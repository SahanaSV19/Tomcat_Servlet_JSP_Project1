<%@page import="admin.dto.Admin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>CRUD</title>
</head>
<body>
	<%
	Admin adm = (Admin) request.getAttribute("emailidbro");
	%>
	<h2>Welcome <%=adm.getEmail()%></h2>
	<table>
		<tr>
			<td><a href="./Insertion.html">Insert Student Details</a></td>
		</tr>
		<tr>
			<td><a href="./fetchbyid.jsp">Fetch By Id</a></td>
		</tr>
		<tr>
			<td><a href="./download.jsp">Fetch All</a></td>
		</tr>
		<tr>
			<td><a href="DA">Delete All</a></td>
		</tr>
	</table>
	
</body>
</html>