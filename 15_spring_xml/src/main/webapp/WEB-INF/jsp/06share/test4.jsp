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
	<h2>test4.jsp : 공유데이터 확인</h2>
	<hr>
	<div>id : ${m.id}</div>
	<div>name : ${m.name}</div>
	<div>password : ${m.password}</div>
	<div>msg : ${msg}</div>
	<a href="<c:url value="/index06.jsp" />">돌아가기</a>
</body>
</html>

















