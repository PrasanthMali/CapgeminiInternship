<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<jsp:include page="/header" />

<section style="padding: 10px; min-height: 400px;">
    <h2>${pageTitle }</h2>
    <h3>Developers</h3>
    <ol>
        <c:forEach var="d" items="${developers }">
            <li>${d }</li>
        </c:forEach>
        
        <c:set var="number" value="${param.num}" />
    	<c:if test="${param.num%2==0}">
       	 	<c:out value="number is even"></c:out>
    	</c:if>
   
    	<c:set var="number" value="${param.num}" />
    	<c:if test="${param.num%2!=0}">
        	<c:out value="number is odd"></c:out>
    	</c:if>
    </ol>
</section>
<jsp:include page="/footer" />