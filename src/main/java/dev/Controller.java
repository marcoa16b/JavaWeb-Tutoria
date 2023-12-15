package dev;

import clases.Project;
import clases.Task;
import clases.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Controladora para manejar la persistencia en la base de datos
 * 
 */
public class Controller {

    private String url = "jdbc:mysql://localhost:3306/task_management";
    private String username = "root";
    private String password = "toor"; // contraseña que tenga en Workbench

    HandleDB db;

    public Controller() {
        db = new HandleDB(url, username, password);
    }

    // Métodos para la tabla projects

    /**
     * Crea un proyecto en la base de datos
     * 
     * @param proyecto Proyecto a crear
     * @return numero de filas afectadas o -1 si hubo un error
     */
    public int CrearProyecto(Project proyecto) {
        String query = String.format("INSERT INTO projects (name, description) VALUES ('%s', '%s')",
                proyecto.getName(), proyecto.getDescription());
        return db.ejecutarActualizacion(query);
    }

    /**
     * Obtiene todos los proyectos de la base de datos
     * 
     * @return Lista de proyectos
     */
    public List<Project> obtenerProyectos() {
        List<Project> proyectos = new ArrayList<>();
        ResultSet resultSet = db.ejecutarConsulta("SELECT * FROM projects");
        try {
            while (resultSet.next()) {
                Project proyecto = new Project();
                proyecto.setProjectId(resultSet.getInt("project_id"));
                proyecto.setName(resultSet.getString("name"));
                proyecto.setDescription(resultSet.getString("description"));
                proyectos.add(proyecto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return proyectos;
    }

    // Métodos para la tabla users

    /**
     * Crea un usuario en la base de datos
     * 
     * @param usuario Usuario a crear
     */
    public void crearUsuario(User usuario) {
        String query = String.format("INSERT INTO users (username, password, role) VALUES ('%s', '%s', '%s')",
                usuario.getUsername(), usuario.getPassword(), usuario.getRole());
        db.ejecutarActualizacion(query);
    }

    /**
     * Obtiene todos los usuarios de la base de datos
     * 
     * @return Lista de usuarios
     */
    public List<User> obtenerUsuarios() {
        List<User> usuarios = new ArrayList<>();
        ResultSet resultSet = db.ejecutarConsulta("SELECT * FROM users");
        try {
            while (resultSet.next()) {
                User usuario = new User();
                usuario.setUserId(resultSet.getInt("user_id"));
                usuario.setUsername(resultSet.getString("username"));
                usuario.setPassword(resultSet.getString("password"));
                usuario.setRole(resultSet.getString("role"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    // Métodos para la tabla tasks

    /**
     * Crea una tarea en la base de datos
     * 
     * @param tarea Tarea a crear
     */
    public void crearTarea(Task tarea) {
        String query = String.format("INSERT INTO tasks (project_id, user_id, title, description, status, due_date) " +
                "VALUES (%d, %d, '%s', '%s', '%s', '%s')",
                tarea.getProjectId(), tarea.getUserId(), tarea.getTitle(), tarea.getDescription(),
                tarea.getStatus(), tarea.getDueDate());
        db.ejecutarActualizacion(query);
    }

    /**
     * Obtiene todas las tareas de la base de datos
     * 
     * @return Lista de tareas
     */
    public List<Task> obtenerTareas() {
        List<Task> tareas = new ArrayList<>();
        ResultSet resultSet = db.ejecutarConsulta("SELECT * FROM tasks");
        try {
            while (resultSet.next()) {
                Task tarea = new Task();
                tarea.setTaskId(resultSet.getInt("task_id"));
                tarea.setProjectId(resultSet.getInt("project_id"));
                tarea.setUserId(resultSet.getInt("user_id"));
                tarea.setTitle(resultSet.getString("title"));
                tarea.setDescription(resultSet.getString("description"));
                tarea.setStatus(resultSet.getString("status"));
                tarea.setDueDate(resultSet.getDate("due_date"));
                tareas.add(tarea);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tareas;
    }

}
