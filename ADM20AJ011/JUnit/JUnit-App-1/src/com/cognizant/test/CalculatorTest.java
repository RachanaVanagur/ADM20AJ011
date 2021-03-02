package com.cognizant.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	static Calculator cal = null;
	
	@BeforeClass
	public static void initStep() {
		System.out.println("--- @BeforeClass annotated method");
		cal = new Calculator();
	}
	
	@AfterClass
	public static void cleanUp() {
		System.out.println("--- @AfterClass annotated method");
		cal = null;
	}
	
	@Before
	public void preCondition() {
		System.out.println("--- @Before annotated method");
	}
	
	@After
	public void afterTest() {
		System.out.println("--- @After annotated method");
	}
	
	@Test
	public void testAddNum() {
		//fail("Not yet implemented");
		System.out.println("---- testAddNum()");		
		int fno=10;
		int sno=20;
		int res = cal.addNum(fno, sno);
		assertEquals(30, res);
	}
	
	@Test
	@Ignore("not yet implemented..")
	public void testAddNum1() {
		System.out.println("---- testAddNum1()");		
		int fno=-10;
		int sno=20;
		int res = cal.addNum(fno, sno);
		assertEquals(10, res);
	}
	
	
}
