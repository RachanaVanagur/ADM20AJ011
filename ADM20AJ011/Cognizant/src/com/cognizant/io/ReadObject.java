package com.cognizant.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("src/com/cognizant/io/product.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);
		
		Object obj = oin.readObject();
		//System.out.println(obj.getClass().getName());
		if(obj instanceof Product) {
			Product prod = (Product)obj;
			System.out.println(prod);
		}
		fin.close();
		oin.close();
	}

}
