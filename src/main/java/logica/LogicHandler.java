package logica;

import clases.Project;
import clases.User;
import dev.Controller;
import java.util.List;

/**
 * En este punto se deberian hacer las validaciones. (Por ejemplo verificar las contraseñas al 
 * iniciar sesión, o validar que los datos introducidos en los input sean correctos)
 * 
 * Esta clase es importante porque es la que separa la logica de servidor y la de usuario para 
 * mantener los datos seguros.
 */
public class LogicHandler {
    
    Controller controlador = new Controller();
    
    // Variable para almacenar el usuario autenticado
    public static User usuarioAutenticado;
    
    /** 
     * Método engargado de crear un nuevo proyecto en la base de datos
     * 
     * @param name
     * @param description
    */
    public void CrearProyecto(String name, String description){
        Project proyecto = new Project();
        proyecto.setName(name);
        proyecto.setDescription(description);
        controlador.CrearProyecto(proyecto);
    }
    
    
    public void IniciarSesion(String username, String psw) {
        List<User> listaUsuarios = controlador.obtenerUsuarios();
        
        for ( User user : listaUsuarios) {
            if (user.getUsername().equals(username)) {
                System.out.println("Usuario encontrado: " + user.getUsername());
                if (user.getPassword().equals(psw)) {
                    System.out.println("La contraseña coincide");
                    usuarioAutenticado = user;
                } else {
                    System.out.println("La contraseña NO coincide");
                }
                break;
            }
        }
    }
}
