package com.cg.fms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "users_details")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NotEmpty(message = "user name cannot be empty")
	@NotNull(message = "user name cannot be omitted")
	private String userName;

	@Column(name = "user_pass")
	@Pattern(regexp = "^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&-+=()])(?=\\S+$).{6, 20}$", message = " is represents at least 8 characters and at most 20 characters.")
	@NotEmpty(message = "password cannot be empty")
	@NotNull(message = "passord cannot be omitted")
	private String password;

	@Column(name = "role")
	@NotEmpty(message = "role cannot be empty")
	@NotNull(message = "role cannot be omitted")
	private String role;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(
			@NotEmpty(message = "user name cannot be empty") @NotNull(message = "user name cannot be omitted") String userName,
			@Pattern(regexp = "^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&-+=()])(?=\\S+$).{6, 20}$", message = " is represents at least 8 characters and at most 20 characters.") @NotEmpty(message = "password cannot be empty") @NotNull(message = "passord cannot be omitted") String password,
			@NotEmpty(message = "role cannot be empty") @NotNull(message = "role cannot be omitted") String role) {
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
