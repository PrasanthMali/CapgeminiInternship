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

import com.cg.fms.dao.IProductDao;
import com.cg.fms.entity.Order;
import com.cg.fms.entity.Product;
import com.cg.fms.model.CustomerModel;
import com.cg.fms.model.LandModel;
import com.cg.fms.model.OrderModel;
import com.cg.fms.model.ProductModel;
import com.cg.fms.service.ProductServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ProductTest {
	
	@Mock
	private IProductDao repo;
	@InjectMocks
	ProductServiceImpl service;

	@Test
	@DisplayName("Product Details should retrive")
	void testGetAll() {
		List<Product> testData=Arrays.asList(new Product[] {
				new Product("11","timber wood","100","best wood in india."),
				new Product("12","timber wood","150","best wood in india.")
		});
		
		Mockito.when(repo.findAll()).thenReturn(testData);
		
		List<ProductModel> expected=Arrays.asList(new ProductModel[] {
				new ProductModel("11","timber wood","150","best wood in india."),
				new ProductModel("11","timber wood","150","best wood in india.")
		});
		
		List<LandModel> actual = service.findAll();
		
		assertEquals(expected,actual);

	}
	
	@Test
	@DisplayName("get by product id ")
	void testGetById () {
		
		Product testdata=new Product("11","timber wood","150","best wood in india.");
		
		ProductModel expected=new ProductModel("11","timber wood","150","best wood in india.");
		
		Mockito.when(repo.findById(testdata.getProductId())).thenReturn(Optional.of(testdata));
	
		ProductModel actual=service.findById(testdata.getProductId());
		
		
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("get by Product id return null")
	void testGetByIdNull() {		
		Mockito.when(repo.findById("4"));
		
		ProductModel actual = service.findById("1");
		assertNull(actual);
	}
	
	@Test
	@DisplayName("exists by Product Id ")
	void testExistsBynumber () {
		ProductModel id=new ProductModel("11","timber wood","150","best wood in india.");
		Product testdata=new Product("11","timber wood","150","best wood in india.");			
		boolean expected=true;
		
		Mockito.when(repo.existsById(testdata.getProductId())).thenReturn(true);
	
		boolean actual=service.existsByProductNumber(testdata.getProductId());
		
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("get product id if not exists")//negative testcase
	void testGetByIdNotExists () {
		ProductModel id=new ProductModel("11","timber wood","150","best wood in india.");
		Product testdata=new Product("11","timber wood","150","best wood in india.");
		
		Mockito.when(repo.findById(testdata.getProductId())).thenReturn(Optional.empty());
		
		ProductModel actual = service.findById(testdata.getProductId());
		assertNull(actual);

	}

}