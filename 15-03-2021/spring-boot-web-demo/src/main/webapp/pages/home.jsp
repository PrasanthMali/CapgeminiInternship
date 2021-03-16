<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="/header" />
	<section style="min-height:400px;">
		<h2>Home Page</h2>
		Name : ${name } <br />
		Age : ${age } <br />
		Location : ${location } <br />
		Technologies : <br />
		<ul>
			<c:forEach var="t" items="${technologies}">
				<li>${t}</li>
			</c:forEach>
		</ul>
	</section>
<jsp:include page="/footer" />