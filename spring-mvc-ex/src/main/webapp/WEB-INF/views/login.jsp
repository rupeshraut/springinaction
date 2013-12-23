<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<form name="f" action="<c:url value='j_spring_security_check'/>"
		method="POST">
		<table>
			<c:if test="${param.error == 'true'}">
				<tr>
					<td colspan="2">
						<div style="color: red">
							Login failed due to -  ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}.
						</div>
					</td>
				</tr>
			</c:if>
			<tr>
				<td>Username:</td>
				<td><input type='text' name='j_username' id="j_username"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password'></td>
			</tr>
			<tr>
				<td colspan="2">&nbsp;</td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		document.getElementById("j_username").focus();
	</script>
</body>
</html>