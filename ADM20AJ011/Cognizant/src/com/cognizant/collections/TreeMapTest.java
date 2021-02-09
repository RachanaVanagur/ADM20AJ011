package com.cognizant.collections;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String, Float> bank = new TreeMap<>();
		
		System.out.println(bank.put("Sunil", 15000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f)); //15000.0
		System.out.println(bank.put("Anil", 25000f)); //null
		bank.put("Sanjay", 12500f);
		bank.put("Charles", 48250f);
		bank.put("Rahul", 75000f);
		
		System.out.println(bank);		

	}

}
