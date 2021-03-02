package com.cognizant.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cognizant.Logics;

public class LogicsTest {

	@Test
	public void testFindLargest() {
		int max = Logics.findLargest(new int[] {15,6,87,42,9});
		assertEquals(87, max);
	}
	
	@Test
	public void testFindLargest1() {
		int max = Logics.findLargest(new int[] {-15,-6,-87,-42,-9});
		assertEquals(-6, max);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testFindLargest2() {
		int max = Logics.findLargest(new int[] {});
		assertEquals(0, max);
	}
	
	@Test
	public void testFindCube() {
		assertEquals(27,Logics.findCube(3));
	}
	@Test
	public void testFindCube1() {
		assertEquals(-27,Logics.findCube(-3));
	}
	
	@Test
	public void testReverseWords() {
		String str = "my name is Sunil";
		assertEquals("ym eman si linuS ",Logics.reverseWords(str));
	}
}
