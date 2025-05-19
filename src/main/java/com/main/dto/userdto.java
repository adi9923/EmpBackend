package com.main.dto;

public class userdto {

	String username;
	String password;
	public userdto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public userdto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
