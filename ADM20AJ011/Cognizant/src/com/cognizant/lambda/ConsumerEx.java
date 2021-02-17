package com.cognizant.lambda;

import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> consume = (name)->System.out.println("Hello, "+name);
		
		consume.accept("Cognizant");
	}
}
