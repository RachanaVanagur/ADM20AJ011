package com.cognizant.threads;

class MyTask2 extends Thread{
    public void run() {
    	Thread t = Thread.currentThread();
    	System.out.println(t);
    }
}

public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println("No of Active Threads = " + Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);		
		
		//create a thread for above instance
		Thread ct = new MyTask2(); //new thread
		ct.start(); //runnable thread
		//ct.run();
		//ct.start(); //java.lang.IllegalThreadStateException
		System.out.println("No of Active Threads = " + Thread.activeCount());
	}
}

