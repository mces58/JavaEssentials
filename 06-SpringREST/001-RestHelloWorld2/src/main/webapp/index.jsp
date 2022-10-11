<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REST</title>
</head>
<body>
	<h2>Spring Rest Api Demo</h2>
	<br>
	<a href="${pageContext.request.contextPath}/test/hello"><b>Say Hello</b></a>
	<!-- ${pageContext.request.contextPath} bu ifade html sayfasinda hello'ya giderken proje ismini basa koyuyor
	bu olmaz ise url eksik olur -->
</body>
</html>