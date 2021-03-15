package com.cg.jh01.model;

import javax.persistence.Column;

public class Address {
	@Column(name = "door_no")
	private String doorNumber;
	@Column(name = "street")
	private String street;
	@Column
	private String pincode;
	public Address() {
		
	}
	public Address(String doorNumber, String street, String pincode) {
		super();
		this.doorNumber = doorNumber;
		this.street = street;
		this.pincode = pincode;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return String.format("doorNumber=%s, street=%s, pincode=%s", doorNumber, street, pincode);
	}
	

}