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
	<div>
		<ul>
			<c:if test="${empty sessionScope.user}">		
				<li><a href="loginform.do">로그인</a></li>
				<li>회원가입</li>
			</c:if>
			<li><a>자유게시판</a></li>
			<c:if test="${not empty sessionScope.user}">		
				<li>마이페이지</li>
				<li><a href="logout.do">로그아웃</a></li>
			</c:if>	
		</ul>		
	</div>
</body>
</html>













