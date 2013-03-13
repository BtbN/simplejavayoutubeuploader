/*******************************************************************************
 * Copyright (c) 2013 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors: Dennis Fischer
 ******************************************************************************/
package org.chaosfisch.youtubeuploader.services.youtube.impl;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.util.EntityUtils;
import org.chaosfisch.exceptions.SystemException;
import org.chaosfisch.google.atom.VideoEntry;
import org.chaosfisch.google.auth.GoogleAuthUtil;
import org.chaosfisch.io.http.Request;
import org.chaosfisch.io.http.RequestSigner;
import org.chaosfisch.io.http.Response;
import org.chaosfisch.util.XStreamHelper;
import org.chaosfisch.youtubeuploader.db.dao.UploadDao;
import org.chaosfisch.youtubeuploader.db.generated.tables.pojos.Upload;
import org.chaosfisch.youtubeuploader.services.youtube.spi.ResumeableManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;

public class ResumeableManagerImpl implements ResumeableManager {
	private static final double	BACKOFF		= 3.13;
	private int					numberOfRetries;
	private static final int	MAX_RETRIES	= 5;
	private final Logger		logger		= LoggerFactory.getLogger(getClass());

	@Inject
	private GoogleAuthUtil		authTokenHelper;
	@Inject
	private RequestSigner		requestSigner;
	@Inject
	private UploadDao			uploadDao;

	@Override
	public ResumeInfo fetchResumeInfo(final Upload upload) throws SystemException {
		ResumeInfo resumeInfo;
		do {
			if (!canResume()) {
				return null;
			}
			resumeInfo = resumeFileUpload(upload);
		} while (resumeInfo == null);
		return resumeInfo;
	}

	private ResumeInfo resumeFileUpload(final Upload upload) throws SystemException {
		final Request request = new Request.Builder(upload.getUploadurl())
			.put(null)
			.headers(ImmutableMap.of("Content-Range", "bytes */*"))
			.sign(requestSigner, authTokenHelper.getAuthHeader(uploadDao.fetchOneAccountByUpload(upload)))
			.build();

		try (final Response response = request.execute();) {

			if (response.getStatusCode() >= 200 && response.getStatusCode() < 300) {
				return new ResumeInfo(parseVideoId(EntityUtils.toString(response.getEntity())));
			} else if (response.getStatusCode() != 308) {
				throw new SystemException(ResumeCode.UNEXPECTED_RESPONSE_CODE).set("code", response.getStatusCode());
			}

			final long nextByteToUpload;

			final Header range = response.getRaw().getFirstHeader("Range");
			if (range == null) {
				logger.info("PUT to {} did not return Range-header.", upload.getUploadurl());
				nextByteToUpload = 0;
			} else {
				logger.info("Range header is: {}", range.getValue());
				final String[] parts = range.getValue().split("-");
				if (parts.length > 1) {
					nextByteToUpload = Long.parseLong(parts[1]) + 1;
				} else {
					nextByteToUpload = 0;
				}
			}
			final ResumeInfo resumeInfo = new ResumeInfo(nextByteToUpload);
			if (response.getRaw().getFirstHeader("Location") != null) {
				final Header location = response.getRaw().getFirstHeader("Location");
				upload.setUploadurl(location.getValue());
				uploadDao.update(upload);
			}
			return resumeInfo;

		} catch (final IOException e) {
			throw SystemException.wrap(e, ResumeCode.IO_ERROR);
		}
	}

	@Override
	public String parseVideoId(final String atomData) {
		logger.info(atomData);
		final VideoEntry videoEntry = XStreamHelper.parseFeed(atomData, VideoEntry.class);
		return videoEntry.mediaGroup.videoID;
	}

	@Override
	public boolean canContinue() {
		return !(numberOfRetries > MAX_RETRIES);
	}

	private boolean canResume() {
		numberOfRetries++;
		if (!canContinue()) {
			return false;
		}
		delay();
		return true;
	}

	@Override
	public void setRetries(final int i) {
		numberOfRetries = i;
	}

	@Override
	public int getRetries() {
		return numberOfRetries;
	}

	@Override
	public void delay() {
		try {
			final int sleepSeconds = (int) Math.pow(BACKOFF, numberOfRetries);
			logger.info(String.format("Zzzzz for : %d sec.", sleepSeconds));
			Thread.sleep(sleepSeconds * 1000L);
			logger.info(String.format("Zzzzz for : %d sec done.", sleepSeconds));
		} catch (final InterruptedException e) { // $codepro.audit.disable
													// logExceptions
			Thread.currentThread().interrupt();
		}
	}

}
