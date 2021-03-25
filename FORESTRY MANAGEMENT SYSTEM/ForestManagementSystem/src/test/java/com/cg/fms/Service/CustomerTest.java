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

import com.cg.fms.dao.CustomerDao;
import com.cg.fms.entity.Contract;
import com.cg.fms.entity.Customer;
import com.cg.fms.model.AdminModel;
import com.cg.fms.model.ContractModel;
import com.cg.fms.model.CustomerModel;
import com.cg.fms.service.CustomerServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CustomerTest {
	@Mock
	private CustomerDao repo;
	@InjectMocks
	CustomerServiceImpl service;

	@Test
	@DisplayName("customer Details should retrive")
	void testGetAll() {
		List<Customer> testData=Arrays.asList(new Customer[] {
				new Customer("2","Age626@","abhishek","abhi@007gmail.com", "kolkata street 121 -a block","kolkata","801121", "9876543211"),
				new Customer("1","aAbhishek#e626@","abhishek","abhi@007gmail.com", "kolkata street 121 -a block","kolkata","801121", "9876543211")
		});
		
		Mockito.when(repo.findAll()).thenReturn(testData);
		
		List<CustomerModel> expected=Arrays.asList(new CustomerModel[] {
				new CustomerModel("2","Age626@","abhishek","abhi@007gmail.com", "kolkata street 121 -a block","kolkata","801121", "9876543211"),
				new CustomerModel("4","Age626@","abhishek","abhi@007gmail.com", "kolkata street 121 -a block","kolkata","801121", "9876543211")
		});
		
		List<CustomerModel> actual = service.findAll();
		
		assertEquals(expected,actual);

	}
	
	@Test
	@DisplayName("get by Customer id ")
	void testGetById () {
		
		Customer testdata=new Customer("4","Age626@","abhishek","abhi@007gmail.com", "kolkata street 121 -a block","kolkata","801121", "9876543211");
		
		CustomerModel expected=new CustomerModel("4","Age626@","abhishek","abhi@007gmail.com", "kolkata street 121 -a block","kolkata","801121", "9876543211");
		
		Mockito.when(repo.findById(testdata.getCustomerId())).thenReturn(Optional.of(testdata));
	
		CustomerModel actual=service.findById(testdata.getCustomerId());
		
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("get by customer id return null")
	void testGetByIdNull() {		
		Mockito.when(repo.findById("4"));
		
		CustomerModel actual = service.findById("4");
		assertNull(actual);
	}
	
	@Test
	@DisplayName("exists by customer Id ")
	void testExistsBynumber () {
		CustomerModel id=new CustomerModel("4","Age626@","abhishek","abhi@007gmail.com", "kolkata street 121 -a block","kolkata","801121", "9876543211");
		Customer testdata=new Customer("4","Age626@","abhishek","abhi@007gmail.com", "kolkata street 121 -a block","kolkata","801121", "9876543211");
		
		boolean expected=true;
		
		Mockito.when(repo.existsById(testdata.getCustomerId())).thenReturn(true);
	
		boolean actual=service.existsByCustomerId(testdata.getCustomerId());
		
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("get Customer id if not exists")//negative testcase
	void testGetByIdNotExists () {
		CustomerModel id=new CustomerModel("abc","Age626@","abhishek","abhi@007gmail.com", "kolkata street 121 -a block","kolkata","801121", "9876543211");
		Customer testdata=new Customer("6","Age626@","abhishek","abhi@007gmail.com", "kolkata street 121 -a block","kolkata","801121", "9876543211");
		
		Mockito.when(repo.findById(testdata.getCustomerId())).thenReturn(Optional.empty());
		
		CustomerModel actual = service.findById(testdata.getCustomerId());
		assertNull(actual);

	}
}