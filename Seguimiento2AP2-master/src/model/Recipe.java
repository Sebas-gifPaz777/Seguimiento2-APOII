package model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	private List<Ingredient> ingredients;
	public Recipe() {
		ingredients = new ArrayList<Ingredient>();
	}
	
	public void addIngredient(String n, double w) {
		
		int searched=searchIngredient(n);
		
		if(searched!=0) {
			ingredients.get(searched).addWeight(w);;
		}else {
			Ingredient newIngredient = new Ingredient(n, w);
			ingredients.add(newIngredient);
		}		
	}
	
	public List<Ingredient> getIngredients(){
		return ingredients;
	}
	
	public void removeIngredient(String n) {
		
		int searched =searchIngredient(n) ;
		
		if(searched==0) {
			
		}
		else {
			ingredients.remove(searched);
		}
	}
	
	public int searchIngredient(String n) {
		
		int searched = 0;
		for (int i = 0; i < ingredients.size() && searched==0; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equals(n)) {
				searched = i;
			}
		}
		
		return searched;
	}
}
