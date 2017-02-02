/**
 * Created by memoricAb on 22.01.2017.
 */



var sepetApp = angular.module("sepetApp", []);


sepetApp.controller("sepetCtrl", function ($scope, $http) {
    $scope.sepetYenile = function () {
        $http.get("/gozlukdukkanim/rest/sepet/" + $scope.sepetId).success(function (data) {
            $scope.sepet = data;

        });

    };

    $scope.sepetTemizle = function () {

        $http.delete("/gozlukdukkanim/rest/sepet/" + $scope.sepetId).success($scope.sepetYenile());

    };


    $scope.initSepetId = function (sepetId) {
        $scope.sepetId = sepetId;
        $scope.sepetYenile(sepetId);

    };

    $scope.sepeteEkle = function (urunId) {
        $http.put("/gozlukdukkanim/rest/sepet/ekle/" + urunId).success(function () {

            alert("Ürün sepete eklendi!");

        });

    };

    $scope.sepettenSil = function (urunId) {
        $http.put("/gozlukdukkanim/rest/sepet/sil/" + urunId).success(function (data) {
            $scope.sepetYenile()

        });

    };

    $scope.hesaplaSepetToplam = function () {
        var sepetToplam = 0;
        for (var i = 0; i < $scope.sepet.sepetItemler.length; i++) {
            sepetToplam += $scope.sepet.sepetItemler[i].toplamFiyat;
        }

        return sepetToplam;

    };
});
