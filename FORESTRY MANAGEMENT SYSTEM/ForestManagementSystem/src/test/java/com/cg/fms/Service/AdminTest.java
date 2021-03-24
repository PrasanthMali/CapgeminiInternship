package com.cg.fms.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cg.fms.dao.AdminDao;
import com.cg.fms.entity.Admin;
import com.cg.fms.model.AdminModel;
import com.cg.fms.service.AdminServiceImpl;

@ExtendWith(MockitoExtension.class)
public class AdminTest {
	@Mock
	private AdminDao repo;
	@InjectMocks
	AdminServiceImpl service;

	@Test
	@DisplayName("admin Details should retrive")
	void testGetAll() {
		List<Admin> testData=Arrays.asList(new Admin[] {
				new Admin(2,"avinash","1234"),
				new Admin(1,"abhi","12345")
		});
		
		Mockito.when(repo.findAll()).thenReturn(testData);
		
		List<AdminModel> expected=Arrays.asList(new AdminModel[] {
				new AdminModel(1,"abhi","12345"),
				new AdminModel(1,"abhi","12345")
		});
		
		List<AdminModel> actual = service.findAll();
		
		assertEquals(expected,actual);

	}
	
	@Test
	@DisplayName("get by admin id ")
	void testGetById () {
		Admin testdata=new Admin(4,"paresh","12");
		
		AdminModel expected=new AdminModel(3,"r sai krishna","123");
		
		Mockito.when(repo.findById(testdata.getAdminId())).thenReturn(Optional.of(testdata));
	
		AdminModel actual=service.findById(testdata.getAdminId());
		
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("get by admin id return null")
	void testGetByIdNull() {		
		
		Mockito.when(repo.findById(1)).thenReturn(Optional.empty());
		
		AdminModel actual = service.findById(1);
		assertNull(actual);
	}
	
	@Test
	@DisplayName("exists by admin id ")
	void testExistsBynumber () {
		AdminModel id=new AdminModel(6,"prasanth","1234567");
		Admin testdata=new Admin(5,"sai tarun","123456");
		
		boolean expected=true;
		
		Mockito.when(repo.existsByAdminId(testdata.getAdminId())).thenReturn(true);
	
		boolean actual=service.existsByAdminId(testdata.getAdminId());
		
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("get admin  Id if not exists")
	void testGetByIdNotExists () {
		AdminModel id=new AdminModel(7,"bhargav sai","12345678");
		Admin testdata=new Admin(10,"wrond admin","12098342");
		
		Mockito.when(repo.findById(testdata.getAdminId())).thenReturn(Optional.empty());
		
		AdminModel actual = service.findById(testdata.getAdminId());
		assertNull(actual);
	}
	
}