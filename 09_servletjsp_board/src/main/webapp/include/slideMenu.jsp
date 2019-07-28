<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
	<nav class="main-menu">
		<div>
			<ul>
				<li>                                   
					<a href="${pageContext.request.contextPath}">
					<i class="fa fa-home fa-lg"></i>
					<span class="nav-text">Home</span>
					</a>
				</li>   
				<c:choose>
				<c:when test="${empty sessionScope.user}">
				<li>                                 
					<a href="${pageContext.request.contextPath}/login/loginform.do">
					<i class="fa fa-user fa-lg"></i>
					<span class="nav-text">Login</span>
					</a>
				</li>   
				</c:when>
				<c:otherwise>
				<li>                                 
					<a href="${pageContext.request.contextPath}/login/logout.do">
					<i class="fa fa-user fa-lg"></i>
					<span class="nav-text">Logout</span>
					</a>
				</li>   
				</c:otherwise>
				</c:choose>
				<li>                                 
					<a href="${pageContext.request.contextPath}/board/list.do">
					<i class="fa fa-envelope-o fa-lg"></i>
					<span class="nav-text">Board</span>
					</a>
				</li>   
			</ul>
		</div>	
   </nav>