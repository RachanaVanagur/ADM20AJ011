<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
table {
	width: 40%;
	font-size: 20px;
	border-collapse: collapse;
	box-shadow: 0 0 10px black;
}

tr {
	height: 45px;
}

td, th {
	border: 1px solid black;
}
</style>
<title>Book Details</title>
</head>
<body>

	<table>
		<tr>
			<th>Book ID</th>
			<th>Book Name</th>
			<th>Book Price</th>
		</tr>
		<c:forEach var="book" items="${books}">
			<tr>
				<td>${book.bookId}</td>
				<td>${book.bookName}</td>
				<td>${book.bookPrice}</td>
			</tr>
		</c:forEach>
	</table>

	<%--  ${books} --%>
</body>
</html>