/**************************************************************************************************
 * Copyright (c) 2014 Dennis Fischer.                                                             *
 * All rights reserved. This program and the accompanying materials                               *
 * are made available under the terms of the GNU Public License v3.0+                             *
 * which accompanies this distribution, and is available at                                       *
 * http://www.gnu.org/licenses/gpl.html                                                           *
 *                                                                                                *
 * Contributors: Dennis Fischer                                                                   *
 **************************************************************************************************/

package de.chaosfisch.youtube.category;

import de.chaosfisch.data.UniqueObject;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;

public class CategoryModel implements UniqueObject<CategoryModel.CategoryDTO> {
	private final SimpleIntegerProperty id        = new SimpleIntegerProperty();
	private final SimpleIntegerProperty youtubeId = new SimpleIntegerProperty();
	private final SimpleStringProperty  name      = new SimpleStringProperty();

	public SimpleStringProperty nameProperty() {
		return name;
	}

	public SimpleIntegerProperty idProperty() {
		return id;
	}

	@Override
	public int hashCode() {
		return youtubeId.hashCode();
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CategoryModel)) {
			return false;
		}
		final CategoryModel that = (CategoryModel) obj;
		return youtubeId.equals(that.youtubeId);
	}

	@Override
	public String toString() {
		return getName();
	}

	public String getName() {
		return name.get();
	}

	public void setName(final String name) {
		this.name.set(name);
	}

	public SimpleIntegerProperty youtubeIdProperty() {
		return youtubeId;
	}

	@Override
	public String uniqueId() {
		return String.valueOf(youtubeId.get());
	}

	@Override
	public CategoryDTO toDTO() {
		return new CategoryDTO(getId(), getName(), getYoutubeId());
	}

	@Override
	public void fromDTO(final CategoryDTO o) {
		setId(o.getId());
		setName(o.getName());
		setYoutubeId(o.getYoutubeId());
	}

	public int getYoutubeId() {
		return youtubeId.get();
	}

	public void setYoutubeId(final int youtubeId) {
		this.youtubeId.set(youtubeId);
	}

	public int getId() {
		return id.get();
	}

	public void setId(final int id) {
		this.id.set(id);
	}

	static final class CategoryDTO implements Serializable {
		private static final long serialVersionUID = 1524311178112810768L;
		private final int    id;
		private final String name;
		private final int    youtubeId;

		private CategoryDTO(final int id, final String name, final int youtubeId) {
			this.id = id;
			this.name = name;
			this.youtubeId = youtubeId;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public int getYoutubeId() {
			return youtubeId;
		}
	}
}
