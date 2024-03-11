<%@page import="student.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% List<Student> stds = (List<Student>) request.getAttribute("fetchall"); %>
	<table>
		<tr>
			<td>Unique ID</td>
			<td>Student Name</td>
			<td>Father</td>
			<td>Mother</td>
			<td>English</td>
			<td>Kannada</td>
			<td>Social</td>
			<td>Science</td>
			<td>Computer</td>
			<td>Mathematics</td>
			<td>SUPW</td>
			<td>Date of Birth</td>
			<td>Date of Issue</td>
			<td>Result</td>
			<td>Delete</td>
			<td>Update</td>
		</tr>
		<% for (Student std : stds) { %>
		<tr>
			<td><%=std.getUniqueId()%></td>
			<td><%=std.getName()%></td>
			<td><%=std.getFatherName()%></td>
			<td><%=std.getMotherName()%></td>
			<td><%=std.getEngMarks()%></td>
			<td><%=std.getKanMarks()%></td>
			<td><%=std.getSocMarks()%></td>
			<td><%=std.getSciMarks()%></td>
			<td><%=std.getCompMarks()%></td>
			<td><%=std.getMathMarks()%></td>
			<td><%=std.getSUPW()%></td>
			<td><%=std.getDOB()%></td>
			<td><%=std.getDOI()%></td>
			<td><%=std.getResult()%></td>
			<td><a href="did?primarykey=<%=std.getUniqueId()%>">Delete</a></td>
			<td><a
				href="Update.jsp?primarykey=<%=std.getUniqueId()%> && sname=<%=std.getName()%> && paname=<%=std.getFatherName()%> && maname=<%=std.getMotherName()%> && eng=<%=std.getEngMarks()%> && kan=<%=std.getKanMarks()%> && soc=<%=std.getSocMarks()%> && sci=<%=std.getSciMarks()%> && maths=<%=std.getMathMarks()%> && comp=<%=std.getCompMarks()%> && supw=<%=std.getSUPW()%> && dob=<%=std.getDOB()%> && doi=<%=std.getDOI()%>">Update</a></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>