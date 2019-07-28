<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 배열이나 리스트에 접근하기
	List<String> nameList = Arrays.asList(
			"김연아", "박지성", "박항서"
	);
	String[] nameArr = {"허준", "대장금", "야인시대"};
	pageContext.setAttribute("list", nameList);
	pageContext.setAttribute("arr", nameArr);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	arr[0] : ${arr[0]}<br>
	list[0] : ${list[0]}
</body>
</html>











