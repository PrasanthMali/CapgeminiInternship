<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<jsp:include page="/header" />
<section>
	<form:form method="post" modelAttribute="emp">
		<form:hidden path="empId" />
		
		<div>
			<form:label path="firstName">First Name:</form:label>
			<form:input path="firstName" />
			<form:errors path="firstName" />
		</div>		
		<div>
			<form:label path="lastName">Last Name:</form:label>
			<form:input path="lastName" />
			<form:errors path="lastName" />
		</div>
		<div>
			<form:label path="basic">Basic:</form:label>
			<form:input path="basic" />
			<form:errors path="basic" />
		</div>
		<div>
			<form:label path="joinDate">Join Date:</form:label>
			<form:input path="joinDate" />
			<form:errors path="joinDate" />
		</div>
		<div>
			<form:label path="mobileNumber">Mobile Number:</form:label>
			<form:input path="mobileNumber" />
			<form:errors path="mobileNumber" />
		</div>
		<div>
			<form:label path="email">Email:</form:label>
			<form:input path="email" />
			<form:errors path="email" />
		</div>
		<div>
			<form:label path="dept">Department:</form:label>
			<form:select path="dept">
				<form:options items="${depts}" />
			</form:select>
			<form:errors path="email" />
		</div>
		
		<div>
			<button type="submit">Save</button>
		</div>
	</form:form>
</section>
<jsp:include page="/footer" />