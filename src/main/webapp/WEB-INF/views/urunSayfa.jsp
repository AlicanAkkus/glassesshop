<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp" %>

<div class="container-wrapper">

    <div class="container">


        <div class="page-header">
            <h1>Ürünü İnceleyin!</h1>


            <p class="lead">Bu gözlüğü sizin için tasarladık!</p>

        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-5">
                    <img class="urunresim" src="<c:url value="/resources/product_images/${urun.urunId}.png"/> " alt="image" style="width: 100%; height: 300px;"/>
                </div>
                <div class="col-md-5 urunyazi">
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
                            <td>Ürün Rengi </td>
                            <td>${urun.urunRenk}</td>
                        </tr>
                        <tr>
                            <td>Ürün Cinsiyet</td>
                            <td>${urun.urunCins}</td>
                        </tr>
                        <tr>
                            <td>Ürün Stok </td>
                            <td>${urun.urunStok}</td>
                        </tr>
                        <tr>
                            <td>Ürün Durumu </td>
                            <td>${urun.urunDurum}</td>
                        </tr>
                        <tr>
                            <td>Ürün Fiyat </td>
                            <td class="urunfiyat">${urun.urunFiyat} TL</td>
                        </tr>
                        </tbody>
                    </table>
                </div>

            </div>


        </div>


    </div>


</div>


<%@include file="template/footer.jsp" %>
