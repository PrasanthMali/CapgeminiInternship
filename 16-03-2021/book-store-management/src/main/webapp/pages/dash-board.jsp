<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="/header" />
<section style="min-height:400px">
	<center><h3>Welcome To Book Store</h3></center>
	<br><hr>
	<c:if test="${msg ne null }">
		<strong>${msg }</strong>
	</c:if>
</section>
<jsp:include page="/footer" />
