<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
		
		a {
			font-size: 20px;	
		}
		a:hover {
			color: red;
		}
		</style>
	</head>
	
	<body>
		<h2 id="back">Path Variable Annotation</h2>
		<a href="${pageContext.request.contextPath}/api/students">Get all students</a>
		<br>
		<br>
		<a href="${pageContext.request.contextPath}/api/students/0">Get student by id</a>
	</body>
</html>