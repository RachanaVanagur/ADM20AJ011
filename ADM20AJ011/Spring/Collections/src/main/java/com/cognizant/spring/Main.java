package com.cognizant.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Databases db = (Databases) context.getBean("db");
		List<String> dbnames = db.getDbNames();
		System.out.println(dbnames);
		
		MIS mis = (MIS)context.getBean("employees");
		Map<Integer,String> emps = mis.getEmps();
		System.out.println(emps);
		
		Courses crs = (Courses)context.getBean("courses");
		Set<String> cnames = crs.getCourseNames();
		System.out.println(cnames);
	}
}
