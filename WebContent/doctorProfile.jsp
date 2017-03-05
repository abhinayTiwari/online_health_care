<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/profile.css">
</head>
<body>

<div class="profile">
<form action="#" method="POST" name="editDoctorProfile">
	<table class=profileTable>
  			<tbody >
    			<tr>
      				<th scope="row">Change Password:</th>
      				<td><input type="password" name="editProfileDoctorPassword" placeholder="New Password"> </td>
    			</tr>
    			<tr>
      				<th scope="row">First name:</th>
      				<td><input type="text" name="editProfileDoctorFirstName" placeholder="First Name"></td>
    			</tr>
                <tr>
      				<th scope="row">Middle name:</th>
      				<td><input type="text" name="editProfileDoctorMiddleName" placeholder="Middle Name"></td>
    			</tr>
    			<tr>
      				<th scope="row">Last name:</th>
      				<td><input type="text" name="editProfileDoctorLastName" placeholder="Last Name"></td>
    			</tr>
                <tr>
                	<th scope="row">Gender:</th>
      				<td><input type="radio" name="editProfileDoctorgender" value="Male" checked> Male<br>
  						<input type="radio" name="editProfileDoctorgender" value="Female"> Female<br>
  						<input type="radio" name="editProfileDoctorgender" value="Other"> Other<br>
                    </td>
                </tr>
    			<tr>
      				<th scope="row">Email Id:</th>
      			<td><input type="email" name="editProfileDoctorEmailId" placeholder="Email Id"></td>
    			</tr>
    			<tr>
      				<th scope="row">Phone Number</th>
      				<td><input type="number" name="editProfileDoctorPhoneNumber"  placeholder=""="Phone Number"></td>
    			</tr>
                <tr>
      				<th scope="row">Identification Number</th>
      				<td><input type="number" name="editProfileDoctorIdentificationNumber"  placeholder=""="Identification Number"></td>
    			</tr>
                <tr>
      				<th scope="row">Consulting Hospital:</th>
      				<td><input type="text" name="editProfileDoctorConsultingHospital" placeholder="Consulting Hospital"></td>
    			</tr>
    			<tr>
      				<th scope="row">Hospital Address:</th>
      				<td><textarea name="editProfileDoctorHospitalAddress" rows="6" cols="20" placeholder="Hospital Address"></textarea> </td>
    			</tr>
                <tr>
      				<th scope="row">Hospital City:</th>
      				<td><input type="text" name="editProfileDoctorHospitalCity" placeholder="Hospital City"> </td>
    			</tr>
                <tr>
      				<th scope="row">Hospital State:</th>
      				<td><input type="text" name="editProfileDoctorHospitalState" placeholder="Hospital State"> </td>
    			</tr>
                <tr>
      				<th scope="row">Hospital Zip Code:</th>
      				<td><input type="text" name="editProfileDoctorHospitalZipCode" placeholder="Specialization"> </td>
    			</tr>
                <tr>
      				<th scope="row">Doctor Department:</th>
      				<td><input type="text" name="editProfileDoctorDepartment" placeholder="Doctor Department"> </td>
    			</tr>
                <tr>
      				<th scope="row">Doctor Specialization:</th>
      				<td><input type="text" name="editProfileDoctorSpecialization" placeholder="Specialization"> </td>
    			</tr>
                <tr>
      				<th scope="row">Years of Experience:</th>
      				<td><input type="text" name="editProfileDoctorExperience" placeholder="Experience"> </td>
    			</tr>
                <tr>
      				<th scope="row">Hospital Name:</th>
      				<td><input type="text" name="editProfileDoctorHospitalName" placeholder="Hospital Name"> </td>
    			</tr>
                <tr>
      				<th scope="row">Click Submit to save these changes</th>
      				<td><input type="submit" name="editProfileDoctorSubmit" value="Submit"> </td>
    			</tr>
  			</tbody>
		</table>
</form>
</div>

</body>
</html>