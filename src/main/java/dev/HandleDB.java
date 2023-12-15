package dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HandleDB {
    
    // Variable para almacenar la conexión
    private Connection connection;
    private Statement statement;
    
    public HandleDB(String url, String user, String password) {
        try {
            // Cargar el driver JDBC de MySQL
            Class.forName("com.mysql.jdbc.Driver");
            
            // Establecer la conexion con la base de datos
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            System.out.println("Conexion a la base de datos establecida con exito.");
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Método para ejecutar consultas SELECT
    public ResultSet ejecutarConsulta(String query) {
        try {
            return statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    // Método para ejecutar consultas de actualizacion (INSERT, UPDATE, DELETE)
    public int ejecutarActualización(String query) {
        try {
            return statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    // Método para cerrar la conexión con la base de datos
    public void cerrarConexion() {
        try {
            if (statement != null)
                statement.close();
            if (connection != null)
                connection.close();
            System.out.println("Conexión cerrada.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
