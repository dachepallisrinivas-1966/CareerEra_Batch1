<%@ page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
	<h2>Welcome to Java Server Pages</h2>
	
	<%
		LocalDate today = LocalDate.now();
		out.println("<h3>Today is " + today + "</h3>");
	%>
	
	<%= application.getServletContextName() %>
</body>
</html>