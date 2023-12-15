package dev;

/**
 * Clase Controladora para manejar la persistencia en la base de datos
 */
public class Controller {
    
    String url = "jdbc:mysql://localhost:3306/task_management";
    String username = "root";
    String password = "toor"; // contraseña que tenga en Workbench
    
    HandleDB db;
    
    public Controller() {
        db = new HandleDB(url, username, password);
    }
    
    // CREAR AQUI LOS METODOS PARA MANEJAR LOS DATOS DE LAS TABLAS
    
}
