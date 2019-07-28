<%--
	실행문 : 실행할 자바코드 작성
	표현식 : 출력할 부분을 명시(out.println())
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
	<%
	String msg = "Hello~ JSP";
	int cnt = 10;
	if (cnt > 5) {
		msg = "Hello Cnt";
	}
	
	// _jspService 메서드에 이미 선언된 변수이기 때문에 선언 불가..
// 	String request = "aaa";
	%>
	<h2>MSG : <%= msg %></h2>
	<h2>request uri : <%= request.getRequestURI() %></h2>
	<h2>MSG : out.println(msg)</h2>
</body>
</html>












