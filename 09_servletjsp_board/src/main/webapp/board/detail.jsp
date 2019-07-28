<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    	
<!DOCTYPE html> 
<html>
<head>
  <meta charset='utf-8'>
  <title>자유게시판</title>
  <%@ include file="/include/includeCssJS.jsp" %> 
</head>
<body>
   <jsp:include page="/include/slideMenu.jsp" />	
   <div class="content">
	<h2>자유게시판</h2>
	<hr />
	<div>번호 : ${board.no}</div>
	<div>글쓴이 : ${board.writer}</div>
	<div>제목 : ${board.title}</div>
	<div>내용 : ${board.content}</div>
	<div>등록일 : ${board.regDate}</div>
	<div>조회수 : ${board.viewCnt}</div>
	<div>첨부파일 : 
		<c:forEach var="file" items="${fileList}">
			<a href="${pageContext.request.contextPath}/download.do?path=${file.filePath}&name=${file.systemName}&dname=${file.orgName}">
			${file.orgName}
			</a>
			(${file.fileSize}bytes)
		</c:forEach>
	</div>
	<div>
	    <a href='updateform.do?no=${board.no}'>수정</a>
	    <a href='delete.do?no=${board.no}'>삭제</a>
	    <a href='list.do'>목록</a>
	</div>
	
	<!-- 댓글 파트 시작 -->
	<div id="commentRegistForm">
		<form method="post" action="comment-regist.do">
			<input type="hidden" name="no" value="${board.no}" />	
			<table width="70%">
			<tr>
				<td><input type="text" name="writer" /></td>
				<td><textarea name="content" rows="2" cols="60"></textarea></td>
				<td><input type="submit" value="등록" /></td>
			</tr>	
			</table>
		</form>
	</div>	
	
	<div id="commentList">
		<form action="comment-update.do" method="post">
			<input type="hidden" name="no" value="${board.no}" />
			<input type="hidden" name="commentNo" value="${param.commentNo}" />
			
		  <table width='80%' border='1'>
			<c:forEach var="comment" items="${commentList}">
			<c:choose>
		  		<c:when test="${param.commentNo eq comment.commentNo}">	
					<tr>
					  <td><c:out value="${comment.writer}" /></td>
					  <td>
					  	<textarea name="content" rows="2" cols="60"><c:out value="${comment.content}" /></textarea>
					  </td>
					  <td colspan="2">
					  	  <input type="submit" value="수정" />
					  	  <a href="detail.do?no=${comment.no}">취소</a>
					  </td>
					 </tr>
			 	</c:when>
			 	<c:otherwise>
					<tr>
					  <td><c:out value="${comment.writer}" /></td>
					  <td><c:out value="${comment.content}" /></td>
					  <td><fmt:formatDate value="${comment.regDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
					  <td>
					  	  <a href="comment-delete.do?commentNo=${comment.commentNo}&no=${comment.no}">삭제</a>	
					  	  <a href="detail.do?commentNo=${comment.commentNo}&no=${comment.no}">수정</a>	
					  </td>
					 </tr>
			 	</c:otherwise>
			 </c:choose>	
			 </c:forEach>
			 <c:if test="${empty commentList}">
			 <tr>
			    <td colspan='4'>댓글이 존재하지 않습니다.</td>
			 </tr>
		 	</c:if>
		 </table>
		</form>
	</div> 
   </div>
</body>
</html>















