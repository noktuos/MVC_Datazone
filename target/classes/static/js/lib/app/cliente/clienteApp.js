'use strict'
angular.module('clienteModule',[])
    .controller('clienteController',function($scope,$http,$window){
//        variable de datos
    $scope.cliente={
        id:null,
        codigo:null,
        nombreCliente:null,
        direccion:null,
        telefono:null
    };

//    Arreglo para mantener el resulset
    $scope.clientes = [];

//    listar a todos los clientes
    function listClientes(){
//        aqui se llama al rest api de nuestro servidor
        $http.get('/cliente/listar').then(

            (response) =>{
                $scope.clientes=response.data;
            }

        );

    }
//    la flecha reempalza a la palabra reservada function
    $scope.save = (cliente) => {

        $http.post('/cliente/agregar', cliente).then(
            (response) =>{
                $window.alert('Cliente guardado con exito');
            }
        );

    }

    listClientes();



    });

