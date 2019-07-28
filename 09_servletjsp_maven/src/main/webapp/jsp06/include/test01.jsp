<%--
	지시자 인클루드
	: jsp -> java 변경할 때 인클루드 페이지의 소스를 포함시켜 생성한다.
	
	- 변수를 공유해서 사용 가능하다.
	- 파라미터 정보를 넘길 수 없다.
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>a.jsp 페이지 포함하기....</h1>
	<hr>
		<%-- a.jsp 페이지 포함하기 --%>
		<%@ include file="a.jsp" %>
		<%--@ include file="a.jsp?no=100" --%>
	<hr>	
	
	<%= msg %> 
</body>
</html>












