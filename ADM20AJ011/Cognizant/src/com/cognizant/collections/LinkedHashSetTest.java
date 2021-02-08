package com.cognizant.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<>();
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		System.out.println(names.add("Anil")); //true
		names.add("Rahul");
		names.add("Sanjay");
		names.add("Praveen");
		
		System.out.println(names);
	}
}
