package com.cg.tddp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cg.tddp.excep.ZeroNotAllowedException;

class ArithmeticServiceImplTest {

	
	ArithmeticServiceImpl service;
	
	@BeforeEach
	void runBeforeAnyTestCase() {
		service = new ArithmeticServiceImpl();
	}
	
	@AfterEach
	void cleanAfterEachTestCase() {
		service = null;
	}
	
	@Test
	@DisplayName("should return 0 when two equal numbers are given")
	void subtractTestShouldReturn0GivenTwoEquals() {
		int[] testData = {2,2}; 
		int actual = service.subtract(testData); 
		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("should return +ve when first number is larger than second")
	void subtractTestShouldReturnPositiveGivenFirstNumberLarger() {
		int[] testData = {2,1}; 
		int actual = service.subtract(testData); 
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("should return -ve given first number is smaller than second")
	void subtractTestShouldReturnNegativeGivenFirstNumberSmaller() {
		int[] testData = {1,2}; 
		int actual = service.subtract(testData); 
		int expected = -1;
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("should return 1 when two numbers equal")
	void divideTestShouldReturn1GivenTwoEquals() throws ZeroNotAllowedException {
		assertEquals(1, service.divide(2,2));
	}
	
	@Test
	@DisplayName("should return +ve quotient when two +ves are given")
	void divideTestShouldReturnPositiveGivenTwoPositives() throws ZeroNotAllowedException {
		assertEquals(2, service.divide(20,10));
	}
	
	@Test
	@DisplayName("should return -ve given any one as negative")
	void divideTestShouldReturnNegativeGivenOneNegative() throws ZeroNotAllowedException {
		assertEquals(-2, service.divide(20,-10));
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