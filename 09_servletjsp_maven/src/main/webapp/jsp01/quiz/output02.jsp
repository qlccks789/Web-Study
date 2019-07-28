<%@ page contentType="text/html; charset=UTF-8" %>
<%
	int dan = Integer.parseInt(
					request.getParameter("dan"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border: 1px solid #444;
		width: 30%;
		text-align: center;
	}
	td, th {
		border: 1px solid #444;
	}
</style>
</head>
<body>
	<table>
	<tr>
		<th>단</th><th>값</th>
	</tr>	
	<%
		for (int i = 1; i < 10; i++) {
	%>
	<tr>
		<td><%= dan %> * <%= i %></td>
		<td><%= dan * i %></td>
	</tr>	
	<%
		}
	%>
	</table>
	<a href="input02.jsp">다시입력</a>
</body>
</html>




