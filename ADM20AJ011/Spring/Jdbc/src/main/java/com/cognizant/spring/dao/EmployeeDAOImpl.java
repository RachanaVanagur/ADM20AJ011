package com.cognizant.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cognizant.spring.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private JdbcTemplate template;
	
	public int saveEmp(Employee emp) {		
		String sql = "insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSal()+")";
		int n = template.update(sql);
		return n;
	}
}
