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
	<%-- 
		참일 경우 처리하기
		
		if (조건식) 
		{
			처리할 일	
		} 
		else if (조건) 
		{
		
		}
		..
		else 
		{
		
		} 
	--%>
	<c:set var="auth" value="S" />
	<c:set var="auth" value="U" />
	<c:set var="auth" value="T" />
	<c:choose>
		<c:when test="${auth == 'S'}">
			<h2>관리자 입니다.</h2>
		</c:when>
		<c:when test="${auth == 'U'}">
			<h2>일반 사용자 입니다.</h2>
		</c:when>
		<c:otherwise>
			<h2>잘못된 사용자 입니다.</h2>
		</c:otherwise>
	</c:choose>
</body>
</html>














