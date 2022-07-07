<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <title>머먹지?</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<%@ include file="header.jsp" %>
<div class="container">
<h3>메뉴입력</h3>
  <form action="/action_page.php" method="post">
    <div class="form-group">
      <label for="menu">메뉴이름:</label>
      <input type="text" class="form-control" id="menu" placeholder="메뉴 이름 입력" name="menu">
    </div>
    <div class="form-group">
      <label for="price">메뉴가격:</label>
      <input type="number" class="form-control" id="price" placeholder="메뉴 가격 입력" name="price">
    </div>
    <div class="form-group">
      <label for="img">이미지주소:</label>
      <input type="text" class="form-control" id="img" placeholder="이미지주소 입력" name="img">
    </div>
    <button type="submit" class="btn btn-primary">메뉴입력</button>
  </form>
</div>
</body>
</html>