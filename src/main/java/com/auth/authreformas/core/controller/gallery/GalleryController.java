package com.auth.authreformas.core.controller.gallery;

import com.auth.authreformas.core.facade.gallery.GalleryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gallery")
public class GalleryController {

	@Autowired
	private GalleryFacade galleryFacade;

	@GetMapping
	public List<String> getGallery() {
		return galleryFacade.getGallery();
	}
}
