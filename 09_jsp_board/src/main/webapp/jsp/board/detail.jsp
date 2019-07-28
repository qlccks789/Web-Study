<%@page import="kr.co.mlec.board.vo.BoardVO"%>
<%@page import="kr.co.mlec.common.db.MyAppSqlConfig"%>
<%@page import="kr.co.mlec.board.dao.BoardMapper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
BoardMapper mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);

int no = Integer.parseInt(request.getParameter("no"));
mapper.updateViewCnt(no); 
BoardVO board = mapper.selectBoardByNo(no); 
%>        
<!DOCTYPE html> 
<html>
<head>
  <meta charset='utf-8'>
  <title>자유게시판</title>
</head>
<body>
	<h2>자유게시판</h2>
	<hr />
	<div>번호 : <%= board.getNo() %></div>
	<div>글쓴이 : <%= board.getWriter() %></div>
	<div>제목 : <%= board.getTitle() %></div>
	<div>내용 : <%= board.getContent() %></div>
	<div>등록일 : <%= board.getRegDate() %></div>
	<div>조회수 : <%= board.getViewCnt() %></div>
	<div>
	    <a href='updateform.jsp?no=<%= board.getNo() %>'>수정</a>
	    <a href='delete.jsp?no=<%= board.getNo() %>'>삭제</a>
	    <a href='list.jsp'>목록</a>
	</div>
</body>
</html>