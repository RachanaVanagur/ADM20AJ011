package com.cognizant.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EnumerationIteratorDiff {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Integer> marks = new ArrayList<>(Arrays.asList(92,78,93,87,65,90));
		System.out.println(marks);
		
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"    ");
			/*
			if(n == 87)
				it.remove();
			*/
			it.remove();
			Thread.sleep(1000);
		}
		System.out.println();
		System.out.println(marks);
	}

}
