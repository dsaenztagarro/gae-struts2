<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head></head>
<body>
	<h1>GAE + Struts 2 Example</h1>
	
	<h4>User details: </h4>
	<s:property value="userName"/>
	<s:property value="password"/>	
	<s:property value="firstName"/>
	<s:property value="lastName"/>
	<s:property value="emailAddress"/>
</body>
</html>