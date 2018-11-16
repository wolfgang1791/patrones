<%-- 
    Document   : form_reg
    Created on : 10/11/2018, 01:40:57 PM
    Author     : Jonathan
--%>

<%@page import="proy.entidad.Ruta"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Handlee" rel="stylesheet"> 
        <style type="text/css">
         body { 
                  background-image: url(/patrones/img/fondo.jpg);
                  background-repeat: no-repeat;
                  background-size: cover ;
                  /*background-color: red;*/
                  background-attachment: fixed;
                  font-family: 'Handlee', cursive;
                  
           }
         .color{
                background-color: rgba(60,175,180, 0.7);
                border-radius: 5px;
                
                
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
                /*font-family: 'Handlee', cursive;*/
            }
            
            
            
            
        </style>
    </head>
    <body>
        
        <div class="container ">
            <form  action="/patrones/ProxyServlet" method="post">
                <div class="row justify-content-center  mt-3 mb-4">
                    <div class="col-6 color mt-4 mb-4 justify-content-center text-white">

                        <div class="row mt-4 justify-content-center"> 
                            <h1 class="text-center">Datos de la Empresa</h1>
                        </div>

                        <div class="row form-group">
                            <div class="col-12 "><label for="nom">Nombre de Empresa</label></div>
                            <div class="col-12">
                                <input type="text" class="form-control" id="nom" name="nom" placeholder="Ejm: Chacarita S.A.">    
                            </div>

                        </div>



                        <div class="row form-group">
                                <% List<Ruta> list = (List<Ruta>)request.getAttribute("rutas");%>
                                <div class="col-12"><label for="ruta">Rutas</label></div>
                                <div class="col-12">
                                    <select class="form-control" id="ruta" name="ruta">
                                      <option name="ruta" value=" ">Elige...</option>
                                      <%for(Ruta r:list){%>
                                      <option name="ruta" value="<%out.println(r.getId());%>"><% out.println(r.getDescripcion());%></option>
                                      <% } %>
                                    </select>
                                </div>
                        </div>


                        <div class="row form-group">

                            <div class="col-12"><label for="img">Imagen</label></div>
                            <div class="col-12">
                            <input type="text" class="form-control" id="img" name="img" placeholder="Ejm: nombre de archivo">
                            </div>

                        </div>
                        <div class="row form-group">
                             <% List<String> list_ = (List<String>)request.getAttribute("tipo");%>
                             <div class="col-12"><label for="ruta">Tipo</label></div>

                             <div class="col-12">
                                <select class="form-control" id="ruta" name="tipo">
                                    <option name="tipo" value=" ">Choose...</option>
                                   <%for(String i:list_){%>
                                   <option name="tipo" value="<%out.println(i);%>"><%out.println(i);%></option>
                                   <% } %>
                                </select>
                            </div>
                        </div>
                         <div class="row form-group">
                             <div class="col-8">
                                <input class="btn btn-success" type="submit" value="Registrar">
                             </div>
                        </div>
                    </div>
              </div>
            </form>
      </div>
    </body>
</html>
