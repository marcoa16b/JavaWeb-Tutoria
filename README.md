# Proyecto de tareas

## Instrucciones de la evaluación:

### Configuración del Proyecto:

- Cree un proyecto web en Java utilizando un IDE de su elección.
- Configure el proyecto para utilizar JSP y una base de datos MySQL.

### Base de Datos:

Disene y cree una base de datos MySQL llamada task_management con las siguientes tablas:

- "**projects**" que incluya campos para **_project_id_** (autoincremental), **_name_** y **_description_**.
- "**users**" que incluya campos para **_user_id_** (autoincremental), **_username_**, **_password_** y **_role_** (administrador o miembro).
- "**tasks**" que incluya campos para **_task_id_** (autoincremental), **_project_id_**, **_user_id_**, **_title_**, **_description_**, **_status_** y **_due_date_**.

### Página para Listar Proyectos:

- Cree una página JSP (listProjects.jsp) que muestre la lista de proyectos.
- Incluya información básica sobre cada proyecto.

### Página para Crear Proyectos:

- Cree una pagina JSP (createProject.jsp) que permita a los usuarios crear nuevos proyectos.
- Los usuarios deben tener roles de administrador para crear proyectos.

### Página para Listar Tareas:

- Cree una página JSP (listTasks.jsp) que permita a los usuarios ver las tareas asignadas a ellos en el proyecto.
- Muestre detalles sobre cada tarea, incluyendo el estado y la fecha de vencimiento.

### Página para Asignar Tareas:

- Cree una pagina JSP (assign Task.jsp) que permita a los usuarios con roles de administrador asignar tareas a miembros del equipo en un proyecto específico.

### Página para Actualizar Estado de Tareas:

- Cree una página JSP (update TaskStatus.jsp) que permita a los usuarios actualizar el estado de una tarea (por ejemplo, "En progreso" o "Completada").

### Estilo y Presentación:

- Agregue estilos CSS para mejorar la presentación de las páginas JSP y garantizar una experiencia de usuario agradable.

### Documentación y Comentarios (5 puntos):

- Proporcione documentación clara sobre el funcionamiento del código y agregue comentarios en el código donde sea necesario.

---

## Sobre el proyecto:

El Query para crear la base de datos esta en "/resourses/Database-creation-query.md".

En la carpeta `clases` se encuentran los objetos de las tablas ("projects", "users", "tasks").

En la carpeta `dev` esta el manejador de la base de datos y el controlador, estas dos clases se encargan de todo lo relacionado con el CRUD en la base de datos.

En la carpeta `logica`, se encuentra la "logica de la aplicación" que es donde se realizan las validaciones y operaciones necesarias. (Es como el Backend de la app, que se comunica entre el cliente y la base de datos)

En la carpeta `servlets` se encuentran los servlets que reciben las consultas http de las paginas.

## IMPORTANTE:

Existe un error que se puede presentar dependiendo del JDK de Java que esté utilizando que es el siguiente:

```bash
java.lang.ClassNotFoundException: com.mysql.jdbc.Driver
	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1353)
	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1165)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:375)
                  (...)
```

Para solucionarlo unicamente es necesario agregar la dependencia del controlador de MySql:

https://mvnrepository.com/artifact/com.mysql/mysql-connector-j/8.2.0

Agregando lo siguiente en el archivo `pom.xml` en el apartado de "dependencies":

```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.2.0</version>
</dependency>
```
