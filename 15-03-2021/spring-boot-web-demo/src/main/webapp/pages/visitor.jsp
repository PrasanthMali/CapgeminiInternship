<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<jsp:include page="/header" />
<section style="min-height: 400px;">
    <h2>Visitor</h2>

 

    <form>
        <div>
            <label>Task: <input type="text" name="First Name" required />
            </label>
            <label>Task: <input type="text" name="Last Name" required />
            </label>
            <label>Task: <input type="date" name="Date Of Birth" required />
            </label>
            <button formAction="Register"></button>
           
        </div>
    </form>
    

</section>
<jsp:include page="/footer" />