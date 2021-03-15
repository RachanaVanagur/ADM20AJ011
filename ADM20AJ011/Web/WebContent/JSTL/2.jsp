<h2>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 <c:set var="s" value="Cognizant" />
 <c:out value="${s}" />
 
 <c:remove var="s" />
 <br>
 <c:out value="Value is ${s}" />