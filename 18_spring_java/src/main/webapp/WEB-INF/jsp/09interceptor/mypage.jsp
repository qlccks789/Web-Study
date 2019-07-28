<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="<c:url value="/09interceptor/logout.do" />">로그아웃</a>
	<div>
		<h2>아이디 : ${user.id}</h2>
		<h2>이름 : ${user.name}</h2>
	</div>
</body>
</html>