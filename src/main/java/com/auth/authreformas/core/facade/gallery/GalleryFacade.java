package com.auth.authreformas.core.facade.gallery;

import com.auth.authreformas.router.MainRouter;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GalleryFacade {

	public List<String> getGallery() {
		List<String> gallery = new ArrayList<>();
		gallery.add("Filipe");
		gallery.add("Charles");

		try (CamelContext camel = new DefaultCamelContext()) {
			camel.addRoutes(new MainRouter());
			camel.start();
			Thread.sleep(10_000);
			camel.stop();
		} catch (Exception e) {
			System.out.println("error happened");
		}

		return gallery;
	}
}
