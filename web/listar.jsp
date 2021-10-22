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
<link rel="stylesheet" href="css/custom.css">


<%
    Crud c = new Crud();
    ArrayList<Producto> list = c.mostrar();
    Iterator<Producto> iter = list.iterator();
%>

<!DOCTYPE html>
<html>
    <head>
        <%@include file="/sections/head.jsp"%>
    </head>
    <body>
        <%@include file="/sections/navbar.jsp"%>


        <div id="hero">
            <div class="container">
                <div class="row">
                    <div class="six columns">
                        <div class="contenido-hero">
                            <h2>Compra tu ropa favorita</h2>
                            <p>Haz tu estilo</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="container">
            <div class="card-header my-3">Todos los productos</div>
            <div class="row">
                <%
                    if (!list.isEmpty()) {
                        for (Producto p : list) {
                %>
                <div class="col-md-3 my-3">
                    <div class="card w-100">
                        <img class="card-img-top" src="<%=p.getImg()%>"
                             alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title"><%=p.getNombre()%></h5>
                            <h6 class="price">Price: $<%=p.getPrecio()%></h6>
                            <div class="mt-3 d-flex justify-content-between">
                                <a class="btn btn-dark" href="add-to-cart?id=<%=p.getID()%>">Add to Cart</a> <a
                                    class="btn btn-primary" href="order-now?quantity=1&id=<%=p.getID()%>">Buy Now</a>
                            </div>
                        </div>
                    </div>
                </div>
                <%
                        }
                    } else {
                        out.println("There is no proucts");
                    }
                %>

            </div>
        </div>





        <%@include file="/sections/footer.jsp"%>
    </body>
</html>