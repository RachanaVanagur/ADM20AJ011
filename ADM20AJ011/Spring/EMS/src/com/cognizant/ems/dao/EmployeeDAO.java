package com.cognizant.ems.dao;

import java.util.List;

import com.cognizant.ems.entity.Employee;

public interface EmployeeDAO {
 void saveEmp(Employee emp);
 void updateEmp(Employee emp);
 void deleteEmp(int eno);
 Employee searchEmp(int eno);
 List<Employee> getEmployees();
}
