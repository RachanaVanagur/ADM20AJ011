package com.cognizant.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.cognizant.util.PropertiesFile;

public class DBConnection {
 private static Connection con=null;
 static {
	 try {
		Properties props = PropertiesFile.getProperties();
		String dc = props.getProperty("driverclass");
		String url = props.getProperty("url");
		String uid = props.getProperty("username");
		String pwd = props.getProperty("password");
		
		Class.forName(dc);
	 	//con = DriverManager.getConnection(url,uid,pwd);
		} catch (Exception e) {
		e.printStackTrace();
	}	 
 }//static block
 
 public Connection getDBConnection() {
	/* try {
	 Thread.sleep(6000);
	 }catch(Exception ex) {}*/
	 //if(con==null)
	//	 throw new RuntimeException("Could not establish a connection with DB");
	 return con;
 }
 
 
}
