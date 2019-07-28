<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>파일 다운로드</h2>
	<div>
		<img src="${pageContext.request.contextPath}/download.do?path=/board/2019/03/19&name=68365d95-bdaf-4d2a-a0d8-34a633a364e9.jpg" >
	</div>
	<div>
		<a href="${pageContext.request.contextPath}/download.do?path=/board/2019/03/19&name=68365d95-bdaf-4d2a-a0d8-34a633a364e9.jpg">
			이미지 보여주기
		</a>	
		<a href="${pageContext.request.contextPath}/download.do?path=/board/2019/03/19&name=68365d95-bdaf-4d2a-a0d8-34a633a364e9.jpg&dname=테스트.jpg">
			이미지 다운로드
		</a>	
	</div>		
</body>
</html>












