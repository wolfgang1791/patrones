<%-- 
    Document   : index
    Created on : 27/10/2018, 08:30:30 PM
    Author     : Jonathan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="http://maps.googleapis.com/maps/api/js?v3"></script>
    </head>
    <body>
        <section id="map" style=" width: 700px; height: 500px"></section>
        <script src="js/js1.js">
            navigator.geolocation.getCurrentPosition(fn_ok,fn_mal);
            var mapa = document.getElementById("map");
            function fn_mal(){}
            function fn_ok(respuesta){
               var lat = respuesta.coords.latitude;
               var lon = respuesta.coords.longitude;
               //var cor = lat+','+lon;

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
               var upn = new google.maps.LatLng(-12.0564133,-77.0859679);

                    var configd = {
                            origin: larlon,
                            destination:upn,
                            travelMode: google.maps.TravelMode.DRIVING
                    };


               var ds = new google.maps.DirectionsService();
               var configR = {
                       map:gmap
               };
               var dr  = new google.maps.DirectionsRenderer(configR);

               ds.route(configd,fn_rutear);
               function fn_rutear(res,status){
                       if(status === "OK"){
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
