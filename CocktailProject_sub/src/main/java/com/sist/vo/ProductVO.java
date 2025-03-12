package com.sist.vo;

import lombok.Data;

/*
PRODUCT_NO	NUMBER
NAME	VARCHAR2(1000 BYTE)
TYPE	VARCHAR2(50 BYTE)
PRICE	VARCHAR2(100 BYTE)
POSTER	VARCHAR2(200 BYTE)
DELIVER	VARCHAR2(200 BYTE)
ALC	VARCHAR2(100 BYTE)
VOLUMN	VARCHAR2(100 BYTE)
LOC	VARCHAR2(2000 BYTE)
CONTENT	CLOB
CNO	VARCHAR2(20 BYTE)
DELIVERY_FEE	VARCHAR2(100 BYTE)
HIT	NUMBER
 */

public class ProductVO {
	private String name,type,price,poster,deliver,alc,volumn,loc,content,cno,delivery_fee;
	private int product_no,hit;
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
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getDelivery_fee() {
		return delivery_fee;
	}
	public void setDelivery_fee(String delivery_fee) {
		this.delivery_fee = delivery_fee;
	}
	public int getProduct_no() {
		return product_no;
	}
	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
}
