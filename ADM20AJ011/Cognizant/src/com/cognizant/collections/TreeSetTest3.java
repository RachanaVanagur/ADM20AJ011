package com.cognizant.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest3 {

	public static void main(String[] args) {
		TreeSet<Integer> marks = new TreeSet<Integer>(new MyComparator());
		
		marks.add(76);
		marks.add(55);
		marks.add(98);
		marks.add(82);
		marks.add(90);
		marks.add(77);
		marks.add(81);
		
		System.out.println(marks);
	}
}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 > o2)
			return -1;
		else if(o1 < o2)
			return 1;
		else
			return 0;
	}
	
}
