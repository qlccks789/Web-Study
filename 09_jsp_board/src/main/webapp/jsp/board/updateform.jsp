<%@page import="kr.co.mlec.board.vo.BoardVO"%>
<%@page import="kr.co.mlec.common.db.MyAppSqlConfig"%>
<%@page import="kr.co.mlec.board.dao.BoardMapper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
BoardMapper mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);

int no = Integer.parseInt(request.getParameter("no"));
BoardVO board = mapper.selectBoardByNo(no); 
%>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <h2>자유게시판</h2>
	 <form method='post' action='update.jsp'>
	 	<input type="hidden" name="no" value="<%= board.getNo() %>" />
	 	<div>
  		   제목 : <input type='text' name='title' size='70' value="<%= board.getTitle() %>" />	 	
	 	</div>
	 	<div>
		     글쓴이 : <input type='text' name='writer' size='30' value="<%= board.getWriter() %>" readonly="readonly" />
	 	</div>
	 	<div>
	            내용 : <textarea name='content' rows='7' cols='70'><%= board.getContent() %></textarea>
	 	</div>
	    <button type='submit'>수정</button>
	 </form>
</body>
</html>