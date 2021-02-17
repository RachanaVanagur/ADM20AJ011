package com.cognizant.lambda;

public class StaticMethodReference {

	public static void myMethod() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}

	public static void main(String[] args) {
		Thread t = new Thread(StaticMethodReference::myMethod);

		t.start();
	}

}
