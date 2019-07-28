<%--
	JSP 
	: 서블릿에서 복잡하게 처리되던 화면을 깔끔하게 처리하기 위한 목적..
	: HTML + 자바
	: 실행될 때 먼저 서블릿으로 변환하는 과정을 거치게 된다.
	
	jsp를 최초 호출시
	- .jsp -> .java -> .class -> 객체생성 -> 실행결과만들고 -> 사용자 전송
	
	jsp를 재 호출시 
	- 실행결과만들고 -> 사용자 전송
	
	.java(서블릿)으로 작성될때
	_jspService 메서드가 추가된다. 이 메서드가 사용자 요청에 대한 실제적인 처리메서드
	.jsp로 작성하는 파일의 내용은 _jspService 메서드 안에 들어가게 된다.
	jsp 파일안에서 _jspService 메서드에 선언된 변수들을 사용할 수 있게 된다.
	
	이러한 변수를 내장객체 또는 기본객체라고 부른다.
	
	request - HttpServletRequest
	response - HttpServletResponse
	page - Object
	pageContext - PageContext 
	out - JSPWriter
	session - HttpSession
	application - ServletContext
	config - ServletConfig
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
	<h2>첫번째 JSP 페이지 호출</h2>
</body>
</html>




