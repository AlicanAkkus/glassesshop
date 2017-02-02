<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%--
  Created by IntelliJ IDEA.
  User: memoricAb
  Date: 2.02.2017
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>


<%@include file="/WEB-INF/views/template/header.jsp" %>
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>siparis</h1>

            <p class="lead">Sipariş Onay</p>
        </div>

        <div class="container">

            <div class="row">

                <form:form commandName="siparis" class="form-horizontal">

                    <div class="well col-xs-10 col-sm-10 col-md-6 col-xs-offset-1 col-sm-offset-1 co-md-offset-3">

                        <div class="text-center">
                            <h1>Fatura</h1>
                        </div>
                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <address>
                                    <strong>Kargo Adresi</strong><br>
                                        ${siparis.sepet.musteri.kargoAdres.sokak}
                                    <br>
                                        ${siparis.sepet.musteri.kargoAdres.no}
                                    <br>
                                        ${siparis.sepet.musteri.kargoAdres.sehir}, ${siparis.sepet.musteri.kargoAdres.ilce}
                                    <br>
                                        ${siparis.sepet.musteri.kargoAdres.ulke}, ${siparis.sepet.musteri.kargoAdres.postaKodu}
                                    <br>
                                </address>
                            </div>
                            <div class="col-xs-6 col-sm-6 col-md-6 text-right">
                                <p>Sipariş Tarihi:  <fmt:formatDate type="date" value="${now}"/></p>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-xs-6 col-sm-6 col-md-6">
                                <address>
                                    <strong>Fatura Adresi</strong><br>
                                        ${siparis.sepet.musteri.musteriAdres.sokak}
                                    <br>
                                        ${siparis.sepet.musteri.musteriAdres.no}
                                    <br>
                                        ${siparis.sepet.musteri.musteriAdres.sehir}, ${siparis.sepet.musteri.musteriAdres.ilce}
                                    <br>
                                        ${siparis.sepet.musteri.musteriAdres.ulke}, ${siparis.sepet.musteri.musteriAdres.postaKodu}
                                    <br>
                                </address>
                            </div>
                        </div>
                        <div class="row">
                            <table class="table table-hover">
                                <thead>
                                <tr>
                                    <th>Ürün</th>
                                    <th>Adet</th>
                                    <th class="text-center">Fiyat</th>
                                    <th class="text-center">Toplam</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="sepetItem" items="${siparis.sepet.sepetItemler}">
                                    <tr>
                                        <td class="col-md-9"><em>${sepetItem.urun.urunMarka}</em></td>
                                        <td class="col-md-1" style="text-align: center">${sepetItem.adet}</td>
                                        <td class="col-md-1"
                                            style="text-align: center">${sepetItem.urun.urunFiyat}</td>
                                        <td class="col-md-1" style="text-align: center">${sepetItem.toplamFiyat}</td>
                                    </tr>
                                </c:forEach>

                                <tr>
                                    <td></td>
                                    <td></td>
                                    <td class="text-right">
                                        <h4><strong>Sipariş Toplam Tutar </strong></h4>
                                    </td>
                                    <td class="text-center text-danger">
                                        <h4><strong> ${siparis.sepet.sepetToplam} TL</strong></h4>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>

                        <input type="hidden" name="_flowExecutionKey"/>

                        <br><br>
                        <button class="btn btn-warning" name="_eventId_geriKargoAdresBilgileriTopla">Geri</button>
                        <input type="submit" value="Sipariş Et" class="btn btn-danger"
                               name="_eventId_siparisOnaylandi"/>
                        <button class="btn btn-primary" name="_eventId_iptal">İptal</button>
                    </div>
                </form:form>

            </div>
        </div>

        <%@include file="/WEB-INF/views/template/footer.jsp" %>

