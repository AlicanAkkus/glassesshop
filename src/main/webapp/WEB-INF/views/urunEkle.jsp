<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: memoricAb
  Date: 22.01.2017
  Time: 02:26
  To change this template use File | Settings | File Templates.
--%>

<%@include file="template/header.jsp" %>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Ürün Ekleyin!</h1>
            <p class="lead">Ürün detaylarını girin ve yeni ürün ekleyin!</p>

        </div>


        <form:form action="${pageContext.request.contextPath}/admin/urun/urunEkle" method="post" commandName="urun"
                   enctype="multipart/form-data">
            <div class="form-group">
                <table class="table table-bordered bg-success">
                    <thead>
                    <tr>
                        <th><label for="marka">Ürün Markası</label><form:errors path="urunMarka" cssStyle="color:red;"/>
                        </th>
                        <th><form:input path="urunMarka" id="marka" cssClass="form-control"/></th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <th><label for="kategori">Ürün Kategorisi</label></th>
                        <td><label class="checkbox-inline"><form:radiobutton path="urunKategori" id="kategori"
                                                                             value="Güneş Gözlüğü"/> Güneş
                            Gözlüğü </label>
                            <label class="checkbox-inline"><form:radiobutton path="urunKategori" id="kategori"
                                                                             value="Yakın Gözlüğü"/> Yakın
                                Gözlüğü </label>
                            <label class="checkbox-inline"><form:radiobutton path="urunKategori" id="kategori"
                                                                             value="Uzak Gözlüğü"/> Uzak
                                Gözlüğü </label>
                            <label class="checkbox-inline"><form:radiobutton path="urunKategori" id="kategori"
                                                                             value="Prograsif Gözlük"/> Prograsif
                                Gözlük </label></td>
                    </tr>
                    <tr>
                        <td><label for="aciklama">Ürün Açıklaması</label></td>
                        <td><form:textarea path="urunAciklama" id="aciklama" cssClass="form-control"/></td>
                    </tr>
                    <tr>
                        <td><label for="renk">Ürün Rengi</label></td>
                        <td><form:input path="urunRenk" id="renk" cssClass="form-control"/></td>
                    </tr>
                    <tr>
                        <td><label for="cins">Ürün Cinsiyet</label></td>
                        <td><label class="checkbox-inline"><form:radiobutton path="urunCins" id="cins" value="Erkek"/>
                            Erkek</label>
                            <label class="checkbox-inline"><form:radiobutton path="urunCins" id="cins" value="Kadın"/>
                                Kadın </label>
                            <label class="checkbox-inline"><form:radiobutton path="urunCins" id="cins" value="Unisex"/>
                                Unisex </label></td>
                    </tr>
                    <tr>
                        <td><label for="stok">Ürün Stok Durumu</label> <form:errors path="urunStok"
                                                                                    cssStyle="color:red;"/></td>
                        <td><form:input path="urunStok" id="stok" cssClass="form-control"/></td>
                    </tr>
                    <tr>
                        <td><label for="durum">Ürün Durumu</label></td>
                        <td><label class="checkbox-inline"><form:radiobutton path="urunDurum" id="durum" value="Aktif"/>
                            Aktif</label>
                            <label class="checkbox-inline"><form:radiobutton path="urunDurum" id="durum"
                                                                             value="Inaktif"/> İnaktif </label></td>
                    </tr>
                    <tr>
                        <td><label for="fiyat">Ürün Fiyatı</label><form:errors path="urunFiyat" cssStyle="color:red;"/>
                        </td>
                        <td><form:input path="urunFiyat" id="fiyat" cssClass="form-control"/></td>
                    </tr>
                    <tr>
                        <td><label class="control-label" for="resim">Ürün Resmi</label></td>
                        <td><form:input path="urunResim" id="resim" type="file" class="form:input-large"
                                        cssClass="btn btn-primary"/></td>
                    </tr>

                    </tbody>
                </table>
                <input type="submit" value="Ekle" class="btn btn-success">
                <a href="<c:url value="/admin/urunEnvanter"/> " class="btn btn-danger">İptal</a>


            </div>


        </form:form>


    </div>


</div>


<%@include file="template/footer.jsp" %>
