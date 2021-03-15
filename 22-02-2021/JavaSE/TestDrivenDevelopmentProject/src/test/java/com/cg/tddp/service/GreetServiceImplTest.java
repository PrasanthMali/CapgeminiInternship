package com.cg.tddp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cg.tddp.excep.InvalidUserNameException;

class GreetServiceImplTest {

	static GreetServiceImpl service;
	
	@BeforeAll
	static void setUp() {
		service = new GreetServiceImpl();
	}
	
	@AfterAll
	static void tearDown() {
		service = null;
	}
	
	@Test
	@DisplayName("should return 'Hello Srinivas' given 'Srinivas'")
	void greetTest1() throws InvalidUserNameException {
		assertEquals("Hello Srinivas", service.greet("Srinivas"));
	}
	
	@Test
	@DisplayName("should return null given null")
	void greetTest2() throws InvalidUserNameException {
		assertNull(service.greet(null));
	}
	
	
	@Test
	@DisplayName("should throw InvalidUserNameException given empty string")
	void greetTest3() {
		assertThrows(InvalidUserNameException.class, ()-> {
			service.greet("");
		});
	}
}