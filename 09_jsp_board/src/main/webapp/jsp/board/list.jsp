<%@page import="java.text.SimpleDateFormat"%>
<%@page import="kr.co.mlec.board.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.mlec.common.db.MyAppSqlConfig"%>
<%@page import="kr.co.mlec.board.dao.BoardMapper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// Database 에서 데이터 가져오기
	BoardMapper mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
	List<BoardVO> list = mapper.selectBoard(); 
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>자유게시판</h2>
	<hr>
	<div>
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>조회수</th>
				<th>등록일</th>
			</tr>
			<%
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			for (BoardVO board : list) {
			%>
				<tr>
				  <td><%= board.getNo() %></td>
				  <td><a href='detail.jsp?no=<%= board.getNo()%>'><%= board.getTitle() %></a></td>
				  <td><%= board.getWriter() %></td>
				  <td><%= board.getViewCnt() %></td>
				  <td><%= sdf.format(board.getRegDate()) %></td>
				</tr>
			<%
			}
			%>	
		</table>
		<a href="writeform.jsp">등록</a>
	</div>
</body>
</html>












