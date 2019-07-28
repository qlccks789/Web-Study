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
	<form method="post" 
		  enctype="multipart/form-data"
		  action="<c:url value="/jsp04/fileupload/test03.do" />">
		<input type="text" name="msg"><br>
		<input type="file" name="attach"><br>
		<button>전송</button>
	</form>
</body>
</html>









