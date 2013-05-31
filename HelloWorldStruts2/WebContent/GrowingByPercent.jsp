<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Growing by percentage</title>
</head>
<body>
	<h2>Growing by percentage</h2>

	<h3>Your percentage grow was : <s:property value="percentage"/></h2>
	<h3>Your meta data is:</h3>
	
	<s:property value="meta"/>
	<br/>
	<br/>
	<a href="index.jsp">return</a>
</body>
</html>