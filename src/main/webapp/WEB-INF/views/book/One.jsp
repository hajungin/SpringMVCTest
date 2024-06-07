<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 수정</title>
</head>
<body>
    <h2>도서 수정</h2>
    
    <form action="/book/update" method="post">
        <label for="b_name">도서명:</label><br>
        <input type="text" id="b_name" name="b_name" ><br>
        
        <label for="b_author">저자:</label><br>
        <input type="text" id="b_author" name="b_author" ><br>
        
        <label for="b_publisher">출판사:</label><br>
        <input type="text" id="b_publisher" name="b_publisher"><br>
        
        <label for="b_isbn">ISBN:</label><br>
        <input type="text" id="b_isbn" name="b_isbn" value="${bookDto.b_isbn}" readonly><br>
        
        <button type="submit">수정 완료</button>
    </form>
</body>
</html>
