package com.cognizant.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) throws InterruptedException {
		//Vector<Integer> v = new Vector<Integer>();
		//Vector<Integer> v = new Vector<Integer>(5);//initial_capacity-5
		Vector<Integer> v = new Vector<Integer>(5,3);//initial_capacity-5, capacity_increment-3
		
		System.out.println(v+" |Size="+v.size()+" |Capacity="+v.capacity());
		
		for(int i=11; i<=20;i++) {
			v.add(i);
		}
		System.out.println(v+" |Size="+v.size()+" |Capacity="+v.capacity());
		
		v.add(21);
		System.out.println(v+" |Size="+v.size()+" |Capacity="+v.capacity());
		
		Enumeration<Integer> en = v.elements();
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"   ");
			Thread.sleep(1000);
		}		
	}
}
