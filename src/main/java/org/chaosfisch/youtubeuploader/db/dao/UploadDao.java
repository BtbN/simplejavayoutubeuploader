/*
 * Copyright (c) 2013 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors: Dennis Fischer
 */
package org.chaosfisch.youtubeuploader.db.dao;

import java.util.GregorianCalendar;

import org.chaosfisch.youtubeuploader.db.generated.Tables;
import org.chaosfisch.youtubeuploader.db.generated.tables.pojos.Account;
import org.chaosfisch.youtubeuploader.db.generated.tables.pojos.Upload;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;

import com.google.inject.Inject;

public class UploadDao extends org.chaosfisch.youtubeuploader.db.generated.tables.daos.UploadDao {
	private final DSLContext	context;

	@Inject
	public UploadDao(final Configuration configuration) {
		super(configuration);
		context = DSL.using(configuration);
	}

	public Upload insertReturning(final Upload upload) {
		return context.insertInto(Tables.UPLOAD)
			.set(context.newRecord(Tables.UPLOAD, upload))
			.returning()
			.fetchOne()
			.into(Upload.class);
	}

	public Account fetchOneAccountByUpload(final Upload upload) {
		return context.select()
			.from(Tables.ACCOUNT)
			.join(Tables.UPLOAD)
			.on(Tables.UPLOAD.ACCOUNT_ID.eq(Tables.ACCOUNT.ID))
			.where(Tables.UPLOAD.ID.eq(upload.getId()))
			.fetchOneInto(Account.class);
	}

	public Upload fetchNextUpload() {
		final GregorianCalendar cal = new GregorianCalendar();

		return context.select()
			.from(Tables.UPLOAD)
			.where(Tables.UPLOAD.ARCHIVED.ne(true), Tables.UPLOAD.FAILED.ne(true), Tables.UPLOAD.INPROGRESS.ne(true),
				Tables.UPLOAD.LOCKED.ne(true), Tables.UPLOAD.DATE_OF_START.le(cal)
					.or(Tables.UPLOAD.DATE_OF_START.isNull()))
			.orderBy(Tables.UPLOAD.DATE_OF_START.desc(), Tables.UPLOAD.FAILED.asc())
			.fetchOneInto(Upload.class);
	}

	public long countLeftUploads() {
		return context.select()
			.from(Tables.UPLOAD)
			.where(Tables.UPLOAD.ARCHIVED.ne(true), Tables.UPLOAD.FAILED.eq(false))
			.fetchCount();
	}

	public long countAvailableStartingUploads() {
		final GregorianCalendar cal = new GregorianCalendar();

		return context.select()
			.from(Tables.UPLOAD)
			.where(Tables.UPLOAD.ARCHIVED.ne(true), Tables.UPLOAD.INPROGRESS.ne(true), Tables.UPLOAD.FAILED.ne(true),
				Tables.UPLOAD.DATE_OF_START.le(cal))
			.fetchCount();
	}
}
