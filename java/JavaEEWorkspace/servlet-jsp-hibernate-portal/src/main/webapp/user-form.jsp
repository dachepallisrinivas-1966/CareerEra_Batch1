<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			<a href="new">Add New User</a>
			&nbsp; |  &nbsp;	
			<a href="list">List All Users</a>
		</h4>
	</center>
	
	<div align="center">
		<c:if test="${user != null}">
			<form action="update" method="post">
		</c:if>
		<c:if test="${user == null }">
			<form action="insert" method="post">
		</c:if>
		<table border="1" cellpadding="5">
			<caption>
				<h3>
					<c:if test="${user != null}">
						Edit User
					</c:if>
					<c:if test="${user == null}">
						New User
					</c:if>
				</h3>
			</caption>
			
			<c:if test="${user != null}">
				<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
			</c:if>
			
			<tr>
				<th>User Name: </th>
				<td>
					<input type="text" name="name" size="20" value="<c:out value='${user.name}' />" />
				</td>
			</tr>
			<tr>
				<th>Email: </th>
				<td>
					<input type="text" name="email" size="20" value="<c:out value='${user.email}' />" />
				</td>
			</tr>
			<tr>
				<th>Country </th>
				<td>
					<input type="text" name="country" size="20" value="<c:out value='${user.country}' />" />
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button>Submit</button>
				</td>
			</tr>
		
			</table>
		</form>
	</div>
	
</body>
</html>

