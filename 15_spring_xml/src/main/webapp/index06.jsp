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
	<h2>컨트롤러 데이터 공유 이해</h2>
	<a href="<c:url value="/06share/test1.do?id=a&password=1111&name=hong" />">
		request 공유
	</a><br>
	<a href="<c:url value="/06share/test2.do?id=a&password=1111&name=hong" />">
		파라미터 자동 공유
	</a><br>
	<a href="<c:url value="/06share/test3.do?id=a&password=1111&name=hong" />">
		@ModelAttribute 공유
	</a><br>
	<a href="<c:url value="/06share/test4.do?id=a&password=1111&name=hong" />">
		Model을 이용한 공유
	</a><br>
	<a href="<c:url value="/06share/test5.do?id=a&password=1111&name=hong" />">
		Map을 이용한 공유
	</a><br>
	<a href="<c:url value="/06share/test6.do" />">
		리다이렉트시 정보 넘기기
	</a><br>
</body>
</html>




















