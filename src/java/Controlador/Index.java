/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Crud.Crud;
import Objetos.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author carde
 */
public class Index extends HttpServlet {

    String listar = "/listar.jsp";
    String add = "/add.jsp";
    String edit = "/edit.jsp";
    String eliminar = "/eliminar.jsp";

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String acceso = "";
        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("listar")) {
            acceso = listar;
        } else if (action.equalsIgnoreCase("add")) {
            acceso = add;
        } else if (action.equalsIgnoreCase("agregar")) {
            int ID = Integer.parseInt(request.getParameter("ID"));
            String Nombre = request.getParameter("Nombre");
            int Precio = Integer.parseInt(request.getParameter("Precio"));
            String Img = request.getParameter("Img");
            Crud c = new Crud();
            try {
                c.insertar(ID, Nombre, Precio, Img);
            } catch (SQLException ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso = listar;
        } else if (action.equalsIgnoreCase("Actualizar")) {
            int ID = Integer.parseInt(request.getParameter("ID"));
            String Nombre = request.getParameter("Nombre");
            int Precio = Integer.parseInt(request.getParameter("Precio"));
            String Img = request.getParameter("Img");
            Crud c = new Crud();
            try {
                c.modificar(ID, Nombre, Precio, Img);
            } catch (SQLException ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso = listar;
        } else if (action.equalsIgnoreCase("editar")) {
            request.setAttribute("ID", request.getParameter("ID"));
            acceso = edit;
        } else if (action.equalsIgnoreCase("eliminar")) {
            int ID = Integer.parseInt(request.getParameter("ID"));
            Crud c = new Crud();
            try {
                c.eliminar(ID);
            } catch (SQLException ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }
            acceso = listar;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
