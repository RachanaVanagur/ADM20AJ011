package com.cognizant.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class OracleDBDatas {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","cognizant","password");
		
		DatabaseMetaData dbMeta = con.getMetaData();
		
		System.out.println("Jdbc Driver Used = " + dbMeta.getDriverName());
		System.out.println("Jdbc Driver Version = " + dbMeta.getDriverVersion());
		System.out.println("Jdbc Driver Major Version = " + dbMeta.getDriverMajorVersion());
		System.out.println("Jdbc Driver Minor Version = " + dbMeta.getDriverMinorVersion());
		
		System.out.println("DB Name: "+ dbMeta.getDatabaseProductName());
		System.out.println("DB Version: "+ dbMeta.getDatabaseProductVersion());
		con.close();
	}
}
