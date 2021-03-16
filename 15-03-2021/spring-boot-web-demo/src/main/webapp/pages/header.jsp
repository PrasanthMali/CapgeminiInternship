<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import = "java.time.LocalDate"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
</head>
<body bgcolour="cyan">
	<header>
		<h3><%= LocalDate.now() %></h3>
		<h3>${appTitle}</h3>
		<hr />
	</header>
	<nav>
		<a href="home">Home</a> |
		<a href="greet">Greet</a> |
		<a href="emp">Employee</a> |
		<a href="tasks">Task List</a> |
		<a href="visitors">Visitors</a> |
	</nav>