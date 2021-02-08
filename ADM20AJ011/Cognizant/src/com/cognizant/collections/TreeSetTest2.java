package com.cognizant.collections;

import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		Product prod1 = new Product(125, "Keyboard");
		Product prod2 = new Product(113, "Monitor");
		Product prod3 = new Product(112, "Mouse");
		Product prod4 = new Product(119, "Cabinet");
		
		TreeSet<Product> products = new TreeSet<Product>();
		
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		products.add(prod4);
		
		System.out.println(products);
	}
}
