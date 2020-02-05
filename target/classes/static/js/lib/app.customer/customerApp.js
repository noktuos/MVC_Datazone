'use strict'
angular.module('customerModule',[])
    .controller('customerController',function($scope,$http,$window)){
        $scope.customer={
            customernumber :null,
            customername:null,
            contactfirstname:null,
            contactlastname:null,
            phone:null,
            addressline1:null,
            addressline2:null,
            city:null,
            state:null,
            postalcode:null,
            country:null,
            salesrepemploteenumber:null,
            creditlimit:null
        };

        $scope.customers = [];

//        Funcion para obtener un listado de todos los customers
        function listCustomers(){

        }
    }