<%--
  Created by IntelliJ IDEA.
  User: memoricAb
  Date: 22.01.2017
  Time: 05:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">


        <div class="wrapper">
            <form action="<c:url value="/j_spring_security_check"/> " method="post" name="Login_Form"
                  class="form-signin">
                <h3 class="form-signin-heading">Yönetici Paneline Gitmek için Lütfen Giriş Yapınız!</h3>
                <hr class="colorgraph">
                <br>

                <input type="text" class="form-control" name="kullaniciadi" placeholder="Kullanıcı Adı Giriniz"
                       required="" autofocus=""/>
                <input type="password" class="form-control" name="sifre" placeholder="Şifre Giriniz" required=""/>

                <input class="btn btn-lg btn-primary btn-block" name="Submit" value="Giriş" type="Submit">
                <c:if test="${not empty msj}">
                    <div class="msj">${msj}</div>
                </c:if>
                <c:if test="${not empty hata}">
                    <div class="hata" style="color:red;">${hata}</div>
                </c:if>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        </div>


    </div>


</div>


<%@include file="template/footer.jsp" %>