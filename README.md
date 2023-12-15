# Proyecto de tareas

## Sobre el proyecto:

El Query para crear la base de datos esta [aquí](https://github.com/marcoa16b/JavaWeb-Tutoria/blob/main/resourses/Database-creation-query.md).

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
