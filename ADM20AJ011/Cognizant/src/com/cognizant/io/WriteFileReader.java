package com.cognizant.io;

import java.io.FileWriter;

public class WriteFileReader {

	public static void main(String[] args) throws Exception {
		FileWriter fout = new FileWriter("src/com/cognizant/io/cognizant1.txt");
				
		String data = "Cognizant is an American multinational product led digital corporation that provides digital products, digital IT services, including digital, technology, consulting, and operations services. It sells digital products on cloud based data engineering, model based testing tool, process automation tool RPA***\n";
				
		fout.write(data);
		
		System.out.println("File Saved!");
		
		fout.close();

	}

}
