package com.sist.vo;

import lombok.Data;

/*
COCKTAIL_NO	NUMBER
ID	VARCHAR2(20 BYTE)
NAME	VARCHAR2(100 BYTE)
ENAME	VARCHAR2(100 BYTE)
COMMENTS	VARCHAR2(260 BYTE)
ALC	VARCHAR2(100 BYTE)
IMAGE	VARCHAR2(260 BYTE)
CONTENT	CLOB
DETAIL	CHAR(1 BYTE)
HIT	NUMBER
LIKES	NUMBER
 */

public class CocktailVO {
	private int cocktail_no,hit,likes;
	private String id,name,ename,comments,alc,image,content,detail;
	private CocktailIngredientsVO civo = new CocktailIngredientsVO();
	private CocktailRecipeIngredientsVO crivo = new CocktailRecipeIngredientsVO();
	public int getCocktail_no() {
		return cocktail_no;
	}
	public void setCocktail_no(int cocktail_no) {
		this.cocktail_no = cocktail_no;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getAlc() {
		return alc;
	}
	public void setAlc(String alc) {
		this.alc = alc;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public CocktailIngredientsVO getCivo() {
		return civo;
	}
	public void setCivo(CocktailIngredientsVO civo) {
		this.civo = civo;
	}
	public CocktailRecipeIngredientsVO getCrivo() {
		return crivo;
	}
	public void setCrivo(CocktailRecipeIngredientsVO crivo) {
		this.crivo = crivo;
	}
	
	
}
