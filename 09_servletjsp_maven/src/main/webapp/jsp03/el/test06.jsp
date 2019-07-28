<%@page import="kr.co.mlec.jsp03.el.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 공유되는 데이터가 VO 형태의 객체일 경우
	Member m = new Member();
	m.setId("kim");
	m.setName("김연아");
	pageContext.setAttribute("member", m);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	member : ${member}<br>
	member - id : ${member.getId()} ::: ${member.id}<br>
	member - name : ${member.getName()} ::: ${member.name}<br>
	<%-- error 발생함
	member - email : ${member.getEmail()} ::: ${member.email}<br>
	 --%>
</body>
</html>








