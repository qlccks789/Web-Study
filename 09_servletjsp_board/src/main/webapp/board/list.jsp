<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="/include/includeCssJS.jsp" %> 
</head>
<body>
	<jsp:include page="/include/slideMenu.jsp" />
    <div class="content">
   	  	<h2>자유게시판</h2>
		<hr>
		<div>
			<span>전체 : ${pageResult.count}개</span>
			<table>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>글쓴이</th>
					<th>조회수</th>
					<th>등록일</th>
				</tr>
				<c:forEach var="board" items="${list}">
					<tr>
					  <td>${board.no}</td>
					  <td><a href='detail.do?no=${board.no}'>
					  		<c:out value="${board.title}" />
					  	  </a>
					  </td>
					  <td>${board.writer}</td>
					  <td>${board.viewCnt}</td>
					  <td><fmt:formatDate value="${board.regDate}" 
					                      pattern="yyyy-MM-dd" /> </td>
					</tr>
				</c:forEach>			
			</table>
			<a href="writeform.do">등록</a>
			<c:if test="${pageResult.count != 0}">
				<jsp:include page="/include/pagetype1.jsp">
					<jsp:param name="link" value="list.do"/>
				</jsp:include>
			</c:if>
		</div>
   </div>
</body>
</html>












