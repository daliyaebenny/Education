

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Failure Page</title>
</head>
<body>
	<jsp:include page="Header.jsp" />
	<div style="color: red">
		<h1>
			Invalid user name (
			<bean:write name="LoginForm" property="userName"></bean:write>
			) or Password
		</h1>
	</div>
	<html:link forward="firstScreen.jsp">Go Back</html:link>
	<jsp:include page="Footer.jsp" />
</body>
</html>
