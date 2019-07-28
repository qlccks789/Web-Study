<%@page import="kr.co.mlec.jsp05.cookie.MyDecoder"%>
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
	<h2>설정된 쿠키 정보</h2>
	<hr>
	<c:forEach var="c" items="${cookie}">
		<h2>${MyDecoder.decode(c.key)}:${c.value.value}</h2>
	</c:forEach>
	
	<h2>쿠키 설정</h2>
	<form action="test.do">
		이름 : <input type="text" name="name"><br>
		값 : <input type="text" name="value"><br>
		<input type="submit" value="쿠키설정">
	</form>
</body>
</html>


















