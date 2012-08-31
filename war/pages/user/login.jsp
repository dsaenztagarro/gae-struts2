<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head></head>
<body>
<h1>GAE + Struts 2 Example</h1>

<s:form action="welcome">
	<s:textfield name="userName" label="Username"/>
	<s:password name="password" label="Password"/>
	<s:textfield name="firstName" label="First name"/>
	<s:textfield name="lastName" label="Last name"/>
	<s:textfield name="emailAddress" label="Email address"/>
	<s:submit />
	<s:submit action="addUser" value="Add" />
	<s:submit action="updateUser" value="Update" />
	<s:submit action="deleteUser" value="Delete" />
</s:form>

</body>
</html>