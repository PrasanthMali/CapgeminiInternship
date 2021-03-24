package com.cg.fms.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "contract_details")
public class Contract {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String contractNumber;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Customer> customer;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Set<Product> product;

	@Column(name = "delivery_place")
	@NotEmpty(message = "delivery place cannot be empty")
	@NotNull(message = "delivery place cannot be omitted")
	private String deliveryPlace;

	@Column(name = "delivery_date")
	@DateTimeFormat(iso = ISO.DATE)
	private String deliveryDate;

	@Column(name = "quantity")
	@NotEmpty(message = "quantity cannot be empty")
	@NotNull(message = "quantity  cannot be omitted")
	private String quantity;

	@ManyToOne(cascade = CascadeType.ALL)
	private Set<Scheduler> scheduler;

	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contract(String contractNumber, Set<Customer> customer, Set<Product> product,
			@NotEmpty(message = "delivery place cannot be empty") @NotNull(message = "delivery place cannot be omitted") String deliveryPlace,
			String deliveryDate,
			@NotEmpty(message = "quantity cannot be empty") @NotNull(message = "quantity  cannot be omitted") String quantity,
			Set<Scheduler> scheduler) {
		super();
		this.contractNumber = contractNumber;
		this.customer = customer;
		this.product = product;
		this.deliveryPlace = deliveryPlace;
		this.deliveryDate = deliveryDate;
		this.quantity = quantity;
		this.scheduler = scheduler;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Set<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
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

	public Set<Scheduler> getScheduler() {
		return scheduler;
	}

	public void setScheduler(Set<Scheduler> scheduler) {
		this.scheduler = scheduler;
	}


	
}