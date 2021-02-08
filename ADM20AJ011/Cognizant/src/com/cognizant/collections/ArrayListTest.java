package com.cognizant.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		//List<String> names = new ArrayList<String>();
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names + " | Size = "+ names.size());
		
		names.add("Sunil");
		names.add("Sunil");
		names.add("Naveen");
		names.add("Sanjay");
		names.add("Aashish");
		names.add("Jaswanth");
		System.out.println(names + " | Size = "+ names.size());
		
		names.add(1,"Kavya");
		System.out.println(names + " | Size = "+ names.size());
		names.add("Sunil");
		//to replace an element
		names.set(3,"Cognizant");
		System.out.println(names + " | Size = "+ names.size());
		
		System.out.println("Is Participants Empty = " + names.isEmpty());
		
		System.out.println("Is \"Sunil\" in list of Participats = " + names.contains("Sunil"));
		
		System.out.println("Location of Sunil = "+ names.indexOf("Sunil"));
		System.out.println("Location of Sunil from Last = "+ names.lastIndexOf("Sunil"));
		
		System.out.println("Person @ index 0 = "+ names.get(0));
		
		List<String> newNames = Arrays.asList("Mamtha", "Harsha", "Elizabeth","Akhil");
		names.addAll(newNames);
		System.out.println(names + " | Size = "+ names.size());
		
		System.out.println(names.remove("Sunil")); //true;
		System.out.println(names.remove(0)); //Kavya
		
		System.out.println(names + " | Size = "+ names.size());
	}
}
