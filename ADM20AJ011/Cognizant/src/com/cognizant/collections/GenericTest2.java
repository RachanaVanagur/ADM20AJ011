//to implement Generic Methods
package com.cognizant.collections;

class MyClass1{
 static <T> void myMethod(T arg){
	 System.out.println("Type of argument = " + arg.getClass().getName() +" - "+ arg);
 }
}

public class GenericTest2 {
	public static void main(String[] args) {
		MyClass1.myMethod("Cognizant");
		MyClass1.myMethod(new Employee<Integer>(101,"Sanjay"));
		MyClass1.myMethod(152);
		MyClass1.myMethod(152L);
	}
}
