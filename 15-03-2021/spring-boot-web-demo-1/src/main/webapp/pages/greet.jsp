<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="/header" />
    <section style="min-height:400px;">
        <h2>Greet Page</h2>
        <form>
            <label>Enter Name:
                <input type="text" name="uname" required />
            </label>
            <button type="submit">Greet</button>
        </form>
       
        <c:if test="${greetings ne null }">
            <p><strong>${greetings }</strong></p>
        </c:if>
    </section>
<jsp:include page="/footer" />