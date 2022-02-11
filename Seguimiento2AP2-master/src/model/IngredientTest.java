package model;

import org.junit.Test;

import junit.framework.TestCase;

public class IngredientTest extends TestCase {
	
	private Ingredient use;
	
	public void setupStage1() {
		use= new Ingredient("Tomato",245);
	}
	
	@Test
	public void testAddWeight() {
		setupStage1();
		use.addWeight(54);
		assertEquals(299,use.getWeight());
	}
	
}
