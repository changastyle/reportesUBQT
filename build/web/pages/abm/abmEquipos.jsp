<html>
    <head>
        <%@include file="../comun/comun.jsp" %>
        <style>
            .table thead th , .table tbody tr td 
            {
                text-align: center;
            }
            .head-abm-equipos
            {
                text-align: center;
                margin-top:0px;
                padding:25px;
                background-color:#1abc9c;
                color:white;
                margin-bottom:20px;
            }
            .btn-new-equipo , btn-new-equipo:active , .btn-new-equipo:focus , .btn-new-equipo:hover
            {
                background-color:#1abc9c;
                color:white;
                margin-top:12px;
                margin-bottom:12px;
            }
        </style>
    </head>
    <body ng-app="app" ng-controller="abmEquipos" ng-init="init()">
        <h3 class="head-abm-equipos">LISTADO DE EQUIPOS</h3>
        
        <div class="contenedor-equipos col-xs-10 col-xs-offset-1">
            <input type="search" ng-model="busqueda" placeholder="Busca tu equipo rapidamente" class="form-control">
            
            <button class="btn btn-new-equipo" data-toggle="modal" data-target="#myModal">
                <span class="glyphicon glyphicon-plus"></span>
                AGREGAR NUEVO EQUIPO
            </button>
               
            <table class="table table-responsive">
                <thead>
                    <th>ID</th>
                    <th>Direccion IP</th>
                    <th>MAC</th>
                    <th>Device Name</th>
                    <th>MODO</th>
                    <th>SSID</th>
                </thead>
                <tbody>
                    <tr ng-repeat="equipo in arrEquipos">
                        <td>
                            <button class="btn btn-default">
                                {{equipo.id}}
                            </button>
                        </td>
                        <td>{{equipo.direccionIP}}</td>
                        <td>{{equipo.mac}}</td>
                        <td>{{equipo.deviceName}}</td>
                        <td>{{equipo.modo.nombre}}</td>
                        <td>{{equipo.ssid}}</td>
                    </tr>
                </tbody>
            </table>
            
            <button class="btn btn-new-equipo" data-toggle="modal" data-target="#myModal">
                <span class="glyphicon glyphicon-plus"></span>
                AGREGAR NUEVO EQUIPO
            </button>
        </div>
        
        <!-- MODAL ADD EQUIPO:-->
        <%@include file="modal-equipos.jsp" %>
        
    </body>
<script>
var app = angular.module('app', []);

app.controller('abmEquipos', function($scope, $http) 
{
    $scope.init =  function()
    {
        $scope.findEquipos();
    }
    
    $scope.arrEquipos = [];
    $scope.findEquipos = function()
    {
        $.ajax(
        {
            url:"../../findEquipos",
            success: function (resultado, textStatus, jqXHR) 
            {
                $scope.arrEquipos = resultado;
                $scope.$apply();
            }
        });
        console.log("");
    }
    
    $scope.addEquipo = function()
    {
        $.ajax(
        {
            url:"../../addEquipo",
            data:
            {
                "equipoRAW": JSON.stringify($scope.equipo)
            },
            success: function (resultado, textStatus, jqXHR) 
            {
                console.log("res add equipo: " + resultado);  
            }
        });
    }
});
</script>
    
</html>