<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book LIST</title>
</head>
<body>
    <h2>Book LIST</h2>
    <table>
        <tr>
            <th>도서명</th>
            <th>저자</th>
            <th>출판사</th>
            <th>ISBN</th>
            <th>삭제</th>    
        </tr>
        <c:forEach var="dto" items="${bookDtos}">
            <tr>
                <td>
                    <c:url value='/book/update' var='update'>
                        <c:param name="b_isbn" value='${dto.b_isbn}'/>
                    </c:url>
                    <a href="${update}">${dto.b_name}</a>
                </td>
                <td>${dto.b_author}</td>
                <td>${dto.b_publisher}</td>
                <td>${dto.b_isbn}</td>
                <td>
                    <form action="<c:url value='/book/delete'/>"
                        method="post">
                        <button type="submit">삭제</button>
                        <input type="hidden" name="id" value="${dto.b_isbn}">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
    
    <a href="<c:url value='/book/insert'/>">도서등록</a>
</body>
</html>
