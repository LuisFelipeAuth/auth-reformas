package com.auth.authreformas.core.facade.gallery;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GalleryFacade {

	public List<String> getGallery() {
		List<String> gallery = new ArrayList<>();
		gallery.add("Filipe");
		gallery.add("Charles");

		return gallery;
	}
}
