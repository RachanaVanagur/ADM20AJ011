package com.cognizant.test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorEx {
	@Rule
	public ErrorCollector collector = new ErrorCollector();
	
	@Test
	public void test() {
		System.out.println("Line - 1");
		collector.addError(new Throwable("an error in line-2"));
		
		System.out.println("Line - 2");
		collector.addError(new Throwable("an error in line-3"));
		try {
			assertTrue("A"=="B");
		}catch(Throwable t) {
			System.out.println(t);
			collector.addError(t);			
		}
		System.out.println("Line - 3");
	}
}
