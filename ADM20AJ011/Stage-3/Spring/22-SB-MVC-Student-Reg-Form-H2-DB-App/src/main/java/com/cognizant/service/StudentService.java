package com.cognizant.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.entity.GenderDtlsEntity;
import com.cognizant.repository.CourseRepository;
import com.cognizant.repository.CourseTimimgsRepository;
import com.cognizant.repository.GenderRepository;

@Service
public class StudentService {
  @Autowired	
  GenderRepository genderRepo;	
  
  @Autowired
  CourseRepository courseRepo;
  
  @Autowired
  CourseTimimgsRepository courseTimimgRepo;
  
  public List<String> getGenders(){
	  /*
	  List<String> genders = new ArrayList<String>();
	  
	  List<GenderDtlsEntity> allGenders = genderRepo.findAll();
	  allGenders.forEach(genderEntity->{
		  genders.add(genderEntity.getGenderText());  	
	  });
	  */
	  List<String> genders = genderRepo.getGenderText();
			  
	  return genders;
  }
  
  public List<String> getCourses(){	  
	  return courseRepo.getCourseNames();
  }
  
  public List<String> getTimings(){
	  return courseTimimgRepo.getCourseTimings();
  }  
}
