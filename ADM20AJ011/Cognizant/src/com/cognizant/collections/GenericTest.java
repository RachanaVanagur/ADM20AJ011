package com.cognizant.collections;

public class GenericTest {

	public static void main(String[] args) {
		Employee<Long> emp1 = new Employee<Long>(101L,"Sunil");
		System.out.println(emp1);
		
		Employee<String> emp2 = new Employee<String>("COG-11524","Sagar");
		System.out.println(emp2);
		
		Employee<Integer> emp3 = new Employee<>(20661,"Joseph");
		System.out.println(emp3);
	}

}
