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
<title>首页</title>
</head>
<body>
<form action="<%=path %>/UploadServlet" method="post" enctype="multipart/form-data">
<p>用户名<input type="text" name="username"></p>
<p>大头照<input type="file" name="bigHeadImage"></p>
<p><input type="submit" value="提交"></p>

</form>
	
</body>
</html>