package com.cognizant.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		System.out.println(names.add("Anil")); //true
		names.add("Rahul");
		names.add("Sanjay");
		names.add("Praveen");
		
		System.out.println(names);
		
		Iterator<String> it= names.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		
		names.add(null);
		System.out.println(names);
	}
}
