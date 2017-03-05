<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Health Care - Registration </title>
<link rel="stylesheet" type="text/css" href="css/common.css">
<link rel="stylesheet" type="text/css" href="css/register.css">

<link rel="shortcut icon" type="image/x-icon" href="http://localhost:8080/Online_Health_Care/img/favicon.ico">
<link rel="icon" type="image/x-icon" href="http://localhost:8080/Online_Health_Care/img/favicon.ico">
<script src= "js/validation.js"></script>

</head>
<body>
 <div id="main-container">
<header>
<h1>Online Health Care</h1>
<nav>
  	<a class="ohc_button ohc_logout" href="login.jsp">Sign In</a>
</nav>
</header>

<div id="content-container">
      <div class="registration-box">
        <h3>Sign Up</h3>
      <form name="registration" onSubmit="return formValidation();" method="post" action="registerController">
          <input type="text" name="fname" placeholder="Firstname">
        <input type="text" name="lname" placeholder="Lastname">
        <div class="gender">
          <input type="radio" value="M" id="male" name="gender" checked/>
          <label for="M" class="radio" chec>Male</label>
          <input type="radio" value="F" id="female" name="gender" />
          <label for="F" class="radio">Female</label>
        </div>
        <input type="text" name="birthdate" placeholder="Birthdate(mm/dd/year)">
        <input type="text" name="mobile" placeholder="Mobile Number">
        <input type="text" name="email" placeholder="Email ID">
        <input type="text" name="address" placeholder="Address(line 1)">
        <input type="text" name="address" placeholder="Address(line 2)">
        <input type="text" name="city" placeholder="City">
        <input type="text" name="state" placeholder="State">
        <input type="text" name="zipcode" placeholder="Zipcode">
        <input type="text" name="username" placeholder="Username">
        <input type="password" name="pass" placeholder="Password">
        <input type="password" name="cpass" placeholder="Confirm Password">
        <input type="radio" value="patient" id="patient" name="user" checked/>
        <label for="patient" class="radio" chec>Patient</label>
        <input type="radio" value="doctor" id="doctor" name="user" checked/>
        <label for="doctor" class="radio" chec>Doctor</label>
        <input type="submit" name="login" class="login login-submit" value="Sign Up">
      </form>

      <div class="Reg-ForgotP">
        <a href="login.jsp">Existing User? Click here to login.</a>
      </div>
    </div>

</div> <!-- main div ends here -->

<footer>
    <div>
    <a href="#">About us</a> |
    <a href="mailto:aitiwari@albany.edu">24x7 Customer Service</a>
    </div>
</footer>
</div>
</body>
</html>