<%--
	<%= request.getContextPath() %>
	
	${pageContext.request.contextPath}
	
	<c:url value="/.." />
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
		파일업로드시 필수사항
		1. method 방식을 post로 지정
		2. enctype="multipart/form-data" 로 설정해야 한다.
		   : 설정이 안된 경우 파일의 내용이 전송되지 않는다.	
	 --%>
	<form method="post" 
		  enctype="multipart/form-data"
		  action="<c:url value="/jsp04/fileupload/test01.do" />">
		<input type="text" name="msg"><br>
		<input type="file" name="attach1"><br>
		<input type="file" name="attach2"><br>
		<button>전송</button>
	</form>
</body>
</html>









