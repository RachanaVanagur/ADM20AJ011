package com.cognizant.except;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class TryWithResource {

	public static void main(String[] args) {
		Reader console = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(console);
		try {
			System.out.print("Enter Your Name:");
			String name = br.readLine();
			System.out.println("Name = " + name);
		} catch (Exception ex) {}
	}
}
