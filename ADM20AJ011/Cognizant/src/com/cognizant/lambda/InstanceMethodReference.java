package com.cognizant.lambda;

interface Inter1{
	public void greetings(String name);
}

public class InstanceMethodReference {
 void myMethod(String name) {
	 System.out.println("Hai, "+name+" (for method reference)");
 }
 
 public static void main(String[] args) {
	 Inter1 obj = (name)-> System.out.println("Hello, "+name+" (using lambda)");
	 obj.greetings("Sanjay");
	 
	 InstanceMethodReference myRef = new InstanceMethodReference();
	 myRef.myMethod("Sunil");
	 
	 Inter1 obj1 = myRef::myMethod;
	 obj1.greetings("Sunil");
 }
}
