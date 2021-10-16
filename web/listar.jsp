<%-- 
    Document   : listar
    Created on : 08-oct-2021, 19:26:34
    Author     : carde
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Crud.Crud"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Objetos.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
        <title>Mostrar | Usa2</title>
    </head>
    <body>
        <h1>Mostrar Productos</h1>
        <div>

            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Nombre</th>
                        <th scope="col">Precio</th>
                    </tr>
                </thead>

                <%
                    Producto p = null;
                    Crud c = new Crud();
                    ArrayList<Producto> list = c.mostrar();
                    Iterator<Producto> iter = list.iterator();

                    while (iter.hasNext()) {
                        p = iter.next();

                %>

                <tr>
                    <td><%=p.getID()%></td>
                    <td><%=p.getNombre()%></td>
                    <td><%=p.getPrecio()%></td>
                    <td>
                        <a href="Index?accion=editar&ID=<%=p.getID()%>">Editar</a>
                        <a href="Index?accion=eliminar&ID=<%=p.getID()%>">Eliminar</a>
                    </td>
                </tr>
                <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
