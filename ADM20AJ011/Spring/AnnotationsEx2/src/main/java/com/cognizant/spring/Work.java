package com.cognizant.spring;

public class Work {
 public Work() {
	 System.out.println("--- inside Work constructor");
 }
 public void workInit() {
	 System.out.println("---initializing Work");
 }
 public void workDestroy() {
	 System.out.println("---Destroying Work");
 }
 public void doWork() {
	 System.out.println("Working on Project");
 }
}
