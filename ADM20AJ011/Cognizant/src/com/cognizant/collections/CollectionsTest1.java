package com.cognizant.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest1 {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(95,82,75,100,64,89,73);
		System.out.println(marks);
		
		System.out.println("Maximum Mark = " + Collections.max(marks));
		System.out.println("Minimum Mark = " + Collections.min(marks));
		
		Collections.sort(marks);
		System.out.println(marks);
	}
}
