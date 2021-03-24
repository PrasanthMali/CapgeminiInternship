package com.cg.fms.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


public class OrderModel{

	private String orderNumber;
	

	private ContractModel contract;

	private CustomerModel customer;
	
	private ProductModel product;
	

	private String deliveryPlace;
	

	private String deliveryDate;
	
	private String quantity;
	

	private SchedulerModel scheduler;

	public OrderModel(String orderNumber, ContractModel contract, CustomerModel customer, ProductModel product,String deliveryPlace,String deliveryDate,String quantity,SchedulerModel scheduler) {
		super();
		this.orderNumber = orderNumber;
		this.contract = contract;
		this.customer = customer;
		this.product = product;
		this.deliveryPlace = deliveryPlace;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
		this.scheduler = scheduler;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public ContractModel getContract() {
		return contract;
	}

	public void setContract(ContractModel contract) {
		this.contract = contract;
	}

	public CustomerModel getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}

	public ProductModel getProduct() {
		return product;
	}

	public void setProduct(ProductModel product) {
		this.product = product;
	}

	public String getDeliveryPlace() {
		return deliveryPlace;
	}

	public void setDeliveryPlace(String deliveryPlace) {
		this.deliveryPlace = deliveryPlace;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public SchedulerModel getScheduler() {
		return scheduler;
	}

	public void setScheduler(SchedulerModel scheduler) {
		this.scheduler = scheduler;
	}
	
	
}
