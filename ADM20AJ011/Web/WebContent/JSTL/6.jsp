<h1>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="var1" value="Cognizant" />
<c:if test="${!empty var1}">
	<c:out value="Value = ${var1}" />
</c:if>