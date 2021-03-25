package com.cognizant.beans;

import org.springframework.stereotype.Component;

@Component(value = "de")
public class DieselEngine implements Engine {

	@Override
	public Integer start() {
		System.out.println("** DieselEngine :: start() called **");
		return 0;
	}

}
