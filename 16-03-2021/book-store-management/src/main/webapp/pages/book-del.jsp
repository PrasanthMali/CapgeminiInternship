<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<jsp:include page="/header" />
<section>
<center>
	<form:form method="post" modelAttribute="book">
		<br>
		<br>
		<div>
			<form:label path="bookId">bookId:</form:label>
			<form:input path="bookId" />
			<form:errors path="bookId" />
		</div>	<br>
		<div>
			<button type="submit">Delete</button>
		</div>	
	</form:form>
<br><br>
</center>
</section>
<jsp:include page="/footer" />


