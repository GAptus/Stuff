<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Growing from 0</title>
</head>
<body>
	<h2>The percentage you are shrinking by is : <s:property value="percentage"/></h2>
	<br/>
	<h3>Your starting values are:</h3>
	<table>
	<tr>
	<td>width: </td><td><s:property value="width"/></td>
	</tr>
	<tr>
	<td>height: </td><td><s:property value="height"/></td>
	</tr>
	<tr>
	<td>x: </td><td><s:property value="x"/></td>
	</tr>
	<tr>
	<td>y: </td><td><s:property value="y"/></td>
	</tr>
	</table>
	
	<br/>
	<br/>
	
	<h3>Your Ending value are: </h3>
	<table>
	<tr>
	<td>width: </td><td><s:property value="changedWidth"/></td>
	</tr>
	<tr>
	<td>height: </td><td><s:property value="changedHeight"/></td>
	</tr>
	<tr>
	<td>x: </td><td><s:property value="changedX"/></td>
	</tr>
	<tr>
	<td>y: </td><td><s:property value="changedY"/></td>
	</tr>
	</table>
	<br/>
	<br/>
	<a href="index.jsp">return</a>
</body>
</html>