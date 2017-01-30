<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: memoricAb
  Date: 19.01.2017
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
    <title>Gözlük Dükkanı</title>
    <link href="<c:url value="/resources/css/bootstrap.css"/> " rel="stylesheet" type="text/css" media="all"/>
    <script src="<c:url value="/resources/js/angular.min.js"/> "
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
    <link href="<c:url value="/resources/urun/css.css"/> " rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/resources/urun/urunsayfa.css"/> " rel="stylesheet" type="text/css"/>
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
          type="text/css"/>
    <!-- Custom Theme files -->
    <!--theme-style-->
    <link href="<c:url value="/resources/css/style.css"/> " rel="stylesheet" type="text/css" media="all"/>
    <link href="<c:url value="/resources/admin/admin.css"/> " rel="stylesheet" type="text/css" media="all"/>
    <!--//theme-style-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);
    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <!--fonts-->
    <link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'>
    <!--//fonts-->
    <!-- start menu -->
    <link href="<c:url value="/resources/css/memenu.css"/> " rel="stylesheet" type="text/css" media="all"/>
    <script type="text/javascript" src="<c:url value="/resources/js/memenu.js"/> "></script>
    <script>$(document).ready(function () {
        $(".memenu").memenu();
    });</script>
    <script src="<c:url value="/resources/js/simpleCart.min.js"/>"></script>
</head>
<body class="bg-info">
<!--header-->

<div class="container">
    <div class="head-top">
        <div class="logo">
            <a href="<c:url value="/" />"><img src="<c:url value="/resources/images/logo.png" />" alt=""></a>
        </div>
        <div class=" h_menu4">
            <ul class="memenu skyblue">
                <li class="color4"><a href="<c:url value="/"/> ">Anasayfa</a></li>

                <li><a class="color4" href="<c:url value="/urunListe"/> ">Gözlükler</a></li>
                <li><a class="color6" href="<c:url value="/admin"/> ">Yönetici</a></li>
                <li><a class="bg-primary" href="<spring:url value="/sepet"/>" ><i class="fa fa-shopping-bag fa-3x"></i> </a> </li>
            </ul>
        </div>

        <div class="clearfix"></div>
    </div>
</div>

</div>