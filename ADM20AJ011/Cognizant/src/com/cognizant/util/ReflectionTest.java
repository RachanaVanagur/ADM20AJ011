package com.cognizant.util;

public class ReflectionTest {

	public static void main(String[] args) throws Exception{
		Class pClass = Class.forName("com.cognizant.util.Person");
		
		@SuppressWarnings("deprecation")
		Person p = (Person)pClass.newInstance();
		System.out.println(p);
	}
}
