package com.cognizant;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body style=\"text-align:center;color:white;"
				+ "background:linear-gradient(to right,#42275a, #734b6d)\">");
		out.println("<img src=images/cog_logo.png>");
		out.println("<p style=\"font-size:22px;text-shadow:0 0 10px white\">"
				+ "Digital Solutions to Advance Your Business</p>");
		out.println("<hr>");
		out.println("<p style=text-align:left>Hello, "+request.getParameter("uid_field")+"</p>");
		out.println("<hr>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
