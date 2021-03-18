package com.cg.sbrcd.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sbrcd.entity.Employee;
import com.cg.sbrcd.exception.EmployeeException;
import com.cg.sbrcd.service.IEmployeeService;

@RestController
@RequestMapping(path="/emps")
public class EmployeeAPI {
	
	@Autowired
	private IEmployeeService empService;
	
	@GetMapping
	public ResponseEntity<List<Employee>> findAll() {
		return new ResponseEntity<>(empService.findAll(), HttpStatus.OK); 
	}
	
	@GetMapping("/{empId}")
	public ResponseEntity<Employee> findById(@PathVariable("empId") Long employeeId) {
		ResponseEntity<Employee> response = null;
		System.out.println("find-by-empid");
		Employee emp = empService.findById(employeeId);
		
		if (emp == null) {
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			response = new ResponseEntity<>(emp, HttpStatus.OK);
		}
		return response;
	}
	
	@GetMapping("/{mno:[1-9][0-9]{9}}")
	public ResponseEntity<Employee> findByMobileNumber(@PathVariable("mno") String mobileNumber) {
		ResponseEntity<Employee> response = null;
		System.out.println("find-by-mobilenumber");
		Employee emp = empService.findByMobileNumber(mobileNumber);
		
		if (emp == null) {
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			response = new ResponseEntity<>(emp, HttpStatus.OK);
		}
		return response;
	}
	
	@PostMapping
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) throws EmployeeException {
		emp = empService.add(emp);
		return new ResponseEntity<>(emp, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{empId}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("empId") Long employeeId) {
		ResponseEntity<Void> response = null;
		Employee emp = empService.findById(employeeId);
		if (emp == null) {
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			empService.deleteById(employeeId);
			response = new ResponseEntity<>(HttpStatus.OK);
		}
		return response;
	}
	
	@PutMapping
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) throws EmployeeException {
		emp = empService.save(emp);
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
}