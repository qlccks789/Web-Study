<%@page import="kr.co.mlec.common.db.MyAppSqlConfig"%>
<%@page import="kr.co.mlec.board.dao.BoardMapper"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
BoardMapper mapper = MyAppSqlConfig.getSqlSession().getMapper(BoardMapper.class);
mapper.deleteBoard(Integer.parseInt(request.getParameter("no"))); 
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta http-equiv="refresh" content="2; url=list.jsp">
<title>Insert title here</title>
</head>
<body>
	<h2>게시물이 삭제되었습니다.</h2>
</body>
</html>