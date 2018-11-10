<%-- 
    Document   : form_reg
    Created on : 10/11/2018, 01:40:57 PM
    Author     : Jonathan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
    <body>
        <form  action="action" method="post"> 
            <div class="col-md-4 form-group">
                <label for="nom">Nombre de Empresa</label>
                <input type="text" class="form-control" id="nom" name="nom" placeholder="Ejm: Chacarita S.A.">
            </div>
            <div class="col-md-4 form-group">
             
                    <label for="ruta">Rutas</label>
                    <select class="custom-select" id="ruta">
                      <option selected>Choose...</option>
                    </select>
             
            </div>
            <div class="col-md-4 form-group">
                <label for="img">Imagen</label>
                <input type="text" class="form-control" id="img" name="img" placeholder="Ejm: nombre de archivo">
            </div>
            <div class="col-md-4 form-group">
                <label for="ruta">Tipo</label>
                <select class="custom-select" id="ruta">
                  <option selected>Choose...</option>
                </select>
            </div>
        </form>
    </body>
</html>
