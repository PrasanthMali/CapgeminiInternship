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

import com.cg.fms.dao.ISchedulerDao;
import com.cg.fms.entity.Product;
import com.cg.fms.entity.Scheduler;
import com.cg.fms.model.LandModel;
import com.cg.fms.model.ProductModel;
import com.cg.fms.model.SchedulerModel;
import com.cg.fms.service.SchedulerServiceImpl;

@ExtendWith(MockitoExtension.class)
public class SchedulerTest {
	
	@Mock
	private ISchedulerDao repo;
	@InjectMocks
	SchedulerServiceImpl service;

	@Test
	@DisplayName("Scheduler Details should retrive")
	void testGetAll() {
		List<Scheduler> testData=Arrays.asList(new Scheduler[] {
				new Scheduler("11","abhishek","9876543211",null,null,"tn-A11-100"),
				new Scheduler("11","abhishek","9876543211",null,null,"tn-A11-100")
		});
		
		Mockito.when(repo.findAll()).thenReturn(testData);
		
		List<SchedulerModel> expected=Arrays.asList(new SchedulerModel[] {
				new SchedulerModel("11","abhishek","9876543211","tn-A-1000"),
				new SchedulerModel("11","abhishek","9876543211","tn-A-1000")
		});
		
		List<LandModel> actual = service.findAll();
		
		assertEquals(expected,actual);

	}
	
	@Test
	@DisplayName("get by Scheduler id ")
	void testGetById () {
		
		Scheduler testdata=new Scheduler("11","abhishek","9876543211",null,null,"tn-A-1000");
		
		SchedulerModel expected=new SchedulerModel("11","abhishek","9876543211","tn-A-1000");
		
		Mockito.when(repo.findById(testdata.getSchedulerId())).thenReturn(Optional.of(testdata));
	
		ProductModel actual=service.findById(testdata.getSchedulerId());
		
		
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("get by Product id return null")
	void testGetByIdNull() {		
		Mockito.when(repo.findById("4"));
		
		ProductModel actual = service.findById("4");
		assertNull(actual);
	}
	
	@Test
	@DisplayName("exists by Scheduler Id ")
	void testExistsBynumber () {
		SchedulerModel id=new SchedulerModel("11","abhishek","9876543211","tn-A-1000");
		Scheduler testdata=new Scheduler("11","abhishek","9876543211",null,null,"tn-A-1000");			
		boolean expected=true;
		
		Mockito.when(repo.existsById(testdata.getSchedulerId())).thenReturn(true);
	
		boolean actual=service.existsBySchedulerId(testdata.getSchedulerId());
		
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("get Scheduler id if not exists")//negative testcase
	void testGetByIdNotExists () {
		SchedulerModel id=new SchedulerModel("11","abhishek","9876543211","tn-A-1000");
		Scheduler testdata=new Scheduler("11","abhishek","9876543211",null,null,"tn-A-1000");
		
		Mockito.when(repo.findById(testdata.getProductId())).thenReturn(Optional.empty());
		
		ProductModel actual = service.findById(testdata.getProductId());
		assertNull(actual);

	}

}
