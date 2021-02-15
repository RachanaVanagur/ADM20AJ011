package com.cognizant.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class CognizantTask implements Runnable{
	@Override
	public void run() {
		System.out.println("Inside run method....."); 
		System.out.println(Thread.currentThread().getName()+" - working");
		try {
			TimeUnit.SECONDS.sleep(5); //5 seconds
		}catch(Exception ex) {}
		System.out.println(Thread.currentThread().getName()+" - completed");
		System.out.println("---------------------------------");
	}	
}


public class ThreadPoolTest {
	public static void main(String[] args) {	
		
		CognizantTask task = new CognizantTask();
		/*
		Thread ct = new Thread(task);
		ct.start();
		Thread ct1 = new Thread(task);
		ct1.start();
		Thread ct2 = new Thread(task);
		ct2.start();
		*/
		//Executor executor = Executors.newSingleThreadExecutor();
		Executor executor = Executors.newFixedThreadPool(15);
		
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		executor.execute(task);
		
		executor.execute(task);
		executor.execute(task);
		
		System.out.println("No of Active Threads = "+ Thread.activeCount());
	}

}
