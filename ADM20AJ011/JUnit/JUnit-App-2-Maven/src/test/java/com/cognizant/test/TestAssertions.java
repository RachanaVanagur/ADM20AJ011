package com.cognizant.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestAssertions {

	@Test
	public void testAssertEqualsAndSame() {		
		String s1 = "JUnit";
		String s2 = "JUnit";
		
		assertEquals(s1,s2); 
		assertSame(s1,s2);
		
		String s3 = new String("JUnit");
		String s4 = new String("JUnit");
		assertNotSame(s3,s4);
	}
	
	@Test
	public void testAssertNull() {
		//String str = null;
		String str = "null";
		assertNull(str);		
	}

	@Test
	public void testAssertTrue() {
		int num1 = 12, num2=24;
		assertTrue(num1<num2);		
	}	
	
	@Test
	public void testAssertArrayEquals() {
		int[] arr1 = {10,20,30,40};
		int[] arr2 = {10,20,30,40};
		assertArrayEquals(arr1, arr2);	
		//assertEquals(arr1, arr2);
		System.out.println(arr1.equals(arr2));
		char[] arr3 = {'A','B','C'};
		char[] arr4 = {65,66,67};
		assertArrayEquals(arr3, arr4);
	}
	
	@Test
	public void testAssertSame1() {	
		/*
		Integer n1 = Integer.valueOf(250);
		Integer n2 = Integer.valueOf(250);
		*/
		Integer n1 = Integer.valueOf(127);
		Integer n2 = Integer.valueOf(127);
		assertSame(n1, n2);		
	}
}
