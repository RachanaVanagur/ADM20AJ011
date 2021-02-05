package com.cognizant.except;

public class MultiCatchTest {

	public static void main(String[] args) {
		try {
			
		}		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}
	}
}
