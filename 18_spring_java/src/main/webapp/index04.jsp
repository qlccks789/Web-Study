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
	<h2>파일업로드 처리하기</h2>
	<form method="post" enctype="multipart/form-data"
	      action="<c:url value="/file/upload1.do" />">
		<input type="text" name="msg" value="한글"><br>
		<input type="file" name="attach"><br>
		<button>업로드</button>
	</form>

	<form method="post" enctype="multipart/form-data"
	      action="<c:url value="/file/upload2.do" />">
		<input type="text" name="msg" value="test"><br>
		<input type="file" name="attach" multiple="multiple"><br>
		<button>업로드</button>
	</form>

	<form method="post" enctype="multipart/form-data"
	      action="<c:url value="/file/upload3.do" />">
		<input type="text" name="msg" value="test"><br>
		<input type="file" name="attach1" multiple="multiple"><br>
		<input type="file" name="attach2" multiple="multiple"><br>
		<button>업로드</button>
	</form>
</body>
</html>



















