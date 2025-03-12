package com.sist.vo;

import java.sql.Date;

import lombok.Data;

/*
 *  ID             NOT NULL VARCHAR2(20)  
	PWD            NOT NULL VARCHAR2(30)  
	NAME           NOT NULL VARCHAR2(51)  
	SEX            NOT NULL CHAR(6)       
	EMAIL                   VARCHAR2(100) 
	BIRTHDAY       NOT NULL VARCHAR2(10)  
	POST           NOT NULL VARCHAR2(10)  
	ADDRESS        NOT NULL VARCHAR2(100) 
	ADDRESS_DETAIL          VARCHAR2(100) 
	REGDATE                 DATE          
	COMENT                  CLOB          
	ADMIN                   VARCHAR2(1)   
	LOGIN                   VARCHAR2(1)   
	PHONE                   VARCHAR2(13)  
	AVATAR                  VARCHAR2(100) 
 */

public class Cocktail_MemberVO {
	private String id,pwd,name,sex,email,birthday,post,address,address_detail,coment,admin,login,phone,avatar,msg;
	private Date regdate;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress_detail() {
		return address_detail;
	}
	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}
	public String getComent() {
		return coment;
	}
	public void setComent(String coment) {
		this.coment = coment;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
}
