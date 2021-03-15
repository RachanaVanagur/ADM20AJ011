<jsp:useBean id="acc" class="com.cognizant.Account"></jsp:useBean>
<jsp:setProperty name="acc" property="*"/>
<h2>
A/C No: <jsp:getProperty property="acno" name="acc"/> <br>
Name: <jsp:getProperty property="name" name="acc"/> <br>
Balance: <jsp:getProperty property="bal" name="acc"/> <br>
<hr>
