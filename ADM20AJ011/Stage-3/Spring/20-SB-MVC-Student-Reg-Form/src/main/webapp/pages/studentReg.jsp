<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
#wrapper{
	margin:100px auto;	
	width:550px;
	background:linear-gradient(45deg,black,orangered,black);
	color:white;
	padding:10px;
	border-radius:10px;
	box-shadow:0 0 10px black;
}
table{
	font-size:18px;
	width:97%;
}
input{
 font-size:18px;
}
tr{
 height:40px;
}
input[type=submit]{
  margin-top:35px;
  background-color:transparent;
  border:1px solid white;
  padding:3px 25px;
  border-radius:20px;
  color:white;
}
input[type=submit]:hover{  
  background-color:white;
  color:black;
  box-shadow:0 0 10px white;
}
</style>
<title>Student Registration</title>
</head>
<body>
 <div id="wrapper">
  <h2 style="text-align:center">STUDENT REGISTRATION</h2>
  <form:form action="saveStudent" method="post" modelAttribute="student">
    <table>
     <tr>
       <td>
         <label for="sid">Student ID</label>
       </td>
       <td>  
         <form:input path="studentId" required="required" size="25" id="sid"/>
       </td>
     </tr>

     <tr>
       <td>
         <label for="sname">Student Name</label>
       </td>
       <td>  
         <form:input path="studentName" size="25" id="sname"/>
       </td>
     </tr>     
 		
 	 <tr>
 	 	<td>
 	 	 <label for="gen">Gender</label>
 	 	</td>
 	 	<td>
 	 	  <form:radiobuttons path="studentGender" id="gen" items="${genders}"/>
 	 	</td>
 	 </tr>
 	 
	 <tr>
 	 	<td>
 	 	 <label for="course">Select Course</label>
 	 	</td>
 	 	<td>
 	 	  <form:select path="courseName">
 	 	  	<form:options items="${courses}"/>
 	 	  </form:select>
 	 	</td>
 	 </tr> 	 
 	 
	 <tr>
 	 	<td>
 	 	 <label for="timings">Preferred Timings</label>
 	 	</td>
 	 	<td>
 	 	  <form:checkboxes items="${timings}" path="timings"/> 	 	  
 	 	</td>
 	 </tr> 	  	 
 	 <tr>
 	  <td colspan=2 align=center>
 	    <input type=submit value="Save Student"/>
 	  </td>
 	 </tr>
    </table>
  </form:form> 
 </div>	
</body>
</html>