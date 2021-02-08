package com.cognizant.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) throws Exception{
		List<Integer> marks = Arrays.asList(92,78,93,87,65,90);
		
		listIteration1(marks);
		Thread.sleep(1500);
		
		listIteration2(marks);
		Thread.sleep(1500);
		
		listIteration3(marks);
		Thread.sleep(1500);
		
		listIteration4(marks);
		Thread.sleep(1500);
		
		listIteration5(marks);
	}
	
	static void listIteration1(List<Integer> data) {
		System.out.println("1)iteration using a normal for loop - only for java.util.List");
		for(int i=0;i<data.size();i++) {
			Integer n = data.get(i);
			System.out.print(n+"    ");
		}
		System.out.println("\n");
	}
	
	static void listIteration2(List<Integer> data) {
		System.out.println("2)iteration using an enhanced for loop");
		for(Integer n : data) {
			System.out.print(n+"    ");
		}
		System.out.println("\n");
	}
	
	static void listIteration3(List<Integer> data) {
		System.out.println("3)iteration using java.util.Iterator");
		Iterator<Integer> it = data.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"    ");
		}
		System.out.println("\n");
	}
	
	static void listIteration4(List<Integer> data) {
		System.out.println("4)iteration using java.util.ListIterator - only for java.util.List");
		ListIterator<Integer> lit = data.listIterator();
		while(lit.hasNext()) {
			Integer n = lit.next();
			System.out.print(n+"    ");
		}
		System.out.println();
		
		while(lit.hasPrevious()) {
			Integer n = lit.previous();
			System.out.print(n+"    ");
		}
		System.out.println("\n");
	}
	
	static void listIteration5(List<Integer> data) {
		System.out.println("5)iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(data);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"    ");
		}
		System.out.println("\n");
	}
}
