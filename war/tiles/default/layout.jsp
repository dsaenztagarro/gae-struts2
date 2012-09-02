<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<!--5grid--><script src="/css/5grid/viewport.js"></script><!--[if lt IE 9]><script src="/css/5grid/ie.js"></script><![endif]--><link rel="stylesheet" href="/css/5grid/responsive.css" /><!--/5grid-->
<link rel="stylesheet" href="/css/style.css" />
<!--[if lte IE 9]><link rel="stylesheet" href="/css/style-ie9.css" /><![endif]-->
</head>
<body>
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="main" />
	<tiles:insertAttribute name="footer" />
</body>
</html>