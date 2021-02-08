package com.cognizant.collections;

import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<StringBuffer> names = new TreeSet<>();
		
		System.out.println(names.add(new StringBuffer("Sunil"))); //true
		System.out.println(names.add(new StringBuffer("Sunil"))); //false
		System.out.println(names.add(new StringBuffer("Anil"))); //true
		names.add(new StringBuffer("Rahul"));
		names.add(new StringBuffer("Sanjay"));
		names.add(new StringBuffer("Praveen"));
		System.out.println(names);
		
		names.add(null);
		System.out.println(names);
	}
}
