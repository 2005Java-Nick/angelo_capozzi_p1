<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Login </title>
</head>
<body bgcolor="lightgray">
	<% 
	    String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		String greeting = "Hello " + name + ", welcome to your app!";
		
		
		
		out.println(greeting);
		
		%>
</body>
</html>