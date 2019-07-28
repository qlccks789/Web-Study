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
	<c:set var="msg" value="test" />
	
	el : ${msg}<br>
	jstl out : <c:out value="${msg}" /><br>	
	
	<c:set var="msg" value="<h1>test</h1>" />
	el : ${msg}<br>
	jstl out : <c:out value="${msg}" /><br>	

	jstl out default : <c:out value="${abc}" default="메세지가 없습니다." /><br>	
	
	
</body>
</html>














