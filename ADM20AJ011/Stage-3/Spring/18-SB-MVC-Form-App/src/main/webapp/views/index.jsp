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
<title>Product Entry Form</title>
</head>
<body>
 <form action="saveProduct" method="post">
 <table>
  <tr>
    <td>Product ID</td>
    <td><input type="text" name="pid" size=20 autofocus></td>
  </tr>
  <tr>
    <td>Product Name</td>
    <td><input type="text" name="pname" size=20></td>
  </tr>  
  <tr>
    <td>Product Price</td>
    <td><input type="text" name="pprice" size=20></td>
  </tr>  
  <tr>
   <td align=center><input type=submit value="Add Product"></td>
   <td align=center><input type=reset value="Clear Form"></td>
  </tr>
 </table>
 </form>
</body>
</html>