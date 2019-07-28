<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("msg", "page msg~~");
	request.setAttribute("msg", "request msg~~");
	request.setAttribute("name", "황광희,태양,임시완,유노윤호");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	msg : ${msg}<br>
	request msg : ${requestScope.msg}<br>
	name : ${name}<br>
	id : ${id}<br>
	empty id : ${empty id}
</body>
</html>













