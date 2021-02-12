package com.cognizant.ems.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
		Employee emp = searchEmp(eno);
		if(emp==null) {
			System.out.println("No Matching Employee to Delete");	
		}
		else {
			System.out.println(emp);
			System.out.print("Confirm deletion of above Employee: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			if(str.equalsIgnoreCase("Y")) {
				st.execute(sql);
				//int emps_deleted = st.getUpdateCount();
				System.out.println("Employee with Emp No: "+eno+" Deleted!");
			}
		}
	}

	@Override
	public Employee searchEmp(int eno) throws Exception {
		Employee emp = null;
		String sql = "select ename,sal from emp where empno = "+eno;
		ResultSet rs = st.executeQuery(sql);
		if(rs.next()) {
			String name = rs.getString(1);
			float sal = rs.getFloat(2);
			emp = new Employee(eno,name,sal);
		}
		return emp;
	}

	@Override
	public List<Employee> getEmployees() throws Exception {
		List<Employee> emps = new ArrayList<>();
		String sql = "select * from emp";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			int eno = rs.getInt(1);			
			String name = rs.getString(2);
			float sal = rs.getFloat(3);
			
			emps.add(new Employee(eno,name,sal));
		}
		return emps;
	}

}
