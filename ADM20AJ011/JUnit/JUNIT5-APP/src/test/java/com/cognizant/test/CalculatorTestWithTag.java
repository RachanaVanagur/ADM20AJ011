package com.cognizant.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.cognizant.service.Calculator;
import com.cognizant.service.CalculatorImpl;

class CalculatorTestWithTag {
	static Calculator calc = null;
	
	@BeforeAll
	public static void initSetup() {
		calc = new CalculatorImpl();		
	}
	
	@AfterAll
	public static void finalCleanUp() {
		calc = null;
	}
	
	@Test
	@Tag("dev")
	void testAdd() {
		System.out.println("--- testAdd() method - development");
		assertEquals(10, calc.add(5, 5));
		//assertEquals(11,calc.add(5, 5),"5 + 5 must generate 10");
	}

	@Test
	@Tag("prod")
	void testSub() {
		System.out.println("--- testSub() method - production");
		assertEquals(0, calc.sub(5, 5));		
	}

	@Test
	@Tag("qa")
	void testProd() {
		System.out.println("--- testProd() method - qa");
		assertEquals(25, calc.prod(5, 5));	
	}

	@Test
	@Tag("dev")
	void testDiv() {
		System.out.println("--- testDiv() method - development");
		assertEquals(1, calc.div(5, 5));		
	}
}
