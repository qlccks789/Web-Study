<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>설정된 쿠키 정보</h2>
	<hr>
	<%
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				String name = c.getName();
				String value = c.getValue();
	%>
				<h2><%= URLDecoder.decode(name, "utf-8") %> : <%= value %></h2>
	<%			
			}
		} else {
	%>
			<h2>설정된 쿠키가 없습니다.</h2>
	<%		
		}
	%>		
	
	<h2>쿠키 설정</h2>
	<form action="test.do">
		이름 : <input type="text" name="name"><br>
		값 : <input type="text" name="value"><br>
		<input type="submit" value="쿠키설정">
	</form>
</body>
</html>


