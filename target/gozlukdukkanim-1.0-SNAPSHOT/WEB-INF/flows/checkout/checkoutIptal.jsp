<%--
  Created by IntelliJ IDEA.
  User: memoricAb
  Date: 2.02.2017
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Sipariş İptal Edildi</h1>
                    <h2 class="alert-danger">Checkout işleminiz iptal edilmiştir. Alışverişe devam edebilirsiniz.</h2>
                </div>
            </div>
        </section>
        <section class="container">
            <p>
                <a href="<spring:url value="/urun/urunListe"/>" class="btn btn-primary">Ürünler</a>
            </p>
        </section>
    </div>

</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>
