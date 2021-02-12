package com.cognizant.threads;

class MyTask1 implements Runnable{
    public void run() {
    	Thread t = Thread.currentThread();
    	System.out.println(t);
    }
}

public class ThreadTest1 {
	public static void main(String[] args) {
		System.out.println("No of Active Threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		Runnable task1 = new MyTask1();
		//create a thread for above instance
		Thread ct = new Thread(task1); //new thread
		ct.start(); //runnable thread
		
		System.out.println("No of Active Threads = " + Thread.activeCount());
	}
}
