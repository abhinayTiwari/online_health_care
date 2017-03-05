<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Health Care - Feedback </title>
<link rel="stylesheet" type="text/css" href="css/feedback.css">
</head>
<body>

      <div class="feed-box">
      <form name="feedback"  onSubmit="location.href='index.jsp'" method="post" action="">
        <input type="name" name="name" placeholder="Name">
        <input type="text" name="mobile" placeholder="Mobile Number">
        <input type="text" name="email" placeholder="Email ID">
        <input type="text" name="address" placeholder="Address">
        <input type="text" name="description" placeholder="Description">
        <input type="submit" name="feedback" class="feed-box feed-box-submit" value="Submit feedback">
      </form>
    </div>
</body>
</html>