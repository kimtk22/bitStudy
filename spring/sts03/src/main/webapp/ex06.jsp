<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>URL</h1>
	<nav>
		<a href="/sts03/">HOME</a>
		<a href="<%=request.getContextPath()%>/">HOME</a>
		<a href="${pageContext.request.contextPath }/">HOME</a>
		<c:url value="/" var="root" />
		<a href="${root }emp">EMP</a>
		<c:url var="naver" value="https://search.naver.com/search.naver">
			<c:param name="query" value="java"></c:param>
			<c:param name="ie" value="utf8"></c:param>
		</c:url>
		<a href="">${naver }</a>
	</nav>
	
</body>
</html>