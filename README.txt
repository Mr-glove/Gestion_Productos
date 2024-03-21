# Sistema de Gestión de productos

Este proyecto es un sistema de gestión de productos, la cual permite administrar productos, usuarios y sus transacciones asociadas. Utiliza MySQL como base de datos y Java para la aplicación.

# Funcionalidades

- Gestión de productos: Permite agregar, modificar y eliminar productos.
- Gestión de usuarios: Permite agregar nuevos usuarios y asignarles roles.
- Registro de transacciones: Registra las transacciones de entrada y salida de productos realizadas por los usuarios, ademas de ser solo observadas por los aministradores

# Estructura de la Base de Datos

El sistema utiliza las siguientes tablas en la base de datos MySQL (la base de datos se puede encontrar en la carpeta DB):

- `Productos`: Almacena la información de los productos disponibles.
- `Usuarios`: Contiene los datos de los usuarios del sistema.
- `Transacciones`: Registra las transacciones realizadas por los usuarios.


# Estandares y tecnologías aplicadas
- MVC (Modelo-Vista-Controlador): El proyecto sigue el patrón de diseño MVC para separar la lógica de negocio (modelo), la presentación (vista) y el control (controlador), lo que facilita la organización y mantenimiento del código.
- Java: Lenguaje de programación utilizado para desarrollar la aplicación (JDK-21).
- MySQL: Sistema de gestión de bases de datos utilizado para almacenar los datos del sistema.
- JDBC (Java Database Connectivity): API de Java que proporciona métodos para interactuar con bases de datos relacionales.
- Git: Sistema de control de versiones utilizado para el desarrollo colaborativo del proyecto.
- GitHub: Plataforma de alojamiento de código utilizado para almacenar y compartir el repositorio del proyecto.

# Creditos
Realizado por Piero Coveñas