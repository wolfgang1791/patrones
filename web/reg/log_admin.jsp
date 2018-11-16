<%-- 
    Document   : log_admin
    Created on : 10/11/2018, 02:45:58 PM
    Author     : Jonathan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Handlee" rel="stylesheet">      
    <style type="text/css">
         body { background-image: url(../img/fondo.jpg);
                  background-repeat: no-repeat;
                  background-size: cover ;
                  background-attachment: fixed;
                  
           }
         .color{
                background-color: rgba(60,175,180, 0.5);
                border-radius: 10px;
                
                
            }
            
            .xd{
                position: absolute !important;
                top:50% !important;
                left:50% !important;
                width: 400px !important; /* Definimos el ancho del objeto a centrar */
                    height: 400px !important; /* Definimos el alto del objeto a centrar */
margin-top: -200px !important; /* Restamos la mitad de la altura del objeto con un margin-top */
margin-left: -200px !important; /* Restamos la mitad de la anchura del objeto con un margin-left */
                
            }
            .texto{
                font-family: 'Handlee', cursive;
            }
            
            
            
            
        </style>
    
    
    </head>
    <body>
        <div class="container ">
            <form  action="/patrones/MediatorServet" method="post"> 
                <div class="row justify-content-center mt-5  ">
                    <div class="col-md-4 color xd" >

                    <div class="row justify-content-center mb-4  text-white texto "> 
                        
                        <div class="col-md-12 mt-5" >
                            <h1 class="text-center">Pon tus weas</h1>
                        </div>

                        <div class="col-md-12 form-group">
                            <label for="nom">Nombre de Usuario:</label>
                            <input type="text" class="form-control" id="user" name="user" placeholder="Nombre de Usuario">
                        </div>

                        <div class="col-md-12 form-group">
                            <label for="img">Contraseña</label>
                            <input type="password" class="form-control" id="pass" name="pass" placeholder="Contraseña">
                        </div>

                        <div class="col-md-12 form-group">
                            <input type="submit" class="form-control btn btn-success" value="Ingresar">
                        </div>

                    </div>
                    </div>
                </div>
            </form>

        </div>
    </body>
</html>
