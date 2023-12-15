<%@ page import="clases.User"  %>
<%@ page import="logica.LogicHandler"  %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Homepage</title>
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body>
        <h1>Esta es la pagina de inicio</h1>
        
        <!-- Aqui hacemos la logica para ver si el usuario autenticado tiene el rol administrador o miembro 
        y en caso de que si sea administrador se muestra el boton para crear nuevos proyectos. -->
        
        <% User user = LogicHandler.usuarioAutenticado; %>
        
        <p class="my-4 text-sm">El usuario tiene rol: <%=user.getRole()%></p>
        
        <%
            if (user.getRole().equals("administrador")) {
        %>
            <a href="#" class="w-full bg-blue-500 hover:bg-blue-600 text-white font-bold px-5 py-2 rounded focus:outline-none focus:shadow-outline">Crear nuevo proyecto</a>
        <% } else { %>
            <p>El usuario no tiene permisos para crear proyectos</p>
        <% } %>
    </body>
</html>
