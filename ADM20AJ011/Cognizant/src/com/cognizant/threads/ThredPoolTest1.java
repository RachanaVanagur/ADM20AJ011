package com.cognizant.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThredPoolTest1 {
 public static void main(String[] args) {
		CognizantTask task = new CognizantTask();
		
		ExecutorService threadPool = Executors.newFixedThreadPool(10);
		
		for(int i=1;i<=7;i++) {
			threadPool.execute(task);
		}
		
		System.out.println("No of Active Threads = "+ Thread.activeCount());
		
		threadPool.shutdown();
 }
}
