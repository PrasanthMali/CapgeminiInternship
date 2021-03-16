<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<jsp:include page="/header" />
	<section style="min-height:400px;">
		<h2>Simple Interest Calculator</h2>
		
		<form:form method="POST" modelAttribute="emp">
			<div>
				<form:label path="principal">Principal:</form:label>
				<form:input path="principal" type="double" />
			</div>
			<div>
				<form:label path="rate">rate</form:label>
				<form:input path="rate" type="double" />
			</div>
			<div>
				<form:label path="time">time</form:label>
				<form:input path="time" type="double" />
			</div>
			 <div>
			 	<button type="submit">Submit</button>
			</div>
		
		</form:form>  
	</section>
<jsp:include page="/footer" />