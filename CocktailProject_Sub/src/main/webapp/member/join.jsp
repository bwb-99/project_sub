<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="zxx">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>로그인</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="../css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="../css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="../css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="../css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="../css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="../css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="../css/style.css" type="text/css">
</head>

<body>

    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <!-- Humberger Begin -->
    <div class="humberger__menu__overlay"></div>
    <div class="humberger__menu__wrapper">

        <div class="humberger__menu__cart">
            <ul>
                <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
            </ul>
            <div class="header__cart__price">item: <span>$150.00</span></div>
        </div>
        <div class="humberger__menu__widget">
            <div class="header__top__right__auth">
                <a href="#"><i class="fa fa-user"></i> Login</a>
            </div>
        </div>
        <nav class="humberger__menu__nav mobile-menu">
            <ul>
                <li class="active"><a href="../main/main.do">Home</a></li>
                <li><a href="./shop-grid.html">Shop</a></li>
                <li><a href="">칵테일바</a>
                    <ul class="header__menu__dropdown">
                        <li><a href="./shop-details.html">Shop Details</a></li>
                        <li><a href="./shoping-cart.html">Shoping Cart</a></li>
                        <li><a href="./checkout.html">Check Out</a></li>
                        <li><a href="./blog-details.html">Blog Details</a></li>
                    </ul>
                </li>
                <li><a href="#">Blog</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
        <div id="mobile-menu-wrap"></div>
        <div class="header__top__right__social">
            <a href="#"><i class="fa fa-facebook"></i></a>
            <a href="#"><i class="fa fa-twitter"></i></a>
            <a href="#"><i class="fa fa-linkedin"></i></a>
            <a href="#"><i class="fa fa-pinterest-p"></i></a>
        </div>
        <div class="humberger__menu__contact">
            <ul>
                <li><i class="fa fa-envelope"></i> hello@colorlib.com</li>
                <li>Free Shipping for all Order of $99</li>
            </ul>
        </div>
    </div>
    <!-- Humberger End -->

    <!-- Header Section Begin -->
    <header class="header">
        <div class="header__top">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6">

                    </div>
                    <div class="col-lg-6">
                        <div class="header__top__right">

                            <div class="header__top__right__auth">
                                <a href="#"><i class="fa fa-user"></i> 로그인</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                
                </div>
                <div class="col-lg-6">
                    <nav class="header__menu">
                        <ul>
                            <li><a href="../main/main.do">Home</a></li>
                            
                            <li><a href="#">칵테일</a>
                                <ul class="header__menu__dropdown">
                                    <li><a href="cocktail/cocktail_list.do">칵테일 목록</a></li>
                                    <li><a href="./shoping-cart.html">재료 목록</a></li>
                                    <li><a href="./shoping-cart.html">칵테일 검색</a></li>
                                    <li><a href="./checkout.html">나만의 칵테일</a></li>
                                </ul>
                            </li>
                            
                             <li><a href="#">칵테일바</a>
                                <ul class="header__menu__dropdown">
                                    <li><a href="./shop-details.html">칵테일바 목록</a></li>
                                    <li><a href="./shoping-cart.html">칵테일바 관리</a></li>
                                    <c:if test="${sessionScope.id!=null }">
                                    <li><a href="./checkout.html">칵테일바 예약</a></li>
                                    </c:if>
                                </ul>
                            </li>
                            <li><a href="#">상품</a>
                                <ul class="header__menu__dropdown">
                                    <li><a href="./shop-details.html">주류상품 목록</a></li>
                                    <li><a href="./shoping-cart.html">용품 목록</a></li>
                                    <li><a href="./shoping-cart.html">주류상품 검색</a></li>
                                    <li><a href="./shoping-cart.html">용품 검색</a></li>
                                </ul>
                            </li>
                             <li><a href="#">커뮤니티</a>
                                <ul class="header__menu__dropdown">
                                    <li><a href="./shop-details.html">자유게시판</a></li>
                                    <li><a href="./shoping-cart.html">묻고 답하기</a></li>
                                    <li><a href="./checkout.html">공지사항</a></li>
                                    <c:if test="${sessionScope.id!=null }">
                                    <li><a href="./checkout.html">실시간 채팅</a></li>
                                    </c:if>
                                </ul>
                            </li>
                        </ul>
                    </nav>
                </div>
                <div class="col-lg-3">
                    <div class="header__cart">
                        <ul>
                            <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                            <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
                        </ul>
                        <div class="header__cart__price">총가격: <span>$150.00</span></div>
                    </div>
                </div>
            </div>
            <div class="humberger__open">
                <i class="fa fa-bars"></i>
            </div>
        </div>
    </header>
    <!-- Header Section End -->

<!-- 

        ID             NOT NULL VARCHAR2(20)  
		PWD            NOT NULL VARCHAR2(30)  
		NAME           NOT NULL VARCHAR2(51)  
		SEX            NOT NULL CHAR(6)       
		EMAIL                   VARCHAR2(100) 
		BIRTHDAY       NOT NULL VARCHAR2(10)  
		POST           NOT NULL VARCHAR2(10)  
		ADDRESS        NOT NULL VARCHAR2(100) 
		ADDRESS_DETAIL          VARCHAR2(100) 
		REGDATE                 DATE          
		COMENT                  CLOB          
		ADMIN                   VARCHAR2(1)   
		LOGIN                   VARCHAR2(1)   
		PHONE                   VARCHAR2(13)  
		AVATAR                  VARCHAR2(100) 
		
		 -->
    <!-- Checkout Section Begin -->
    <section class="checkout spad">
        <div class="container">
            <div class="checkout__form",>
                <h4>회원가입</h4>
                <form action="#">
                    <div class="row">
                        <div class="col-lg-8 col-md-6">
                           <!-- <div class="row">   -->
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>아이디<span>*</span></p>
                                        <input type="text" placeholder="아이디를 입력하세요,">
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>패스워드<span>*</span></p>
                                        <input type="password" placeholder="패스워드를 입력하세요.">
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>이름<span>*</span></p>
                                        <input type="text" placeholder="이름을 입력하세요.">
                                    </div>
                                </div>
                            <!--  </div>  -->
                            <div class="checkout__input">
                                <p>Country<span>*</span></p>
                                <input type="text">
                            </div>
				                <th width=15% class="text-center" style="color:gray">성별<br></th>
				                <br>
				               <td width=85%>
				                <input type="radio" name="sex" value="남자" checked>남자
				                <input type="radio" name="sex" value="여자">여자
				               </td>
                            <div class="checkout__input">
                                <br><p>주소<span>*</span></p>
                                <input type="text" placeholder="Street Address" class="checkout__input__add">
                                <input type="text" placeholder="Apartment, suite, unite ect (optinal)">
                            </div>
                            <div class="checkout__input">
                                <p>주소<span>*</span></p>
                                <input type="text">
                            </div>
                            <div class="checkout__input">
                                <p>상세주소<span>*</span></p>
                                <input type="text">
                            </div>
                            <div class="checkout__input">
                                <p>Postcode / ZIP<span>*</span></p>
                                <input type="text">
                            </div>
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Phone<span>*</span></p>
                                        <input type="text">
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="checkout__input">
                                        <p>Email<span>*</span></p>
                                        <input type="text">
                                    </div>
                                </div>
                            </div>
                            <div class="checkout__input__checkbox">
                                <label for="acc">
                                    Create an account?
                                    <input type="checkbox" id="acc">
                                    <span class="checkmark"></span>
                                </label>
                            </div>
                            <p>Create an account by entering the information below. If you are a returning customer
                                please login at the top of the page</p>
                            <div class="checkout__input">
                                <p>Account Password<span>*</span></p>
                                <input type="text">
                            </div>
                            <div class="checkout__input__checkbox">
                                <label for="diff-acc">
                                    Ship to a different address?
                                    <input type="checkbox" id="diff-acc">
                                    <span class="checkmark"></span>
                                </label>
                            </div>
                            <div class="checkout__input">
                                <p>Order notes<span>*</span></p>
                                <input type="text"
                                    placeholder="Notes about your order, e.g. special notes for delivery.">
                            </div>
                        </div>

                    </div>
                </form>
            </div>
        </div>
    </section>
    <!-- Checkout Section End -->


<jsp:include page="../main/footer.jsp" />
    <!-- Js Plugins -->
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/jquery.nice-select.min.js"></script>
    <script src="../js/jquery-ui.min.js"></script>
    <script src="../js/jquery.slicknav.js"></script>
    <script src="../js/mixitup.min.js"></script>
    <script src="../js/owl.carousel.min.js"></script>
    <script src="../js/main.js"></script>

 

</body>

</html>