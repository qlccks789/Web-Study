<%@page import="kr.co.mlec.board.vo.BoardVO"%>
<%@page import="kr.co.mlec.common.db.MyAppSqlConfig"%>
<%@page import="kr.co.mlec.board.dao.BoardMapper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
BoardMapper mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
// 파라미터 정보를 읽어 데이터베이스에 저장하기
BoardVO board = new BoardVO();
board.setTitle(request.getParameter("title"));
board.setWriter(request.getParameter("writer"));
board.setContent(request.getParameter("content"));
mapper.insertBoard(board);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta http-equiv="refresh" content="2; url=list.jsp">
<title>Insert title here</title>
</head>
<body>
	<h2>게시물이 등록되었습니다.</h2>
</body>
</html>