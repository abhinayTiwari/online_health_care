<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%@page import="java.sql.ResultSet"%>
		<%@page import="VO.doctorVO"%>
    	<% ResultSet rs =(ResultSet)session.getAttribute("searchList");%>
    <table>
    	<%while(rs.next()){
			 doctorVO doctor = new doctorVO();
			 if(rs.getString("lastname")!=null){%>
		<tr>
				 <td><h3><%= rs.getString("firstname") %><p>,</p> <%= rs.getString("lastname")%></h3></td>
			 <% }else { %>
				 <td><h3><%= rs.getString("firstname") %></h3></td>
			 <% } %>
			 <td><h3><%= rs.getString("consult_hsptl")%></h3></td>
		</tr> 
		 <% } %>
		 
	</table>
</body>
</html>