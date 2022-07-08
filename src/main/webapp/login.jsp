<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<%@ include file="header.jsp" %>

<br>

<div class="container">
  <h2>로그인</h2>
  <form action="/login.menu" method="post">
    <div class="form-group">
      <label for="userid">아이디:</label>
      <input type="text" class="form-control" id="userid" placeholder="아이디 입력" name="userid">
    </div>
    <div class="form-group">
      <label for="userpw">패스워드:</label>
      <input type="password" class="form-control" id="userpw" placeholder="패스워드 입력" name="userpw">
    </div>

    <button type="submit" class="btn btn-primary">로그인</button>
  </form>
</div>

</body>
</html>