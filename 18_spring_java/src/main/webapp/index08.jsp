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
	<h2>AJAX 호출 이해하기</h2>
	<p><a href="<c:url value="/08ajaxctrl/test1.do" />">텍스트 받기</a></p>
	<p><a href="<c:url value="/08ajaxctrl/test2.do" />">Map 받기</a></p>
	<p><a href="<c:url value="/08ajaxctrl/test3.do" />">Member 받기</a></p>
	<p><a href="<c:url value="/08ajaxctrl/test4.do" />">List 받기</a></p>
	<p><a href="<c:url value="/08ajaxctrl/test5.do" />">ResponseEntity 문자열 결과</a></p>
	<p><a href="<c:url value="/08ajaxctrl/board/100.do" />">PathVariable 100</a></p>
	<p><a href="<c:url value="/08ajaxctrl/board/200.do" />">PathVariable 200</a></p>
	
	<script>
		$("a").click(function (e) {
			// 페이지 이동 기본 이벤트 막기
			e.preventDefault();
			
// 			alert($(this).attr("href"));

			// ajax 호출하기
			$.ajax({
				url: $(this).attr("href")
			})
			.done(function (result) {
				console.dir(result);
			})
			.fail(function (xhr) {
				alert("서버 처리중 에러발생");
				console.dir(xhr);
			});
			
		});
	</script>
</body>
</html>




















