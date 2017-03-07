<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First Screen</title>
</head>

<body>
	<jsp:include page="Header.jsp" />

	<form>
		<table>
			<tr>
				<td>New User</td>
				<td><html:link forward="signUp">SIGN UP</html:link></td>
			</tr>
			<tr>
				<td>Existing User</td>
				<td><html:link forward="signIn">SIGN IN</html:link></td>
			</tr>
		</table>

	</form>

	<jsp:include page="Footer.jsp" />
</body>
</html>