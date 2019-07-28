<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<form method='post' action='write.do' enctype="multipart/form-data">
	 	<div>
  		   제목 : <input type='text' name='title' size='70' />	 	
	 	</div>
	 	<div>
		     글쓴이 : <input type='text' name='writer' size='30' />
	 	</div>
	 	<div>
	            내용 : <textarea name='content' rows='7' cols='70'></textarea>
	 	</div>
	    <div>
	 		첨부파일 : <input type="file" name="attach" />
	 	</div>	 	
	    <button type='submit'>등록</button>
	</form>
   </div>	 	
</body>
</html>












