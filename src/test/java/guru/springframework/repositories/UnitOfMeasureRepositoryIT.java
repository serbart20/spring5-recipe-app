package guru.springframework.repositories;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import guru.springframework.domain.UnitOfMeasure;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {
	
	@Autowired
	private UnitOfMeasureRepository unitOfMeasureRepository;;

	@Before
	public void setup() {
		// this.cut = new UnitOfMeasureRepository();
	}

	@Test
	public void findByDescription() throws Exception {

		Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

		assertEquals("Teaspoon", uomOptional.get().getDescription());
	}

	@Test
	public void findByDescriptionCup() throws Exception {

		Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepository.findByDescription("Cup");

		assertEquals("Cup", uomOptional.get().getDescription());
	}
}