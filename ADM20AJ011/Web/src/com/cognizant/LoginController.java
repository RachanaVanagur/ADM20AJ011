package com.cognizant;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Connection con = null;
	private static PreparedStatement pst = null;

	public void init(ServletConfig config) throws ServletException {
		/*-- to make connection with Database --*/ 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cognizant", "root", "");
			pst = con.prepareStatement("select * from users where username=? and password=?");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void destroy() {
		try {
			pst.close();
			con.close();
		} catch (Exception ex) {
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get form data (uid_field & pwd_field)
		String uid = request.getParameter("uid_field");
		String pwd = request.getParameter("pwd_field");
		
		try {
			pst.setString(1, uid);
			pst.setString(2, pwd);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				/*--forward the request to /welcome Servlet for valid user--*/
				RequestDispatcher rd = request.getRequestDispatcher("welcome");
				rd.forward(request, response);				
			}
			else {
				PrintWriter out = response.getWriter();
				out.println("<p style=text-align:center;font-size:18px;color:cyan>"
						+ "Invalid Username/ Password</p>");
				
				RequestDispatcher rd = request.getRequestDispatcher("Login.html");
				rd.include(request, response);
			}
		}catch(Exception ex) {System.out.println(ex.toString());}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
