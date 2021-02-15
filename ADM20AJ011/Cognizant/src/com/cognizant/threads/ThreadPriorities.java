package com.cognizant.threads;

class Counter extends Thread{
	long time = 0;
  	public void run() {
  		while(true) {
  			time += 1;
  			System.out.println(Thread.currentThread().getName()+" - "+ time);
  		}
  	}
}

public class ThreadPriorities {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Min Priority = " + Thread.MIN_PRIORITY);
		System.out.println("Max Priority = " + Thread.MAX_PRIORITY);
		System.out.println("Normal Priority = " + Thread.NORM_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY + 3);
		System.out.println("---------------------------------");
		
		Counter counterThread1 = new Counter();		
		Counter counterThread2 = new Counter();		
		
		counterThread1.setPriority(9);
		counterThread2.setPriority(2);
		
		counterThread1.start();
		counterThread2.start();
		
		Thread.sleep(10000); //main thread is waiting for 10 secs
		counterThread1.stop();
		counterThread2.stop();
		
		System.out.println(counterThread1.time);
		System.out.println(counterThread2.time);
	}
}
