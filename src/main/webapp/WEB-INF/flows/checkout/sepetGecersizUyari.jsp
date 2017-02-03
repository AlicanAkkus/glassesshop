
<%--
  Created by IntelliJ IDEA.
  User: memoricAb
  Date: 2.02.2017
  Time: 21:21
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
                    <h1>İstek Geçersiz</h1>
                    <h2>Lütfen sepetinize ürün ekleyiniz!</h2>
                </div>
            </div>
        </section>
        <section class="container">
            <p>
                <a href="<spring:url value="/urun/urunListe/hepsi"/>" class="btn btn-primary">Urunler</a>
            </p>
        </section>
    </div>

</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>
