package com.cognizant.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cognizant.Arithmetic;

public class ArithmeticTest {
	private Arithmetic arithmeticObj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		arithmeticObj = new Arithmetic();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDoSum() {		
		//assertEquals(30, arithmeticObj.doSum(10, 20));
		assertEquals("my message incase the test fails",30, arithmeticObj.doSum(11, 20));
	}

}
