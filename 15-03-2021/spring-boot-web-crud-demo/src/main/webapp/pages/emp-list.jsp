<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="/header" />
<section>
	<h3>Employee List</h3>
	<c:choose>
		<c:when test="${emps eq null}">
			<p>Employees Not Found</p>
		</c:when>
		<c:when test="${emps.size()==0}">
			<p>Employees Not Found</p>
		</c:when>
		<c:otherwise>
			<table>
				<thead>
					<tr>
						<th>Employee#</th>
						<th>Full Name</th>
						<th>Mobile</th>
						<th>Email</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="e" items="${emps }">
						<tr>
							<td>${e.empId }</td>
							<td>${e.firstName} ${e.lastName } </td>
							<td>${e.mobileNumber }</td>
							<td>${e.email }</td>
							<td><a href="details">View Details</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:otherwise>
	</c:choose>
</section>
<jsp:include page="/footer" />