/**************************************************************************************************
 * Copyright (c) 2014 Dennis Fischer.                                                             *
 * All rights reserved. This program and the accompanying materials                               *
 * are made available under the terms of the GNU Public License v3.0+                             *
 * which accompanies this distribution, and is available at                                       *
 * http://www.gnu.org/licenses/gpl.html                                                           *
 *                                                                                                *
 * Contributors: Dennis Fischer                                                                   *
 **************************************************************************************************/

package de.chaosfisch.youtube.upload;

import javafx.beans.property.SimpleBooleanProperty;

import java.util.List;

public interface IUploadService {

	List<UploadModel> getAll();

	UploadModel get(String id);

	void store(UploadModel upload);

	void remove(UploadModel upload);

	UploadModel fetchNextUpload();

	int count();

	int countUnprocessed();

	long countReadyStarttime();

	void resetUnfinishedUploads();

	void startUploading();

	void stopUploading();

	void startStarttimeCheck();

	void stopStarttimeCheck();

	List<UploadModel> fetchByArchived(boolean archived);

	void abort(UploadModel upload);

	long getStarttimeDelay();

	SimpleBooleanProperty runningProperty();

	boolean getRunning();

	void setRunning(boolean running);

	void setMaxUploads(int maxUploads);

	void setMaxSpeed(int maxSpeed);
}
