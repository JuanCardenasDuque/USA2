/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud;

import Conexion.conexion;
import Objetos.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author carde
 */
public class Crud {

    public void insertar(int ID, String Nombre, int Precio) throws SQLException {

        try {

            String sql = "INSERT INTO Producto (ID, Nombre, Precio) VALUES ('" + ID + "','" + Nombre + "','" + Precio + "')";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://DESKTOP-K1Q9I2S\\SQLEXPRESS:1433;" + "databaseName=Clientes_nomina;" + "user = sa;" + "password = IdKwPtP102463297.-; ";
            Connection con = DriverManager.getConnection(connectionURL);

            PreparedStatement statement = con.prepareStatement(sql);
            statement.execute();
        } catch (Exception e) {
        }
    }

    public ArrayList<Producto> mostrar() throws SQLException, ClassNotFoundException {

        ArrayList<Producto> productos = null;
        String query = "SELECT * FROM Producto";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://DESKTOP-K1Q9I2S\\SQLEXPRESS:1433;" + "databaseName=Clientes_nomina;" + "user = sa;" + "password = IdKwPtP102463297.-; ";
        Connection con = DriverManager.getConnection(connectionURL);

        int ID = 0;
        String Nombre = null;
        int Precio = 0;

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                if (productos == null) {
                    productos = new ArrayList<Producto>();
                }

                Producto registro = new Producto();

                ID = rs.getInt(1);
                registro.setID(ID);

                Nombre = rs.getString(2);
                registro.setNombre(Nombre);

                Precio = rs.getInt(3);
                registro.setPrecio(Precio);

                productos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }
        return productos;
    }

    public Producto mostrar1(int Id) throws ClassNotFoundException, SQLException {

        ArrayList<Producto> productos = null;
        String query = "SELECT * FROM Producto WHERE ID=" + Id;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://DESKTOP-K1Q9I2S\\SQLEXPRESS:1433;" + "databaseName=Clientes_nomina;" + "user = sa;" + "password = IdKwPtP102463297.-; ";
        Connection con = DriverManager.getConnection(connectionURL);

        int ID = 0;
        String Nombre = null;
        int Precio = 0;
        Producto registro = new Producto();

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                ID = rs.getInt(1);
                registro.setID(ID);

                Nombre = rs.getString(2);
                registro.setNombre(Nombre);

                Precio = rs.getInt(3);
                registro.setPrecio(Precio);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }
        return registro;

    }

    public void eliminar(int ID) throws SQLException, ClassNotFoundException {

        String sql = "DELETE FROM Producto WHERE ID=" + ID;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://DESKTOP-K1Q9I2S\\SQLEXPRESS:1433;" + "databaseName=Clientes_nomina;" + "user = sa;" + "password = IdKwPtP102463297.-; ";
        Connection con = DriverManager.getConnection(connectionURL);
        PreparedStatement statement = con.prepareStatement(sql);
        statement.execute();

    }

    public void modificar(int ID, String Nombre, int Precio) throws SQLException, ClassNotFoundException {

        String res = null;
        String sql = "UPDATE Producto SET ID='" + ID + "',Nombre='" + Nombre + "',Precio='" + Precio + "'WHERE ID=" + ID;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://DESKTOP-K1Q9I2S\\SQLEXPRESS:1433;" + "databaseName=Clientes_nomina;" + "user = sa;" + "password = IdKwPtP102463297.-; ";
        Connection con = DriverManager.getConnection(connectionURL);

        PreparedStatement statement = con.prepareStatement(sql);
        statement.execute();

    }

}
