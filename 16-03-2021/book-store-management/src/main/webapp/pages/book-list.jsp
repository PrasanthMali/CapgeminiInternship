<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="/header" />
<section>
<center>
	<h3>Books List</h3>
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
						<th>Book Id</th>
						<th>Title</th>
						<th>Price</th>
						<th>Publisher</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="b" items="${books }">
						<tr>
							<td>${b.bookId }</td>
							<td>${b.title }</td>
							<td>${b.price }</td>
							<td>${b.publisher }</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:otherwise>
	</c:choose>
<br><br>
</center>
</section>
<jsp:include page="/footer" />


