package com.cognizant.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
  public List<String> getGenders(){
	  List<String> genders = new ArrayList<String>();
	  genders.add("Male");
	  genders.add("Female");
	  return genders;
  }
  
  public List<String> getCourses(){
	  List<String> courses = Arrays.asList("Select a Course","Java",".NET","Python","R Language","PHP");
	  return courses;
  }
  
  public List<String> getTimings(){
	  List<String> timings = new ArrayList<String>();
	  timings.add("Morning");
	  timings.add("Afternoon");
	  timings.add("Evening");
	  return timings;
  }  
}
