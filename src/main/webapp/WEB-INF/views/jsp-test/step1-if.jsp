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
<c:if test="true">
	true 이므로 실행~
</c:if>

<hr>
Query String 방식
<br>
<a href="/hhh/step1-if?age=20&nick=팽수">step1을 다시 호출!</a><br>
나이 : ${param.age} <br>
닉네임 : ${param.nick} <br>

<c:if test="${param.age > 5 && param.nick == '팽수'}">
    나이가 5세를 초과하고 닉네임은 ${param.nick}입니다.
</c:if>


</body>
</html>