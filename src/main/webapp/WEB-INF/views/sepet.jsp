<%--
  Created by IntelliJ IDEA.
  User: memoricAb
  Date: 22.01.2017
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp" %>


<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="page-header">


                <h1>Sepetiniz!</h1>


                <p class="lead">Sepetinizdeki ürünleri görüntüleyin ve işlem yapın!</p>


            </div>


        </section>

        <section class="container" ng-app="sepetApp">
            <div ng-controller="sepetCtrl" ng-init="initSepetId('${sepetId}')">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="panel panel-info">
                            <div class="panel-heading">
                                <div class="panel-title">
                                    <div class="row">
                                        <div class="col-xs-6">
                                            <h5><i class="fa fa-shopping-cart" aria-hidden="true"></i> Alışveriş
                                                Sepetim
                                            </h5>
                                        </div>
                                        <br>
                                        <div class="col-xs-6">
                                            <a href="<spring:url value="/urun/urunListe/hepsi"/>"
                                               class="btn btn-primary btn-sm btn-block">
                                                <i class="fa fa-share" aria-hidden="true"></i> Alışverişe Devam
                                            </a>
                                        </div>
                                        <div class="col-xs-6">
                                            <a href="#" ng-click="sepetTemizle()"
                                               class="btn btn-sm btn-success btn-block">
                                                <i class="fa fa-eraser"></i> Sepeti Temizle
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-body">
                                <div class="row" ng-repeat="item in sepet.sepetItemler">
                                    <div class="col-xs-2"><img class="img-responsive"
                                                               ng-src="/gozlukdukkanim/resources/urun_resimler/{{item.urun.urunId}}.png">
                                    </div>
                                    <div class="col-xs-4">
                                        <h4 class="product-name"><strong>{{item.urun.urunMarka}}</strong></h4><br>
                                        <h4>
                                            <small>{{item.urun.urunKategori}}</small>

                                        </h4>
                                        <br>
                                        <h4>
                                            <small>{{item.urun.urunRenk}}</small>


                                        </h4>
                                        <hr>
                                        <br>
                                    </div>
                                    <div class="col-xs-6">
                                        <div class="col-xs-6 text-right">
                                            <h6><strong>{{item.urun.urunFiyat}} TL <span
                                                    class="text-muted">x</span></strong></h6>
                                        </div>
                                        <div class="col-xs-4">
                                            <input type="text" class="form-control input-sm" value="{{item.adet}} Adet"
                                                   disabled>
                                        </div>
                                        <div class="col-xs-6 text-right">
                                            <h6><strong> =<span class="text-muted">{{item.toplamFiyat}} TL</span></strong>
                                            </h6>
                                        </div>
                                        <div class="col-xs-2">
                                            <a href="#" class="btn btn-link btn-xs"
                                               ng-click="sepettenSil(item.urun.urunId)">
                                                <i class="fa fa-trash-o" aria-hidden="true"></i>
                                            </a>
                                        </div>
                                    </div>


                                </div>
                                <hr>
                            </div>
                            <div class="panel-footer">
                                <div class="row text-center">
                                    <div class="col-xs-9">
                                        <h4 class="text-right">Toplam = <strong>{{hesaplaSepetToplam()}} TL</strong></h4>
                                    </div>
                                    <a href="<spring:url value="/siparis/${sepetId}"/>" class="btn btn-primary"><span class="fa fa-check fa-2x"></span>Onayla</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>


    </div>


</div>
<script src="<c:url value="/resources/js/controller.js"/> "></script>
<%@include file="template/footer.jsp" %>
