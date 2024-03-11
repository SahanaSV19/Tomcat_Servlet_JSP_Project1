<html>
<style>
* {
	padding: 0;
	margin: 0;
}

body {
	position: relative;
}

.main-container {
	height: 80px;
	width: 100%;
	height: 150px;
}

#image-cont {
	position: absolute;
	top: 0;
	left: 0;
}

.nav-container {
	display: flex;
	align-items: center;
	justify-content: space-around;
	background-color: #D0D4CA;
	padding: 20px;
}

.std-cont {
	
	height: 150px;
	width: 350px;
	display: grid;
	align-items: center;
	justify-content: center;
}

.std-cont .uid-cont {
	height: 40px;
	font-size: 20px;
}

.super-main {

	top:100px;
	display: grid;
	align-items: center;
	justify-content: center;
}

.btn-container {
	display: flex;
	align-items: center;
	justify-content: space-around;
}

.btn-container button {
	padding-left: 15px;
	padding-right: 15px;
	padding-top:5px;
	padding-bottom:5px;
	border-radius: 10px;
	background-color: #164863;
	color: #fff;
}
</style>
<title>ICSE</title>
<body>

	<div class="main-container">
		<div style="background-color: #EFECEC; height: 15px;"></div>

		<nav class="nav-container">
			<div>
				<img src="./icse-logo-removebg-preview.png" height="110px"
					width="300px" id="image-cont">
			</div>
			<div style="font-family: sans-serif; font-size: 22px;">COUNCIL
				FOR THE INDIAN SCHOOL CERTIFICATE EXAMINATIONS</div>
			<div>
				<div>Email:helpdesk@cisce.org</div>

				<div>
					<a href="./adminLogin.html">Admin Login</a>
				</div>
			</div>
		</nav>
		<div style="background: #45474B; height: 25px;"></div>
	</div>
	<br>
	<form action="StdLogin" method="post">
	<div class="super-main">
		<div class="std-cont">
			<h1>Login</h1>
			<div class="uid-cont">
				<label id="primarykey">Unique ID</label> <input type="number" name="primarykey">
			</div>
			<div class="btn-container">
				<button type="submit">Submit</button>
				<button type="reset">Reset</button>
			</div>
		</div>
	</div>
	</form>
</body>
</html>
