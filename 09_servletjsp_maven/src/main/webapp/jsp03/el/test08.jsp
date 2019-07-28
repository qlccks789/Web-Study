<%@ page import="kr.co.mlec.jsp03.el.DateUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 정적메서드(static) 접근하기.. EL 3.0 부터 가능
	String today = DateUtil.today();
	pageContext.setAttribute("today", today);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	오늘 : ${today}<br>
	오늘(EL 3.0) : ${DateUtil.today()}
</body>
</html>















