<%--
	EL에서 객체 찾기...
	
	${id}
	${name}
	${param}
	
	- 찾는 순서
	1. EL에서 제공하는 기본객체에서 $에서 사용된 이름을 찾는다.
	  : pageContext - jsp제공되는 기본 객체와 동일, jsp의 다른 기본객체 접근
	  ------------------------------
	    jsp에서 제공하는 공유영역에 접근하는 객체
	    EL 기본객체                  JSP 기본객체 	
	  : pageScope        - pageContext	
	  : requestScope     - request	
	  : sessionScope     - session	
	  : applicationScope - application
	  ------------------------------
	    파라미터 값 처리
	  : param
	  : paramValues
	  ------------------------------
	    헤더 값 처리	  
	  : header
	  ------------------------------
	    상태정보 저장하는 Cookie와 연관
	  : cookie	
	
	2. 1번 과정에서 못찾은 경우 jsp 4가지 공유영역에서 찾는다.
	   pageContext -> request -> session -> application
	   : pageContext .. application 쪽으로 이름이 나올때 까지 이동하면서 찾는다.  
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
	id : <%= request.getParameter("id") %><br>
	id(el) : ${param.id}
	
</body>
</html>















