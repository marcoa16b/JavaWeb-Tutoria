package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import logica.LogicHandler;

@WebServlet(name = "SVProyects", urlPatterns = { "/SVProyects" })
public class SVProyects extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Realizar las consultas u operaciones necesarias
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request  servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException      if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Obtener los datos del formulario
        String name = request.getParameter("project_name");
        String description = request.getParameter("project_description");

        // Enviar datos a la capa de lógica
        LogicHandler handler = new LogicHandler();
        handler.CrearProyecto(name, description);

        // redireccionar a otra pagina o a la misma...
        response.sendRedirect("createProject.jsp");
    }

}
