package com.cognizant.beans;

import org.springframework.stereotype.Component;

@Component("pe")
public class PetrolEngine implements Engine {

	@Override
	public Integer start() {
		System.out.println("** PetrolEngine :: start() called **");
		return 0;
	}

}
