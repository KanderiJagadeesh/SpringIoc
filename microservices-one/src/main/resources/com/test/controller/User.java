package com.test.controller;

public class User {

	private int userid;
	private String username;
	private String mobile;
	private String email;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String username, String mobile, String email) {
		super();
		this.userid = userid;
		this.username = username;
		this.mobile = mobile;
		this.email = email;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
