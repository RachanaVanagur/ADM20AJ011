package com.cognizant.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveObject {

	public static void main(String[] args) throws Exception {
		
		Product product = new Product(10123,"Keyboard",12,250f);
		System.out.println(product);
		
		FileOutputStream fout = new FileOutputStream("src/com/cognizant/io/product.txt");
		
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		//to write an object to OutputStream
		oout.writeObject(product);
		
		System.out.println("Product Saved!");
		fout.close();
		oout.close();
	}
}
