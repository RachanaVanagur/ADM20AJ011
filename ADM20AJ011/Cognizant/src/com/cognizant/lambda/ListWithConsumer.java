package com.cognizant.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListWithConsumer {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Anil","Charles","Mark","Jefferey","Chris");
		
		names.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);				
			}			
		});
		
		System.out.println();
		names.forEach(name -> System.out.print(name+" | "));
	}
}
