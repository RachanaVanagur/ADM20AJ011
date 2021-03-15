package com.cognizant;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


//@WebFilter("/welcome")
//@WebFilter("/*")
@WebFilter(urlPatterns = {"/welcome","/Form1"})
public class WelcomeFilter implements Filter {
	public void init(FilterConfig fConfig) throws ServletException {}
	
	public void destroy() {	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		
		out.println("<body style=text-align:center;background-color:lightgreen;color:blue>");
		out.println("<h2>Our Application is under maintenance!!!<br><br> Check back @ 01.00AM</h2>");
		/*
		out.println("<h2>Received Request...</h2>");
		String uid = request.getParameter("uid_field");
		String pwd = request.getParameter("pwd_field");
		
		if(uid.equals("admin") && pwd.equals("123"))
			chain.doFilter(request, response);
		else {
			out.println("<p style=font-size:18px;color:red>Invalid User name/ Password</p>");
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		out.println("<h2>Sent Response...</h2>");
		*/
	}
}
