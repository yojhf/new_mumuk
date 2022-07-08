<%@page import="dto.TbUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 세션 정보 받아오기
	TbUser dto = (TbUser)session.getAttribute("user");
	// 세션에 정보가 있으면 메뉴 넣기가 보여야 되고 로그인 -> 로그아웃
	
	// 세션에 정보가 없으면 메뉴 넣기는 안보이고 로그인 버튼
%>




    
<div class="container">
  <h3>머먹지?</h3>
</div>

<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
  <ul class="navbar-nav">
  

    <li class="nav-item">
      <a class="nav-link" href="/">메인</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/best.menu">메뉴추천</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="/insert.menu">메뉴넣기</a>
    </li>
    <% if (dto != null) {%>
    <li class="nav-item">
      <a class="nav-link" href="/see.menu">메뉴보기</a>
    </li>
    <%} %>
    <% if (dto == null) {%>
    <li class="nav-item">
      <a class="nav-link" href="/login.menu">로그인</a>
    </li>
    <%} else {%>
    <li class="nav-item">
      <a class="nav-link" href="/logout.menu">로그아웃</a>
    </li>
    <%} %>
  </ul>
</nav>