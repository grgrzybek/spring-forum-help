<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<script type="text/javascript" src="<c:url value="/scripts/jquery-1.4.2.min.js" />">	</script>
	<script type="text/javascript">
	$(function() {
		$("#add").click(function(ev) {
			ev.preventDefault();
			var index = $('#t > tbody > tr').length;
			
			$('#t > tbody:last').append(
				'<tr>' +
				'<td><input type="text" name="columns[' + index + '].nodePath"></td>' +
				'<td><input type="text" name="columns[' + index + '].name"></td>' +
				'</tr>'
			);
		});
	});
	</script>
</head>
<body>
<div>
<c:url value="/app/example323942/post" var="u" />
<form:form commandName="table" action="${u}">
<table id="t">
<c:forEach items='${table.columns}' var="column" varStatus='column_status'>
<tr>
	<td><form:input path="columns[${column_status.index}].nodePath"/></td>
	<td><form:input path="columns[${column_status.index}].name"/></td> 
</tr>
</c:forEach>
</table>
<input type="submit" value="send" />
<input id="add" type="button" value="add column" />
</form:form>
</div>
</body>
</html>
