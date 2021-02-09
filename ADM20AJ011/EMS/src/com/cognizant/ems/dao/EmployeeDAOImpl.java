package com.cognizant.ems.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

import com.cognizant.ems.config.ConnectionFactory;
import com.cognizant.ems.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static Statement st = null;
	
	//contructor
	public EmployeeDAOImpl() throws Exception{
		//get connection with DB
		Connection con = ConnectionFactory.getDbConnection();
		//create statement reference
		st = con.createStatement();
	}
	
	@Override
	public void saveEmp(Employee emp) throws Exception {
		String sql = "insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSal()+")";
		int emps_saved = st.executeUpdate(sql);
		System.out.println("Employee Saved");
	}

	@Override
	public void updateEmp(Employee emp) throws Exception {
		String sql = "update emp set ename='"+emp.getEname()+"',sal="+emp.getSal()+" where empno="+emp.getEmpno();
		int emps_updated = st.executeUpdate(sql);
		if(emps_updated>0)
		 System.out.println("Employee Saved");
		else
		 System.out.println("No Employee Updated");	
	}

	@Override
	public void deleteEmp(int eno) throws Exception {
		String sql = "delete from emp where empno="+eno;
		//int emps_deleted = st.executeUpdate(sql);
		st.execute(sql);
		int emps_deleted = st.getUpdateCount();
		if(emps_deleted > 0)
		 System.out.println("Employee with Emp No: "+eno+" Deleted!");
		else
		 System.out.println("No Matching Employee to Delete");	
	}

	@Override
	public Employee searchEmp(int eno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
