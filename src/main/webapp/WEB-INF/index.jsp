<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/mainPage.js"></script>
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script
  src="https://code.jquery.com/jquery-1.11.0.min.js"
  integrity="sha256-spTpc4lvj4dOkKjrGokIrHkJgNA0xMS98Pw9N7ir9oI="
  crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>Popup Login and SignUp</h1>
		<a id="modal_trigger" href="#modal" class="btn"> Click here for
			Login/Register</a>

		<div id="modal" class="popupContainer" style="display: none;">
			<header class="popupHeader"> <span class="header_title">Login</span>
			<span class="modal_close"> <i class=fa fa-times></i>
			</span> </header>

			<section class="popupBody">
			<div class="social_login">
				<div class="" /></div>
				<div class="centered_text" />
				<div class="action_btns">
					<div class="one_half">
						<a href="#" id="login_form" class="btn">Login</a>
					</div>
					<div class="one half">
						<a href="#" id="register_form" class="btn">Sign Up</a>
					</div>
				</div>
			</div>

			<div class="user_login">
				<form>
					<label>UserName</label> <input type="text" /><br /> <label>Password</label>
					<input type="password" /><br />

					<div class="checkbox">
						<input id="remember" type="checkbox" /> <label for="rememer">Remember
							me</label>
					</div>

					<div class="action_btns">
						<div class="one_half">
							<a href="#" class="btnback_btn"> <i
								class="fa fa-angle-double-left"></i> Back
							</a>
						</div>
						<div classs="one_half">
							<a href="#" class="btn_btnred">Login</a>
						</div>
					</div>
				</form>

				<div class="user_register">
					<form>
						<label>Full Name</label> <input type="text" /><br /> <label>Email
							Address</label> <input type="email" /><br /> <label>Password</label> <input
							type="password" /><br />

						<div class="actn_btns">
							<div class="one_half">
								<a href="#" class="btnback_btn"> <i
									class="fa fa_angle-double-left"></i> Back
								</a>
							</div>
							<div class="one half">
								<a href="#" class="btnbtn_red">Register</a>
							</div>
						</div>
					</form>
				</div>
			</section>
		</div>
</body>
</html>