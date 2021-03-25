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

import com.cg.fms.dao.IOrderDao;
import com.cg.fms.entity.Land;
import com.cg.fms.entity.Order;
import com.cg.fms.model.CustomerModel;
import com.cg.fms.model.LandModel;
import com.cg.fms.model.OrderModel;
import com.cg.fms.service.OrderServiceImpl;

@ExtendWith(MockitoExtension.class)
public class OrderTest {
	@Mock
	private IOrderDao repo;
	@InjectMocks
	OrderServiceImpl service;

	@Test
	@DisplayName("order Details should retrive")
	void testGetAll() {
		List<Order> testData=Arrays.asList(new Order[] {
				new Order("1",null,null,null,"chennai","2020-11-05","10000",null),
				new Order("1",null,null,null,"chennai","2020-11-15","100",null)
		});
		
		Mockito.when(repo.findAll()).thenReturn(testData);
		
		List<OrderModel> expected=Arrays.asList(new OrderModel[] {
				new OrderModel("1",null,null,null,"chennai","2020-11-05","10000",null),
				new OrderModel("1",null,null,null,"chennai","2020-11-55","100",null)
		});
		
		List<LandModel> actual = service.findAll();
		
		assertEquals(expected,actual);

	}
	
	@Test
	@DisplayName("get by order id ")
	void testGetById () {
		
		Order testdata=new Order("1",null,null,null,"chennai","2020-11-05","10000",null);
		
		OrderModel expected=new OrderModel("1",null,null,null,"chennai","2020-11-05","10000",null);
		
		Mockito.when(repo.findById(testdata.getOrderNumber())).thenReturn(Optional.of(testdata));
	
		CustomerModel actual=service.findById(testdata.getOrderNumber());
		
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("get by Order id return null")
	void testGetByIdNull() {		
		Mockito.when(repo.findById("4"));
		
		CustomerModel actual = service.findById("1");
		assertNull(actual);
	}
	
	@Test
	@DisplayName("exists by land Id ")
	void testExistsBynumber () {
		OrderModel id=new OrderModel("1",null,null,null,"chennai","2020-11-05","10000",null);
		Order testdata=new Order("1",null,null,null,"chennai","2020-11-05","10000",null);			
		boolean expected=true;
		
		Mockito.when(repo.existsById(testdata.getOrderNumber())).thenReturn(true);
	
		boolean actual=service.existsByOrderNumber(testdata.getOrderNumber());
		
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("get land id if not exists")//negative testcase
	void testGetByIdNotExists () {
		OrderModel id=new OrderModel("1",null,null,null,"chennai","2020-11-05","10000",null);
		Order testdata=new Order("1",null,null,null,"chennai","2020-11-05","10000",null);
		
		Mockito.when(repo.findById(testdata.getOrderNumber())).thenReturn(Optional.empty());
		
		CustomerModel actual = service.findById(testdata.getOrderNumber());
		assertNull(actual);

	}
}