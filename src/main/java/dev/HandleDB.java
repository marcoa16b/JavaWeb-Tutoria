package dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HandleDB {

    // Variables para almacenar la conexión
    private Connection connection;
    private Statement statement;

    // Constructor
    public HandleDB(String url, String user, String password) {
        try {
            // Cargar el driver JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexion con la base de datos
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            System.out.println("Conexion a la base de datos establecida con exito.");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al intentar conectar con la base de datos... ");
            e.printStackTrace();
        }
    }

    /**
     * Método para ejecutar consultas de selección (SELECT)
     * 
     * @param query Consulta a ejecutar
     * @return ResultSet con los resultados de la consulta
     */
    public ResultSet ejecutarConsulta(String query) {
        try {
            return statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Método para ejecutar consultas de actualización (INSERT, UPDATE, DELETE)
     * 
     * @param query Consulta a ejecutar
     * @return número de filas afectadas
     */
    public int ejecutarActualizacion(String query) {
        try {
            return statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * Método para cerrar la conexión con la base de datos
     * 
     * Importante cerrar la conexión una vez que se terminen de hacer las consultas
     */
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
