package com.cognizant.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		//FileInputStream fin = new FileInputStream("src/com/cognizant/io/java.txt");
		
		File file = new File("src/com/cognizant/io/java.txt");
		if(file.exists()) {
			System.out.println("Is Absolute Path = " + file.isAbsolute());
			System.out.println("Absolute Path = " + file.getAbsolutePath());
			System.out.println();
			
			FileInputStream fin = new FileInputStream(file);
			
			/*
			System.out.println("No of characters to read = " + fin.available());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println("No of characters to read = " + fin.available());
			*/
			
			/*
			//---- to read file contents byte by byte ---- 
			int n = fin.read();
			while(n != -1) {
				System.out.print((char)n);
				n = fin.read();
				Thread.sleep(250);
			}
			*/
			
			/*
			//---- to read file contents completely
			byte[] b = new byte[fin.available()]; //byte[] b = new byte[(int) file.length()];
			fin.read(b);
			String str = new String(b);
			System.out.println(str);
			*/
			
			//-- to read file contents line by line
			Reader sourceFile = new InputStreamReader(fin); //to convert a byte stream to character stream
			BufferedReader br = new BufferedReader(sourceFile);
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
				Thread.sleep(2000);
			}			
			fin.close();
		}
	}
}
