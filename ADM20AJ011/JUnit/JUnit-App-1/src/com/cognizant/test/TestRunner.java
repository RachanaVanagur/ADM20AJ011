package com.cognizant.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestJUnit.class,CalculatorTest.class);
		
		List<Failure> failures = result.getFailures();
		
		System.out.println("No of Testcase Failures = "+ result.getFailureCount());
		
		for(Failure failure : failures) {
			System.out.println(failure.toString()+" | "+failure.getMessage());
		}
		System.out.println("Is Test case(s) Successfull - "+ result.wasSuccessful());
	}

}
