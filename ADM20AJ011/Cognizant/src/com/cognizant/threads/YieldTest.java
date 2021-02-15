package com.cognizant.threads;

class MyCounterThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Child Thread - " + i);
		}
	}
}

public class YieldTest {
	public static void main(String[] args) {
		MyCounterThread t = new MyCounterThread();
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread - " + i);
			Thread.yield();
		}		
	}
}
