package com.cognizant.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<String, Float> bank = new LinkedHashMap<>();
		
		bank.put("Sunil", 15000f);
		bank.put("Anil", 25000f);
		bank.put("Sanjay", 12500f);
		bank.put("Charles", 48250f);
		bank.put("Rahul", 75000f);
		
		System.out.println(bank);			

	}

}
