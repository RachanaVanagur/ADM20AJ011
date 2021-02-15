package com.cognizant.threads;

public class JoinTest1 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {			
				System.out.println("First task started...");
				System.out.println("Sleeping for 3 seconds");
				try {
					Thread.sleep(3000);
				}catch(Exception ex) {}
				System.out.println("First task completed...");
			}			
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Second task completed after first task...");
			}			
		});
		
		
		t1.start();
		t1.join();
		System.out.println("Is t1 thread alive = " + t1.isAlive());
		
		t2.start();
	}
}
