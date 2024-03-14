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

.bg-container {
	height: 100vh;
	background-image: repeating-conic-gradient(#A5DD9B 0.27deg, #C5EBAA 0.60deg,#C5EBAA 0.58deg,#C5EBAA 0.37deg);
	width: 55vw;
	padding: -20px;
}

.cardbody {
	height: 100%;
	width: 100%;
	display: grid;
	align-items: center;
	justify-content: center;
	font-size: 22px;
}

.cardbodytxt {
	display: flex;
	align-items: center;
	justify-content: space-between;
}

.list {
	display: flex;
	align-items: center;
	justify-content: center;
}

#som {
	display: flex;
	align-items: center;
	justify-content: center;
}
</style>
<title>Marks Card</title>
</head>
<body>
	<div class="bg-container">
		<%
		Student student = (Student) request.getAttribute("markscard");
		%>
		<div class="cardbody">
			<h4>COUNCIL FOR THE INDIAN SCHOOL CERTIFICATE EXAMINATIONS, NEW
				DELHI</h4>
			<h5 style="padding-left: 20px;">INDIAN CERTIFICATE OF SECONDARY
				EDUCATION EXAMINATION (CLASS - X)- YEAR 2016</h5>

			<div class="cardbodytxt">
				<span style="font-weight: bolder; font-size: 18px;">No. TD
					70015549</span> <span><img src="./icselogo-removebg-preview.png"
					style="height: 160px; width: 180px;"> </span> <span
					style="font-weight: bold; font-size: 15px;">1161183/099 </span>
			</div>
			<h4 id="som" style="text-decoration: underline;">STATEMENT OF
				MARKS</h4>
			<div>
				<h5>
					<span style="font-weight: lighter;">NAME</span>
					<%=student.getName()%></h5>
				<br>
				<h5>
					<span style="font-weight: lighter;">of </span> VINAYAKA PUBLIC
					SCHOOL
				</h5>
				<br>
				<h5>
					<span style="font-weight: lighter;">UNIQUE ID </span>
					<%=student.getUniqueId()%></h5>
				<br>
				<h5>Daughter of</h5>
				<br>
				<h5>
					<span style="font-weight: lighter;">Smt </span>
					<%=student.getMotherName()%></h5>
				<br>
				<h5>
					<span style="font-weight: lighter;">Shri </span>
					<%=student.getFatherName()%></h5>
				<br>
			</div>
			<br>
			<div>
				<table style=" font-size: 20px;  width: 100%; ">
					<tr>
						<th style="">SUBJECTS</th>
						<th></th>
					</tr>
					<tr>
						<td>External Examination</td>
						<th>Percentage Marks</th>
					</tr>
					<tr>
						<td>ENGLISH</td>
						<td><%=student.getEngMarks()%></td>
					</tr>
					<tr>
						<td>KANNADA</td>
						<td><%=student.getKanMarks()%></td>
					</tr>
					<tr>
						<td>HISTORY, CIVICS & GEOGRAPHY(HCS-B, GEO-C)</td>
						<td><%=student.getSocMarks()%></td>
					</tr>
					<tr>
						<td>MATHEMATICS</td>
						<td><%=student.getMathMarks()%></td>
					</tr>
					<tr>
						<td>SCIENCE(PHY-C, CHE-C, BIO-C)</td>
						<td><%=student.getSciMarks()%></td>
					</tr>
					<tr>
						<td>COMPUTER APPLICATIONS</td>
						<td><%=student.getCompMarks()%></td>
					</tr>

				</table>
			</div>
		</div>
	</div>
</body>
</html>