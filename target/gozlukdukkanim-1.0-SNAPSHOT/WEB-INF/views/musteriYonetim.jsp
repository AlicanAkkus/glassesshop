<%--
  Created by IntelliJ IDEA.
  User: memoricAb
  Date: 2.02.2017
  Time: 23:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="template/header.jsp" %>


<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Müşteri Yönetim Paneli</h1>
            <p class="lead">Müşterileri Yönetin</p>

        </div>


        <table class="table table-bordered bg-success">
            <thead>
            <tr class="bg-success">
                <th>İsim</th>
                <th>Email</th>
                <th>Telefon Numarası</th>
                <th>Kullancı Adı</th>
                <th>Enabled</th>
                <th>Sepet Toplamı</th>

            </tr>
            </thead>
            <c:forEach items="${musteriListe}" var="musteri">
                <tr>
                    <td>${musteri.musteriIsim}</td>
                    <td>${musteri.musteriEmail}</td>
                    <td>${musteri.musteriTel}</td>
                    <td>${musteri.kullaniciadi}</td>
                    <td>${musteri.enabled}</td>
                    <td>${musteri.sepet.sepetToplam} TL</td>
                    <td>

                </tr>
            </c:forEach>
        </table>


    </div>


</div>


<%@ include file="template/footer.jsp" %>
