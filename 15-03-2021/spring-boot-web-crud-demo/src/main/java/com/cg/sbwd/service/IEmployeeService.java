package com.cg.sbwd.service;

import java.util.List;

import com.cg.sbwd.entity.Employee;

public interface IEmployeeService {
		Employee save(Employee emp);
		void deleteById(Long empId);
		
		Employee findById(Long empId);
		List<Employee> findAll();
}