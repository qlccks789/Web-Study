<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	SimpleDateFormat sdf = new SimpleDateFormat(
		"yyyy-MM-dd"
	);
	// 날짜객체 -> 문자열
	String sDate = sdf.format(new Date());
	
	// 문자열 -> 날짜객체
	Date date = sdf.parse("2019-01-01");
	date.getYear() + 1900
	date.getMonth() + 1	
	 --%>
	
	<%-- 문자열에서 날짜 객체 얻기 --%> 
	<fmt:parseDate var="d" value="2019-01-01" pattern="yyyy-MM-dd" />
	년도 : ${d.year + 1900}<br>
			
	<%-- 날짜 객체에서 문자열 얻기 --%>
	<fmt:formatDate value="${d}" pattern="yyyy-MM-dd" />
</body>
</html>













