<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lib-Err</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<h3>Error Occurred</h3>
	<ul>
		<li>The below error occurred while processing your request.</li>
		<li>We regret the inconvenience.</li>li>
		<li>If the error persists please contact admin.</li>
	</ul>
	<p>
		<strong>Err: ${errMsg }</strong>
	</p>
</body>
</html>