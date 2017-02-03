<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: memoricAb
  Date: 1.02.2017
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="template/header.jsp" %>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Kaydolun!</h1>
            <p class="lead">Alışveriş yapabilmek için lütfen aşağıdaki bilgileri giriniz!</p>

        </div>


        <form:form action="${pageContext.request.contextPath}/kayit" method="post" commandName="musteri">
        <h3>Genel Bilgiler</h3>
        <div class="form-group">
            <table class="table table-bordered bg-success">
                <thead>
                <tr>
                    <th><label for="isim">İsim Soyisim</label><form:errors path="musteriIsim" cssStyle="color:red"/></th>
                    <th><form:input path="musteriIsim" id="isim" cssClass="form-control"/></th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th><label for="email">E-Mail</label><span style="color: red">${emailMsj} </span><form:errors path="musteriIsim" cssStyle="color:red"/></th>
                    <td><form:input path="musteriEmail" id="email" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td><label for="telefon">Telefon</label></td>
                    <td><form:input path="musteriTel" id="telefon" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td><label for="kullaniciadi">Kullanıcı Adı</label><span style="color: red">${kullaniciadiMsj} </span><form:errors path="kullaniciadi" cssStyle="color:red"/></td>
                    <td><form:input path="kullaniciadi" id="kullaniciadi" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <td><label for="sifre">Şifre</label><form:errors path="sifre" cssStyle="color:red"/></td>
                    <td><form:password path="sifre" id="sifre" cssClass="form-control"/></td>
                </tr>
                </tbody>
            </table>
        </div>
        <h3>Fatura Adresi</h3>
        <div class="form-group">
            <table class="table table-bordered bg-primary">
                <tr>
                    <th><label for="sokak">Sokak İsmi</label></th>
                    <td><form:input path="musteriAdres.sokak" id="sokak" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="no">No</label></th>
                    <td><form:input path="musteriAdres.no" id="no" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="sehir">Şehir</label></th>
                    <td><form:input path="musteriAdres.sehir" id="sehir" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="ilce">İlçe</label></th>
                    <td><form:input path="musteriAdres.ilce" id="ilce" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="ulke">Ülke</label></th>
                    <td><form:input path="musteriAdres.ulke" id="ulke" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="zip">Posta Kodu</label></th>
                    <td><form:input path="musteriAdres.postaKodu" id="zip" cssClass="form-control"/></td>
                </tr>


            </table>
        </div>
        <h3>Kargo Adresi</h3>
        <div class="form-group">
            <table class="table table-bordered bg-warning">
                <tr>
                    <th><label for="kargoSokak">Sokak İsmi</label></th>
                    <td><form:input path="kargoAdres.sokak" id="kargoSokak" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="kargoNo">No</label></th>
                    <td><form:input path="kargoAdres.no" id="kargoNo" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="kargoSehir">Şehir</label></th>
                    <td><form:input path="kargoAdres.sehir" id="kargoSehir" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="kargoIlce">İlçe</label></th>
                    <td><form:input path="kargoAdres.ilce" id="kargoIlce" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="kargoUlke">Ülke</label></th>
                    <td><form:input path="kargoAdres.ulke" id="kargoUlke" cssClass="form-control"/></td>
                </tr>
                <tr>
                    <th><label for="kargoZip">Posta Kodu</label></th>
                    <td><form:input path="kargoAdres.postaKodu" id="kargoZip" cssClass="form-control"/></td>
                </tr>


            </table>
        </div>


        <input type="submit" value="Kaydet" class="btn btn-success">
        <a href="<c:url value="/"/> " class="btn btn-danger">İptal</a>


    </div>


    </form:form>


</div>


<%@include file="template/footer.jsp" %>