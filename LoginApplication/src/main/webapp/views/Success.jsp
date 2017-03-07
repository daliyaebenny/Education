

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Success Page</title>
</head>
<body>
	<jsp:include page="Header.jsp" />
	<h1>
		Welcome
		<bean:write name="LoginForm" property="name"></bean:write>
	</h1>
	<br>
	<form>
	</form>
	<jsp:include page="Footer.jsp" />
</body>
</html>
