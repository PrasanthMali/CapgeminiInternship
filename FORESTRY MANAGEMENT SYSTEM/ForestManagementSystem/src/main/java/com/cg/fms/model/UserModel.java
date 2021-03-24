package com.cg.fms.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class UserModel implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	
	private String userName;
	
	
	private String password;
	

	private String role;
	
	public UserModel( String userName,String password,String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.role = role;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
