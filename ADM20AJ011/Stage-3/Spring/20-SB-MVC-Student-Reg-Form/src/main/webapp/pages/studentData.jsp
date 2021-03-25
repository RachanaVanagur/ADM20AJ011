<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
table {
	font-size: 20px;
	width: 450px;
	border-collapse: collapse;
}

tr {
	height: 45px;
}

td {
	border: 1px solid black;
}
</style>
<title>Student Details : Print</title>
</head>
<body>

	<table>
		<caption>Student Details</caption>
		<tr>
			<td>Student ID</td>
			<td>${student.studentId}</td>
		</tr>
		<tr>
			<td>Student Name</td>
			<td>${student.studentName}</td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>${student.studentGender}</td>
		</tr>

		<tr>
			<td>Course</td>
			<td>${student.courseName}</td>
		</tr>

		<tr>
			<td>Preferred Timings</td>
			<%-- <td>${student.timings}</td> --%>
			<%--
			<td>
			  <c:forEach var="time" items="${student.timings}">
			     <c:out value="${time}"></c:out>
			  </c:forEach>
			</td>
			--%>
			<td>${selectedTimings}</td>
		</tr>
	</table>
	<a href="student">Home</a>
</body>
</html>