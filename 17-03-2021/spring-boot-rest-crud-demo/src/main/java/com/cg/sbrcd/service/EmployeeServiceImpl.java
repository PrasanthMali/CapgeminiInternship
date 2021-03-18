package com.cg.sbrcd.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sbrcd.dao.IEmployeeRepository;
import com.cg.sbrcd.entity.Department;
import com.cg.sbrcd.entity.Employee;
import com.cg.sbrcd.exception.EmployeeException;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository empRepo;
	
	@Override
	public Employee add(Employee emp) throws EmployeeException {
		if (emp != null) {
			if (empRepo.existsById(emp.getEmpId())) {
				throw new EmployeeException("Employee with Id " + emp.getEmpId() + " is exist already");
			} else if (empRepo.existsByMobileNumber(emp.getMobileNumber())) {
				throw new EmployeeException("Employee with mobile number " + emp.getMobileNumber() + " is exist already");
			} else if (empRepo.existsByEmail(emp.getEmail())) {
				throw new EmployeeException("Employee with email " + emp.getEmail() + " is exist already");
			} else {
				emp = empRepo.save(emp);
			}
		}
		return emp;
	}

	@Override
	public Employee save(Employee emp) throws EmployeeException {
		Employee oldEmp = empRepo.findById(emp.getEmpId()).orElse(null);
		if (oldEmp == null) {
			throw new EmployeeException("No Employee with id " + emp.getEmpId() + " is present");
		} else if (!oldEmp.getMobileNumber().equals(emp.getMobileNumber()) && empRepo.existsByMobileNumber(emp.getMobileNumber())) {
			throw new EmployeeException("Employee with mobile number " + emp.getMobileNumber() + " is present");
		} else if (!oldEmp.getEmail().equals(emp.getEmail()) && empRepo.existsByEmail(emp.getEmail())) {
			throw new EmployeeException("Employee with email " + emp.getEmail() + " is present");
		} else {
			emp = empRepo.save(emp);
		}
		return emp;
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
	public Employee findByMobileNumber(String mobileNumber) {
		return empRepo.findByMobileNumber(mobileNumber);
	}

	@Override
	public Employee findByEmail(String email) {
		return empRepo.findByEmail(email);
	}

	@Override
	public List<Employee> findAll() {
		return empRepo.findAll();
	}

	@Override
	public List<Employee> findAllByDept(Department dept) {
		return empRepo.findAllByDept(dept);
	}

	@Override
	public List<Employee> findAllByJoinDate(LocalDate joinDate) {
		return empRepo.findAllByJoinDate(joinDate);
	}

	@Override
	public List<Employee> findAllByBasicRange(double lb, double ub) {
		return empRepo.findAllByBasicRange(lb, ub);
	}

}