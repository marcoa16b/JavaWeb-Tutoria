package logica;

import clases.Project;
import dev.Controller;

/**
 * En este punto se deberian hacer las validaciones. (Por ejemplo verificar las contraseñas al 
 * iniciar sesión, o validar que los datos introducidos en los input sean correctos)
 * 
 * Esta clase es importante porque es la que separa la logica de servidor y la de usuario para 
 * mantener los datos seguros.
 */
public class LogicHandler {
    
    Controller controlador = new Controller();
    
    /** 
     * Método engargado de crear un nuevo proyecto en la base de datos
     * 
     * @param name
     * @param description
     * @return numero que indica la cantidad de filas afectadas o -1 en caso de ser error 
    */
    public int CrearProyecto(String name, String description){
        Project proyecto = new Project();
        proyecto.setName(name);
        proyecto.setDescription(description);
        return controlador.CrearProyecto(proyecto);
    }
}
