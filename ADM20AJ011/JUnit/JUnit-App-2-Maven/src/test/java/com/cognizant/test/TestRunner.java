package com.cognizant.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestSuite;

public class TestRunner {

	public static void main(String[] args) {
		//Result result = JUnitCore.runClasses(LogicsTest.class);		
		Result result = JUnitCore.runClasses(AllTests.class);		
		
		List<Failure> failures = result.getFailures();
		
		System.out.println("No of Testcase Failures = "+ result.getFailureCount());
		
		for(Failure failure : failures) {
			System.out.println(failure.toString()+" | "+failure.getMessage());
		}
		System.out.println("Is Test case(s) Successfull - "+ result.wasSuccessful());
	}

}
