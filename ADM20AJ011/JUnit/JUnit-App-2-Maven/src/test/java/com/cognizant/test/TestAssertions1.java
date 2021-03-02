package com.cognizant.test;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//@FixMethodOrder(MethodSorters.DEFAULT)
@FixMethodOrder(MethodSorters.JVM)
public class TestAssertions1 {
	@Test
	public void testAssertCEqualsAndSame() {		
		String s1 = "JUnit";
		String s2 = "JUnit";
		
		assertEquals(s1,s2); 
		assertSame(s1,s2);
		
		String s3 = new String("JUnit");
		String s4 = new String("JUnit");
		assertNotSame(s3,s4);
	}
	
	@Test
	public void testAssertANull() {
		//String str = null;
		String str = "null";
		assertNull(str);		
	}

	@Test
	public void testAssertDTrue() {
		int num1 = 12, num2=24;
		assertTrue(num1<num2);		
	}	
	
	@Test
	public void testAssertBArrayEquals() {
		int[] arr1 = {10,20,30,40};
		int[] arr2 = {10,20,30,40};
		assertArrayEquals(arr1, arr2);	
		//assertEquals(arr1, arr2);
		System.out.println(arr1.equals(arr2));
		char[] arr3 = {'A','B','C'};
		char[] arr4 = {65,66,67};
		assertArrayEquals(arr3, arr4);
	}
	
}
