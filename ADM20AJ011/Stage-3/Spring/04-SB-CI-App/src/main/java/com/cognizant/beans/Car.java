package com.cognizant.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Engine eng;

	public Car() {
		System.out.println("**** Car :: Constructor ****");
	}

	@Autowired
	public Car(Engine eng) {
		super();
		System.out.println("---- parameterized Car constructor----");
		this.eng = eng;
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
