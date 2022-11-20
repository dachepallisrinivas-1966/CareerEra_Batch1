<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Management Application</title>
</head>
<body>
	<center>
		<h3>User Management</h3>
		<h4>
			<a href="new">Add New User</a> &nbsp; | &nbsp; <a href="list">List
				All Users</a>
		</h4>
	</center>

	<div align="center">

		<table border="1" cellpadding="5">
			<caption>
				<h3>List of Users</h3>
			</caption>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<td>Email</td>
				<td>Country</td>
				<td>Actions</td>
			</tr>
			<c:forEach var="user" items="${listUser}">
				<tr>
					<td><c:out value="${user.id}" /></td>
					<td><c:out value="${user.name}" /></td>
					<td><c:out value="${user.email}" /></td>
					<td><c:out value="${user.country}" /></td>
					<td><a href="edit?id=<c:out value='${user.id}' />">Edit</a>
						&nbsp; &nbsp; &nbsp; 
					<a href="delete?id=<c:out value='${user.id}' />">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>

