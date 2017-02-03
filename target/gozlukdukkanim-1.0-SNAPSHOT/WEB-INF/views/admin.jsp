<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp" %>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <c:if test="${pageContext.request.userPrincipal.name != null}">
                <h2>
                    Yönetici Paneline Hoşgeldiniz, ${pageContext.request.userPrincipal.name}

                </h2>

            </c:if>

            <p class="lead">Yapmak istediğiniz işlemi aşağıdan seçiniz!</p>

        </div>


        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <p>
                        <a href="<c:url value="/admin/urunEnvanter"/>" class="btn btn-sq-lg btn-primary">
                            <i class="fa fa-user fa-5x" aria-hidden="true"></i><br/>
                            <br>Ürün Envanter
                        </a>
                        <a href="<c:url value="/admin/urun/urunEkle" />" class="btn btn-sq-lg btn-success">
                            <i class="fa fa-cart-plus fa-5x"></i><br/>
                            <br>Ürün Ekle
                        </a>
                        <a href="<c:url value="/admin/musteri" />" class="btn btn-sq-lg btn-warning">
                            <i class="fa fa-address-card-o fa-5x"></i><br/>
                            <br>Müşteri Yönetim
                        </a>

                        <a href="<c:url value="/j_spring_security_logout" />" class="btn btn-sq-lg btn-info">
                            <i class="fa fa-sign-out fa-5x"></i><br/>
                            <br>Çıkış
                        </a>


                    </p>
                </div>
            </div>

        </div>


    </div>


<%@include file="template/footer.jsp" %>