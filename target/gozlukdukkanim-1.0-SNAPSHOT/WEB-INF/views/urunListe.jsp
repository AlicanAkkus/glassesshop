<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp" %>
<script>
    $(document).ready(function () {
        var aramaSarti = '${aramaSarti}';
        $('.table').DataTable({
            "lengthMenu": [[3, 5, 10, -1], [3,5,10], "All"],
            "oSearch": {"sSearch": aramaSarti}
        });
    });

</script>


<!--content-->
<div class="container-wrapper" ng-App="sepetApp">
    <div class="container">
        <div class="page-header">
            <h1>Tüm Ürünlerimize Gözatın!</h1>

            <p class="lead">Sizin İçin Tasarladığımız Muhteşem Gözlüklere Gözatın!</p>
        </div>

        <table style="border: groove;" class="table table-striped table-hover table-bordered bg-warning">
            <thead>
            <tr class="bg-success">
                <th class="productdesc">Resim</th>
                <th class="productdesc">Marka</th>
                <th class="productdesc">Kategori</th>
                <th class="productdesc">Açıklama</th>
                <th class="productdesc">Renk</th>
                <th class="productdesc">Cinsiyet</th>
                <th class="productdesc">Fiyat</th>
                <th></th>
            </tr>
            </thead>
            <c:forEach items="${urunler}" var="urun">
                <tr>
                    <td class="productdesc"><img src="<c:url value="/resources/urun_resimler/${urun.urunId}.png" /> " alt="image"
                             style="width:150px"/></td>
                    <td class="productdesc">${urun.urunMarka}</td>
                    <td class="productdesc">${urun.urunKategori}</td>
                    <td style="word-break: break-all" >${urun.urunAciklama}</td>
                    <td class="productdesc">${urun.urunRenk}</td>
                    <td class="productdesc">${urun.urunCins}</td>
                    <td class="productdesc">${urun.urunFiyat} TL</td>
                    <td class="productdesc">
                        <div class="btn-group-vertical">
                            <a class="btn btn-primary btn-sq-sm"
                               href="<spring:url value="/urun/urunSayfa/${urun.urunId}" />"
                            ><span class="fa fa-search fa-3x"></span></a>
                            <a class="btn btn-success btn-sq-sm" ng-controller="sepetCtrl" ng-click="sepeteEkle('${urun.urunId}')"
                               href="<c:if test="${pageContext.request.userPrincipal.name=='admin'|| pageContext.request.userPrincipal.name==null }">
                        <c:url value="/giris"/>
</c:if>">
                                <span class="fa fa-cart-plus fa-3x"></span></a></div>
                    </td>
                </tr>
            </c:forEach>
        </table>

        <!----->

        <script src="<c:url value="/resources/js/controller.js"/> "></script>

<%@include file="template/footer.jsp" %>