package com.cognizant.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring.bank.BankOperations;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		//BankOperations bank = (BankOperations)context.getBean("bank");
		BankOperations bank = (BankOperations)context.getBean("proxy");
		
		bank.deposit();
		System.out.println("---------------------------");
		bank.deposit("SBI10054152", 25000.5f);
	}

}
