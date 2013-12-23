<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	Welcome <strong><u><sec:authentication property="principal.username"/></u></strong>.
	<br />
	<ul>
		
		<sec:authorize ifAllGranted="admin">
			<li><a href="private/access">admin</a></li>
		</sec:authorize>
		<sec:authorize ifAnyGranted="user,admin">
			<li><a href="public/access">user</a></li>
		</sec:authorize>
	</ul>
	<a href="logout">Logout</a>
</body>
</html>