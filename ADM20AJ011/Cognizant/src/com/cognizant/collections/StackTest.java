package com.cognizant.collections;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//System.out.println(stack.peek()); //java.util.EmptyStackException
		//System.out.println(stack.pop()); //java.util.EmptyStackException
		
		System.out.println("Is stack empty = "+ stack.empty());
		stack.push(10);		
		System.out.println("Position of 10 = "+ stack.search(10));
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("Position of 10 = "+ stack.search(10));
		
		System.out.println(stack);
		System.out.println(stack.peek());//Looks at the object at the top of this stack without removing itfrom the stack.
		System.out.println(stack);
		
		System.out.println(stack.pop()); //Removes the object at the top of this stack and returns thatobject as the value of this function.
		System.out.println(stack);
		System.out.println("Position of 10 = "+ stack.search(10));
	}

}
