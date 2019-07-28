<%@ page contentType="text/html; charset=UTF-8" %>
<%
	String id = request.getParameter("id");
	String msg = request.getParameter("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= id %>님이 <%= msg %> 메세지를 보냈습니다.
</body>
</html>
