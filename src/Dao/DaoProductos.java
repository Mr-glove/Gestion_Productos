package Dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelo.dtoProductos;

public class DaoProductos extends Conexion{
    // Procedimientos almacenados
    private static final String PROCEDIMIENTO_INSERTAR_PRODUCTO = "{CALL CrearProducto(?, ?, ?, ?)}";
    private static final String PROCEDIMIENTO_ELIMINAR_PRODUCTO = "{CALL EliminarProducto(?)}";
    private static final String PROCEDIMIENTO_ACTUALIZAR_PRODUCTO = "{CALL ModificarProducto(?, ?, ?, ?, ?)}";
    private static final String PROCEDIMIENTO_SELECCIONAR_PRODUCTO_POR_ID = "{CALL ObtenerProductoPorID(?)}";
    private static final String PROCEDIMIENTO_SELECCIONAR_TODOS_PRODUCTOS = "{CALL ObtenerTodosProductos()}";
    private static final String PROCEDIMIENTO_INGRESAR_PRODUCTO = "{CALL IngresarProducto(?, ?)}";
    private static final String PROCEDIMIENTO_RETIRAR_PRODUCTO = "{CALL RetirarProducto(?, ?)}";

    // Método para insertar un producto
    public static boolean crearProducto(dtoProductos producto) {
        try (Connection conexion = Conexion.conectar();
             CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_INSERTAR_PRODUCTO)) {

            statement.setString(1, producto.getNombre());
            statement.setString(2, producto.getDescripcion());
            statement.setInt(3, producto.getCantidad());
            statement.setDouble(4, producto.getPrecioUnitario());

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al insertar producto: " + e.getMessage());
            return false;
        }
    }

    // Método para eliminar un producto por su ID
    public static boolean eliminarProducto(int idProducto) {
        try (Connection conexion = Conexion.conectar();
             CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_ELIMINAR_PRODUCTO)) {

            statement.setInt(1, idProducto);

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e.getMessage());
            return false;
        }
    }

    // Método para actualizar un producto
    public static boolean actualizarProducto(dtoProductos producto) {
        try (Connection conexion = Conexion.conectar();
             CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_ACTUALIZAR_PRODUCTO)) {

            statement.setInt(1, producto.getIdProducto());
            statement.setString(2, producto.getNombre());
            statement.setString(3, producto.getDescripcion());
            statement.setInt(4, producto.getCantidad());
            statement.setDouble(5, producto.getPrecioUnitario());

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e.getMessage());
            return false;
        }
    }

    // Método para seleccionar un producto por su ID
    public static dtoProductos seleccionarProductoPorID(int idProducto) {
        dtoProductos producto = null;
        try (Connection conexion = Conexion.conectar();
             CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_SELECCIONAR_PRODUCTO_POR_ID)) {

            statement.setInt(1, idProducto);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                producto = new dtoProductos(
                resultSet.getInt("id_producto"),
                resultSet.getString("nombre"),
                resultSet.getString("descripcion"),
                resultSet.getInt("cantidad"),
                resultSet.getDouble("precio_unitario")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar producto por ID: " + e.getMessage());
        }
        return producto;
    }

    // Método para seleccionar todos los productos
    public static List<dtoProductos> seleccionarTodosProductos() {
        List<dtoProductos> productos = new ArrayList<>();
        try (Connection conexion = Conexion.conectar();
             CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_SELECCIONAR_TODOS_PRODUCTOS)) {

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                dtoProductos producto = new dtoProductos(
                resultSet.getInt("id_producto"),
                resultSet.getString("nombre"),
                resultSet.getString("descripcion"),
                resultSet.getInt("cantidad"),
                resultSet.getDouble("precio_unitario")
                );
                productos.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar todos los productos: " + e.getMessage());
        }
        return productos;
    }
    
    public static boolean ingresarProducto(int id, int cant){
        try (Connection conexion = Conexion.conectar();
             CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_INGRESAR_PRODUCTO)) {

            statement.setInt(1, id);
            statement.setInt(2, cant);

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al ingresar el producto: " + e.getMessage());
            return false;
        }
        
    }
    
    public static boolean retirarProducto(int id, int cant){
        try (Connection conexion = Conexion.conectar();
             CallableStatement statement = conexion.prepareCall(PROCEDIMIENTO_RETIRAR_PRODUCTO)) {

            statement.setInt(1, id);
            statement.setInt(2, cant);

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al retirar el producto: " + e.getMessage());
            return false;
        }
        
    }
}
