<%--
	지시문 : directive
	
	1. 종류 : page(JSP 실행시에 필요한 정보를 설정), include, taglib
	2. 형태 : <%@ 종류 속성 ...  로 시작
	      : <%@ page ..,
	      : <%@ include .. 
	      : <%@ taglib ..
	3. page 지시문의 속성
	   : import - 서블릿 변환시 import .. 구문으로 변경
	   : contentType - 서블릿 변환시 response.setContentType(값...)
	   : pageEncoding - 웹 엔진에게 jsp 페이지 해석 시 사용할 encoding 지정
	   : trimDirectiveWhitespaces 
	   ...
	   ...
	   ...
 --%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 
import java.util.List;
<%@ page import="java.util.List,java.util.ArrayList" %>    
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>    
--%>	
<%
	List<String> list = new ArrayList<>();
%>    
<%!
    // 선언문 : _jspService 밖으로 선언이 된다.
	String a = "a";
	public void test() {
		
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>list.size() : <%= list.size() %></h2>
</body>
</html>











