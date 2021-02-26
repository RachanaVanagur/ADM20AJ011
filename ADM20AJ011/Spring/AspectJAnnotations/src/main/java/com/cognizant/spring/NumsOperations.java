package com.cognizant.spring;

public class NumsOperations {
 public void add(int x, int y) {
	 System.out.println("--inside add()");
	 System.out.println("Sum = "+(x+y));
 }
 public void sub(int x, int y) {
	 System.out.println("-- inside sub()");
	 System.out.println("Diff = "+(x-y));
 }
 
 public void prod(int x, int y) {
	 System.out.println("Product = "+(x*y));
 }
}
