package com.cognizant.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {
	 @Pointcut("execution(void com.cognizant.spring.NumsOperations.*(..))")
	 public void myPointcut() {} //pointcut name
	 
	 @Before("myPointcut()")
	 public void log(){
	 	   System.out.println("--- going to perform some logic before!");
	 }
	/*
	 @Before("execution(void com.cognizant.spring.NumsOperations.*(..))")
	 public void log(){
 	   System.out.println("--- going to perform some logic before!");
	 }
	 
	 @After("execution(* com.cognizant.spring.NumsOperations.*(..))")
	 public void afterLog() {
		 System.out.println("--- logic completed");
	 }
	*/	 
}
