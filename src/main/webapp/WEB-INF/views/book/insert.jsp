<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book 등록</title>
<!-- 부트스트랩 CDN 링크 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2 class="mt-4">Book 등록 페이지</h2>
    <form action="insert" method="post">
        <div class="form-group">
            <label for="b_name">책 제목:</label>
            <input type="text" class="form-control" id="b_name" name="b_name" required>
        </div>
        <div class="form-group">
            <label for="b_author">저자:</label>
            <input type="text" class="form-control" id="b_author" name="b_author" required>
        </div>
        <div class="form-group">
            <label for="b_publisher">출판사:</label>
            <input type="text" class="form-control" id="b_publisher" name="b_publisher">
        </div>
        <div class="form-group">
            <label for="b_isbn">ISBN:</label>
            <input type="text" class="form-control" id="b_isbn" name="b_isbn" required>
        </div>
        <button type="submit" class="btn btn-primary">등록</button>
    </form>
</div>

<!-- 부트스트랩 JS 및 jQuery CDN 링크 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
