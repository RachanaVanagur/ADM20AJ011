package com.cognizant.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//initialize the spring container
		ApplicationContext factory = new ClassPathXmlApplicationContext("context.xml");
		
		
		Student st1 = (Student)factory.getBean("stud1");
		System.out.println(st1);		
		System.out.println("-----------------------------------");
		Student st2 = factory.getBean("stud2",Student.class);
		System.out.println(st2);		
		
		System.out.println("-----------------------------------");		
	}
}
