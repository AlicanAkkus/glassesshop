<%@include file="/WEB-INF/views/template/header.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: memoricAb
  Date: 2.02.2017
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Müşteri ve Fatura</h1>
            <p class="lead">Müşteri Bilgileriniz Aşağıdadır</p>

        </div>


        <form:form commandName="siparis" class="form-horizontal">
        <h3>Genel Bilgiler</h3>
        <div class="form-group">
            <table class="table table-bordered bg-success">
                <thead>
                <tr>
                    <th><label for="isim">İsim Soyisim</label></th>
                    <th><form:input path="sepet.musteri.musteriIsim" id="isim" cssClass="form-control"/></th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th><label for="email">E-Mail</label></th>
                    <td><form:input path="sepet.musteri.musteriEmail" id="email" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td><label for="telefon">Telefon</label></td>
                    <td><form:input path="sepet.musteri.musteriTel" id="telefon" cssClass="form-control"/></td>
                </tr>
                </tbody>
            </table>
        </div>
        <h3>Fatura Adresi</h3>
        <div class="form-group">
            <table class="table table-bordered bg-primary">
                <tr>
                    <th><label for="sokak">Sokak İsmi</label></th>
                    <td><form:input path="sepet.musteri.musteriAdres.sokak" id="sokak" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="no">No</label></th>
                    <td><form:input path="sepet.musteri.musteriAdres.no" id="no" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="sehir">Şehir</label></th>
                    <td><form:input path="sepet.musteri.musteriAdres.sehir" id="sehir" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="ilce">İlçe</label></th>
                    <td><form:input path="sepet.musteri.musteriAdres.ilce" id="ilce" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="ulke">Ülke</label></th>
                    <td><form:input path="sepet.musteri.musteriAdres.ulke" id="ulke" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="zip">Posta Kodu</label></th>
                    <td><form:input path="sepet.musteri.musteriAdres.postaKodu" id="zip" cssClass="form-control"/></td>
                </tr>


            </table>
        </div>
        <input type="hidden" name="_flowExecutionKey">


        <input type="submit" value="İlerle" class="btn btn-success" name="_eventId_musteriBilgileriToplandi">
        <button class="btn btn btn-danger" name="_eventId_iptal">İptal</button>


    </div>


    </form:form>


</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>