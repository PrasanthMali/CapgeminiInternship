package com.cg.fms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.entity.Admin;
import com.cg.fms.exception.AdminException;
import com.cg.fms.service.IAdminService;

@RestController
@RequestMapping(path="/admins")
public class AdminAPI {
	@Autowired
	
	private IAdminService adminService;
	
	//add admin
	@PostMapping
	public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin) throws AdminException {
		admin = adminService.addAdmin(admin);
		return new ResponseEntity<>(admin, HttpStatus.CREATED);
	}
	
//	//update
//	@PutMapping
//	public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin) throws AdminException {
//		admin = adminService.updateAdmin(admin);
//		return new ResponseEntity<>(admin, HttpStatus.OK);
//	}
//	
//	
//	//display all admin
//	@GetMapping
//	public ResponseEntity<List<Admin>> findAll() {
//		return new ResponseEntity<>(adminService.getAllAdmins(), HttpStatus.OK); 
//	}
	
	
}
