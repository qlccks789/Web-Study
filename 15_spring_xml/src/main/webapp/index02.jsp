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
	<h2>Mapping 방식 이해</h2>
	<div>
		<a href="<c:url value="/requestmapping/test1.do" />">
			requestmapping1
		</a><br>
		<a href="<c:url value="/requestmapping/test2.do" />">
			requestmapping2-URL공통부분 클래스 적용
		</a><br>
		<a href="<c:url value="/requestmapping/test3.do" />">
			requestmapping3-path 속성
		</a><br>
		<a href="<c:url value="/requestmapping/test4.do" />">
			requestmapping4
		</a><br>
		<a href="<c:url value="/requestmapping/test5.do" />">
			requestmapping5
		</a><br>
		<a href="<c:url value="/requestmapping/test6.do" />">
			requestmapping6 - GET
		</a><br>
		<form method="POST" action="<c:url value="/requestmapping/test6.do" />">
			<button>requestmapping6 - POST</button>
		</form>
	</div>
	
	<h2>Mapping 방식 이해 - 헤더 활용</h2>
	<div id="content">
		<div>
			<a href="#1" data-type="application/json">
				application/json 호출
			</a>
		</div>
		<div>
			<a href="#1" data-type="application/x-www-form-urlencoded">
				application/x-www-form-urlencoded 호출
			</a>
		</div>
		<div>
			<a href="#1" data-type="text/plain">
				text/plain 호출
			</a>
		</div>
	</div>
	
	<script>
		$(function () {
			$("#content > div > a").click(function () {
				alert($(this).data("type"));
				
				$.ajax({
					url: "<c:url value="/requestmapping/test8.do" />",
					headers: {
						"Content-Type": $(this).data("type") 
					}
				});
			});
		});
	</script>
</body>
</html>



















