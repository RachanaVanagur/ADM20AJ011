package com.cognizant.collections.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		   List<Person> people = Arrays.asList(
				   	new Person("Charles", "Deckens", 60), 
				   	new Person("Lewis", "Carroll", 42),
					new Person("Thomas", "Deckens", 51), 
					new Person("Chris", "Stine", 43),
					new Person("Charles", "Jem", 20));
		   
		   people.forEach(p -> System.out.println(p));
		   System.out.println();
		   people.forEach(System.out::println);
		   System.out.println();
		   
		   people.stream()
		    .filter(p->p.getFirstName().startsWith("C"))
		    .forEach(p->System.out.println(p));
		   
		   System.out.println();
		   
		   Stream.iterate(1, element->element+1)
			.filter(element->element%5==0)
			.limit(10)
			.forEach(System.out::println);
	}

}
