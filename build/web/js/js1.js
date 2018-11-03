/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

            /* global google */
          //  console.log("fuckkkk");
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