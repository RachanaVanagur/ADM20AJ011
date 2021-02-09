package com.cognizant.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDbConnection();
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(101,'Sunil',2500)";
		String sql = "insert into emp(empno,ename,sal) values(102,'Anil',3500), (103,'Sanjay',4500), (104,'Sachin',5500), (105,'Naveen',8600)";
		
		int rows_affected = st.executeUpdate(sql);
		System.out.println("Employees Saved - " + rows_affected);
		
		st.close();
		con.close();
	}
}
