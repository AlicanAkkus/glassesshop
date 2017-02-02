<%--
  Created by IntelliJ IDEA.
  User: memoricAb
  Date: 1.02.2017
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Tebrikler, başarıyla kaydoldunuz.</h1>
                    <h2>Alışveriş yapmak için lütfen kullanıcı adı ve şifrenizle giriş yapınız.</h2>
                </div>
            </div>
        </section>
        <section class="container">
            <p>
                <a href="<spring:url value="/urun/urunListe"/>" class="btn btn-primary">Urunler</a>
            </p>
        </section>
    </div>

</div>


<%@include file="template/footer.jsp" %>
