package com.cg.fms.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "customers_details")

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String customerId;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Contract>contract;
	
	@Column(name = "customer_pass")
	@Pattern(regexp = "^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&-+=()])(?=\\S+$).{6, 20}$", message = " is represents at least 8 characters and at most 20 characters.")
	@NotEmpty(message = "password cannot be empty")
	@NotNull(message = "password cannot be omitted")
	private String customerPassword;

	@Column(name = "customer_name", length = 30)
	@NotEmpty(message = "customer name cannot be empty")
	@NotNull(message = "customer name cannot be omitted")
	private String customerName;

	@Column(name = "customer_email")
	@Email(message = "please provide valid email")
	@Email(message = "email must be a valid one")
	@NotNull(message = "email cannot be omitted")
	private String customerEmail;

	@Column(name = "customer_address")
	@NotEmpty(message = "customer address cannot be empty")
	@NotNull(message = "customer address cannot be omitted")
	private String customerAddress;

	@Column(name = "customer_town")
	@NotEmpty(message = "customer town cannot be empty")
	@NotNull(message = "customer town cannot be omitted")
	private String customerTown;

	@Column(name = "customer_postalcode", length = 6)
	@NotEmpty(message = "customer postal cannot be empty")
	@NotNull(message = "customer postal cannot be omitted")
	private String customerPostalCode;

	@Column(name = "customer_contact")
	@Pattern(regexp = "[1-9][0-9]{9}", message = "mobile number is expected to be 10 digits and should not start with 0")
	@NotNull(message = "Mobile number cannot be omitted")
	private String customerContact;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerId,
			@Pattern(regexp = "^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&-+=()])(?=\\S+$).{6, 20}$", message = " is represents at least 8 characters and at most 20 characters.") @NotEmpty(message = "password cannot be empty") @NotNull(message = "password cannot be omitted") String customerPassword,
			@NotEmpty(message = "customer name cannot be empty") @NotNull(message = "customer name cannot be omitted") String customerName,
			@Email(message = "please provide valid email") @Email(message = "email must be a valid one") @NotNull(message = "email cannot be omitted") String customerEmail,
			@NotEmpty(message = "customer address cannot be empty") @NotNull(message = "customer address cannot be omitted") String customerAddress,
			@NotEmpty(message = "customer town cannot be empty") @NotNull(message = "customer town cannot be omitted") String customerTown,
			@NotEmpty(message = "customer postal cannot be empty") @NotNull(message = "customer postal cannot be omitted") String customerPostalCode,
			@Pattern(regexp = "[1-9][0-9]{9}", message = "mobile number is expected to be 10 digits and should not start with 0") @NotNull(message = "Mobile number cannot be omitted") String customerContact) {
		super();
		this.customerId = customerId;
		this.customerPassword = customerPassword;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.customerTown = customerTown;
		this.customerPostalCode = customerPostalCode;
		this.customerContact = customerContact;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerTown() {
		return customerTown;
	}

	public void setCustomerTown(String customerTown) {
		this.customerTown = customerTown;
	}

	public String getCustomerPostalCode() {
		return customerPostalCode;
	}

	public void setCustomerPostalCode(String customerPostalCode) {
		this.customerPostalCode = customerPostalCode;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

}