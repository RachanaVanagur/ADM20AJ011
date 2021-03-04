package com.cognizant.service;

public class CalculatorImpl implements Calculator {

	public int add(int x, int y) {		
		return x+y;
	}

	public int sub(int x, int y) {
		return x-y;
	}

	public int prod(int x, int y) {
		return x*y;
	}

	public int div(int x, int y) {
		return x/y;
	}

}
