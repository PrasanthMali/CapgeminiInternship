package com.cg.jh04.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/*@Entity
@DiscriminatorValue(value = "M")*/
@Entity
//@DiscriminatorValue(value = "M")
@Table(name="only_managers_table")
public class Manager extends Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "allow")
	public Double allowance;
	
	public Manager() {
		
	}

	public Manager(String empName,Double salary, Double allowance) {
		super(empName, salary);
		this.allowance = allowance;
	}

	public Double getAllowance() {
		return allowance;
	}

	public void setAllowance(Double allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return String.format("Manager [allowance=%s, toString()=%s]", allowance, super.toString());
	}
}
