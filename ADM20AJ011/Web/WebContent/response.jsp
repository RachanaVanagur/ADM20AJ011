<%!
 String uid, pwd;
%>
<h2>
<%
 uid = request.getParameter("uid_field");
 pwd = request.getParameter("pwd_field");
 
 if(uid.equals("admin") && pwd.equals("123"))
	 response.sendRedirect("https://www.cognizant.com");
 else
	 response.sendError(response.SC_UNAUTHORIZED,"Invalid Username/Password");
%> 