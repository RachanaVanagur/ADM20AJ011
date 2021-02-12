package com.cognizant.threads;

import java.util.concurrent.TimeUnit;

public class Lifecycle {
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		for(int i=1; i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" - " + i);
			//Thread.sleep(1000);//100ms - 1 sec
			TimeUnit.SECONDS.sleep(1);
			//TimeUnit.MINUTES.sleep(1);
			if(i==4)
				//t.suspend();
				t.stop();
		}
	}
}
