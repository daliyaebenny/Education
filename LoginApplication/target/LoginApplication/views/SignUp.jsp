
<%@ page contentType="text/html; charset=iso-8859-1" language="java"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up Page</title>

</head>
<body>
	<jsp:include page="Header.jsp" />

	<html:form action="/signup">

		<table>
			<tr>
				<td> Name : </td>
				<td><html:text name="LoginForm" property="name" /></td>
			</tr>
			<tr>
				<td>Email Id  :</td>
				<td><html:text name="LoginForm" property="userName" /></td>
			</tr>
			<tr>
				<td>Password  : </td>
				<td> <html:password name="LoginForm" property="pass1"
			maxlength="10" /></td>
			</tr>
			<tr>
				<td>Confirm Password  :</td>
				<td><html:password name="LoginForm"
			property="password" maxlength="10" /></td>
			</tr>
			<tr>
				<td><html:submit value="SIGN UP" /></td>
			</tr>
		</table>
           
		
	</html:form>
	<jsp:include page="Footer.jsp" />
</body>
</html>