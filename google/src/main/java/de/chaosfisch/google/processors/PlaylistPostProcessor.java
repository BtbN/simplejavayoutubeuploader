/*
 * Copyright (c) 2014 Dennis Fischer.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0+
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors: Dennis Fischer
 */

package de.chaosfisch.google.processors;

import de.chaosfisch.google.youtube.playlist.IPlaylistService;
import de.chaosfisch.google.youtube.playlist.Playlist;
import de.chaosfisch.google.youtube.playlist.PlaylistIOException;
import de.chaosfisch.google.youtube.upload.Upload;
import de.chaosfisch.google.youtube.upload.UploadPostProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public class PlaylistPostProcessor implements UploadPostProcessor {

	private final IPlaylistService playlistService;
	private static final Logger LOGGER = LoggerFactory.getLogger(PlaylistPostProcessor.class);

	@Inject
	public PlaylistPostProcessor(final IPlaylistService playlistService) {
		this.playlistService = playlistService;
	}

	@Override
	public Upload process(final Upload upload) {
		for (final Playlist playlist : upload.getPlaylists()) {
			try {
				playlistService.addVideoToPlaylist(playlist, upload.getVideoid());
			} catch (final PlaylistIOException e) {
				LOGGER.error("Failed adding video {} to playlist {}", upload.getVideoid(), playlist.getTitle(), e);
			}
		}
		return upload;
	}
}
