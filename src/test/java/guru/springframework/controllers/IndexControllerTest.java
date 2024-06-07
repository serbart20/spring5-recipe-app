package guru.springframework.controllers;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import guru.springframework.services.RecipeService;
import guru.springframework.services.RecipeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RunWith(MockitoJUnitRunner.class)
public class IndexControllerTest {
	@Mock
	private RecipeService recipeService;

	@Mock
	Model model;

	private IndexController indexController;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

		this.indexController = new IndexController(recipeService);
	}

	@Test
	public void getIndexPage() {

		String actualValue = indexController.getIndexPage(model);

		assertEquals("index", actualValue);
		verify(recipeService, times(1)).getRecipes();
		verify(model, times(1)).addAttribute(eq("recipes"), anySet());
	}
}
