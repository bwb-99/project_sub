package com.sist.vo;

/*
BAR_NO	NUMBER
NAME	VARCHAR2(100 BYTE)
ADDRESS	VARCHAR2(100 BYTE)
PHONE	VARCHAR2(14 BYTE)
IMAGE	VARCHAR2(300 BYTE)
PROFILE	CLOB
HIT	NUMBER
TIME	VARCHAR2(500 BYTE)
LOC	VARCHAR2(10 BYTE)
SUBWAY	VARCHAR2(500 BYTE)
 */
import lombok.Data;


public class CocktailbarVO {
	private int bar_no,hit;
	private String name,address,phone,image,profile,time,loc,subway;
	public int getBar_no() {
		return bar_no;
	}
	public void setBar_no(int bar_no) {
		this.bar_no = bar_no;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getSubway() {
		return subway;
	}
	public void setSubway(String subway) {
		this.subway = subway;
	}
	
}
