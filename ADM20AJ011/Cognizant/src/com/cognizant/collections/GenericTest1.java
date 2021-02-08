package com.cognizant.collections;

class MyClass<T1,T2>{
	T1 data1;
	T2 data2;
	
	MyClass(T1 data1, T2 data2){
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return "MyClass [" + data1 + " | " + data2 + "]";
	}	
}

public class GenericTest1 {

	public static void main(String[] args) {
		MyClass<Integer,Integer> obj1 = new MyClass<Integer,Integer>(101,202);
		System.out.println(obj1);
		
		MyClass<Integer,String> obj2 = new MyClass<Integer,String>(231,"Cognizant");
		System.out.println(obj2);
	}

}
