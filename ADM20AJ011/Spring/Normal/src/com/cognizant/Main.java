package com.cognizant;

public class Main {
	
	public static void main(String[] args) {
		Student stud1 = new Student();
		stud1.setName("Sanjay");
		System.out.println(stud1);
		
		Student stud2 = new Student("Joseph");
		System.out.println(stud2);
	}
}
