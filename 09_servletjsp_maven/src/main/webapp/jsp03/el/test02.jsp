<%--
	el에서의 문자열 연산
	"3" + 2 = 32(자바)
	"3" + 2 = 5(EL)
	"hello~" + 3 = hello~3(자바)
	"hello~" + 3 = 에러발생(숫자변경이 안되어 에러발생)
	
	jsp2.2 버전 까지는 문자열 연산이 안되었음..
	jsp2.3 - EL 3.0 버전 부터는 문자열 연산이 가능해짐
	+= 연산자를 이용한다.
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
	<h2>EL의 문자열 연산</h2>
	<hr>
	"100" + "200" = ${"100" + "200"}<br>
	<%--
	// java.lang.NumberFormatException: For input string: "hello"
	// + 연산시 숫자로 변경해야 하는데 변경할 수 없는 값이기 때문에 에러 발생
	"hello" + "java" = ${"hello" + "java"}<br>
	 --%>
	"hello " += "java" = ${"hello " += "java"} 
</body>
</html>












