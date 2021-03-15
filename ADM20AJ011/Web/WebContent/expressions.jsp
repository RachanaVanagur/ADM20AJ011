<%!
 String cname = "Cognizant";  //instance variable
 public int add(int x,int y){
	 return x+y;
 }
%>
<h2>
 My Company Name is <%=cname %>
 <br>
 <%="Sum = "+ add(12,32) %>
</h2>