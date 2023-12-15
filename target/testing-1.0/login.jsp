
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar sesión</title>
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body class="bg-gray-100 flex items-center justify-center h-screen">
        <div class="bg-white p-8 rounded shadow-md w-96">
            <h1 class="text-2xl font-bold mb-6 text-center">Iniciar sesión</h1>
            <form action="SVLogin" method="POST">
                <div class="mb-4">
                    <label for="username" class="block text-sm font-semibold mb-2">Nombre de usuario</label>
                    <input type="text" id="username" name="username" class="w-full px-4 py-2 rounded border focus:outline-none focus:border-blue-500" placeholder="Nombre de usuario">
                </div>
                <div class="mb-6">
                    <label for="password" class="block text-sm font-semibold mb-2">Contraseña</label>
                    <input type="password" id="password" name="password" class="w-full px-4 py-2 rounded border focus:outline-none focus:border-blue-500" placeholder="Contraseña">
                </div>
                <button type="submit" class="w-full bg-blue-500 hover:bg-blue-600 text-white font-bold py-2 rounded focus:outline-none focus:shadow-outline">Iniciar sesión</button>
            </form>
        </div>
    </body>
</html>
