<%-- 
    Document   : agregar
    Created on : 08-oct-2021, 19:45:10
    Author     : carde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/style.css" rel="stylesheet" type="text/css">
        <title>Agregar | Usa2</title>
    </head>
    <body>
        <div class="container">
            <form id="signup" action="Index">
                <div  class="form_settings" class="header">

                    <h3>Usa2</h3>

                </div>
                <div class="sep"></div>

                <div class="inputs">

                    <input class="contact" type="text" placeholder="ID" name="ID" value=""/>
                    <input class="contact" type="text" placeholder="Nombre" name="Nombre" value=""/>
                    <input class="contact" type="text" placeholder="Precio" name="Precio" value="">
                    <input class="contact" type="text" placeholder="Img" name="Img" value="">
 
                    <input class="submit" id="submit" type="submit" name="accion" value="agregar" />
                </div>
                <div>
                    <span style="font-size: 16px">
                        This is a demo
                    </span>
                </div>
            </form>
        </div>
    </body>
</html>
