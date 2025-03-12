package com.sist.vo;
import java.util.*;

import lombok.Data;
/*
NO	NUMBER
TITLE	VARCHAR2(2000 BYTE)
NAME	VARCHAR2(52 BYTE)
CONTENT	CLOB
REGDATE	DATE
HIT	NUMBER
IMAGE	VARCHAR2(2000 BYTE)
 */
@Data
public class NewsVO {
	private int no,hit;
	private String title,name,content,dbday,image;
	private Date regdate;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDbday() {
		return dbday;
	}
	public void setDbday(String dbday) {
		this.dbday = dbday;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
}
