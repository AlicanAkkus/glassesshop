<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: memoricAb
  Date: 2.02.2017
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Tebrikler, siparişiniz onaylandı.</h1>
                    <p class="lead">Siparişiniz en kısa sürede size ulaştırılacaktır.</p>

                </div>
            </div>
        </section>
        <section class="container">
            <p>
                <a href="<spring:url value="/"/>" class="btn btn-primary">Anasayfa'ya Dön!</a>
            </p>
        </section>
    </div>

</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>

