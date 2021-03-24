package com.cg.fms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "products_details")
public class Product {

	@Id
	private String productId;

	@Column(name = "product_name")
	@NotEmpty(message = "product name cannot be empty")
	@NotNull(message = "product name cannot be omitted")
	private String productName;

	@Column(name = "product_quantity")
	@NotEmpty(message = "product quantity cannot be empty")
	@NotNull(message = "product quantity cannot be omitted")
	private String productQuantity;

	@Column(name = "product_description")
	@NotEmpty(message = "product description cannot be empty")
	@NotNull(message = "product description cannot be omitted")
	private String productDescription;

	@ManyToOne(cascade = CascadeType.ALL)
	private Order order;

	@ManyToOne(cascade = CascadeType.ALL)
	private Contract contract;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productId,
			@NotEmpty(message = "product name cannot be empty") @NotNull(message = "product name cannot be omitted") String productName,
			@NotEmpty(message = "product quantity cannot be empty") @NotNull(message = "product quantity cannot be omitted") String productQuantity,
			@NotEmpty(message = "product description cannot be empty") @NotNull(message = "product description cannot be omitted") String productDescription,
			Order order, Contract contract) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productDescription = productDescription;
		this.order = order;
		this.contract = contract;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
