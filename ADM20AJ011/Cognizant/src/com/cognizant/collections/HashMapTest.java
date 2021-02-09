package com.cognizant.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String, Float> bank = new HashMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 15000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f)); //15000.0
		System.out.println(bank.put("Anil", 25000f)); //null
		bank.put("Sanjay", 12500f);
		bank.put("Charles", 48250f);
		bank.put("Rahul", 75000f);
		
		System.out.println(bank);
		System.out.println("---------------------------------");
		
		Float bal = bank.get("Sunil");
		System.out.println("A/c Balance of \"Sunil\" = "+ bal);
		
		bal += 1250.5f;
		bank.put("Sunil", bal);
		System.out.println("---------------------------------");
		
		System.out.print("A/C Holders:     ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name+" | ");
		}
		System.out.println();
		
		System.out.println("---------------------------------");
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String, Float>> it = entries.iterator();
		while(it.hasNext()) 
		{
			Map.Entry<String, Float> entry = it.next();
			
			String name = entry.getKey();
			bal = entry.getValue();
			System.out.println(name+" --> "+ bal);
			//Thread.sleep(2000);
		}
		System.out.println("---------------------------------");
		System.out.println(bank);
		
		//System.out.println(("Rahul".hashCode()) & 15);
	}
}
