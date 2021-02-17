package com.cognizant.util;

import java.io.IOException;

public class GarbageTest {

	public static void main(String[] args) throws IOException {
		Person p1 = new Person("Sunil","Joseph",35);
		Person p2 = new Person("Praveen","Kumar",31);
		
		System.out.println(p1);
		System.out.println(p2);
		/*
		p1 = null;
		p2 = null;
		*/
		p1=p2;
		
		Runtime.getRuntime().exec("notepad");
		
		System.out.println("--------------------------------");
		System.gc();
	}
}
