<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="${path}/resources/css/login_form.css" rel="stylesheet">
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="${path}/resources/js/login_form.js"></script>

</head>
<body>

    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-body">
                        <h2 class="card-title">User Log In</h2>
                        <form action="<c:url value='/user/login' />" method="post" id="login_form">
                            <div class="form-group">
                                <input type="text" name="u_name" id="u_name" class="form-control" placeholder="User ID">
                            </div>
                            <div class="form-group">
                                <input type="text" name="u_pw" id="u_pw" class="form-control" placeholder="User Password">
                            </div>
                            <button type="submit" class="btn btn-primary btn-block" id="btn_login">Login</button>
                            <button type="reset" class="btn btn-secondary btn-block">Reset</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
