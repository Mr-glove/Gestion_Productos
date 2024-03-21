package Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelo.dtoUsuario;

public class DaoUsuario {

    private static final String PROCEDIMIENTO_INSERTAR_USUARIO = "{CALL CrearUsuario(?, ?, ?, ?)}";
    private static final String PROCEDIMIENTO_ELIMINAR_USUARIO = "{CALL EliminarUsuario(?)}";
    private static final String PROCEDIMIENTO_ACTUALIZAR_USUARIO = "{CALL ActualizarUsuario(?, ?, ?, ?, ?)}";
    private static final String PROCEDIMIENTO_SELECCIONAR_USUARIO_POR_ID = "{CALL ObtenerUsuarioPorID(?)}";
    private static final String PROCEDIMIENTO_SELECCIONAR_TODOS_USUARIOS = "{CALL ObtenerTodosUsuarios()}";
    private static final String PROCEDIMIENTO_SELECCIONAR_USUARIO_POR_NOMBRE = "{CALL ObtenerUsuarioPorNombre(?)}";

    // Método para insertar un usuario
    public static boolean insertarUsuario(dtoUsuario usuario) {
        try (Connection conexion = Conexion.conectar(); CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_INSERTAR_USUARIO)) {

            statement.setString(1, usuario.getNombreUsuario());
            statement.setString(2, usuario.getContraseña());
            statement.setString(3, usuario.getRol());
            statement.setString(4, usuario.getInformacionContacto());

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al insertar usuario: " + e.getMessage());
            return false;
        }
    }

    // Método para eliminar un usuario por su ID
    public static boolean eliminarUsuario(int idUsuario) {
        try (Connection conexion = Conexion.conectar(); CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_ELIMINAR_USUARIO)) {

            statement.setInt(1, idUsuario);

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
            return false;
        }
    }

    // Método para actualizar un usuario
    public static boolean actualizarUsuario(dtoUsuario usuario) {
        try (Connection conexion = Conexion.conectar(); CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_ACTUALIZAR_USUARIO)) {

            statement.setInt(1, usuario.getIdUsuario());
            statement.setString(2, usuario.getNombreUsuario());
            statement.setString(3, usuario.getContraseña());
            statement.setString(4, usuario.getRol());
            statement.setString(5, usuario.getInformacionContacto());

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: " + e.getMessage());
            return false;
        }
    }

    // Método para seleccionar un usuario por su ID
    public static dtoUsuario seleccionarUsuarioPorID(int idUsuario) {
        dtoUsuario usuario = null;
        try (Connection conexion = Conexion.conectar(); CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_SELECCIONAR_USUARIO_POR_ID)) {

            statement.setInt(1, idUsuario);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                usuario = new dtoUsuario(
                        resultSet.getInt("id_usuario"),
                        resultSet.getString("nombre_usuario"),
                        resultSet.getString("contraseña"),
                        resultSet.getString("rol"),
                        resultSet.getString("informacion_contacto")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar usuario por ID: " + e.getMessage());
        }
        return usuario;
    }

    // Método para seleccionar todos los usuarios
    public static List<dtoUsuario> seleccionarTodosUsuarios() {
        List<dtoUsuario> usuarios = new ArrayList<>();
        try (Connection conexion = Conexion.conectar(); CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_SELECCIONAR_TODOS_USUARIOS)) {

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                dtoUsuario usuario = new dtoUsuario(
                        resultSet.getInt("id_usuario"),
                        resultSet.getString("nombre_usuario"),
                        resultSet.getString("contraseña"),
                        resultSet.getString("rol"),
                        resultSet.getString("informacion_contacto")
                );
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar todos los usuarios: " + e.getMessage());
        }
        return usuarios;
    }
    
    public static dtoUsuario seleccionarUsuarioPorNombre(String nombre){
        dtoUsuario usuario = null;
        try (Connection conexion = Conexion.conectar(); CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_SELECCIONAR_USUARIO_POR_NOMBRE)) {

            statement.setString(1, nombre);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                usuario = new dtoUsuario(
                        resultSet.getInt("id_usuario"),
                        resultSet.getString("nombre_usuario"),
                        resultSet.getString("contraseña"),
                        resultSet.getString("rol"),
                        resultSet.getString("informacion_contacto")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar usuario por Usuario: " + e.getMessage());
        }
        return usuario;
        
    }
}
