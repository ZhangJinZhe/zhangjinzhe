<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
	
</body>
<script type="text/javascript">
window.location.href="<%=path %>/FrontServlet";
</script>
</html>