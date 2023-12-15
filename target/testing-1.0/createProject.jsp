<%-- 
    Document   : createProject
    Created on : 14 dic. 2023, 23:43:46
    Author     : 50684
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear proyectos</title>
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body>
        <h1 class="text-4xl font-bold text-center">Crear proyectos</h1>
        
        <form action="SVProyects" method="POST" class="w-full max-w-[500px] mt-16 flex flex-col gap-8 bg-slate-200 p-5 rounded-xl">
          <div>
            <label for="name" class="block mb-2 text-sm font-medium text-gray-900">Nombre del proyecto</label>
            <input type="text" name="project_name" id="first_name" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5" placeholder="Proyecto de informática" required>
          </div>

          <div>
            <label for="name" class="block mb-2 text-sm font-medium text-gray-900">Descripción del proyecto</label>
            <input type="text" name="project_description" id="first_name" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5" placeholder="Un proyecto sobre Java web" required>
          </div>

          <div class="flex flex-col items-center">
            <button type="submit" class="text-white bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:ring-blue-300 font-medium rounded-lg text-sm px-5 py-2.5 me-2 mb-2 focus:outline-none">Guardar proyecto</button>
          </div>
        </form>
    </body>
</html>
