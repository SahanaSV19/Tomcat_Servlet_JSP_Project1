<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="update" method="post">
	Unique ID <input type="number" name="primarykey" value="<%=request.getParameter("primarykey")%>" readonly="readonly"><br>
	Student Name <input type="text" name="sname" placeholder="Student Name" value="<%=request.getParameter("sname")%>"><br>
	Father Name <input type="text" name="paname" placeholder="Father Name" value="<%=request.getParameter("paname")%>"><br>
	Mother Name <input type="text" name="maname" placeholder="Mother Name" value="<%=request.getParameter("maname")%>"><br>
	English <input type="number" name="eng" placeholder="English" value="<%=request.getParameter("eng")%>"><br>
	Kannada <input type="number" name="kan" placeholder="Kannada" value="<%=request.getParameter("kan")%>"><br>
	Social <input type="number" name="soc" placeholder="Social" value="<%=request.getParameter("soc")%>"><br>
	Science <input type="number" name="sci" placeholder="Science" value="<%=request.getParameter("sci")%>"><br>
	Mathematics <input type="number" name="maths" placeholder="Maths" value="<%=request.getParameter("maths")%>"><br>
	Computer <input type="number" name="comp" placeholder="Computer" value="<%=request.getParameter("comp")%>"><br>
	SUPW <input type="text" name="supw" placeholder="SUPW" value="<%=request.getParameter("supw")%>"><br>
	Date of Birth <input type="Date" name="dob" value="<%=request.getParameter("dob")%>"><br>
	Date of Issue <input type="Date" name="doi" value="<%=request.getParameter("doi")%>"><br>
	</form>
</body>
</html>