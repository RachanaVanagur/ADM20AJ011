<%!
 String uid, pwd;
%>
<h2>
<%
 uid = request.getParameter("uid_field");
 pwd = request.getParameter("pwd_field");
 
 out.println("User Name = "+ uid+"<br>");
 out.println("Password = "+ pwd);
%>
<hr>
Server Name = <%=request.getServerName() %> <br>
Server Port = <%=request.getServerPort() %> <br>
Protocol = <%=request.getProtocol() %> <br>
Method = <%=request.getMethod() %> <br>
Application = <%=request.getContextPath() %> <br>
Content Type = <%=request.getContentType() %> <br>
Content Length = <%=request.getContentLength() %>
</h2>