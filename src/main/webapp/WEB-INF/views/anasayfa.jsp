<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp" %>

<div class="banner">
    <div class="container">
        <script src="<c:url value="/resources/js/responsiveslides.min.js"/> "></script>
        <script>
            $(function () {
                $("#slider").responsiveSlides({
                    auto: true,
                    nav: true,
                    speed: 500,
                    namespace: "callbacks",
                    pager: true,
                });
            });
        </script>
        <div id="top" class="callbacks_container">
            <ul class="rslides" id="slider">
                <li>

                    <div class="banner-text">
                        <h3 style="color:red; opacity: 0.8" class="jumbotron alert-info"><img class="img-responsive" style="width: 20%" src="<c:url value="/resources/images/kalite-guvencesi.png"/>">Kalite Güvencesi</h3>
                        <p>33 İLDE 154 NOKTADA KOLAY İADE / DEĞİŞİM
                            Hasarsız ürününüz ve orijinal faturanızla
                            14 günde iade 30 günde değişim imkanı</p>
                    </div>

                </li>
                <li>

                    <div class="banner-text">
                        <h3 style="color:red; opacity: 0.8" class="jumbotron alert-info"><img class="img-responsive" style="width: 20%" src="<c:url value="/resources/images/ultrasonik-temizlik.png"/>">Ömür Boyu Ücretsiz Bakım</h3>
                        <p>Güneş gözlüklerinin plaket,sap,vida ayarı
                            ve vida değişimi. Gözlükçüm.com'dan alınmamış olsa dahi istediğiniz
                            zaman tüm noktalarımızda ücretsiz temizlik</p>
                    </div>

                </li>
                <li>
                    <div class="banner-text">
                        <h3  style="color:red; opacity: 0.8" class="jumbotron alert-info"><img class="img-responsive" style="width: 20%" src="<c:url value="/resources/images/ucretsiz-bakim.png"/>">Türkiye'nin Her yerinde</h3>
                        <p>Gözlükçüm.com dünyasına adım attığınız ilk andan itibaren, güler yüzlü, ilgili, deneyimli ekibimiz ve canlı destek hizmetimizle farklı deneyim yaşarsınız.</p>
                    </div>

                </li>
            </ul>
        </div>

    </div>
</div>

<!--content-->
<div class="content">
    <div class="container">
        <div class="content-top bg-success img-rounded">
            <h1>ÜRÜNLERİMİZ</h1>
            <div class="grid-in">
                <div class="col-xs-6 grid-top bg-primary img-circle">
                    <a href="<c:url value="/urun/urunListe?aramaSarti=uzak" />" class="b-link-stripe b-animate-go  thickbox img-circle"><img
                            class="img-responsive" src="<c:url value="/resources/images/uzakgozlugu.png"/> " alt="">
                        <div class="b-wrapper">
                            <h3 class="b-animate b-from-left    b-delay03 ">
                                <span>UZAK GÖZLÜKLERİ</span>
                            </h3>
                        </div>
                    </a>


                </div>

                <div class="col-xs-6 grid-top bg-primary img-circle">
                    <a href="<c:url value="/urun/urunListe?aramaSarti=yakın" />" class="b-link-stripe b-animate-go  thickbox img-circle"><img
                            class="img-responsive" src="<c:url value="/resources/images/yakingozluk.png"/> " alt="">
                        <div class="b-wrapper">
                            <h3 class="b-animate b-from-left    b-delay03 ">
                                <span>YAKIN GÖZLÜKLERİ</span>
                            </h3>
                        </div>
                    </a>

                </div>
                <div class="clearfix"></div>
            </div>
            <div class="grid-in">
                <div class="col-xs-6 grid-top bg-primary img-circle">
                    <a href="<c:url value="/urun/urunListe?aramaSarti=prograsif" />" class="b-link-stripe b-animate-go  thickbox img-circle"><img
                            class="img-responsive" src="<c:url value="/resources/images/prograsif.png"/> " alt="">
                        <div class="b-wrapper">
                            <h3 class="b-animate b-from-left    b-delay03 ">
                                <span>PROGRESİF GÖZLÜKLER</span>
                            </h3>
                        </div>
                    </a>

                </div>
                <div class="col-xs-6 grid-top bg-primary img-circle">
                    <a href="<c:url value="/urun/urunListe?aramaSarti=güneş"/>" class="b-link-stripe b-animate-go  thickbox img-circle"><img
                            class="img-responsive" src="<c:url value="/resources/images/gunesgozluk.png"/> " alt="">
                        <div class="b-wrapper">
                            <h3 class="b-animate b-from-left    b-delay03 ">
                                <span>GÜNEŞ GÖZLÜKLERİ</span>
                            </h3>
                        </div>
                    </a>

                </div>

                <div class="clearfix"></div>
            </div>
        </div>
        <!----->

<%@include file="template/footer.jsp" %>