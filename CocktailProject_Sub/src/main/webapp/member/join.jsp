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