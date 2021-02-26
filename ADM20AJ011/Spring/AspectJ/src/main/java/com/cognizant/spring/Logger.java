package com.cognizant.spring;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {
	 public void log(){
 	   System.out.println("--- going to perform some logic before!");
	 }
	 public void afterLog() {
		 System.out.println("--- logic completed");
	 }
	 
	 public void logAround(ProceedingJoinPoint pjp) {
		 System.out.println("logic before ----");
		 try {
			pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("logic after ---");
	 }
}
