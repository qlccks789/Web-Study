<%--
	JSTL : JSP Standard Tag Library
	
	- JSP에서 자체 제공하는 문법 아님..
	- 개발자들이 개별적으로 만들어 쓰던 태그(커스텀 태그)를 표준으로 만들어서 제공
	- jstl을 사용하기 위해서는 프로젝트에 라이브러리 다운로드 해서 사용
	- JSTL 기능별로 태그를 관리
	  1. core : 프로그램 작성시 필요한 기본 기능들을 제공
	  2. fmt : 날짜, 숫자, 다국어
	  3. funtion : 문자열 클래스의 주요 기능들을 제공
	  ---------------------------------------
	  * 거의 사용하지 않는다.
	  4. sql
	  5. xml
	- tablib 지시자를 이용해서 jstl 해석할 수 있게 설정한다.  
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		데이터 공유하는 자바 코드를 대체한다.
		pageContext.setAttribute("msg", "연습");
		
		변경되는 값 ?? "msg", "연습", pageContext 
		
		var   - "msg"
		value - "연습"
		scope - page, request, session, application
	 --%>
	<c:set  var="msg" value="연습" scope="page" />
	
	<%-- scope를 적용하지 않은경우 디폴트 page 영역으로 설정 --%>
	<c:set  var="msg" value="연습 변경" />
	
	<%-- 공유영역에 설정된 msg 확인 --%>
	msg : ${msg}<br>
	
	page 영역에 cnt 변수이름으로 1을 설정<br>
	<c:set var="cnt" value="1" />
	
	request 영역에 cnt 변수 이름으로 100을 설정<br>
	<c:set var="cnt" value="100" scope="request" />
	
	page 영역에 있는 cnt : ${cnt}<br>
	request 영역에 있는 cnt : ${requestScope.cnt}<br>
	
	page 영역의 cnt 변수의 값을 기존의 값에서 1을 증가시킨다.<br>
	${cnt = cnt + 1}<br>
	<c:set var="cnt" value="${cnt + 1}" /><br>
	증가된 값 : ${cnt}<br>
	
	 
</body>
</html>
















