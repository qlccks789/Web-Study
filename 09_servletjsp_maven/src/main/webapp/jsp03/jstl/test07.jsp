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
	<h2>프로젝트 경로 가져오기</h2>
	<%= request.getContextPath() %>/board/list.jsp<br>
	${pageContext.request.contextPath}/board/list.jsp<br>
	<c:url value="/board/list.jsp" /><br>
	<c:url value="list.jsp" />
</body>
</html>















