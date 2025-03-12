package com.sist.vo;

import lombok.Data;

/*
COCKTAIL_TAG_NO	NUMBER
COCKTAIL_NO	NUMBER
VALUE	VARCHAR2(30 BYTE)
 */

public class CocktailTagVO {
	private int cocktail_tag_no,cocktail_no;
	private String value;
	public int getCocktail_tag_no() {
		return cocktail_tag_no;
	}
	public void setCocktail_tag_no(int cocktail_tag_no) {
		this.cocktail_tag_no = cocktail_tag_no;
	}
	public int getCocktail_no() {
		return cocktail_no;
	}
	public void setCocktail_no(int cocktail_no) {
		this.cocktail_no = cocktail_no;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
