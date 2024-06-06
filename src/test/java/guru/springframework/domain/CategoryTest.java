package guru.springframework.domain;

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
import org.mockito.junit.MockitoJUnitRunner;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class CategoryTest {

	private Category category;

	@Before
	public void setup() {
		this.category = new Category();
	}
	@Test
	public void shouldCompile() {
		assertThat("Actual value", is("Expected value"));
	}
	@Test
	public void testGetDescription() {
		
	}
	@Test
	public void getId() {
		Long idValue = 4L;
		category.setId(idValue);
		assertEquals(idValue, category.getId());
	}
	@Test
	public void testGetRecipes() {
		
	}
}
