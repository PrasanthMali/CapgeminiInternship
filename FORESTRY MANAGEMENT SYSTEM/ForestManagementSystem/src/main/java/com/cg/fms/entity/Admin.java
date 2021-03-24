package com.cg.fms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "admins_details")
public class Admin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	
	@Column(name = "admin_name")
	@NotEmpty(message = "admin name cannot be empty")
	@NotNull(message = "admin name cannot be omitted")
	private String adminName;

	@Column(name = "admin_password")
	@NotEmpty(message = "admin password cannot be empty")
	@NotNull(message = "admin password cannot be omitted")
	private String adminPassword;

	
	
	public Admin(int adminId,
			@NotEmpty(message = "admin name cannot be empty") @NotNull(message = "admin name cannot be omitted") String adminName,
			@NotEmpty(message = "admin password cannot be empty") @NotNull(message = "admin password cannot be omitted") String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}

	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

}