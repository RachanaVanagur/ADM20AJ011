package com.cognizant.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableOracle {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Initialize an appropriate JDBC Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//connect to Oracle Database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","cognizant","password");
		System.out.println("<<< Connected to Database");
		
		//create a provision for passing SQL query
		Statement st = con.createStatement();
		
		String sql = "create table emp(empno number(5), ename varchar(25), sal number(10,2), primary key(empno))";
		
		try {
			//pass SQL query to connected DB
			st.execute(sql);
			System.out.println("<<< Database Table \"emp\" created!");
		}catch(Exception ex) {
			System.out.println("Exception: "+ ex.toString());
		}
		
		//close the connection with database
		st.close();
		con.close();
	}
}
