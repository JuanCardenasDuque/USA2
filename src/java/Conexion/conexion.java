package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author carde
 */
public class conexion {
    
    private static Connection CONEXION = null;

    public static Connection getConnection() throws SQLException {
        if (CONEXION == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
//Integracion Log4J;
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            } catch (InstantiationException e) {
//Integracion Log4J
                throw new SQLException(e);
            } catch (IllegalAccessException e) {
//Integracion Log4J
                throw new SQLException(e);
            }

            try {
                CONEXION = DriverManager.getConnection("jdbc:mysql://localhost:3306/Clientes_nomina", "sa", "IdKwPtP102463297.-");
            } catch (SQLException e) {
                throw new SQLException(e);
            }
        }
        return CONEXION;
    }

    public static PreparedStatement prepareStatement(String select_idcodigonombrecuposprecio_FROM_eve) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
