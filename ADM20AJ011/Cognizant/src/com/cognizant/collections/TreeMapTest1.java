package com.cognizant.collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest1 {

	public static void main(String[] args) {
		TreeMap<String, Float> bank = new TreeMap<>(new MyComparatorForAccount());
		
		bank.put("Sunil", 15000f);
		bank.put("Anil", 25000f);
		bank.put("Sanjay", 12500f);
		bank.put("Charles", 48250f);
		bank.put("Rahul", 75000f);
		
		System.out.println(bank);		
	}
}

class MyComparatorForAccount implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		int n = o1.compareTo(o2);
		if(n > 0)
		 return -1;
		else if(n < 0)
		 return 1;
		else 
		 return 0;	
	}
	
}
