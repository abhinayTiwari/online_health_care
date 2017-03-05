<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Health Care - Search doctor</title>
<link rel="stylesheet" type="text/css" href="css/search.css">
</head>
<body>

<div class="search">
<form action="searchController" method="POST" name="searchDoctor">
	<input type="text" name="City" placeholder="Enter City">
	<input type="text" name="State" placeholder="Enter State">
	<input type="text" name="Zipcode" placeholder="Enter Zipcode">
    <input type="text" name="Department" placeholder="Enter Department">
    <input type="text" name="Specialization" placeholder="Specialization">
    <select name="Experience">
    	<option value="Years of Experience">Select Experience</option>
  		<% int i = 0;%>
  		<% while(i<=20){ %>
  		<option value=<%= i %>><%= i %></option>
  		<% i++;} %>
	</select>
	<input type="submit" name="Search" class="search search-submit" value="Search Doctor">
</form>
</div>
</body>
</html>