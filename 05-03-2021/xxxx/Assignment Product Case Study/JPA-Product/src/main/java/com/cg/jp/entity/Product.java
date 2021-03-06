package com.cg.jp.entity;

import java.io.Serializable;
//import java.util.Locale.Category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="product_id")
	private Long pId;
	@Column(name="product_name")
	private String pName;
	@Column(name="Rate")
	private Double unitRate;
	@Column(name="category")
	@Enumerated(EnumType.STRING)
    private Category category;
	
	public Product() {
		/* no implementation required */
	}
	
	
	public Product(Long pId, String pName, Double unitRate,Category category) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.unitRate = unitRate;
		this.category=category;
	}


	public Long getpId() {
		return pId;
	}


	public void setpId(Long pId) {
		this.pId = pId;
	}


	public String getpName() {
		return pName;
	}


	public void setpName(String pName) {
		this.pName = pName;
	}


	public Double getUnitRate() {
		return unitRate;
	}


	public void setUnitRate(Double unitRate) {
		this.unitRate = unitRate;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return String.format("pId=%s, pName=%s, unitRate=%s, category=%s", pId, pName, unitRate, category);
	}	
}