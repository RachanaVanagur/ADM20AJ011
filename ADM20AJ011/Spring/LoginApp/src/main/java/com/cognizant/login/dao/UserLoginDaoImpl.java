package com.cognizant.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cognizant.login.configs.ConnectionFactory;
import com.cognizant.login.entity.User;

public class UserLoginDaoImpl implements UserLoginDao {
	private static PreparedStatement pst =null ;
	
	public UserLoginDaoImpl() throws Exception{
		Connection con = ConnectionFactory.getDbConnection();
		pst = con.prepareStatement("select * from users where username=? and password=?");
	}
	
	public boolean checkUserWithPassword(User user) throws Exception {
		pst.setString(1, user.getUserName());
		pst.setString(2, user.getPassword());
		ResultSet rs = pst.executeQuery();
		if(rs.next())
			return true;
		else
			return false;
	}

}
