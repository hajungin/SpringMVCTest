<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<ul>
		<li><a href="<c:url value='/user/login'/>">로그인</a></li>
		<li><a href="<c:url value='/user/create'/>">회원가입</a></li>
	</ul>

</body>
</html>