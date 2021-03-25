package com.cognizant;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cognizant.students.entity.StudentsEntity;
import com.cognizant.students.repository.StudentsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentsRepository studRepo = context.getBean(StudentsRepository.class); //Proxy design pattern - implementation class will be created internally
		//System.out.println("****- "+studRepo.getClass().getName());
		
		/*
		//to save a Student
		StudentsEntity stud = new StudentsEntity();
		stud.setStudentId(102);
		stud.setStudentName("Naveen Kumar");
		stud.setStudentEmail("naveen@gmail.com");
		
		studRepo.save(stud);
		System.out.println("Student Saved!");
		*/
		
		/*
		//to get a Student based on Student ID
		Optional<StudentsEntity> optStud = studRepo.findById(101);
		//System.out.println(optStud.isPresent());
		if(optStud.isPresent()) {
			StudentsEntity stud = optStud.get();
			System.out.println(stud);
		}else {
			System.out.println("No matching student with the specified ID");
		}
		*/
		
		/*
		//to delete a Student based on ID
		Optional<StudentsEntity> optStud = studRepo.findById(102);
		if(optStud.isPresent())
			studRepo.deleteById(102);
		else {
			System.out.println("No student to delete");
		}
		*/
		
		/*
		StudentsEntity entity1 = new StudentsEntity(102,"Naveen","naveen@gmail.com");
		StudentsEntity entity2 = new StudentsEntity(103,"Charles","charels@gmail.com");
		StudentsEntity entity3 = new StudentsEntity(104,"Chris","Chris@gmail.com");
		StudentsEntity entity4 = new StudentsEntity(105,"Praveen","praveen@hotmail.com");
		
		List<StudentsEntity> students = Arrays.asList(entity1, entity2, entity3, entity4);
		
		studRepo.saveAll(students);
		*/
		
		//System.out.println("Is Student with ID 101 exists = " + studRepo.existsById(101));
		
		//Iterable<StudentsEntity> students = studRepo.findAll();
		Iterable<StudentsEntity> students = studRepo.findAllById(Arrays.asList(101,102,125,103));
		for(StudentsEntity stud : students) {
			System.out.println(stud);
		}
		
		System.out.println("No of Students = " + studRepo.count());
		context.close();
		
	}

}
