package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entity.Customer;

public interface CustomerService {
	
	public Customer serviceGetCustomer(String customerId);

	public Customer serviceAddCustomer(Customer customer);

	public Customer serviceUpdateCustomer(Customer customer);

	public Customer serviceDeleteCustomer(String customerId);

	public List<Customer> serviceGetAllCustomers();
}