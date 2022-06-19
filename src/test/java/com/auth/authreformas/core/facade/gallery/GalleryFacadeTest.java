package com.auth.authreformas.core.facade.gallery;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GalleryFacadeTest {

	@InjectMocks
	private GalleryFacade galleryFacade;

	@Test
	public void getGallery_test() {
		List<String> expectedValues = new ArrayList<>();
		expectedValues.add("Filipe");
		expectedValues.add("Charles");

		List<String> retornedList = galleryFacade.getGallery();

		Assert.assertEquals(expectedValues, retornedList);
	}
}
