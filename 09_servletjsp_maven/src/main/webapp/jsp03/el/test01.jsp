<%--
	EL : Expression Language
	
	- jsp 표현식을 대체한다(<%= %>)
	- 자바 클래스의 메서드를 호출하거나 집합객체에 대한 접근하는 방법을 제공
	- jsp에서 제공하는 기본객체(내장객체) 중에서 공유영역과 연관된 4가지 객체와 
	   밀접한 연관성을 가진다.
	  4가지 기본객체 : request, pageContext, session, application
	
	
	- 구문 : ${값..}, #{값..} (jsp 2.1 버전부터 가능)	
	- 톰켓 버전을 확인하고 사용해야 한다. (jsp 2.0 부터 직접 사용 가능)
	  2.0미만에는 jstl 태그 안에서만 사용 가능했음..
	  2.0 부터는 jsp 파일안에서 단독으로 사용 가능함.. 
	  
	- 살펴볼 EL의 특징
	  : 연산자
	  : 객체란
	  : 객체의 접근방식  
	  
	- 연산자
	  : 산술연산자( +, -, *, /(div), %(mod) )
	  : 비교연산자( ==(eq), !=(ne), <=(le), >=(ge) )
	  : 논리연산자( &&(and), ||(or), !(not) )
	  : 삼항연산자( ? : )	
	  
	- 추가된 연산자
	  : empty 연산자
	    1. 값이 null 일 경우 true
	    2. null 값이 아닌데 true이 나오는 경우
	       2-1. 문자열의 값인 경우는 길이가 0이면 true ""(0) " "(X)
	       2-2. 리스트나 배열의 경우 데이터 없는 경우 true	  
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
	<h2>EL 에서 사용하는 연산자</h2>
	<hr>
	<div>5 + 5 = <%= 5 + 5 %></div>
	<div>5 + 5(el) = ${ 5 + 5 }</div>
	<div>5 % 2 = ${ 5 % 2 }</div>
	<div>5 mod 2 = ${ 5 mod 2 }</div>
	<div>5 == 2 = ${5 == 2}</div>
	<div>5 eq 2 = ${5 eq 2}</div>
	<div>empty "a" = ${empty "a"}</div>
	<div>empty "" = ${empty ""}</div>
	<div>not empty "" = ${not empty ""}</div>
</body>
</html>
















