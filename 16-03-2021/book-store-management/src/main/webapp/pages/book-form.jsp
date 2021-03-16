<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<jsp:include page="/header" />
<section>
	<form:form method="post" modelAttribute="book">
		<form:hidden path="bookId" />
		
		<div>
			
			<form:label path="bookTitle">Book Title:</form:label>
			<form:input path="bookTitle" />
			<form:errors path="bookTitle" />
			
		</div>		
		
		<div>
			
			<form:label path="price">Price:</form:label>
			<form:input path="price" />
			<form:errors path="price" />
			
		</div>
		<div>
			<form:label path="publishDate">Publish Date:</form:label>
			<form:input path="publishDate" />
			<form:errors path="publishDate" />
		</div>
		<div>
			<form:label path="pub">Publisher:</form:label>
			<form:select path="pub">
				<form:options items="${publishers}" />
			</form:select>
		
		<div>
			<button type="submit">Save</button>
		</div>
	</form:form>
</section>
<jsp:include page="/footer" />