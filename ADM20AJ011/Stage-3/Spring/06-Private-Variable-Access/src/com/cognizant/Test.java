package com.cognizant;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception{
		/*
		Account acc = new Account();
		acc.name = "Sunil Joseph"; //Error- The field Account.name is not visible
		System.out.println(acc);
		*/
		Class<?> clz = Class.forName("com.cognizant.Account");
		Field nameField = clz.getDeclaredField("name");
		
		nameField.setAccessible(true);
		
		Object obj = clz.newInstance();
		
		nameField.set(obj, "Sunil Joseph");
		System.out.println(obj);
	}

}
