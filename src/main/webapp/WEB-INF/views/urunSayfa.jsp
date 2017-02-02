<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp" %>

<div class="container-wrapper">

    <div class="container">


        <div class="page-header">
            <h1>Ürünü İnceleyin!</h1>


            <p class="lead">Bu gözlüğü sizin için tasarladık!</p>

        </div>

        <div class="container" ng-app="sepetApp">
            <div class="row">
                <div class="col-md-5">
                    <img class="urunresim" src="<c:url value="/resources/urun_resimler/${urun.urunId}.png"/> "
                         alt="image" style="width: 100%; height: 300px;"/>
                </div>
                <div class="col-md-5 urunyazi bg-success">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>Ürün Markası</th>
                            <th>${urun.urunMarka}</th>

                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th>Ürün Kategorisi</th>
                            <td>${urun.urunKategori}</td>
                        </tr>
                        <tr>
                            <td>Ürün Açıklaması</td>
                            <td>${urun.urunAciklama}</td>
                        </tr>
                        <tr>
                            <td>Ürün Rengi</td>
                            <td>${urun.urunRenk}</td>
                        </tr>
                        <tr>
                            <td>Ürün Cinsiyet</td>
                            <td>${urun.urunCins}</td>
                        </tr>
                        <tr>
                            <td>Ürün Stok</td>
                            <td>${urun.urunStok}</td>
                        </tr>
                        <tr>
                            <td>Ürün Durumu</td>
                            <td>${urun.urunDurum}</td>
                        </tr>
                        <tr>
                            <td>Ürün Fiyat</td>
                            <td class="urunfiyat">${urun.urunFiyat} TL</td>
                        </tr>
                        </tbody>
                        <c:set var="role" scope="page" value="${param.role}"/>
                        <c:set var="url" scope="page" value="/urun/urunListe"/>
                        <c:if test="${role=='admin'}">
                            <c:set var="url" scope="page" value="/admin/urunEnvanter"/>
                        </c:if>




                    </table>

                    <p ng-controller="sepetCtrl">
                        <a href="<c:url value="${url}"/> " class="btn btn-sq btn-primary"><i class="fa fa-reply fa-5x" aria-hidden="true"></i> <br>Geri</a>
                        <a href="#" class="btn btn-sq btn-warning" ng-click="sepeteEkle('${urun.urunId}')"><i class="fa fa-cart-plus fa-5x" aria-hidden="true"></i><br> Sepete Ekle </a>
                        <a href="<spring:url value="/musteri/sepet"/> " class="btn btn-sq btn-info"><i class="fa fa-shopping-bag fa-5x" aria-hidden="true"></i><br>Sepeti Görüntüle </a>
                    </p>
                </div>

            </div>


        </div>


    </div>


</div>

<script src="<c:url value="/resources/js/controller.js"/> "></script>
<%@include file="template/footer.jsp" %>
