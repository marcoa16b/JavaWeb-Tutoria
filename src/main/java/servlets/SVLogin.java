package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import logica.LogicHandler;

@WebServlet(name = "SVLogin", urlPatterns = {"/SVLogin"})
public class SVLogin extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (LogicHandler.usuarioAutenticado != null) {
            response.sendRedirect("homepage.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Se obtienen los datos
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Se llama a la funcion para iniciar sesion
        LogicHandler logic = new LogicHandler();
        logic.IniciarSesion(username, password);
        
        // Redireccionamos hacia este mismo servlet para que verifique si se inicio la sesión
        // Obviamente lo mejor seria hacer una mejor logica para mostrar un mensaje que indique 
        // que no se ha podido autenticar, pero este es solo un ejemplo.
        response.sendRedirect("SVLogin");
    }

}
