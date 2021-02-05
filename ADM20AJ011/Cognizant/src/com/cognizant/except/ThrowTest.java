package com.cognizant.except;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("enter two numbers:");
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(y == 0) {
				//ArithmeticException aex = new ArithmeticException();
				ArithmeticException aex = new ArithmeticException("cannot divide a number by zero");
				throw aex;
			}
			int z = x / y;
			System.out.println(x + " / " + y + " = " + z);
		} catch (Exception ex) {
			System.out.println("--- catch block ---");
			System.out.println("Message: " + ex.getMessage());
			System.out.println(ex.toString());
		}
		System.out.println("--- DONE ---");
	}

}
