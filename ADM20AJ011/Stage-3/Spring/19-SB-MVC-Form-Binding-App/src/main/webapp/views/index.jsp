<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
 <h2 style="text-align:center">Product Details</h2>
 <p style="text-align:center;color:green">${successMsg}</p>
 
 <form:form action="saveProduct" method="post" modelAttribute="product">
 <table>
  <tr>
    <td>Product ID</td>
    <td><form:input path="pid" size="20" required="required"></form:input></td>
  </tr>
  <tr>
    <td>Product Name</td>
    <td><form:input path="pname" size="20"></form:input></td>
  </tr>  
  <tr>
    <td>Product Price</td>
    <td><form:input path="price" size="20"></form:input></td>
  </tr>  
  <tr>
   <td align=center><input type=submit value="Add Product"></td>
   <td align=center><input type=reset value="Clear Form"></td>
  </tr>
 </table>
 </form:form>
</body>
</html>