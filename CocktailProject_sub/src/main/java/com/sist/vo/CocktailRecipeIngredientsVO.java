package com.sist.vo;

import lombok.Data;

/*
RECIPE_NO	NUMBER
COCKTAIL_NO	NUMBER
ING_NO	NUMBER
VOLUME	NUMBER
UNIT	CHAR(8 BYTE)
 */

public class CocktailRecipeIngredientsVO {
	private int recipe_no,cocktail_no,ing_no,volume;
	private String unit;
	public int getRecipe_no() {
		return recipe_no;
	}
	public void setRecipe_no(int recipe_no) {
		this.recipe_no = recipe_no;
	}
	public int getCocktail_no() {
		return cocktail_no;
	}
	public void setCocktail_no(int cocktail_no) {
		this.cocktail_no = cocktail_no;
	}
	public int getIng_no() {
		return ing_no;
	}
	public void setIng_no(int ing_no) {
		this.ing_no = ing_no;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
}
