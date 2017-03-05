<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
    <%@page import="java.util.*" %>
    <%@page import="VO.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Health Care - Edit Profile</title>
<link rel="stylesheet" type="text/css" href="css/profile.css">
<%--<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %> --%>
<%-- <link rel="stylesheet" type="text/css" href="css/common.css">--%>
</head>
<body>
<% session= request.getSession();
	patientProfileVO patient =(patientProfileVO) session.getAttribute("session_patient_list");
%>
<div class="userProfile">
<form action="<%=request.getContextPath()%>/patientProfileController" method="get" name="editPatientProfile">
	<table class="userProfileTable">
  			<tbody >
  			
    			<tr>
      				<td scope="row">Change Password</td>
      				<td><input type="password" name="editProfilePatientPassword" placeholder="New Password" ></td>
    			</tr>
    			<tr>
      				<td scope="row">First name</td>
      				<td><input type="text" name="editProfilePatientFirstName" placeholder="First Name"value="<%=patient.getPatientProfileVO_firstName()%>"></td>
    			</tr>
                <tr>
      				<td scope="row">Middle name</td>
      				<td><input type="text" name="editProfilePatientMiddleName" placeholder="Middle Name" value="<%=patient.getPatientProfileVO_middleName()%>"></td>
    			</tr>
    			<tr>
      				<td scope="row">Last name</td>
      				<td><input type="text" name="editProfilePatientLastName" placeholder="Last Name" value="<%=patient.getPatientProfileVO_lastName() %>"></td>
    			</tr>
    			<tr>
      				<td scope="row">Email Id</td>
      			<td><input type="email" name="editProfilePatientEmailId" placeholder="Email Id" value="<%=patient.getPatientProfileVO_emailId() %>"></td>
    			</tr>
    			<tr>
      				<td scope="row">Phone Number</td>
      				<td><input type="number" name="editProfilePatientMobileNumber"  placeholder="Phone Number" value="<%=patient.getPatientProfileVO_mobileNo() %>"></td>
    			</tr>
    			<tr>
      				<td scope="row">Address</td>
      				<td><textarea name="editProfilePatientTextArea" rows="6" cols="20" placeholder="Address"value="<%= patient.getPatientProfileVO_address()%>"></textarea> </td>
    			</tr>
                <tr>
                	<td scope="row">Gender</td>
      				<td><input type="radio" name="editProfilePatientGender" value="Male" checked> Male<br>
  						<input type="radio" name="editProfilePatientGender" value="Female"> Female<br>
  						<input type="radio" name="editProfilePatientGender" value="Other"> Other<br>
                    </td>
                </tr>
                <tr>
                	<td scope="row">Date of Birth</td>
      				<td><input type="date" name="editProfilePatientDateOfBirth" ></td>
                </tr>
                <tr>
                	<td scope="row">City</td>
      				<td><input type="text" name="editProfilePatientCity"  placeholder="City" value="<%=patient.getPatientProfileVO_city() %>"></td>
                </tr>
                <tr>
                	<td scope="row">State</td>
      				<td><input type="text" name="editProfilePatientState"  placeholder="State" value="<%= patient.getPatientProfileVO_state()%>"></td>
                </tr>
                <tr>
                	<td scope="row">Zip Code</td>
      				<td><input type="number" name="editProfilePatientZipCode" placeholder="Zip Code"value="<%= patient.getPatientProfileVO_zipCode()%>"></td>
                </tr>
                <tr>
                	<td scope="row">Nationality</td>
      				<td><input type="text" name="editProfilePatientNationality"  placeholder="Nationality"value="<%= patient.getPatientProfileVO_nationality()%>"></td>
                </tr>
                <tr>
                	<td scope="row">Marital Status</td>
      				<td><input type="radio" name="editProfilePatientMaritalStatus" value="Single" checked> Single<br>
  						<input type="radio" name="editProfilePatientMaritalStatus" value="Married"> Married<br>
  						<input type="radio" name="editProfilePatientMaritalStatus" value="Separated"> Separated<br>
                        <input type="radio" name="editProfilePatientMaritalStatus" value="Divorced"> Divorced<br>
  						<input type="radio" name="editProfilePatientMaritalStatus" value="Widowed"> Widowed<br>
  						<input type="radio" name="editProfilePatientMaritalStatus" value="Prefer not to answer"> Prefer not to answer<br>
                    </td>
                </tr>
                <tr>
      				
      				<td><input type="submit" class="userProfile-submit" name="editProfilePatientSubmit" value="Save changes"> </td>
    			</tr>
    			<%-- </c:forEach>--%>
  			</tbody>
		</table>
</form>
</div>

</body>
</html>