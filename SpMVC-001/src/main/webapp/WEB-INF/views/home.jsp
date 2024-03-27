<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
<link href="${rootPath}/static/css/main.css"
	rel="stylesheet">
</head>
<body>
	<header class="main">
		<h1>반갑습니다</h1>
		<h2>지금 시각은 ${serverTime}</h2>
	</header>
	<nav>
		<ul>
			<li><a href="/login"> HOME </a></li>
			<li><a href="/login"> 공지사항 </a></li>
			<li><a href="/login"> 로그인 </a></li>
			<li><a href="${rootPath}/user/join"> 회원가입 </a></li>
		</ul>
	</nav>
</body>
</html>
