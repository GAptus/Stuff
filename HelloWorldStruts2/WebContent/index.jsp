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
	
	<form action="doActions">
		<h3>Enter your starting values</h3>
		<table>
			<tr>
				<td>Element_ID</td><td><input type="text" name="elementID"/></td>
			</tr>
			<tr>
				<td>X</td><td><input type="text" name="x"/></td>
			</tr>
			<tr>
				<td>Y</td><td><input type="text" name="y"/></td>
			</tr>
			<tr>
				<td>Width</td><td><input type="text" name="width"/></td>
			</tr>
			<tr>
				<td>Height</td><td><input type="text" name="height"/></td>
			</tr>
		</table>
		<br/>
		<hr>
		<table>
			<tr>
				<td><input type="radio" name="resizingOptionTable1" value="growing"/></td><td>Growing</td>
				<td><input type="radio" name="resizingOptionTable1" value="shrinking"/></td><td>Shrinking</td>
				<td><input type="radio" name="resizingOptionTable1" value="GrowingFromZero"/></td><td>Grow from 0</td>
			</tr>
			<tr>
				<td>Percentage</td><td><input type="text" name="percentageTable1"/></td>
				<td>Delay</td><td><input type="text" name="delayTable1"/></td>
				<td>Duration</td><td><input type="text" name="durationTable1"/></td>
			</tr>	
			<tr>
				<td>Untick to Ignore</td><td><input type="checkbox" name="ignoreTable1" value="checked" checked/></td>
			</tr>
		</table>
		<hr>	
		<table>
			<tr>
				<td><input type="radio" name="resizingOptionTable2" value="growing"/></td><td>Growing</td>
				<td><input type="radio" name="resizingOptionTable2" value="shrinking"/></td><td>Shrinking</td>
				<td><input type="radio" name="resizingOptionTable2" value="GrowingFromZero"/></td><td>Grow from 0</td>
			</tr>
			<tr>
				<td>Percentage</td><td><input type="text" name="percentageTable2"/></td>
				<td>Delay</td><td><input type="text" name="delayTable2"/></td>
				<td>Duration</td><td><input type="text" name="durationTable2"/></td>
			</tr>	
			<tr>
				<td>Untick to Ignore</td><td><input type="checkbox" name="ignoreTable2" value="checked" checked/></td>
			</tr>
		</table>
		<hr>
		<table>
			<tr>
				<td><input type="radio" name="resizingOptionTable3" value="growing"/></td><td>Growing</td>
				<td><input type="radio" name="resizingOptionTable3" value="shrinking"/></td><td>Shrinking</td>
				<td><input type="radio" name="resizingOptionTable3" value="GrowingFromZero"/></td><td>Grow from 0</td>
			</tr>
			<tr>
				<td>Percentage</td><td><input type="text" name="percentageTable3"/></td>
				<td>Delay</td><td><input type="text" name="delayTable3"/></td>
				<td>Duration</td><td><input type="text" name="durationTable3"/></td>
			</tr>	
			<tr>
				<td>Untick to Ignore</td><td><input type="checkbox" name="ignoreTable3" value="checked" checked/></td>
			</tr>
		</table>
		<hr>
		<table>
			<tr>
				<td><input type="radio" name="resizingOptionTable4" value="growing"/></td><td>Growing</td>
				<td><input type="radio" name="resizingOptionTable4" value="shrinking"/></td><td>Shrinking</td>
				<td><input type="radio" name="resizingOptionTable4" value="GrowingFromZero"/></td><td>Grow from 0</td>
			</tr>
			<tr>
				<td>Percentage</td><td><input type="text" name="percentageTable4"/></td>
				<td>Delay</td><td><input type="text" name="delayTable4"/></td>
				<td>Duration</td><td><input type="text" name="durationTable4"/></td>				
			</tr>	
			<tr>
				<td>Untick to Ignore</td><td><input type="checkbox" name="ignoreTable4" value="checked" checked/></td>
			</tr>
		</table>	
		<br/>
		<hr>
		<input type="submit" value="doActions"/>
	</form>
   
</body>
</html>