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
    </head>
    <body>
        <h1>Hello World!</h1>
        <form  action="/patrones/MediatorServet" method="post"> 
            <div class="col-md-4 form-group">
                <label for="nom">Nombre de Usuario:</label>
                <input type="text" class="form-control" id="user" name="user" placeholder="Ejm: Chacarita S.A.">
            </div>
          
            <div class="col-md-4 form-group">
                <label for="img">Contraseña</label>
                <input type="password" class="form-control" id="pass" name="pass" placeholder="Ejm: nombre de archivo">
            </div>
            
            <div class="col-md-4 form-group">
                <input type="submit" class="form-control btn btn-success" value="Ingresar">
            </div>
    
        </form>
    </body>
</html>
