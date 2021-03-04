package com.cognizant.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.cognizant.service.Calculator;
import com.cognizant.service.CalculatorImpl;

@DisplayName("CALCULATOR TESTS")
//@Disabled
class CalculatorTestWithDisplayName {
static Calculator calc = null;
	
	@BeforeAll
	public static void initSetup() {
		calc = new CalculatorImpl();	
	}
	
	//@Test
	@DisplayName("ADDITION")
	//@RepeatedTest(value = 3)
	@RepeatedTest(value = 3, name = "{displayName} - {currentRepetition}/{totalRepetitions}")
	void testAdd() {
		System.out.println("--- testAdd() method");
		assertEquals(10, calc.add(5, 5));
		//assertEquals(11,calc.add(5, 5),"5 + 5 must generate 10");
	}

	@Test
	@DisplayName(value="SUBTRACTION")
	void testSub() {
		System.out.println("--- testSub() method");
		assertEquals(0, calc.sub(5, 5));		
	}

	@Test
	@DisplayName("MULTIPLICATION")
	//@Disabled	
	void testProd() {
		System.out.println("--- testProd() method");
		assertEquals(25, calc.prod(5, 5));	
	}

	@Test
	@DisplayName("DIVISION")
	void testDiv() {
		System.out.println("--- testDiv() method");
		assertEquals(1, calc.div(5, 5));		
	}
}
