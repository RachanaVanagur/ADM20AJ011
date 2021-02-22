package com.cognizant.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//initialize the spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		System.out.println("-----------------------------------");
		
		//((ConfigurableApplicationContext)context).close();
		((AbstractApplicationContext)context).registerShutdownHook();
	}
}
