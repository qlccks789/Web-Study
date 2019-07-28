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
		List<String> list = ??;
		for (String name : list) 
		{
	
	
		}
	 --%>
	<c:set var="list" 
	       value="<%= new Integer[] {1, 2, 3} %>" /> 
	       
	<c:set var="cnt" value="1" />
	<c:forEach var="data" items="${list}">
		<c:if test='${cnt != 1}'>,</c:if> ${data}
		
		<c:set var="cnt" value="${cnt + 1}" />
	</c:forEach> 
	<br>
	
	<c:forEach var="data" items="${list}" varStatus="loop">
		${loop.first} ::: ${loop.last} ::: ${loop.index} ::: ${loop.count} <br>  
	</c:forEach> 
	<br>

	<c:forEach var="data" items="${list}" varStatus="loop">
		<c:if test="${not loop.first}">,</c:if> ${data}	
	</c:forEach> 
	
</body>
</html>














