package com.ce.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithOperationsTest {
	
	@Test
	public void testSum_givenZeros() {
		ArithOperations arith = new ArithOperations();
		int expected = 0;
		int actual = arith.sum(0,  0);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testSum_givenPositves() {
		ArithOperations arith = new ArithOperations();
		int expected = 5;
		int actual = arith.sum(3, 2);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testSum_givenNegatives() {
		ArithOperations arith = new ArithOperations();
		int expected = -7;
		int actual = arith.sum(-3, -4);
		Assertions.assertEquals(expected, actual);
	}
	
	
	@Test
	public void testIsEven_WhenEvenIsGiven() {
		ArithOperations arith = new ArithOperations();
		boolean actual = arith.isEven(10);
		Assertions.assertTrue(actual);
	}
	
	@Test
	public void testIsEven_WhenOddIsGiven() {
		ArithOperations arith = new ArithOperations();
		boolean actual = arith.isEven(7);
		Assertions.assertFalse(actual);
	}
}



