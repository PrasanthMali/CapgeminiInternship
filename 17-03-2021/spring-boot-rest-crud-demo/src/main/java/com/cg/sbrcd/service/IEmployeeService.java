package com.cg.sbrcd.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.sbrcd.entity.Department;
import com.cg.sbrcd.entity.Employee;
import com.cg.sbrcd.exception.EmployeeException;

public interface IEmployeeService {
	Employee add(Employee emp) throws EmployeeException;
	Employee save(Employee emp) throws EmployeeException;
	void deleteById(Long empId);
	
	Employee findById(Long empId);
	Employee findByMobileNumber(String mobileNumber);
	Employee findByEmail(String email);
	
	List<Employee> findAll();
	List<Employee> findAllByDept(Department dept);
	List<Employee> findAllByJoinDate(LocalDate joinDate);
	List<Employee> findAllByBasicRange(double lb, double ub);
}