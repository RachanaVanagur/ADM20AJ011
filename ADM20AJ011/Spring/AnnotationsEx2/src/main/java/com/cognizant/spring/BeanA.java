package com.cognizant.spring;

public class BeanA {
	private String name;
	public BeanA() {
		System.out.println("--- default constuctor of BeanA");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("---inside setName() method of BeanA");
		this.name = name;
	}

	@Override
	public String toString() {
		return "BeanA [name=" + name + "]";
	}

}
