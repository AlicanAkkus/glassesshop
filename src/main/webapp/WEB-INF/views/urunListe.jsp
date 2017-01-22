<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp" %>


<!--content-->
<div class="content">
    <div class="container-wrapper">
        <div class="container">
            <div class="page-header">
                <h1>Sizin için tasarladığımız muhteşem gözlüklere gözatın!</h1>

                <p class="lead">Tüm ürünler aşağıda listelenmiştir!</p>
            </div>

            <c:forEach items="${urunler}" var="urun">

                <div class="col-md-2 column productbox">
                    <img src="<c:url value="/resources/product_images/${urun.urunId}.png"/> " class="img-responsive">
                    <div class="producttitle ">${urun.urunMarka}</div>
                    <div class="productdesc ">${urun.urunAciklama}</div>
                    <div class="productcolor ">${urun.urunRenk}</div>
                    <div class="productcolor ">${urun.urunCins}</div>
                    <div class="productprice">
                        <div class="pull-right"><a href="<spring:url value="/urunListe/urunSayfa/${urun.urunId}"/>"
                                                   class="btn btn-danger btn-sm" role="button">SATIN AL</a></div>
                        <div class="pricetext">${urun.urunFiyat}TL</div>
                    </div>
                </div>


            </c:forEach>


        </div>

    </div>


</div>

<div class="clearfix"></div>

<!----->


<%@include file="template/footer.jsp" %>