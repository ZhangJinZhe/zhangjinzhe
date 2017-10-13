<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String context = request.getContextPath();// /dt41_javaweb2
	String path = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+context+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=path %>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>测试</title>
</head>
<body>

<%@ include file="/pages/test/Test1.jsp" %>
<h2>我是主体</h2>
<%@ include file="/pages/test/Test2.jsp" %>
	
</body>
</html>