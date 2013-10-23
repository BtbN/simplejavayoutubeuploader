/*
 * Copyright (c) 2013 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors: Dennis Fischer
 */

/**
 * This class is generated by jOOQ
 */
package de.chaosfisch.google.youtube.playlist;

import com.google.common.base.Strings;
import de.chaosfisch.google.account.Account;

import java.io.Serializable;

public class Playlist implements Serializable {

	private static final long serialVersionUID = 2910991664117922235L;
	private String  id;
	private String  pkey;
	private boolean private_;
	private String  title;
	private String  url;
	private String  thumbnail;
	private long    number;
	private String  summary;
	private boolean hidden;
	private Account account;

	public interface Validation {
		String TITLE      = "TITLE";
		String TITLE_SIZE = "TITLE_SIZE";
		String ACCOUNT    = "ACCOUNT";

		int TITLE_MAX_LENGTH = 60;
	}

	private Playlist() {

	}

	public Playlist(final String title, final Account account) {
		setTitle(title);
		setAccount(account);
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getPkey() {
		return pkey;
	}

	public void setPkey(final String pkey) {
		this.pkey = pkey;
	}

	public boolean isPrivate_() {
		return private_;
	}

	public void setPrivate_(final boolean private_) {
		this.private_ = private_;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		if (Strings.isNullOrEmpty(title)) {
			throw new IllegalArgumentException(Validation.TITLE);
		}
		if (Validation.TITLE_MAX_LENGTH < title.getBytes().length) {
			throw new IllegalArgumentException(Validation.TITLE_SIZE);
		}
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(final String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(final long number) {
		this.number = number;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(final boolean hidden) {
		this.hidden = hidden;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(final Account account) {
		if (null == account) {
			throw new IllegalArgumentException(Validation.ACCOUNT);
		}
		this.account = account;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Playlist)) {
			return false;
		}

		final Playlist playlist = (Playlist) obj;

		return null != pkey && pkey.equals(playlist.pkey);
	}

	@Override
	public int hashCode() {
		return null != pkey ? pkey.hashCode() : 0;
	}
}
