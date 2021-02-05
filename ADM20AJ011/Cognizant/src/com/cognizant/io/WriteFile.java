package com.cognizant.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		//FileOutputStream fout = new FileOutputStream("src/com/cognizant/io/cognizant.txt");
		FileOutputStream fout = new FileOutputStream("src/com/cognizant/io/cognizant.txt", true); //true-appending mode
		
		String data = "Cognizant is an American multinational product led digital corporation that provides digital products, digital IT services, including digital, technology, consulting, and operations services. It sells digital products on cloud based data engineering, model based testing tool, process automation tool RPA***\n";
		byte[] b = data.getBytes(); //method to convert String to byte[]
		
		fout.write(b);
		System.out.println("File Saved!");
		
		fout.close();
	}
}
