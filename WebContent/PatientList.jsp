<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/list.css">
<title>Insert title here</title>
</head>
<body>
<table border = "1px">
                                            <thead>
                                                <tr>
                                                    
                                                    <th>Patient Id</th>
                                                    <th>Patient Name</th>
                                                    
                                                </tr>
                                            </thead>

                                            <tbody>
                                            <c:forEach var="patient" items="${session_patient_list}">
                                                <tr>
                                                    <td>${patient.patientvo_id}</td>
                                                    <td>${patient.patientvo_name}</td>
                                                    
                                                    
                                                </tr>
                                                </c:forEach>
                                            </tbody>
                                        </table>

</body>
</html>