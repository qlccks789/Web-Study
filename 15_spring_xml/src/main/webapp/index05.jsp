<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
</head>
<body>
	<h2>컨트롤러 반환타입 이해</h2>
	<a href="<c:url value="/05return/test1.do" />">
		String 반환타입
	</a><br>
	<a href="<c:url value="/05return/test2.do" />">
		void 반환타입
	</a><br>
	<a href="<c:url value="/05return/test3.do" />">
		ModelAndView 반환타입
	</a><br>
	<a href="<c:url value="/05return/test4.do" />">
		View 반환타입
	</a><br>
</body>
</html>




















