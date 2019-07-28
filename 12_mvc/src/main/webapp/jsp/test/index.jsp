<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>폼 정보 등록하기</h2>
	<hr>
	<form action="test-process.do" method="post">
		<div>
			id : <input type="text" name="id" />
		</div>
		<div>
			name : <input type="text" name="name" />
		</div>
		<div>
			취미 : 
			<input type="checkbox" name="aaa" value="1">코딩<br>
			<input type="checkbox" name="aaa" value="2">영화<br>
			<input type="checkbox" name="aaa" value="3">음악<br>					
		</div>
		<div>
			특기 : 
			<input type="checkbox" name="bbb" value="1">코딩<br>
			<input type="checkbox" name="bbb" value="2">웃기<br>
			<input type="checkbox" name="bbb" value="3">먹기<br>					
		</div>
		<div>
			<button>전송</button>
		</div>
	</form>
	
</body>
</html>













