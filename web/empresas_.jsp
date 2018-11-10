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
    </head>
    <body>
        <div class="container-fluid">
            <div class="row justify-content-center">
                    <h2>Empresas</h2>
                    <table class="table">
                        <thead>
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
                            <th scope="row"><%out.print(e_.getId());%></th>
                            <th scope="row"><%out.print(e_.getNombre());%></th>
                            <th scope="row"><img class="img-thumbnail" width="100" height="100" src="<%out.print(e_.getImagen());%>"></th>
                            <th scope="row"><%out.print(e_.getTipo());%></th>
                          </tr>
                          <%} %>
                        </tbody>
                     </table>
              </div>
          </div>            
    </body>
</html>
