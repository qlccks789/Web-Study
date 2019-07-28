<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String msg = (String)request.getAttribute("msg");
	List<String> menu = (List<String>)request.getAttribute("menu");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2><%= msg %></h2>
	<hr>
	<ul>
	<%
	for (String food : menu) {	
	%>
		<li><%= food %></li>
	<%
	}
	%>	
	</ul>
</body>
</html>
















