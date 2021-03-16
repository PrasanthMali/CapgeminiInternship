package com.cg.sbwd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sbwd.dao.EmployeeRepository;
import com.cg.sbwd.entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public Employee save(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public void deleteById(Long empId) {
		empRepo.deleteById(empId);

	}

	@Override
	public Employee findById(Long empId) {
		return empRepo.findById(empId).orElse(null);
	}

	@Override
	public List<Employee> findAll() {
		return empRepo.findAll();
	}

}