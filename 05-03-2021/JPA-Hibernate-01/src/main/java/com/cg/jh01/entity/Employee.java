package com.cg.jh01.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="emp_id")
	private Long empID;
	@Column(name="emp_name")
	private String empName;
	@Column
	private Double salary;
	@Column(name="doj")
	private LocalDate dateJoined;
	
	public Employee(String string, String string2, Laptop lap1) {
		
	}

	public Employee(Long empID, String empName, Double salary, LocalDate dateJoined) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.dateJoined = dateJoined;
	}

	public Long getEmpID() {
		return empID;
	}

	public void setEmpID(Long empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public LocalDate getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(LocalDate dateJoined) {
		this.dateJoined = dateJoined;
	}

	@Override
	public String toString() {
		return String.format("empID=%s, empName=%s, salary=%s, dateJoined=%s", empID, empName, salary, dateJoined);
	}
}


