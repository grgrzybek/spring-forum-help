<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<div>
Result:
<form:form commandName="table">
<table id="t">
<c:forEach items='${table.columns}' var="column" varStatus='column_status'>
<tr>
	<td><form:input path="columns[${column_status.index}].nodePath" readonly="true" /></td>
	<td><form:input path="columns[${column_status.index}].name" readonly="true" /></td> 
</tr>
</c:forEach>
</table>
</form:form>
</div>
</body>
</html>
