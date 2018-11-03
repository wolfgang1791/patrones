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
        <script src="http://maps.googleapis.com/maps/api/js?v3"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    </head>
    <body>
        <div class="container-fluid">
             <% 
                List<Consorcio> con = null;
                List<Independiente> ind = null;
                List<Paradero> par = null;
                
                
                 con = (List<Consorcio>) request.getAttribute("listaC");%>
             <%  ind = (List<Independiente>)request.getAttribute("listaI");%>
             <%  par = (List<Paradero>)request.getAttribute("listaP");%>
            <br>
            <form action="/patrones/MainServlet" method="post">
                <div class="form-group row">
                    <label for="paradero" class="col-md-4 col-form-label text-md-right">¿A dondé ir?</label>
                    <div class="col-md-4">
                        <input id="name" type="text" class="form-control" name="paradero"autofocus>
                        <input id="lat" type="hidden" class="form-control" name="lat" value="<%  out.println(par.get(par.size()-1).getLatitud());%>">
                        <input id="lon" type="hidden" class="form-control" name="lon" value="<%  out.println(par.get(par.size()-1).getLongitud());%>">
                    </div>
                </div>
            </form>
            <div class="row justify-content-center">
                <div class="col-md-6">
                 <section id="map" style=" width: 700px; height: 500px"></section>
                </div> 
            </div>
            <div class="row justify-content-center">
              
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
                      <% 
                          for(Consorcio c:con){%>  
                      <tr>
                        <th scope="row"><%out.print(c.getNombre());%></th>
                        <th scope="row"><%out.print(c.getCodigo_ruta());%></th>
                        <th scope="row"><img class="img-thumbnail" width="100" height="100" src="<%out.print(c.getImagen());%>"></th>
                        <th scope="row"><%out.print(c.getTipo());%></th>
                      </tr>
                      <%} %>
                    </tbody>
                 </table>
          </div>
          <div class="row justify-content-center">
              
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
                      <% 
                      for(Independiente i:ind){%>  
                        <tr>
                          <th scope="row"><%out.print(i.getNombre());%></th>
                          <th scope="row"><%out.print(i.getCodigo_ruta());%></th>
                          <th scope="row"><img class="img-thumbnail" width="100" height="100" src="<%out.print(i.getImagen());%>"></th>
                          <th scope="row"><%out.print(i.getTipo());%></th>
                        </tr>
                      <%
                      }%>
                    </tbody>
                 </table>
          </div>
          <div class="row justify-content-center">
             
                <table class="table table-sm">
                    <thead>
                      <tr>
                        <th scope="col">Paraderos de Ruta</th>
                      </tr>
                    </thead>
                    <tbody>
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
                               console.log("shit");
                       }
               }

        } 
    </script>
        
    </body>
</html>

