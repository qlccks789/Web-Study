<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="msg" value="fn test" />
	fn:length(msg) : ${fn:length(msg)}<br>
	msg.length() : ${msg.length()}<br>
	fn:replace(msg, "fn", "test") : ${fn:replace(msg, "fn", "test")}<br>
	msg.replace("fn", "test") : ${msg.replace("fn", "test")}<br>
</body>
</html>











