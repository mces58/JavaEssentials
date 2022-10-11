<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			body {
				font-size: 20px;
			}
			a:hover {
				color: red;
			}
		</style>
	</head>
	<body>
		<h2>Web CRM Demo</h2>
		<br>
		<a href="${pageContext.request.contextPath}/api/customers">Get All Customers</a>
		<br>
		<a href="${pageContext.request.contextPath}/api/customers/1">Get Customer By Id</a>
	</body>
</html>