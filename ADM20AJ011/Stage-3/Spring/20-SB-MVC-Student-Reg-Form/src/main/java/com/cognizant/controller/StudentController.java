package com.cognizant.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.bindings.Student;
import com.cognizant.service.StudentService;

@Controller
@RequestMapping("/cms")
public class StudentController {
  @Autowired
  private StudentService studentService;
  
  @GetMapping(value = {"/","/student"})	
  public String loadForm(Model model) {
	  model.addAttribute("student", new Student());
	  
	  model.addAttribute("genders", studentService.getGenders());
	  model.addAttribute("courses", studentService.getCourses());
	  model.addAttribute("timings", studentService.getTimings());
	  
	  return "studentReg";
  }
  
  @PostMapping("/saveStudent")
  public String handleSaveStudent(Student student, Model model) {
	  //logic to save student details in DB
	  System.out.println(student);
	  
	  model.addAttribute("student",student);
	  model.addAttribute("selectedTimings", Arrays.toString(student.getTimings()));
	  
	  return "studentData";
  }
}
