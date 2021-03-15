package com.cg.jh05.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Department implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dept_id")
	private Long departmentId;
	
	@Column(name="dept_name")
	private String departmentName;
	
	public Department() {
		
	}

	public Department(Long departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return String.format("Department [departmentId=%s, departmentName=%s]", departmentId, departmentName);
	}
}
