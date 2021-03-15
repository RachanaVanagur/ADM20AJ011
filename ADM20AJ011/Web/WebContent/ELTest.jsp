<h2>
<%
 String uid = request.getParameter("uid_field");
 out.println("User Name = "+ uid+"<br>");
%>
User Name = ${param.uid_field}
<hr>
<%
 String uidd = request.getParameter("uid_fieldd");
 out.println("User Name = "+ uidd+"<br>");
%>
User Name = ${param.uid_fieldd}