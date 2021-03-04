package com.cognizant.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.cognizant.Arithmetic;

@RunWith(Parameterized.class)
public class ArithmeticTest1 {
	int fno;
	int sno;
	int expResult;	
	
	Arithmetic obj = null;	
	
	public ArithmeticTest1(int fno, int sno, int expResult) {
		super();
		System.out.println("---constructor---");
		this.fno = fno;
		this.sno = sno;
		this.expResult = expResult;
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("---setUp---");
		obj = new Arithmetic();
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
	}
	
	/*
	//----- normal approach ----
	@Test
	public void testDoSum() {
		assertEquals("10 + 10 must be 20", 20, obj.doSum(10, 10));
		assertEquals("20 + 20 must be 40", 40, obj.doSum(20, 20));
		assertEquals("30 + 20 must be 50", 50, obj.doSum(30, 20));
	}
	*/
	@Parameters
	public static Collection<Integer[]> input(){
		Collection<Integer[]> params = Arrays.asList(new Integer[][] {{10,10,20},{20,20,40},{30,20,50}});
		System.out.println("---- input ---");
		return params;
	}
	
	@Test
	public void testDoSum() {	
		assertEquals(expResult, obj.doSum(fno, sno));
		System.out.println("Sum of "+ fno + " + "+sno+" = "+expResult);
	}
}
