<%!
 String cname = "Cognizant";  //instance variable
 public int add(int x,int y){
	 return x+y;
 }
%>
<h2>
<%
 int a=10, b=20; //local variables
 out.println("My Company is "+ cname+"<br>");
 out.println("Sum = "+add(a,b));
%>
</h2>