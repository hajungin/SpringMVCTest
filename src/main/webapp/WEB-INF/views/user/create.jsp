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

	<h2>User Sign Up</h2>
	<form action="<c:url value='/user/create'></c:url>"
		method="post">
		<input type="text" name="u_name" placeholder="Input User ID"/><br>
		<input type="text" name="u_pw" placeholder="Input User PW"/><br>
		<input type="text" name="u_pw_again" placeholder="Input User PW Again"/><br>
		<input type="text" name="u_phone" placeholder="Input User Phone"/><br>
		<input type="text" name="u_email" placeholder="Input User Email"/><br>
		<input type="submit" value="create account"/>
		<input type="reset" value="reset"/>
		
		
	</form>

</body>
</html>