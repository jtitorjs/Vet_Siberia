/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
public class conexion {
     public Connection obtenerConexion() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/veterinaria", "root", "");
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println("No se puede conectar " + e.getMessage());
        }
        return connection;
    }
}
