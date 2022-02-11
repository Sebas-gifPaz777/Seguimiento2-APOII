package model;

import org.junit.Test;

import exception.NegativeNumberException;
import junit.framework.TestCase;

public class RecipeTest extends TestCase {
	private Recipe use;
	
	public void setupStage1() {
		
		use= new Recipe();
	}
	
	public void setUpStage2() throws NegativeNumberException {
		use=new Recipe();
		use.addIngredient("Cebolla", 315);
		use.addIngredient("Ajo", 58);
		use.addIngredient("Arroz",520);
	}
	
	@Test
	public void testAddIngredient() throws NegativeNumberException {
		setupStage1();
		use.addIngredient("Sal", 12);
		assertEquals(1,use.countList());
		
		setUpStage2();
		use.addIngredient("Pimienta", 6);
		assertEquals(4,use.countList());
		
		setUpStage2();
		use.addIngredient("Ajo", 21);
		assertEquals(79,use.getIngredients().get(1).getWeight(),0.0001);
		
	}
	
	@Test
	public void testRemoveIngredient() throws NegativeNumberException {
		setUpStage2();
		use.removeIngredient("Ajo");
		assertTrue(use.countList()==2);
	}
	
}
