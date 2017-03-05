<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Online Health Care</title>
		<link rel="stylesheet" type="text/css" href="css/common.css">
		<link rel="shortcut icon" type="image/x-icon" href="http://localhost:8080/Online_Health_Care/img/favicon.ico">
		<link rel="icon" type="image/x-icon" href="http://localhost:8080/Online_Health_Care/img/favicon.ico">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
		<script type="text/javascript" src="js/common.js"></script>
        
	</head>
	
<body>
   <div id="main-container">
	<header >
			<h1>Online Health Care</h1>
			<nav class="ohc_shadow">
  			<!-- 	<a href="adminHome.jsp">Home</a> -->
  				<a class="ohc_button ohc_logout"href="<%=request.getContextPath()%>/logoutController?flag=Logout">Logout</a>
			</nav>
	</header>

	<div id="content-container">
      <div class="sidebar ohc_shadow">
          <table>
              
              <tr>
                   <td class="ohc_button sidebar-link"  goTo="DoctorList.jsp">Doctor List</td>
              </tr>
              <tr>
                   <td class="ohc_button sidebar-link"  goTo="PatientList.jsp">Patient List</td>
              </tr>           
          </table>     
      </div>
      <div class="iframe-container">
          <iframe src= "">
                
          </iframe>
      </div>

	</div>




	<footer>
    	<div>
    			<a href="#">About us</a> |
    			<a href="mailto:aitiwari@albany.edu">24x7 Customer Service</a>
    	</div>
	</footer>
	</div>
</body>
</html>