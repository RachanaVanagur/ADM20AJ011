<%@page import="java.util.Date" info="checking "%>
<%!
  Date today = null;
%>
<h2 style="text-align:center">
<%
 today = new Date();
 out.println(today);
%>
<hr>
<%
 out.println(getServletInfo());
%>
</h2>