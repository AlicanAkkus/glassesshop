<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp" %>


<!--content-->
<div class="content" ng-App="sepetApp">
    <div class="container-wrapper">
        <div class="container">
            <div class="page-header">
                <h1>Sizin için tasarladığımız muhteşem gözlüklere gözatın!</h1>

                <p class="lead">Tüm ürünler aşağıda listelenmiştir!</p>
            </div>

            <c:forEach items="${urunler}" var="urun">

                <div class="col-md-2 column productbox">
                    <img src="<c:url value="/resources/product_images/${urun.urunId}.png"/> " class="img-responsive">
                    <div class="producttitle bg-primary ">${urun.urunMarka}</div>
                    <div class="productdesc bg-warning">${urun.urunAciklama}</div>
                    <div class="productcolor bg-warning">${urun.urunRenk}</div>
                    <div class="productcolor bg-warning">${urun.urunCins}</div>
                    <div class="productprice bg-warning">
                        <div class="pricetext bg-danger">${urun.urunFiyat}TL</div>
                    </div>
                    <div class="btn-group btn-group-justified">
                        <a href="<spring:url value="/urunListe/urunSayfa/${urun.urunId}" />"
                           class="btn btn-sq-sm btn-success">
                            <i class="fa fa-search-plus fa-3x"></i><br/>
                        </a>
                        <a ng-controller="sepetCtrl" href="#" class="btn btn-sq-sm btn-warning"
                           ng-click="sepeteEkle('${urun.urunId}')"><i class="fa fa-cart-plus fa-3x"
                                                                      aria-hidden="true"></i></a>
                    </div>
                </div>


            </c:forEach>


        </div>

    </div>


</div>

<div class="clearfix"></div>

<!----->

<script src="<c:url value="/resources/js/controller.js"/> "></script>
<%@include file="template/footer.jsp" %>