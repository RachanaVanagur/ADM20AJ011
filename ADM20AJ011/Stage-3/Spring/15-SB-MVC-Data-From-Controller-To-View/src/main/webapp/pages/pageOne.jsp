<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
 table{
   width:40%;
   font-size:20px;   
   border-collapse:collapse;
   box-shadow:0 0 10px black;
 } 
 tr{
   height:45px;
 }
 td,th{
  border:1px solid black;
 }
</style>
<title>Book Details</title>
</head>
<body>
 <table>
  <tr>
    <td>Book ID</td>
    <td>${book.bookId}</td>
  </tr>
  <tr>
    <td>Book Name</td>
    <td>${book.bookName}</td>
  </tr>  
  <tr>
    <td>Book Price</td>
    <td>${book.bookPrice}</td>
  </tr>  
 </table>
</body>
</html>