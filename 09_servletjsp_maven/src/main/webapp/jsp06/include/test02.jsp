<%--
	액션 include 
	
	- 호출한 결과 포함
	- 호출하려는 페이지에서 선언한 변수를 같이 사용 불가능
	- 파라미터 정보를 설정할 수 있다.
 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>a.jsp 페이지 포함하기....</h1>
	<hr>
		<%-- a.jsp 페이지 포함하기 --%>
		<jsp:include page="a.jsp">
			<jsp:param name="no" value="100" />
		</jsp:include>
	<hr>
	<jsp:include page="a.jsp" />
	
	<%-- msg --%>
</body>
</html>













