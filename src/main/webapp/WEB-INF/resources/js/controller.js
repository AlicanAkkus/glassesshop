/**
 * Created by memoricAb on 22.01.2017.
 */



var sepetApp = angular.module("sepetApp", []);


sepetApp.controller("sepetCtrl", function ($scope, $http) {
    $scope.sepetYenile = function (sepetId) {
        $http.get("/gozlukdukkanim/rest/sepet/" + $scope.sepetId).success(function (data) {
            $scope.sepet = data;

        });

    };

    $scope.sepetTemizle = function () {

        $http.delete("/gozlukdukkanim/rest/sepet/" + $scope.sepetId).success($scope.sepetYenile($scope.sepetId));

    };


    $scope.initSepetId = function (sepetId) {
        $scope.sepetId = sepetId;
        $scope.sepetYenile(sepetId);

    };

    $scope.sepeteEkle = function (urunId) {
        $http.put("/gozlukdukkanim/rest/sepet/ekle/" + urunId).success(function (data) {
            $scope.sepetYenile($http.get("/gozlukdukkanim/rest/sepet/sepetId"));
            alert("Ürün sepete eklendi!");

        });

    };

    $scope.sepettenSil = function (urunId) {
        $http.put("/gozlukdukkanim/rest/sepet/sil/" + urunId).success(function (data) {
            $scope.sepetYenile($http.get("/gozlukdukkanim/rest/sepet/sepetId"))

        });

    };

});
