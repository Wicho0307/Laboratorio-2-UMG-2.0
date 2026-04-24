# Laboratorio-2-UMG-2.0
# Sistema de Gestión de Usuarios en Java

## Descripción
Este proyecto fue desarrollado en Java utilizando Apache NetBeans 29 y JDK 25.  
El programa simula un sistema básico de inicio de sesión y administración de usuarios mediante una interfaz gráfica creada con Swing.

## Funcionalidades principales

### 1. Login
El sistema permite iniciar sesión con usuario y contraseña.  
Las credenciales se validan contra una lista interna de usuarios registrados.

El usuario administrador principal es:

- Username: `luispedro07`
- Rol: Administrador

### 2. Menú principal
Después de iniciar sesión correctamente, el usuario es dirigido al menú principal.

El menú incluye:

- Management
- See List
- Reset Password
- Log Out

### 3. Control de permisos
El usuario administrador puede acceder a las opciones de Management.

Los usuarios normales no pueden ver ni utilizar la opción Management.

### 4. Lista de usuarios
La opción **See List** muestra una tabla con los usuarios registrados.

La tabla muestra:

- Username
- Name
- Status

En esta vista, la tabla funciona únicamente en modo lectura.

### 5. Administración de usuarios
La opción **Manage Users** permite al administrador editar la información de los usuarios existentes.

Desde esta opción se puede:

- Modificar username
- Modificar name
- Cambiar status entre Active e Inactive
- Agregar nuevos usuarios
- Guardar cambios realizados

### 6. Agregar usuarios
El botón **Add User** abre un formulario donde se solicita:

- Username
- Name
- Password

La contraseña debe tener mínimo 6 caracteres.  
Los nuevos usuarios se agregan como usuarios normales y pueden iniciar sesión mientras la aplicación siga ejecutándose.

### 7. Estado del usuario
Cada usuario tiene un estado:

- Active
- Inactive

Si un usuario está en estado **Inactive**, no puede iniciar sesión y el sistema muestra un mensaje indicando que el usuario está bloqueado o inactivo.

### 8. Bloqueo por intentos fallidos
Los usuarios normales se bloquean automáticamente después de 3 intentos fallidos de inicio de sesión.

El administrador no se bloquea por intentos fallidos.

### 9. Reset Password
Cada usuario puede cambiar su propia contraseña desde la opción **Reset Password**.

El formulario solicita:

- Contraseña actual
- Nueva contraseña
- Confirmación de nueva contraseña

El sistema valida que:

- La contraseña actual sea correcta
- La nueva contraseña tenga al menos 6 caracteres
- La nueva contraseña coincida con la confirmación

### 10. Cerrar sesión
La opción **Log Out** cierra el menú principal y regresa a la pantalla de login.

## Persistencia de datos
Los cambios realizados a los usuarios se mantienen mientras la aplicación esté en ejecución.

Esto incluye:

- Usuarios nuevos agregados
- Cambios en username, name o status
- Cambios de contraseña
- Bloqueo por intentos fallidos

Al cerrar completamente la aplicación, los datos vuelven a los valores iniciales, ya que no se utiliza base de datos ni archivo externo.

## Tecnologías utilizadas

- Java
- Swing
- Apache NetBeans 29
- JDK 25