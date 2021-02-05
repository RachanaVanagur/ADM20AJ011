package com.cognizant.except;

import java.io.Closeable;
import java.io.IOException;

class MyResource1 implements Closeable{
	public void logic() {
		System.out.println("Resource-1 Logic...");
	}

	@Override
	public void close() throws IOException {
		System.out.println("Closing MyResource - 1");		
	}
}

class MyResource2 implements AutoCloseable{
	@Override
	public void close() throws Exception {
		System.out.println("Closing MyResource - 2");
	}	
	public void logic() {
		System.out.println("Resource-2 Logic...");
	}	
}


public class TryWithResource1 {
	public static void main(String[] args) {
		try(MyResource1 res1 = new MyResource1(); MyResource2 res2 = new MyResource2();)
		{
		  res1.logic();
		  res2.logic();		
		  System.out.println("--- try block ---");
		}
		catch(Exception ex) {
			System.out.println("---catch block---");
		}
		System.out.println("---END---");
	}
}
