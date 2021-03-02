package com.cognizant.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAnnotationsEx {
	private static ArrayList<String> names;
	
	@Test
	public void testM1() {
		System.out.println("--- m1() method - test case");
		System.out.println("Is List Empty = "+ names.isEmpty());
		assertTrue(names.isEmpty());
		names.add("Aashish");
		assertFalse(names.isEmpty());
		assertEquals(1, names.size());		
	}
	
	@Before
	public void setup() {
		//names = new ArrayList<String>();
		System.out.println("--- before each test case method");
	}
	
	@Test
	public void testM2() {
		System.out.println("--- m2() method - test case");
		System.out.println(names.isEmpty());
		assertTrue(names.isEmpty());		
	}
	
	@BeforeClass
	public static void beforeAllTest() {
		names = new ArrayList<String>();
	}
	
	@After
	public void afterEachTest() {
		names.clear();
		System.out.println("--- after each test case method");
	}
	
	@Test
	@Ignore
	public void testM3() {
		System.out.println("--- m3() method - test case");
		assertEquals(0,names.size());		
	}	
	
	@Test(timeout=1000)
	public void testM4() throws InterruptedException {
		System.out.println("--- m4() method - test case");
		Thread.sleep(1050);
		System.out.println("--- m4() method - test - completed");
	}
	
	@Test(timeout=2000)
	public void testM5() {
		System.out.println("--- m5() method - test case");
		while(true) {}
		//System.out.println("--- m5() method - test - completed");
	}
	
	/*
	@Test(expected = NoSuchMethodException.class)
	public void testM6() throws NoSuchMethodException {
		System.out.println("--- m6() method - test case");
		throw new NoSuchMethodException();
	}
	*/
	@Test(expected = IndexOutOfBoundsException.class)
	public void testM6() {
		System.out.println("--- m6() method - test case");
		System.out.println(names.get(0));
	}	
}
