package com.cognizant.spring;

public class BeanB {
	private String name;

	public BeanB(String name) {		
		this.name = name;
		System.out.println("--- one argument constructor of BeanB");
	}

	@Override
	public String toString() {
		return "BeanB [name=" + name + "]";
	}
}
