package com.cognizant.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); //false
		System.out.println(names.add("Anil")); //true
		names.add("Rahul");
		names.add("Sanjay");
		names.add("Praveen");
		
		System.out.println(names);
		
		System.out.println("First Element = "+ names.first());
		System.out.println("Last Element = "+ names.last());
		
		Set<String> headSet = names.headSet("Rahul");
		System.out.println("Head Set = " + headSet);
		
		Set<String> tailSet = names.tailSet("Rahul");
		System.out.println("Tail Set = " + tailSet);	
		
		System.out.println("Lower of Rahul = "+ names.lower("Rahul"));
		System.out.println("Floor of Rahul = "+ names.floor("Rahul"));
		
		Set<String> reverseOrder = names.descendingSet();
		System.out.println(reverseOrder);
	}

}
