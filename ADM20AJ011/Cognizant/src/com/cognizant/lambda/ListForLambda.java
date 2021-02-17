package com.cognizant.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListForLambda {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Sunil","Joseph",35),
				new Person("Anil","Kumar",32),
				new Person("Sanjay","Singh",28),    
				new Person("Joshy","Abraham",19)
				);
		System.out.println(persons);
		System.out.println("--------------------------------");
		/*
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		*/
		Collections.sort(persons, (person1, person2)-> person1.getFirstName().compareTo(person2.getFirstName()));
		System.out.println(persons);
		
		System.out.println("--------------------------------");
		
		List<Person> personsWithAgeGreaterThan30 = findPersonsWithAgeGreaterThan30(persons, (Person p)->p.getAge()>30);
		System.out.println(personsWithAgeGreaterThan30);
		
		System.out.println("--------------------------------");
		printAllPersons(persons, (p)->System.out.println(p));
	}

	private static void printAllPersons(List<Person> persons, Consumer<Person> con) {
		for(Person p : persons) {
			con.accept(p);
		}
	}

	private static List<Person> findPersonsWithAgeGreaterThan30(List<Person> persons, Predicate<Person> predicate) {
		List<Person> newPersons = new ArrayList<>();
		for(Person p : persons) {
			if(predicate.test(p))
				newPersons.add(p);
		}
		return newPersons;
	}

}
