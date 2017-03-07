
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Login Page</title>
</head>
<body>
	<jsp:include page="Header.jsp" />

	<%--   <h6 style="color:red">
            <html:errors /></h6> --%>



	<html:form action="/Login">
		<table>
			<tr>
				<td>User Name :</td>
				<td><html:text name="LoginForm" property="userName" error.name./></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><html:password name="LoginForm" property="password" /></td>
			</tr>
		</table>
		<html:submit value="Login" />

	</html:form>
	<jsp:include page="Footer.jsp" />
</body>
</html>
