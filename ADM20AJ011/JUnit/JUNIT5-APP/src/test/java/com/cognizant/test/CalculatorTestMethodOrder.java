package com.cognizant.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.cognizant.service.Calculator;
import com.cognizant.service.CalculatorImpl;

@TestMethodOrder(Alphanumeric.class) //first sorting using 0-9 and then A-Z sorting order
class CalculatorTestMethodOrder {
	static Calculator calc = null;
	
	@BeforeAll
	public static void initSetup() {
		calc = new CalculatorImpl();
		System.out.println("- inside @BeforeAll...");	
		System.out.println("----------------------------------");
	}
	
	@AfterAll
	public static void finalCleanUp() {
		calc = null;		
		System.out.println("- inside @AfterAll...");
	}
	
	@BeforeEach
	public void beforeEachTest() {
		System.out.println("-- inside @BeforeEach...");
	}
	
	@AfterEach
	public void afterEachTest() {
		System.out.println("-- inside @AfterEach...");
		System.out.println("----------------------------------");
	}	
	@Test
	void testAdd() {
		System.out.println("--- testAdd() method");
		assertEquals(10, calc.add(5, 5));
		//assertEquals(11,calc.add(5, 5),"5 + 5 must generate 10");
	}

	@Test
	void testSub() {
		System.out.println("--- testSub() method");
		assertEquals(0, calc.sub(5, 5));		
	}

	@Test
	void testProd() {
		System.out.println("--- testProd() method");
		assertEquals(25, calc.prod(5, 5));	
	}

	@Test
	void testDiv() {
		System.out.println("--- testDiv() method");
		assertEquals(1, calc.div(5, 5));		
	}


}
