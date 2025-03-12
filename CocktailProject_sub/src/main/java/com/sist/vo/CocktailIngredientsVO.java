package com.sist.vo;

import lombok.Data;

/*
ING_NO	NUMBER
INGNAME	VARCHAR2(100 BYTE)
COMMENTS	VARCHAR2(600 BYTE)
ALC	VARCHAR2(100 BYTE)
INGTAG	VARCHAR2(30 BYTE)
IMAGE	VARCHAR2(260 BYTE)
ENAME	VARCHAR2(100 BYTE)
 */
public class CocktailIngredientsVO {
	private int ing_no;
	private String ingname,comments, alc,ingtag,ciimage,ename;
	public int getIng_no() {
		return ing_no;
	}
	public void setIng_no(int ing_no) {
		this.ing_no = ing_no;
	}
	public String getIngname() {
		return ingname;
	}
	public void setIngname(String ingname) {
		this.ingname = ingname;
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
	public String getIngtag() {
		return ingtag;
	}
	public void setIngtag(String ingtag) {
		this.ingtag = ingtag;
	}
	public String getCiimage() {
		return ciimage;
	}
	public void setCiimage(String ciimage) {
		this.ciimage = ciimage;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
}
