<%-- 
    Document   : empresas_
    Created on : 10/11/2018, 12:36:19 PM
    Author     : Jonathan
--%>

<%@page import="proy.entidad.Empresa_"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Iterator"%>
<%@page import="proy.iterator.EmpresasTotales"%>
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
        <div class="container">
            <div class="row justify-content-center mt-5 mb-4">
                <div class="col-12">
                   <h1 class="text-center text-white">Empresas</h1> 
                </div>
                
                <div class="col-6">
                    <div class="row color">
                        <div class="col">
                        <table class="table text-white mt-4  table-sm table-hover">
                            <thead class="thead-dark text-center">
                              <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Nombre de Empresa</th>
                                <th scope="col">Imagen</th>
                                <th scope="col">Tipo</th>
                              </tr>
                            </thead>
                            <tbody>
                              <% 
                                 EmpresasTotales et = (EmpresasTotales) request.getAttribute("emp_totales");
                                 Iterator<Empresa_> iter = et.iterator();
                                 while(iter.hasNext()){
                                    Empresa_ e_ = (Empresa_) iter.next();
                              %>  
                              <tr>
                                  <th scope="row" class="text-dark"><%out.print(e_.getId());%></th>
                                <th scope="row" class="text-center"><%out.print(e_.getNombre());%></th>
                                <th scope="row" class="text-center"><img class="img-thumbnail" width="100" height="100" src="<%out.print(e_.getImagen());%>"></th>
                                <th scope="row" class="text-center"><%out.print(e_.getTipo());%></th>
                              </tr>
                              <%} %>
                            </tbody>
                         </table>
                         </div>
                     </div>
                </div>
              </div>
              <div class="row justify-content-center mb-4">
                  <div class="col-md-2">
                    <form action="/patrones/ObserverServlet" method="post">
                          <input class="btn btn-secondary" type="submit" value="Agregar Empresa">
                    </form>
                  </div>
                  <div class="col-md--2">
                    <form action="/patrones/">
                        <input class="btn btn-danger" type="submit" value="Salir">
                    </form>
                  </div>   
              </div>
          </div>            
    </body>
</html>
