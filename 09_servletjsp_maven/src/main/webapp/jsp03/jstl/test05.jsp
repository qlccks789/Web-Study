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
		1번 형식
		for (int i = 0; i < 10; i++) 
		{
		
		}
		
		var 
		begin
		end
		step : 생략시 1씩 증가함
	--%>
	<c:forEach var="i" begin="1" end="10">
		${i}<br>
	</c:forEach>
	
	년도 : 
	<select>
		<c:forEach var="i" begin="1960" end="2010">
			<option value="${i}">${i}</option>
		</c:forEach>
	</select>
	<br>
	
	
		
</body>
</html>















