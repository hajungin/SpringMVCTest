<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="./nav.jsp"></jsp:include>
	<h2>Admin LIST</h2>
	
   	<form action="<c:url value='/admin/searchAdminConfirm'></c:url>"
      name="search_admin_searchAdminConfirm" method="get" class="form-inline mt-3">
    <div class="form-group mr-2">
        <select name="category" class="form-control">
            <option value="None">== Select Category == </option>
            <option value="Account">Account</option>
            <option value="Name">Name</option>
            <option value="Phone">Phone</option>
        </select>
    </div>
    <div class="form-group mr-2">
        <input type="text" name="keyword" placeholder="Enter Keyword" class="form-control">
    </div>
    <button type="submit" class="btn btn-primary">Search</button>
</form>

	<table class="table table-bordered table-striped">
		<thead class="thead-dark">
        <tr>
            <th>계정</th>
            <th>이름</th>
            <th>연락처</th>
            <th>승인</th>
        </tr>
    </thead>
		<c:forEach var="dto" items="${adminDtos}">
			<tr>
				<td>${dto.a_id}</td>
				<td>${dto.a_name}</td>
				<td>${dto.a_phone}</td>
					<td>
					<c:choose>
						<c:when test="${dto.a_approval eq 0}">
							<c:url value='/admin/setAdminApproval' var='approval_url'>
							<!-- val은 변수 이름생성 -->
							
								<c:param name="id" value="${dto.a_id}"></c:param>
								<!-- http://localhost:8081/hhh/admin/setAdminApproval?id=@@@ -->
								
							</c:url>					
							<a href="${approval_url}">승인처리</a>
						</c:when>
									
						<c:when test="${dto.a_approval eq 1}">
							<c:out value="승인축하"></c:out>
						</c:when>
					</c:choose>
					</td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>