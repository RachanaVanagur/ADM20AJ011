package com.cognizant.beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {
 public Engine() {
	 System.out.println("**** Engine :: Constructor ****");
 }
 public Integer start() {
	 //logic to start engine 
	 System.out.println("----- Engine start() method ----");
	 return 0;
 }
}
