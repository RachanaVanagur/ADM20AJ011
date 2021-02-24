package com.cognizant.ems.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.cognizant.ems.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void saveEmp(Employee emp) {
		String sql = "insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSal()+")";
		int emps_saved = jt.update(sql);
		System.out.println("Employee Saved");
	}

	@Override
	public void updateEmp(Employee emp) {
		String sql = "update emp set ename='"+emp.getEname()+"',sal="+emp.getSal()+" where empno="+emp.getEmpno();
		int emps_updated = jt.update(sql);
		if(emps_updated>0)
		 System.out.println("Employee Updated");
		else
		 System.out.println("No Employee Updated");	
	}

	@Override
	public void deleteEmp(int eno) {
		String sql = "delete from emp where empno="+eno;
		//int emps_deleted = st.executeUpdate(sql);
		Employee emp=null;
		try {
			emp = searchEmp(eno);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(emp==null) {
			System.out.println("No Matching Employee to Delete");	
		}
		else {
			System.out.println(emp);
			System.out.print("Confirm deletion of above Employee: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str=null;
			try {
				str = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(str.equalsIgnoreCase("Y")) {
				jt.update(sql);
				System.out.println("Employee with Emp No: "+eno+" Deleted!");
			}
		}
	}

	@Override
	public Employee searchEmp(int eno) {		
		String sql = "select ename,sal from emp where empno = "+eno;
		
		return jt.query(sql, new ResultSetExtractor<Employee>() {
			@Override
			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					return new Employee(eno,rs.getString(1),rs.getFloat(2));
				}
				return null;
			}			
		});		
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> emps = new ArrayList<>();
		String sql = "select * from emp";
		
		emps = jt.query(sql, new ResultSetExtractor<List<Employee>>() {
			List<Employee> emps = new ArrayList<>();
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				while(rs.next())
				{
					int eno = rs.getInt(1);
					String name = rs.getString(2);
					float sal = rs.getFloat(3);
					Employee emp = new Employee(eno,name,sal);
					emps.add(emp);
				}
				return emps;
			}
			
		});
		return emps;
	}
}
