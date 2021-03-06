/*
 *				Twidere - Twitter client for Android
 * 
 * Copyright (C) 2012 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.model;

public class ImageSpec {

	private static final ImageSpec EMPTY_INSTANCE = new ImageSpec(null, null, null);

	public final String preview_image_link, full_image_link, orig_link;

	public ImageSpec(final String preview_image_link, final String full_image_link, final String orig_link) {
		this.preview_image_link = preview_image_link;
		this.full_image_link = full_image_link;
		this.orig_link = orig_link;
	}

	@Override
	public String toString() {
		return "ImageSpec{preview_image_link=" + preview_image_link + ", full_image_link=" + full_image_link
				+ "orig_link=" + orig_link + "}";
	}

	public static ImageSpec getEmpty() {
		return EMPTY_INSTANCE;
	}
}
