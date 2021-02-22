package com.cognizant.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//initialize the spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");		
		
		Student st1 = (Student)context.getBean("stud1");
		System.out.println(st1);
		
		Student st2 = (Student)context.getBean("stud2");
		System.out.println(st2);		
		
		Student st3 = (Student)context.getBean("cog_stud");
		System.out.println(st3);		
	}
}
