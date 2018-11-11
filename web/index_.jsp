<%-- 
    Document   : index_
    Created on : 02/11/2018, 09:51:35 PM
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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
          <script async defer src="https://maps.googleapis.com/maps/api/js?key=
AIzaSyAd32X_TFs3Db480JGyg0YS9weM0XoO-t8"
  type="text/javascript"></script>
        <!--<script src="http://maps.googleapis.com/maps/api/js?v3"></script>-->
         <style type="text/css">
           body { background-image: url(img/fondo2.jpg) ;
                  background-repeat: no-repeat;
                  background-size: 100%;
                  background-attachment: fixed;
                  
           }
           .xd{
               
               /*opacity: 1 !important;*/
           }
           .container-fluid{
            height: 100%;
            }
            .color{
                background-color: rgba(60,175,180, 1);
                
                
            }
            
            .color2{
                background-color: rgba(54,148,167, 0.7) ;
   
                
            }
            .color3{
                background-color: rgba(40,29,13, 1) ;
            }
            .color4{
                background-color: rgba(37,120,97, 0.9) ;
            }
            
        </style>
    </head>
    <body>
        <div class="container-fluid">
             <% List<Consorcio>  con = (List<Consorcio>) request.getAttribute("listaC");%>
             <% List<Independiente> ind = (List<Independiente>)request.getAttribute("listaI");%>
             <% List<Paradero>par = (List<Paradero>)request.getAttribute("listaP");%>
            <br>
            <form action="MainServlet" method="post">
                <div class="form-group row justify-content-center mt-4">
                    <div class="col-2">
                        <label for="paradero" class="col-form-label text-md-right "><h4 class="text-white">¿A dondé ir?</h4></label>
                    </div>
                    <div class="col-4">
                        <input id="name" type="text" class="form-control" name="paradero"autofocus>
                        <input id="lat" type="hidden" class="form-control" name="lat" value="<%  out.println(par.get(par.size()-1).getLatitud());%>">
                        <input id="lon" type="hidden" class="form-control" name="lon" value="<%  out.println(par.get(par.size()-1).getLongitud());%>">
                    </div>
                </div>
            </form>
                    
            <div class="row justify-content-center">
                <div class="col ml-6">
                 <section id="map" style="height: 500px;"></section>
                </div> 
            </div>
                    
            <div class="row justify-content-center mt-5">
                <div class="col-3 color d-flex">
                    <div class="align-self-center">
                        <h1 class=" text-white">Consorcio</h1>
                    </div>
                </div>
                
                <div class="col-8 color2">
                    <div class="row mt-1 justify-content-center">
                        <div class="col-10">
                            <table class="table table-sm table-hover">
                                <thead class="thead-dark">
                                  <tr>
                                    <th scope="col">Nombre de Empresa</th>
                                    <th scope="col">Ruta</th>
                                    <th scope="col">Imagen</th>
                                    <th scope="col">Tarifa</th>
                                  </tr>
                                </thead>
                                <tbody class="text-white">
                                  <% 
                                      for(Consorcio c:con){%>  
                                  <tr>
                                    <th scope="row"><%out.print(c.getNombre());%></th>
                                    <th scope="row"><%out.print(c.getCodigo_ruta());%></th>
                                    <th scope="row"><img class="img-thumbnail" width="100" height="100" src="<%out.print(c.getImagen());%>"></th>
                                    <th scope="row">General: S/. <%out.print(c.getTarifageneral());%> <br> Universitario S/.<%out.print(c.getUniversitario());%> <br> Escolar: S/.<%out.print(c.getEscolar());%></th>
                                  </tr>
                                  <%} %>
                                </tbody>
                             </table>
                        </div>
                     </div>
                </div>    
          </div>
                                
          <div class="row justify-content-center mt-5">
              <div class="col-3 color3 d-flex">
                  <div class="align-self-center">
                      <h1 class="text-white">Independiente</h1> 
                  </div>
                
              </div>  
              
              <div class="col-8 color2">
                  <div class="row mt-1 justify-content-center">
                      <div class="col-10">
                        <table class="table table-sm table-hover">
                            <thead class="thead-dark">
                              <tr>
                                <th scope="col">Nombre de Empresa</th>
                                <th scope="col">Ruta</th>
                                <th scope="col">Imagen</th>
                                <th scope="col">Tarifa</th>
                              </tr>
                            </thead>
                            <tbody class="text-white">
                              <% 
                              for(Independiente i:ind){%>  
                                <tr>
                                  <th scope="row"><%out.print(i.getNombre());%></th>
                                  <th scope="row"><%out.print(i.getCodigo_ruta());%></th>
                                  <th scope="row"><img class="img-thumbnail" width="100" height="100" src="<%out.print(i.getImagen());%>"></th>
                                  <th scope="row">S/. <%out.print(i.getTarifageneral());%></th>
                                </tr>
                              <%
                              }%>
                            </tbody>
                         </table>
                    </div>
                  </div>
               </div>
          </div>
          <div class="row justify-content-center mt-5 mb-5">
              <div class="col-4 color4">
                  <div class="row mt-1 justify-content-center">
                      <div class="col-10">
                            <table class="table table-sm text-center table-hover">
                                <thead class="thead-dark">
                                  <tr>
                                    <th scope="col">Paraderos de Ruta</th>
                                  </tr>
                                </thead>
                                <tbody class="text-white">
                                  <% 
                                      for(Paradero p:par){%>  
                                  <tr>
                                    <th scope="row"><%out.print(p.getDescripcion());%></th>
                                  </tr>
                                  <%
                                  }%>
                                </tbody>
                             </table>
                        </div>
                   </div>
              </div>      
          </div>
          <div class="row justify-content-center">
              <form action="/patrones/reg/log_admin.jsp">
                  <input class="btn btn-success"type="submit" value="Administrar">
              </form>
          </div>
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
               console.log(larlon);
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
               console.log(destino);
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
                               console.log("shit");
                       }
               }

        } 
    </script>
        
    </body>
</html>

