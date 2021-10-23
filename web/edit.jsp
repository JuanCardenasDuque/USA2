<%-- 
    Document   : modificar
    Created on : 08-oct-2021, 19:46:01
    Author     : carde
--%>

<%@page import="Objetos.Producto"%>
<%@page import="Crud.Crud"%>
<%@page import="Crud.Crud"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
        <title>Modificar | Usa2</title>
    </head>
    <body>
        <h1>Modificar Productos</h1>

        <div class="container">
            <form id="signup" action="Index">
                <div  class="form_settings" class="header">

                    <%
                        Crud c = new Crud();
                        int ID = Integer.parseInt((String) request.getAttribute("ID"));
                        Producto p = (Producto) c.mostrar1(ID);


                    %>

                    <h3>Usa2</h3>

                </div>
                <div class="sep"></div>

                <div class="inputs">

                    <input class="contact" type="text" placeholder="ID" name="ID" value="<%=p.getID()%>" />
                    <input class="contact" type="text" placeholder="Nombre" name="Nombre" value="<%=p.getNombre()%>"/>
                    <input class="contact" type="text" placeholder="Precio" name="Precio" value="<%=p.getPrecio()%>">
                    <input class="contact" type="text" placeholder="Img" name="Img" value="<%=p.getImg()%>">

                    <input class="submit" id="submit" type="submit" name="accion" value="Actualizar" />
                </div>
            </form>
        </div>
    </body>
</html>
