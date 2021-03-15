package com.cg.jh05.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name = "specific_employees", 
			query = "SELECT e FROM Employee e WHERE e.salary >= ?1 AND e.salary <= ?2"),
	@NamedQuery(name = "employees_of_a_department", 
		query = "SELECT e FROM Employee e WHERE e.departmentId = :deptId")

}) 
@Entity
@Table(name="employees5")
public class Employee {
	
	@Id
	@Column(name="employee_id")
	private Long employeeId;
	
	@Column(name="first_name", length = 20)
	private String firstName;
	
	@Column(name="last_name", length = 20)
	private String lastName;
	
	@Column(name="salary", precision = 8, scale = 2)
	private Double salary;
	
	@Column(name="department_id")
	private Integer departmentId;
	
	public Employee() {
		/* default constructor */
	}

	public Employee(Long employeeId, String firstName, String lastName, Double salary, Integer departmentId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.departmentId = departmentId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return String.format("Employee [employeeId=%s, firstName=%s, lastName=%s, salary=%s, departmentId=%s]",
				employeeId, firstName, lastName, salary, departmentId);
	}
}