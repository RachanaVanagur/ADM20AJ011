package com.cognizant.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cognizant.bindings.Student;
import com.cognizant.service.StudentService;

@Controller
@RequestMapping("/cms")
public class StudentController {
  @Autowired
  private StudentService studentService;
  
  @ModelAttribute
  public void init(Model model) {
	  System.out.println("================ init() method called ============");
	  
	  model.addAttribute("genders", studentService.getGenders());
	  model.addAttribute("courses", studentService.getCourses());
	  model.addAttribute("timings", studentService.getTimings());
  }
  
  @GetMapping(value = {"/","/student"})	
  public String loadForm(Model model) {
	  model.addAttribute("student", new Student());	  
	  return "studentReg";
  }
  
  @PostMapping("/saveStudent")
  public String handleSaveStudent(Student student, BindingResult result, Model model, RedirectAttributes redirectAttributes) {
	  //logic to save student details in DB
	  System.out.println(student);	  

	  //model.addAttribute("student",student);
	  model.addAttribute("selectedTimings", Arrays.toString(student.getTimings()));
	 
	  //return "studentReg";
	  redirectAttributes.addFlashAttribute("student", student);
	  return "redirect:studentSavingSuccess";
  }
  
  @GetMapping("/studentSavingSuccess")
  public String afterStudentSaving(Student student, Model model) {	  
	  System.out.println(student); 	
 	model.addAttribute("student", student); 	
 	 return "studentReg";
  }
}
