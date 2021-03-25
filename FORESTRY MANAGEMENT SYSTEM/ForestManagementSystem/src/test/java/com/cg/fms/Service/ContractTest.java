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

import com.cg.fms.dao.ContractDao;
import com.cg.fms.entity.Admin;
import com.cg.fms.entity.Contract;
import com.cg.fms.model.AdminModel;
import com.cg.fms.model.ContractModel;
import com.cg.fms.service.ContractServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ContractTest {
	@Mock
	private ContractDao repo;
	@InjectMocks
	ContractServiceImpl service;

	@Test
	@DisplayName("contract Details should retrive")
	void testGetAll() {
		List<Contract> testData=Arrays.asList(new Contract[] {
				new Contract("2",null,null, "kolkata","2020-11-11","105", null),
				new Contract("1",null,null, "chennai","2020-12-12","150", null)
		});
		
		Mockito.when(repo.findAll()).thenReturn(testData);
		
		List<ContractModel> expected=Arrays.asList(new ContractModel[] {
				new ContractModel("2",null, null, "kolkata","2020-11-11","105", null),
				new ContractModel("1",null, null, "chennai","2020-12-12","100", null)
		});
		
		List<AdminModel> actual = service.findAll();
		
		assertEquals(expected,actual);

	}
	
	@Test
	@DisplayName("get by Contract number ")
	void testGetById () {
		
		Contract testdata=new Contract("1",null, null, "chennai","2020-12-12","100", null);
		
		ContractModel expected=new ContractModel("1",null, null, "chennai","2020-12-12","100", null);
		
		Mockito.when(repo.findById(testdata.getContractNumber())).thenReturn(Optional.of(testdata));
	
		AdminModel actual=service.findById(testdata.getContractNumber());
		
		assertEquals(expected,actual);
	}
	
	@Test
	@DisplayName("get by contract id,if not return null")
	void testGetByIdNull() {		
		
		Mockito.when(repo.findById("1")).thenReturn(Optional.empty());
		
		AdminModel actual = service.findById(1);
		assertNull(actual);
	}
	
	@Test
	@DisplayName("exists by contract number ")
	void testExistsBynumber () {
		ContractModel id=new ContractModel("6",null,null,"chennai","2020-11-15","100",null);
		Contract testdata=new Contract("7",null,null,"chennai","2020-11-15","100",null);
		
		boolean expected=true;
		
		Mockito.when(repo.existsByContractId(testdata.getContractNumber())).thenReturn(true);
	
		boolean actual=service.existsByContractId(testdata.getContractNumber());
		
		assertEquals(expected,actual);
	}
	@Test
	@DisplayName("get contract number if not exists")//negative testcase
	void testGetByIdNotExists () {
		ContractModel id=new ContractModel("7",null,null,"chennai","2020-11-15","100",null);
		Contract testdata=new Contract("6",null,null,"chennai","2020-11-15","100",null);
		
		Mockito.when(repo.findById(testdata.getContractNumber())).thenReturn(Optional.empty());
		
		AdminModel actual = service.findById(testdata.getContractNumber());
		assertNull(actual);
	}
}