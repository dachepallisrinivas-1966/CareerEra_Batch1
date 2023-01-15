<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<jsp:include page="/header" />
<section style="padding:10px; min-height:400px">
	<h2>${applicationTitle}</h2>
	<h3>Team Members</h3>
	<ol>
		<c:forEach var="member" items="${teamMembers}">
			<li>${member}</li>
		</c:forEach>
	</ol>
</section>	

<jsp:include page="/footer" />
