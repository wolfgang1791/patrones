<%-- 
    Document   : index
    Created on : 27/10/2018, 08:30:30 PM
    Author     : Jonathan
--%>

<%@page import="proy.entidad.Paradero"%>
<%@page import="proy.entidad.Independiente"%>
<%@page import="proy.entidad.Consorcio"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script async defer src="https://maps.googleapis.com/maps/api/js?key=
AIzaSyAd32X_TFs3Db480JGyg0YS9weM0XoO-t8"
  type="text/javascript"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Handlee" rel="stylesheet"> 
        <style type="text/css">
        
           body { background-image: url(img/fondo2.jpg) ;
                  background-repeat: no-repeat;
                  background-size: cover;
                  background-attachment: fixed;
                  font-family: 'Handlee', cursive;
                  
           }
           .xd{
               background: #fff;
               opacity: 0.99;
           }
           .container-fluid{
            height: 100%;
            }
            
            
        </style>
    </head>
    <body >
        <div class="container-fluid">
             <% 
                boolean b=false;
                List<Consorcio> con = null;
                List<Independiente> ind= null;
                List<Paradero> par = null;
                
                 if(b){%>
             <%  con = (List<Consorcio>) request.getAttribute("listaC");%>
             <%  ind = (List<Independiente>)request.getAttribute("listaI");%>
             <%  par = (List<Paradero>)request.getAttribute("listaP");}%>
            <br>
            <form action="MainServlet" method="post">
                
                <div class="form-group row justify-content-center mt-4">
                    <div class="col-2">
                        <label for="paradero" class=" col-form-label text-md-right"><h3 class="text-white">¿A dondé ir?</h3></label>
                    </div>
                    <div class="col-4 ">
                        <input id="name" type="text" class="form-control" name="paradero"autofocus>
                        <input id="lat" type="hidden" class="form-control" name="lat" value="<% if(b) out.println(par.get(par.size()-1).getLatitud());%>">
                        <input id="lon" type="hidden" class="form-control" name="lon" value="<% if(b) out.println(par.get(par.size()-1).getLongitud());%>">
                    </div>
                </div>
                    
                    
            </form>
            <div class="xd">      
                <div class="row justify-content-md-center mb-5 ">
                    <div class="col ml-6">
                     <section id="map" style="  height: 500px;"></section>
                    </div> 
                </div>
            </div> 
              <!--
                <div class="row  justify-content-md-center   xd mt-5">
                    <div class="col-8">
                        <table class="table table-sm ">
                            <thead>
                              <tr>
                                <th scope="col">Nombre de Empresa</th>
                                <th scope="col">Ruta</th>
                                <th scope="col">Imagen</th>
                                <th scope="col">Tipo</th>
                              </tr>
                            </thead>
                            <tbody>
                              <% if(b){
                                  for(Consorcio c:con){%>  
                              <tr>
                                <th scope="row"><%out.print(c.getNombre());%></th>
                                <th scope="row"><%out.print(c.getCodigo_ruta());%></th>
                                <th scope="row"><img class="img-thumbnail" src="<%out.print(c.getImagen());%>"></th>
                                <th scope="row"><%out.print(c.getTipo());%></th>
                              </tr>
                              <%}
                              }%>
                            </tbody>
                         </table>
                     </div>
             
          
          <div class="col-8">
              
                <table class="table table-sm">
                    <thead>
                      <tr>
                        <th scope="col">Nombre de Empresa</th>
                        <th scope="col">Ruta</th>
                        <th scope="col">Imagen</th>
                        <th scope="col">Tipo</th>
                      </tr>
                    </thead>
                    <tbody>
                      <% if(b){
                           for(Independiente i:ind){%>  
                      <tr>
                        <th scope="row"><%out.print(i.getNombre());%></th>
                        <th scope="row"><%out.print(i.getCodigo_ruta());%></th>
                        <th scope="row"><img class="img-thumbnail" src="<%out.print(i.getImagen());%>"></th>
                        <th scope="row"><%out.print(i.getTipo());%></th>
                      </tr>
                      <%}
                      }%>
                    </tbody>
                 </table>
          </div>
          <div class="col-8 mt-6">
             
                <table class="table table-sm">
                    <thead>
                      <tr>
                        <th scope="col">Paraderos de Ruta</th>
                      </tr>
                    </thead>
                    <tbody>
                      <% if(b){
                          for(Paradero p:par){%>  
                      <tr>
                        <th scope="row"><%out.print(p.getDescripcion());%></th>
                      </tr>
                      <%}
                      }%>
                    </tbody>
                 </table>
          </div>
         </div>
                    -->
         </div>
        <script>
            navigator.geolocation.getCurrentPosition(fn_ok,fn_mal);
            var mapa = document.getElementById("map");
            
            var lat_ = document.getElementById("lat").value;
            var lon_ = document.getElementById("lon").value;
            console.log(lat_);
            console.log(lon_);
            function fn_mal(){}
            function fn_ok(respuesta){
               var lat = respuesta.coords.latitude;
               var lon = respuesta.coords.longitude;
               var cor = lat+','+lon;
               console.log(cor);
               var larlon = new google.maps.LatLng(lat,lon);
               var objConf = {
                       zoom:17,
                       center:larlon
               };
               var gmap = new google.maps.Map(mapa,objConf);
               var ocm = {
                       position:larlon,
                       map:gmap,
                       title:"SHITTTTT"
               };
               var gmarker = new google.maps.Marker(ocm);
               var destino = new google.maps.LatLng(lat_,lon_);

                    var configd = {
                            origin: larlon,
                            destination:destino,
                            travelMode: google.maps.TravelMode.DRIVING
                    };


               var ds = new google.maps.DirectionsService();
               var configR = {
                       map:gmap
               };
               var dr  = new google.maps.DirectionsRenderer(configR);

               ds.route(configd,fn_rutear);
               function fn_rutear(res,status){
                       if(status === 'OK'){
                               dr.setDirections(res);
                       }
                       else{
                               alert("shit");
                       }
               }

        } 

            
        </script>
        
    </body>
</html>
