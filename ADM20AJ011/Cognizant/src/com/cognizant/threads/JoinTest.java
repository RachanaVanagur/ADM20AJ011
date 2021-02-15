package com.cognizant.threads;

class MyMessengerThread extends Thread{
  public void run() {
	  System.out.println("Cognizant");
	  try {
		  Thread.sleep(3000);
	  }catch(Exception ex) {}
	  System.out.println("Business Solutions");
  }
}

public class JoinTest {
	public static void main(String[] args) throws InterruptedException {
		MyMessengerThread msgThread1 = new MyMessengerThread();
		MyMessengerThread msgThread2 = new MyMessengerThread();
		
		msgThread1.start();
		msgThread1.join();
		
		msgThread2.start();		
	}
}
