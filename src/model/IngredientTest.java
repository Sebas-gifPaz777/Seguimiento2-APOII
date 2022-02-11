package model;

import org.junit.Test;

import exception.NegativeNumberException;
import junit.framework.TestCase;

public class IngredientTest extends TestCase {
	
	private Ingredient use;
	
	public void setupStage1() {
		use= new Ingredient("Tomato",245);
	}
	
	@Test
	public void testAddWeight() throws NegativeNumberException {
		setupStage1();
		use.addWeight(54);
		assertEquals(299,use.getWeight(),0.0001);
		
		setupStage1();
		try {
			use.addWeight(-100);
			fail("Debe lanzar la excepcion");
		}catch(NegativeNumberException negativeNumberException) {
			System.err.println(negativeNumberException.getMessage());
		}
		finally {
			assertEquals(245,use.getWeight(),0.0001);
		}
		
		
	}
	
	@Test
	public void testRemoveWeight() throws NegativeNumberException {
		setupStage1();
		use.removeWeight(45);
		assertEquals(200,use.getWeight(),0.0001);
		
		setupStage1();
		try {
			use.removeWeight(-100);
			fail("Debe lanzar la excepcion");
		}catch(NegativeNumberException negativeNumberException) {
			System.err.println(negativeNumberException.getMessage());
		}
		finally {
			assertEquals(245,use.getWeight(),0.0001);
		}
	}
	
	
}
