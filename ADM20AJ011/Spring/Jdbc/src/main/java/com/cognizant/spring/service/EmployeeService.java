package com.cognizant.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.spring.dao.EmployeeDAO;
import com.cognizant.spring.entity.Employee;

public class EmployeeService {
  @Autowired	
  private EmployeeDAO dao;
  
  public  void savingEmployee(Employee emp) {
	  int n = dao.saveEmp(emp);
	  System.out.println("Employee Saved - " + n);
  }
}
