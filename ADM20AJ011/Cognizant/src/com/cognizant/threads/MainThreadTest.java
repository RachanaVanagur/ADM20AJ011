package com.cognizant.threads;

public class MainThreadTest {

	public static void main(String[] args) {
		int noOfThreads = Thread.activeCount();
		System.out.println("No of Active Threads = "+ noOfThreads);
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println("Name = " + t.getName());
		System.out.println("Priority = " + t.getPriority());
		ThreadGroup tgp = t.getThreadGroup();
		System.out.println(tgp);
		long threadId = t.getId();
		System.out.println("Thread ID = "+ threadId);
		
		t.setName("cognizant");
		//t.setPriority(11); //java.lang.IllegalArgumentException
		t.setPriority(10);
		System.out.println(t);
	}
}
