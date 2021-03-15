<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
</head>
<body bgcolor="yellow">
   <header>
   	<h3><%=LocalDate.now()%></h3>
   	<h2>${appTitle}</h2>
   	<hr />
   	</header>
   	    <nav>
        <a href="home">Home</a> |
        <a href="greet">Greet</a> |
    </nav>
</body>
</html>