package com.ce.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArithOperationsTest2 {
	
	ArithOperations arith;
	
	@BeforeEach
	public void setUp() {
		arith = new ArithOperations();
	}
	
	@AfterEach
	public void tearDown() {
		arith = null;
	}
	
	@Test
	@DisplayName("to test sum function when two inputs are zero")
	public void testSum_givenZeros() {
		int expected = 0;
		int actual = arith.sum(0,  0);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testSum_givenPositves() {
		int expected = 5;
		int actual = arith.sum(3, 2);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testSum_givenNegatives() {
		int expected = -7;
		int actual = arith.sum(-3, -4);
		Assertions.assertEquals(expected, actual);
	}
	
	
	@Test
	public void testIsEven_WhenEvenIsGiven() {
		boolean actual = arith.isEven(10);
		Assertions.assertTrue(actual);
	}
	
	@Test
	public void testIsEven_WhenOddIsGiven() {
		boolean actual = arith.isEven(7);
		Assertions.assertFalse(actual);
	}
}



