<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="dt" uri="http://customtags.org/datatable"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Info</title>
</head>
<body class="yui3-skin-sam">
	<dt:datatable items="users" name="test" rowColors="#ffffff,#EEEEEE"
		border="0" width="800px" cellspacing="1">
		<dt:paginator rowsPerPage="15"/>
		<dt:column property="id" title="Sr.#" width="10%"
			style="font-weight:normal;background-color:gray;color:#ffffff;cursor: pointer" />
		<dt:column property="name" title="Name" width="40%"
			style="font-weight:normal;background-color:gray;color:#ffffff;cursor: pointer" />
		<dt:column property="age" title="Age" width="10%"
			style="font-weight:normal;background-color:gray;color:#ffffff;cursor: pointer" />
		<dt:column property="address" title="Addr" width="40%"
			style="font-weight:normal;background-color:gray;color:#ffffff;cursor: pointer" />
		<dt:column property="" title="Action"
			style="font-weight:normal;background-color:gray;color:#ffffff;cursor: pointer">
			<a href="javascript:alert('edit')" style="cursor: pointer">edit</a>
		</dt:column>
	</dt:datatable>
</body>
</html>