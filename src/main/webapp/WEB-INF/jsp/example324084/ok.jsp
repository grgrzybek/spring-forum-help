<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<div>
StartDate: <fmt:formatDate value="${sd}" pattern="yyyy-MM-dd HH:mm:ss" /><br />
EndDate: <fmt:formatDate value="${ed}" pattern="yyyy-MM-dd HH:mm:ss" /><br />
</div>
</body>
</html>
