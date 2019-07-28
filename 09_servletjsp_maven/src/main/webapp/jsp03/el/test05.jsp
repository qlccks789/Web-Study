<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 맵객체가 공유데이터일 경우
	// EL에서 객체.키이름
	Map<String, String> data = new HashMap<>();
	data.put("id", "dong");
	data.put("name", "동방신기");
	
	pageContext.setAttribute("data", data);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	data : ${data}<br>
	<%-- jsp 2.2 부터는 객체의 메서드 호출이 가능해짐 --%>
	data - id : ${data.id} ::: ${data.get("id")}<br>
	data - name : ${data.name} ::: ${data.get("name")}<br>
</body>
</html>






