<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="template/header.jsp" %>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Ürün Envanteri</h1>
            <p class="lead">Ürünlerinizi görüntüleyin, düzenleyin veya silin!</p>

        </div>


        <table class="table table-bordered bg-success">
            <thead>
            <tr class="bg-success">
                <th>Ürün Resmi</th>
                <th>Ürün Markası</th>
                <th>Ürün Kategorisi</th>
                <th>Ürün Açıklaması</th>
                <th>Ürün Rengi</th>
                <th>Ürün Cinsiyeti</th>
                <th>Ürün Stok Durumu</th>
                <th>Ürün Durumu</th>
                <th>Ürün Fiyatı</th>
                <th>İşlemler</th>
            </tr>
            </thead>
            <c:forEach items="${urunler}" var="urun">
                <tr>
                    <td><img class="urunresim" src="<c:url value="/resources/product_images/${urun.urunId}.png"/> "
                             alt="image" style="width: 100%"/></td>
                    <td>${urun.urunMarka}</td>
                    <td>${urun.urunKategori}</td>
                    <td>${urun.urunAciklama}</td>
                    <td>${urun.urunRenk}</td>
                    <td>${urun.urunCins}</td>
                    <td>${urun.urunStok}</td>
                    <td>${urun.urunDurum}</td>
                    <td>${urun.urunFiyat} TL</td>
                    <td>
                        <div class="btn-group-vertical">
                            <a href="<spring:url value="/urunListe/urunSayfa/${urun.urunId}" />"
                               class="btn btn-primary">İncele<i class="fa fa-sign-in fa-4x" aria-hidden="true"></i>
                            </a>
                            <a href="<spring:url value="/admin/urunEnvanter/urunSil/${urun.urunId}" />"
                               class="btn btn-danger">Sil<i class="fa fa-times fa-4x" aria-hidden="true"></i>
                            </a>
                            <a href="<spring:url value="/admin/urunEnvanter/urunDuzenle/${urun.urunId}" />"
                               class="btn btn-info">Düzenle<i class="fa fa-pencil-square-o fa-4x"
                                                              aria-hidden="true"></i>
                            </a>
                        </div>

                </tr>
            </c:forEach>
        </table>

        <a href="<spring:url value="/admin/urunEnvanter/urunEkle" />" class="btn btn-primary">Ürün Ekle</a>


    </div>


</div>


<%@ include file="template/footer.jsp" %>
