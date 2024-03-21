package Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Modelo.dtoTransaccion;

public class DaoTransaccion {
    // Procedimientos almacenados
    private static final String PROCEDIMIENTO_INSERTAR_TRANSACCION = "{CALL CrearTransaccion(?, ?, ?, ?, ?, ?)}";
    private static final String PROCEDIMIENTO_SELECCIONAR_TRANSACCION_POR_ID = "{CALL ObtenerTransaccionPorID(?)}";
    private static final String PROCEDIMIENTO_SELECCIONAR_TODAS_TRANSACCIONES = "{CALL ObtenerTodasTransacciones()}";

    // Método para insertar una transacción
    public static boolean insertarTransaccion(dtoTransaccion transaccion) {
        try (Connection conexion = Conexion.conectar();
             CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_INSERTAR_TRANSACCION)) {

            statement.setInt(1, transaccion.getIdUsuario());
            statement.setInt(2, transaccion.getIdProducto());
            statement.setInt(3, transaccion.getCantidad());
            statement.setString(4, transaccion.getTipoTransaccion());
            statement.setTimestamp(5, new java.sql.Timestamp(transaccion.getFechaHora().getTime()));
            statement.setString(6, transaccion.getObservaciones());

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al insertar transacción: " + e.getMessage());
            return false;
        }
    }

    // Método para seleccionar una transacción por su ID
    public static dtoTransaccion seleccionarTransaccionPorID(int idTransaccion) {
        dtoTransaccion transaccion = null;
        try (Connection conexion = Conexion.conectar();
             CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_SELECCIONAR_TRANSACCION_POR_ID)) {

            statement.setInt(1, idTransaccion);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                transaccion = new dtoTransaccion(
                    resultSet.getInt("id_transaccion"),
                    resultSet.getInt("id_usuario"),
                    resultSet.getInt("id_producto"),
                    resultSet.getString("tipo_transaccion"),
                    new Date(resultSet.getTimestamp("fecha_hora").getTime()),
                    resultSet.getString("observaciones"),
                    resultSet.getInt("cantidad"),
                    resultSet.getString("nombre_producto"),
                    resultSet.getString("nombre_usuario")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar transacción por ID: " + e.getMessage());
        }
        return transaccion;
    }

    // Método para seleccionar todas las transacciones
    public static List<dtoTransaccion> seleccionarTodasTransacciones() {
        List<dtoTransaccion> transacciones = new ArrayList<>();
        try (Connection conexion = Conexion.conectar();
             CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_SELECCIONAR_TODAS_TRANSACCIONES)) {

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                dtoTransaccion transaccion = new dtoTransaccion(
                    resultSet.getInt("id_transaccion"),
                    resultSet.getInt("id_usuario"),
                    resultSet.getInt("id_producto"),
                    resultSet.getString("tipo_transaccion"),
                    new Date(resultSet.getTimestamp("fecha_hora").getTime()),
                    resultSet.getString("observaciones"),
                    resultSet.getInt("cantidad"),
                    resultSet.getString("nombre_producto"),
                    resultSet.getString("nombre_usuario")
                );
                transacciones.add(transaccion);
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar todas las transacciones: " + e.getMessage());
        }
        return transacciones;
    }
}
