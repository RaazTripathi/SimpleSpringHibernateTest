<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Spring 3 MVC Series - Contact Manager</title>
	<style type="text/css">
		body {
			font-family: sans-serif;
		}
		.data, .data td {
			border-collapse: collapse;
			width: 30%;
			border: 1px solid #aaa;
			margin: 2px;
			padding: 2px;
		}
		.data th {
			font-weight: bold;
			background-color: #5C82FF;
			color: white;
		}
		
		.errorblock
		{
		color: red;
		}
		
	</style>
</head>
<body>

<h2>user Manager</h2>


<form:form method="post" action="addUser.html" commandName="user">
<form:errors path="*" cssClass="errorblock" element="div" />
	<table>
	<tr>
		<td><form:label path="firstName"><spring:message code="label.firstname"/></form:label></td>
		<td><form:input path="firstName" /></td> <td><form:errors path="firstName" cssClass="error" /></td>
	</tr>
	<tr>
		<td><form:label path="lastName"><spring:message code="label.lastname"/></form:label></td>
		<td><form:input path="lastName" /></td>
	</tr>
	<tr>
		<td><form:label path="company"><spring:message code="label.company"/></form:label></td>
		<td><form:input path="company" /></td>
	</tr>
	
	<tr>
		<td colspan="2">
			<input type="submit" value="<spring:message code="label.submit"/>"/>
		</td>
	</tr>
</table>	
</form:form>

	
<h3>Users</h3>
<c:if  test="${!empty userList}">

<table class="data">
<tr>
	<th>First name</th>
	<th>Last name</th>
	<th>Company</th>
	
</tr>
<c:forEach items="${userList}" var="user">
	<tr>
		<td>${user.firstName} </td>
		<td>${user.lastName}</td>
		<td>${user.company}</td>
		
	</tr>
</c:forEach>
</table>
</c:if>


</body>
</html>
