package com.cognizant.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Initialize spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		//Product p1 = (Product)context.getBean("product");
		Product p1 = (Product)context.getBean("prod");
		System.out.println(p1);
		System.out.println(p1.hashCode());
		System.out.println("--------------------------------");
		
		Product p2 = (Product)context.getBean("prod");
		System.out.println(p2);
		System.out.println(p2.hashCode());
		
		System.out.println("-------------------------------");
		((ConfigurableApplicationContext)context).close();
	}
}
