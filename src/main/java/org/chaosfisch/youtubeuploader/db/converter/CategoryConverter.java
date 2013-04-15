/*
 * Copyright (c) 2013 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors: Dennis Fischer
 */
package org.chaosfisch.youtubeuploader.db.converter;

import org.chaosfisch.youtubeuploader.db.data.Category;
import org.jooq.impl.EnumConverter;

public class CategoryConverter extends EnumConverter<String, Category> {

	private static final long	serialVersionUID	= -5248752584645209507L;

	public CategoryConverter() {
		super(String.class,
			Category.class);
	}
}
