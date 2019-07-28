<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
</head>
<body>
	<h2>파라미터 처리 방식 이해하기</h2>
	<div>
		<a href="<c:url value="/param/test1.do?id=aaa&password=1111&name=홍길동" />">
			HttpServletRequest 파라미터 처리 1
		</a><br>
		<a href="<c:url value="/param/test2.do?id=aaa&password=1111&name=홍길동" />">
			@RequestParam 파라미터 처리 2
		</a><br>
		<a href="<c:url value="/param/test2.do?id=aaa&password=1111" />">
			@RequestParam 파라미터 처리 2(파라미터 생략)
		</a><br>
		<a href="<c:url value="/param/test3.do?id=aaa&password=1111" />">
			@RequestParam 파라미터 처리 2(파라미터 생략) - required(옵션설정)
		</a><br>
		<a href="<c:url value="/param/test4.do?password=1111" />">
			@RequestParam 파라미터 처리 2(파라미터 생략) - defaultValue(옵션설정)
		</a><br>
		<a href="<c:url value="/param/test5.do?id=aaa&password=1111&name=홍길동" />">
			파라미터 이름과 매개변수 이름이 값으면 자동으로 값을 설정
		</a><br>
		<a href="<c:url value="/param/test6.do?id=aaa&password=1111&name=홍길동" />">
			VO 객체로 파라미터 받기
		</a><br>
		<a href="<c:url value="/param/test7.do?id=aaa&password=1111&name=홍길동&birthDate=2019-10-22" />">
			VO 객체로 파라미터 받기(날짜 객체에 문자열 데이터 처리 - @DateTimeFormat)
		</a><br>
	</div>
</body>
</html>



















