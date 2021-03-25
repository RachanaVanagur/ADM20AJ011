package com.cognizant.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	//@Qualifier("de")
	@Qualifier("pe")
	private Engine eng;

	public Car() {
		System.out.println("**** Car :: Constructor ****");
	}

	public void drive() {
		System.out.println("----- Car drive() method");
		Integer engStatus = eng.start();
		if(engStatus == 0)
			System.out.println("----- Journey starts-----");
		else
			System.out.println("---- engine trouble------");
	}
}
