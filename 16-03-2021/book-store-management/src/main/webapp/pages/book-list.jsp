<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="/header" />
<section>
	<h3>Book List</h3>
	<c:choose>
		<c:when test="${books eq null}">
			<p>Books Not Found</p>
		</c:when>
		<c:when test="${books.size()==0}">
			<p>Books Not Found</p>
		</c:when>
		<c:otherwise>
			<table>
				<thead>
					<tr>
						<th>Book#</th>
						<th>Book Title</th>
						<th>Price</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="b" items="${books }">
						<tr>
							<td>${b.bookId }</td>
							<td>${b.bookTitle} </td>
							<td>${b.price }</td>
							<td><a href="details">View Details</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:otherwise>
	</c:choose>
</section>
<jsp:include page="/footer" />
