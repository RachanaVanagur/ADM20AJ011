package com.cognizant.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Types;

public class RSMetaDatas {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDbConnection();
		Statement st = con.createStatement();
		
		String sql = "select * from emp where empno>103";
		ResultSet rs = st.executeQuery(sql);
		
		ResultSetMetaData rsMeta = rs.getMetaData();
		
		System.out.println("No of Columns in ResultSet = " + rsMeta.getColumnCount());
		
		for(int i=1;i<=rsMeta.getColumnCount();i++) {
			System.out.println(rsMeta.getColumnLabel(i)+ " | "+rsMeta.getColumnName(i)+" | "+
		rsMeta.getColumnDisplaySize(i)+" | "+rsMeta.getColumnType(i)+" | "+rsMeta.getColumnTypeName(i));
			Thread.sleep(1000);
		}
		System.out.println(Types.INTEGER);
		
		System.out.println("-----------------------------");
		while(rs.next())
		{
			System.out.println(rs.getRow()+"---> "+rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getFloat("sal"));
			Thread.sleep(1000);
		}
		
		st.close();
		con.close();

	}

}
