<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<jsp:include page="/header" />

<section>
	<center>
	<form:form method="post" modelAttribute="book">
		<br><br>
		<form:hidden path="bookId" />
		
		<div>
			<form:label path="title">Title:</form:label>
			<form:input path="title" />
			<form:errors path="title" />
		</div><br>		
		<div>
			<form:label path="price">Price:</form:label>
			<form:input path="price" />
			<form:errors path="price" />
		</div><br>
		<div>
			<form:label path="datePublished">Published Date:</form:label>
			<form:input path="datePublished" />
			<form:errors path="datePublished" />
		</div><br>
		<div>
			<form:label path="publisher">Publisher:</form:label>
			<form:select path="publisher">
				<form:options items="${publisher}" />
			</form:select>
		</div><br>
		
		<div>
			<button type="submit">Save</button>
		</div>
	</form:form>
	<br><br>
	</center>
</section>
<jsp:include page="/footer" />


