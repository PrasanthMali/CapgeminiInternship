package com.cg.tddp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.cg.tddp.excep.ZeroNotAllowedException;

class ArithmeticServiceImplParameterizedTest {


	ArithmeticServiceImpl service;
	
	@BeforeEach
	void runBeforeAnyTestCase() {
		service = new ArithmeticServiceImpl();
	}
	
	@AfterEach
	void cleanAfterEachTestCase() {
		service = null;
	}
	
	@ParameterizedTest
	@CsvSource({"2,2,0","2,1,1","1,2,-1"})
	@DisplayName("subtract should work")
	void subtractTestShouldWork(int td1, int td2, int exp) {
		int[] testData = {td1, td2}; 
		int actual = service.subtract(testData); 
		int expected = exp;
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@CsvSource({"2,2,1","20,10,2","20,-10,-2"})
	@DisplayName("divide should return work")
	void divideTestShouldWork(int td1, int td2, int exp) throws ZeroNotAllowedException {
		assertEquals(exp, service.divide(td1,td2));
	}
	
		
	@Test
	@DisplayName("should throw ZeroNotAllowedException when any number is 0 except first number")
	void divideTestShouldThrowZeroNotAllowedExceptionGivenZeroExceptFirsstNumber() {
		assertThrows(ZeroNotAllowedException.class, ()-> {
			service.divide(1,2,0,5);		// we are passing function as parameter to assertThrows
			// that in-turn call service.divide()
		});
	}
	
	
	
}