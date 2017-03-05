<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Health Care - Login Page</title>
<link rel="stylesheet" type="text/css" href="css/common.css">
<link rel="stylesheet" type="text/css" href="css/login.css">

<link rel="shortcut icon" type="image/x-icon" href="http://localhost:8080/Online_Health_Care/img/favicon.ico">
<link rel="icon" type="image/x-icon" href="http://localhost:8080/Online_Health_Care/img/favicon.ico">

<script src= "js/validation.js"></script>

</head>
<body>
<div id="main-container">
<header>
<h1>Online Health Care</h1>
<nav>
  	<a class="ohc_button ohc_logout" href="register.jsp">Register</a>
</nav>
</header>
<%String str = (String)request.getAttribute("s1");
if( str != null)
	out.println(" "+str);
%>
<div id="content-container">
   <div class="login-box">
      <h3>Sign In</h3><br>
      <form method="post" action="loginController">
        <input type="text" name="user" placeholder="Username">
        <input type="password" name="pass" placeholder="Password">
        <input type="submit" name="login" class="login login-submit" value="Sign In">
      </form>

      <div class="Reg-ForgotP">
        <a href="register.jsp">New User? Click here to register.</a>
        <br>
        <a href="#">Forgot Password?</a>
      </div>
    </div>
</div>




<footer>
    <div>
    <a href="#">About us</a> |
    <a href="mailto:aitiwari@albany.edu">24x7 Cutomer Service</a>
    </div>
</footer>

</div>

</body>
</html>