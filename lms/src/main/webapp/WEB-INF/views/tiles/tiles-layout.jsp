<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:getAsString name="title"></tiles:getAsString></title>
</head>
<body>
	<div align="center">
		<div>
			<table border="1">
				<tr>
					<td colspan="2"><tiles:insertAttribute name="header"></tiles:insertAttribute>
					</td>
				</tr>
				<tr>
					<td width="20%" height="400"><tiles:insertAttribute name="side"></tiles:insertAttribute></td>
					<td width="80%"><tiles:insertAttribute name="body"></tiles:insertAttribute></td>
				</tr>
				<tr>
					<td colspan="2"><tiles:insertAttribute name="footer"></tiles:insertAttribute>
					</td>
				</tr>
			</table>
		</div>
	</div>

</body>
</html>