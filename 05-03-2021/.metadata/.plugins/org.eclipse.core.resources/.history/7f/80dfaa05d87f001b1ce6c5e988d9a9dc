package com.cg.jh01.entity;

import javax.persistence.*;
@Entity
@Table(name = "products")
public class Product {
	@Id
	@Column(name = "prod_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long proId;
	
	@Column(name = "prod_name")
	private String prodname;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Long proId, String prodname) {
		super();
		this.proId = proId;
		this.prodname = prodname;
	}

	public Long getProId() {
		return proId;
	}

	public void setProId(Long proId) {
		this.proId = proId;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	@Override
	public String toString() {
		return String.format("proId=%s, prodname=%s]", proId, prodname);
	}
	

}