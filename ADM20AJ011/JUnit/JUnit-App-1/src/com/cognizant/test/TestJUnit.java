package com.cognizant.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJUnit {
 @Test	
 public void testStringMatch() {
	 System.out.println("----testStringMatch()");
	 String str = "doing unit test";
	 //assertEquals(Object expected, Object actual);
	 //assertEquals("Doing unit test", str);
	 assertEquals("strings are not equals","doing unit test", str);
 }
}
