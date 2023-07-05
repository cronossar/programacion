package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            String sis_java = "jdbc:mysql://localhost:3306/sis_java?serverTimezone=UTC";
            con = DriverManager.getConnection(sis_java, "root", "root");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

}
