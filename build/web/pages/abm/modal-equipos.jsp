<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">
                    <span ng-hide="modoEdicion">ALTA DE NUEVO EQUIPO</span>
                    <span ng-show="modoEdicion">EDICION DE EQUIPO</span>
                </h4>
            </div>
            <div class="modal-body">
                
                <!-- DIRECCION IP:-->
                <div class="form-group">
                    <label>Direccion IP</label>
                    <input type="text" ng-model="equipo.direccionIP" class="form-control" placeholder="192.168.5.200"> 
                </div>
                
                <!-- MAC:-->
                <div class="form-group">
                    <label>MAC ADDRESS</label>
                    <input type="text" ng-model="equipo.mac" class="form-control" placeholder="44:D9:E7:2C:EF:C3"> 
                </div>
                
                <!-- DEVICE NAME-->
                <div class="form-group">
                    <label>DEVICE NAME</label>
                    <input type="text" ng-model="equipo.deviceName" class="form-control" placeholder="Agencia 189-006"> 
                </div>
                
                <!-- SSID -->
                <div class="form-group">
                    <label>SSID</label>
                    <input type="text" ng-model="equipo.ssid" class="form-control" placeholder="TRESPUENTES"> 
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-new-equipo col-xs-12" ng-click="addEquipo()">
                    <span class="glyphicon glyphicon-ok"></span>
                    AGREGAR EQUIPO
                </button>
            </div>
        </div>
    </div>
</div>