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

import com.cg.fms.dao.ILandDao;
import com.cg.fms.entity.Customer;
import com.cg.fms.entity.Land;
import com.cg.fms.model.CustomerModel;
import com.cg.fms.model.LandModel;
import com.cg.fms.service.LandServiceImpl;

@ExtendWith(MockitoExtension.class)
public class LandTest {

	@Mock
		private ILandDao repo;
		@InjectMocks
		LandServiceImpl service;
	
		@Test
		@DisplayName("Land Details should retrive")
		void testGetAll() {
			List<Land> testData=Arrays.asList(new Land[] {
					new Land(1,"12","avinash","10000"),
					new Land(1,"123","r sai krishna","10000")
			});
			
			Mockito.when(repo.findAll()).thenReturn(testData);
			
			List<LandModel> expected=Arrays.asList(new LandModel[] {
					new LandModel(1,"12","avinash","10000"),
					new LandModel(1,"12","r sai krishna","10000")
			});
			
			List<LandModel> actual = service.findAll();
			
			assertEquals(expected,actual);
	
		}
		
		@Test
		@DisplayName("get by land id ")
		void testGetById () {
			
			Land testdata=new Land(1,"12","avinash","10000");
			
			LandModel expected=new LandModel(1,"12","avinash","10000");
			
			Mockito.when(repo.findById(testdata.getLandId())).thenReturn(Optional.of(testdata));
		
			CustomerModel actual=service.findById(testdata.getLandId());
			
			assertEquals(expected,actual);
		}
		
		@Test
		@DisplayName("get by land id return null")
		void testGetByIdNull() {		
			Mockito.when(repo.findById("4"));
			
			CustomerModel actual = service.findById(1);
			assertNull(actual);
		}
		
		@Test
		@DisplayName("exists by land Id ")
		void testExistsBynumber () {
			LandModel id=new LandModel(1,"123","avinash","10000");
			Land testdata=new Land(1,"123","avinash","10000");			
			boolean expected=true;
			
			Mockito.when(repo.existsById(testdata.getLandId())).thenReturn(true);
		
			boolean actual=service.existsByCustomerId(testdata.getLandId());
			
			assertEquals(expected,actual);
		}
		@Test
		@DisplayName("get land id if not exists")//negative testcase
		void testGetByIdNotExists () {
			LandModel id=new LandModel(1,"12","abhishek","10000");
			Land testdata=new Land(1,"12","abhishek","10000");
			
			Mockito.when(repo.findById(testdata.getLandId())).thenReturn(Optional.empty());
			
			CustomerModel actual = service.findById(testdata.getLandId());
			assertNull(actual);
	
		}

}