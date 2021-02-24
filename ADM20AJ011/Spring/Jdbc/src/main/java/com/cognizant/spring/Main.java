package com.cognizant.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring.entity.Employee;
import com.cognizant.spring.service.EmployeeService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		EmployeeService eservice = (EmployeeService) context.getBean("empservice");
		
		Employee emp = new Employee(110,"Test",2500f);
		eservice.savingEmployee(emp);
	}
}
