<%@page import="student.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
* {
	padding: 0;
	margin: 0;
}

body {
	display: flex;
	align-items: center;
	justify-content: center;
}

.cardbody {
	height: 100%;
	background-image: repeating-conic-gradient(#C5EBAA 0.15deg, #A5DD9B 0.15deg, #C5EBAA
		0.39deg);
	width: 70%;
	display: grid;
	align-items: center;
	justify-content: center
}

#1st {
	height: 100px;
	width: 100%;
	display: grid;
	align-items: center;
	justify-content: space-between;

}

.list {
	display: grid;
	align-items: center;
	justify-content: center;
}
</style>
<title>Marks Card</title>
</head>
<body>
	<%
	Student student = (Student) request.getAttribute("markscard");
	%>
	<div class="cardbody">
		<h3>COUNCIL FOR THE INDIAN SCHOOL CERTIFIICATE EXAMINATIONS, NEW
			DELHI</h3>
			<br>
		<div id="1st">
			<span style="font-weight: bolder;">No. TD 70015549</span> 
			
				<pre class="list">
					<span>1161183/099</span>
					<span>015550</span>
				</pre>
			
		</div>
		<div><span>
				<img src="./icse-logo-removebg-preview.png"
				style="height: 100px; width: 250px">
			</span> </div>
	</div>
</body>
</html>