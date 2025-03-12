package com.sist.vo;

import lombok.Data;

/*
	PRODUCT_NO   NOT NULL 	NUMBER         
	NAME         NOT NULL 	VARCHAR2(1000) 
	TYPE         NOT NULL 	VARCHAR2(50)   
	PRICE        NOT NULL 	VARCHAR2(100)  
	POSTER       NOT NULL 	VARCHAR2(200)  
	DELIVER      NOT NULL 	VARCHAR2(200)  
	ALC                  	VARCHAR2(100)  
	VOLUMN                	VARCHAR2(100)  
	LOC                   	VARCHAR2(2000) 
	CONTENT               	CLOB           
	CNO          NOT NULL 	NUMBER         
	HIT                   	NUMBER         
	DELIVERY_FEE          	VARCHAR2(100) 
 */

public class Cocktail_ProductVO {
	private int product_no, cno, hit;
	private String name, type, price, poster, deliver, alc, volumn, loc, content, delevery_fee;
	public int getProduct_no() {
		return product_no;
	}
	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getDeliver() {
		return deliver;
	}
	public void setDeliver(String deliver) {
		this.deliver = deliver;
	}
	public String getAlc() {
		return alc;
	}
	public void setAlc(String alc) {
		this.alc = alc;
	}
	public String getVolumn() {
		return volumn;
	}
	public void setVolumn(String volumn) {
		this.volumn = volumn;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDelevery_fee() {
		return delevery_fee;
	}
	public void setDelevery_fee(String delevery_fee) {
		this.delevery_fee = delevery_fee;
	}
	
}
