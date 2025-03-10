<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
      <div class="container">
        <a class="navbar-brand" href="index.html">Taste</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="oi oi-menu"></span> Menu
        </button>

        <div class="collapse navbar-collapse" id="ftco-nav">
          <ul class="navbar-nav ml-auto">
             <li class="nav-item dropdown">
             <a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">레시피</a>
             <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                <a class="dropdown-item" href="index.html">레시피 목록</a>
                <a class="dropdown-item" href="archive.html">레시피 검색</a>
             <c:if test=" ${sessionScope.id !=null }">
                <a class="dropdown-item" href="single.html">나만의 레시피</a>
             </c:if>
             </div>
            </li>
             <li class="nav-item dropdown">
             <a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">칵테일바</a>
             <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                <a class="dropdown-item" href="index.html">칵테일바 목록</a>
                <a class="dropdown-item" href="archive.html">칵테일바 검색</a>
             <c:if test=" ${sessionScope.id !=null }">
                <a class="dropdown-item" href="single.html">칵테일바 예약</a>
             </c:if>
             </div>
            </li>
             <li class="nav-item dropdown">
             <a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">상품</a>
             <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                <a class="dropdown-item" href="index.html">상품 목록</a>
                <a class="dropdown-item" href="archive.html">상품 검색</a>
             </div>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">커뮤니티</a>
              <div class="dropdown-menu" aria-labelledby="yummyDropdown">
              	<a class="dropdown-item" href="index.html">자유게시판</a>
              	<a class="dropdown-item" href="archive.html">묻고답하기</a>
              	<a class="dropdown-item" href="single.html">공지사항</a>
              	<a class="dropdown-item" href="single.html">실시간 채팅</a>
              </div>
            </li>
            <li class="nav-item">
               <a class="nav-link" href="#">뉴스</a>
            </li>
            <li class="nav-item">
               <a class="nav-link" href="#">문의</a>
            </li>
            <li class="nav-item dropdown">
            	<a class="nav-link dropdown-toggle" href="#" id="yummyDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">회원</a>
            	<c:if test="${sessionScope.id==null }">
            		<div class="dropdown-menu" aria-labelledby="yummyDropdown">
                     	<a class="dropdown-item" href="index.html">회원가입</a>
                        <a class="dropdown-item" href="archive.html">아이디 찾기</a>
                        <a class="dropdown-item" href="single.html">비밀번호 찾기</a>
                    </div>
                </c:if>
                <c:if test=" ${sessionScope.id !=null }">
                    <div class="dropdown-menu" aria-labelledby="yummyDropdown">
                        <a class="dropdown-item" href="index.html">회원수정</a>
                        <a class="dropdown-item" href="archive.html">회원탈퇴</a>
                    </div>
                </c:if>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    <!-- END nav -->
</body>
</html>