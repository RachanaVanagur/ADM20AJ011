package com.cognizant.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.cognizant.service.Calculator;
import com.cognizant.service.CalculatorImpl;

@TestMethodOrder(OrderAnnotation.class)
class CalculatorTest {
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
	@Order(value = 1)
	void testAdd() {
		System.out.println("--- testAdd() method");
		assertEquals(10, calc.add(5, 5));
		//assertEquals(11,calc.add(5, 5),"5 + 5 must generate 10");
	}

	@Test
	@Order(2)
	void testSub() {
		System.out.println("--- testSub() method");
		assertEquals(0, calc.sub(5, 5));		
	}

	@Test
	@Order(3)
	void testProd() {
		System.out.println("--- testProd() method");
		assertEquals(25, calc.prod(5, 5));	
	}

	@Test
	@Order(value = 4)
	void testDiv() {
		System.out.println("--- testDiv() method");
		assertEquals(1, calc.div(5, 5));		
	}

}
