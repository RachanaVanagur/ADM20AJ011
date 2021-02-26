package com.cognizant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring.NumsOperations;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		NumsOperations nums = (NumsOperations)context.getBean("nums");
		
		nums.add(10, 20);
		System.out.println("-------------------------");
		nums.sub(10, 20);
		System.out.println("-------------------------");
		nums.prod(10, 20);
	}
}
