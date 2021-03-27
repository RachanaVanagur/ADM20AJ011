package com.cognizant.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Employee;

@RestController
public class EmployeeController {
 @GetMapping("/employee")	
 public Employee getEmployee() {
	 Employee emp = new Employee();
	 emp.setEmpId(101);
	 emp.setEname("Sunil Joseph");
	 emp.setSal(2500.5f);
	 return emp;
 }
 @GetMapping("/employee1")	
 public ResponseEntity<Employee> getEmployee_1() {
	 Employee emp = new Employee();
	 emp.setEmpId(101);
	 emp.setEname("Sunil Joseph");
	 emp.setSal(2500.5f);
	 return new ResponseEntity<Employee>(emp, HttpStatus.OK);
 }
 
 @GetMapping("/employees")	
 public ResponseEntity<List<Employee>> getEmployees() {
	 List<Employee> emps = Arrays.asList(new Employee(1,"Sunil",2500f), new Employee(2,"Sanjay",4500f),new Employee(3,"Sagar",3450f));
	 return new ResponseEntity<>(emps, HttpStatus.OK);
 } 
}
