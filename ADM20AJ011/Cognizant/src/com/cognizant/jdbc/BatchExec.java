package com.cognizant.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","cognizant","password");

		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(101,'Anil',1500)");
		st.addBatch("insert into emp values(102,'Sunil',2500)");
		//st.addBatch("insert into emp values(101,'Renil',3500)");
		st.addBatch("insert into emp values(103,'Renil',3500)");
		st.addBatch("update emp set sal = 2500");
		
		try {
			int[] rows = st.executeBatch();
			for(int n : rows) {
				System.out.println("Rows Affected = "+n);
			}
			con.commit();
		}catch(Exception ex) {
			System.out.println(ex.toString());
			con.rollback();
		}
		
		
		con.close();		
	}

}
