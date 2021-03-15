package com.cg.jh02.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name = "door_no")
	private String doorNumber;
	@Column(name="street")
	private String street;
	@Column
	private String city;
	public Address() {
		/* no implementation */
	}
	public Address(String doorNumber, String street, String city) {
		super();
		this.doorNumber = doorNumber;
		this.street = street;
		this.city = city;
	}
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}