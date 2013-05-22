<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Growing Calculator</title>
</head>
<body>
   <h1>Growing Calculator</h1>
   <br/>
   <h3>Growing from 0 size</h3>
   <form action="growing">
      <table>
      <tr>
      	<td>Width: </td><td><input type="text" name="width"/></td>
      </tr>
      <tr>
      	<td>Height: </td><td><input type="text" name="height"/></td>
      </tr>
      <tr>
      	<td>X: </td><td><input type="text" name="x"/></td>
      </tr>
      <tr>
      	<td>Y: </td><td><input type="text" name="y"/></td>
      </tr>
      </table>
      <input type="submit" />
   </form>
   <br/>
   <h3>Growing by a percentage</h3>
   <form action="growingPercent">
    <table>
      <tr>
      	<td>Width: </td><td><input type="text" name="width"/></td>
      </tr>
      <tr>
      	<td>Height: </td><td><input type="text" name="height"/></td>
      </tr>
      <tr>
      	<td>X: </td><td><input type="text" name="x"/></td>
      </tr>
      <tr>
      	<td>Y: </td><td><input type="text" name="y"/></td>
      </tr>
      <tr>
      	<td>Percentage:</td><td><input type="text" name="percentage" /></td>
      </tr>
      </table>
      <input type="submit" />
   </form>
   <br/>
   <h3>Shrinking by a percentage</h3>
   <form action="shrinkingPercent">
       <table>
      <tr>
      	<td>Width: </td><td><input type="text" name="width"/></td>
      </tr>
      <tr>
      	<td>Height: </td><td><input type="text" name="height"/></td>
      </tr>
      <tr>
      	<td>X: </td><td><input type="text" name="x"/></td>
      </tr>
      <tr>
      	<td>Y: </td><td><input type="text" name="y"/></td>
      </tr>
      <tr>
      	<td>Percentage:</td><td><input type="text" name="percentage" /></td>
      </tr>
      </table>
      <input type="submit" />
   </form>
</body>
</html>