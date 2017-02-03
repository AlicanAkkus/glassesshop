
<%@include file="/WEB-INF/views/template/header.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: memoricAb
  Date: 2.02.2017
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>



<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Kargo Bilgileri</h1>
            <p class="lead">Kargo Bilgileriniz Aşağıdadır, Lütfen Kontrol Ediniz.</p>

        </div>


        <form:form commandName="siparis" class="form-horizontal">
        <h3>Kargo Adres Bilgileri</h3>
        <div class="form-group">
            <table class="table table-bordered bg-primary">
                <tr>
                    <th><label for="sokak">Sokak İsmi</label></th>
                    <td><form:input path="sepet.musteri.kargoAdres.sokak" id="sokak" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="no">No</label></th>
                    <td><form:input path="sepet.musteri.kargoAdres.no" id="no" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="sehir">Şehir</label></th>
                    <td><form:input path="sepet.musteri.kargoAdres.sehir" id="sehir" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="ilce">İlçe</label></th>
                    <td><form:input path="sepet.musteri.kargoAdres.ilce" id="ilce" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="ulke">Ülke</label></th>
                    <td><form:input path="sepet.musteri.kargoAdres.ulke" id="ulke" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="zip">Posta Kodu</label></th>
                    <td><form:input path="sepet.musteri.kargoAdres.postaKodu" id="zip" cssClass="form-control"/></td>
                </tr>


            </table>
        </div>
        <input type="hidden" name="_flowExecutionKey">


        <input type="submit" value="İlerle" class="btn btn-success" name="_eventId_kargoAdresBilgileriToplandi">
        <button class="btn btn btn-danger" name="_eventId_geriMusteriBilgileriTopla">Geri</button>
        <button class="btn btn btn-danger" name="_eventId_iptal">İptal</button>


    </div>


    </form:form>


</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>

