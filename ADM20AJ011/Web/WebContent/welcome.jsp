<html>
 <head>
  <title>..cognizant..</title>
  <style>
   body{
    background:linear-gradient(to right, black,darkred,black);
    color:white;
    text-align:center;
   }
  </style>
 </head>
 <body>
  <h1>
   <%    
    out.println("COGNIZANT BUSINESS SOLUTIONS");
   %>
  </h1>
  <h3>
   <%
    out.println("Digital Solutions to Advance Your Business");
   %>
  </h3>
  <h4>
   <%=request.getParameter("name") %>
  </h4>
 </body>
</html>