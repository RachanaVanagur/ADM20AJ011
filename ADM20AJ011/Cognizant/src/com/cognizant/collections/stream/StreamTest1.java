package com.cognizant.collections.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10,11,12,13,14,15,16,17,18,19,20);		
		System.out.println(nums);
		
		Stream<Integer> st1 = nums.stream();
		//to display each element using Stream
		st1.forEach(n->System.out.print(n+" | "));
		System.out.println();
		
		st1 = nums.stream();
		st1.forEach(System.out::print); //method reference
		
		System.out.println();
		//get even numbers from the List
		System.out.println("Even Numbers in List");
		//Normal Approach
		List<Integer> evenNums = new ArrayList<>();
		for(Integer n : nums) {
			if(n%2==0)
				evenNums.add(n);
		}
		System.out.println(evenNums);
		
		//Approach using Streams
		Stream<Integer> st2 = nums.stream();
		Stream<Integer> st3 = st2.filter(n->n%2==0);
		List<Integer> evenNums1 = st3.collect(Collectors.toList());
		System.out.println(evenNums);
		
		List<Integer> evenNums2 = nums.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNums2);
		
		List<Integer> modifiedNums = nums.stream().map(n->n+10).collect(Collectors.toList());
		System.out.println(modifiedNums);
		
		//Processing using Stream
		System.out.println("------------- processing using Stream --------------");
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		System.out.println(strings);
		
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered);
		
		List<String> topics = Arrays.asList("core java","adv java","hibernate","sPRING");		
		System.out.println(topics);
		
		List<String> topicsInUpper = topics.stream().map(topic->{return topic.toUpperCase();}).collect(Collectors.toList());
		System.out.println(topicsInUpper);
		
		long num = topics.stream().filter(topic -> topic.length()>5).count();
	    System.out.println("No of Topics with more than 5 characters Length = "+ num);
	    
	    List<String> sorted_topics = topics.stream().sorted().collect(Collectors.toList());
	    System.out.println(sorted_topics);
	}
}
