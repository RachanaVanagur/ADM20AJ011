package com.cognizant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring.Department;
import com.cognizant.spring.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Employee emp = (Employee)context.getBean("emp1");
		System.out.println(emp);
		
		Department dept = emp.getDept();
		System.out.println(dept.toString());
		
		System.out.println();
		
		emp = (Employee)context.getBean("emp1");
		System.out.println(emp);
		
		dept = emp.getDept();
		System.out.println(dept.toString());
		
	}
}
