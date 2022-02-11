package model;

import junit.framework.TestCase;

public class RecipeTest extends TestCase {
	private Recipe use;
	
	public void setupStage1() {
		
		use= new Recipe();
	}
	
	public void setUpStage2() {
		use.addIngredient("Cebolla", 315);
		use.addIngredient("Ajo", 58);
		use.addIngredient("Arroz",520);
	}
}
