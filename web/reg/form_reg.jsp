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
    </head>
    <body>
        <h1>Datos de Empresa</h1>
        <form  action="/patrones/ProxyServlet" method="post"> 
            <div class="col-md-4 form-group">
                <label for="nom">Nombre de Empresa</label>
                <input type="text" class="form-control" id="nom" name="nom" placeholder="Ejm: Chacarita S.A.">
            </div>
            <div class="col-md-4 form-group">
                    <% List<Ruta> list = (List<Ruta>)request.getAttribute("rutas");%>
                    <label for="ruta">Rutas</label>
                    <select class="form-control" id="ruta" name="ruta">
                      <option name="ruta" value=" ">Elige...</option>
                      <%for(Ruta r:list){%>
                      <option name="ruta" value="<%out.println(r.getId());%>"><% out.println(r.getDescripcion());%></option>
                      <%}%>
                    </select>
             
            </div>
            <div class="col-md-4 form-group">
                <label for="img">Imagen</label>
                <input type="text" class="form-control" id="img" name="img" placeholder="Ejm: nombre de archivo">
            </div>
            <div class="col-md-4 form-group">
                 <% List<String> list_ = (List<String>)request.getAttribute("tipo");%>
                <label for="ruta">Tipo</label>
                <select class="form-control" id="ruta" name="tipo">
                    <option name="tipo" value=" ">Choose...</option>
                   <%for(String i:list_){%>
                   <option name="tipo" value="<%out.println(i);%>"><%out.println(i);%></option>
                   <%}%>
                </select>
            </div>
             <div class="col-md-4 form-group">
                 <input class="btn btn-success" type="submit" value="Registrar">
            </div>
        </form>
    </body>
</html>
