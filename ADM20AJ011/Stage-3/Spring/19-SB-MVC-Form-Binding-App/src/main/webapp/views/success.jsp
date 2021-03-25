<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
 table{
   width:35%;
   font-size:20px;   
   border-collapse:collapse;
   box-shadow:0 0 10px black;
   margin:100px auto;
   padding:15px;
   border-radius:10px;
 } 
 tr{
   height:45px;
 }
 input{
  font-size:18px;
 }
 
</style>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
 <h2 style="text-align:center">${msg}</h2>
 <table>
  <tr>
    <td>Product ID</td>
    <td>${id}</td>
  </tr>
  <tr>
    <td>Product Name</td>
    <td>${name}</td>
  </tr>  
  <tr>
    <td>Product Price</td>
    <td>${price}</td>
  </tr>  
  <tr>  
    <td colspan=2>
       <a href="loadform">Go Back</a>
    </td>
  </tr>
 </table>

</body>
</html>