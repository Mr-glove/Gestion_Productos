package Modelo;
import java.util.Date;

public class dtoTransaccion {
    private int idTransaccion;
    private int idUsuario;
    private int idProducto;
    private String tipoTransaccion;
    private Date fechaHora;
    private String observaciones;
    private int cantidad;
    private String nombre_producto;
    private String nombre_usuario;

    public dtoTransaccion(int idTransaccion, int idUsuario, int idProducto, String tipoTransaccion, Date fechaHora, String observaciones, int cantidad, String nombre_producto, String nombre_usuario) {
        this.idTransaccion = idTransaccion;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.tipoTransaccion = tipoTransaccion;
        this.fechaHora = fechaHora;
        this.observaciones = observaciones;
        this.cantidad = cantidad;
        this.nombre_producto = nombre_producto;
        this.nombre_usuario = nombre_usuario;
    }

    public dtoTransaccion(int idUsuario, int idProducto, String tipoTransaccion, Date fechaHora, String observaciones, int cantidad, String nombre_producto, String nombre_usuario) {
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.tipoTransaccion = tipoTransaccion;
        this.fechaHora = fechaHora;
        this.observaciones = observaciones;
        this.cantidad = cantidad;
        this.nombre_producto = nombre_producto;
        this.nombre_usuario = nombre_usuario;
    }

    public dtoTransaccion(int idUsuario, int idProducto, String tipoTransaccion, Date fechaHora, int cantidad, String observaciones) {
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.tipoTransaccion = tipoTransaccion;
        this.fechaHora = fechaHora;
        this.observaciones = observaciones;
        this.cantidad = cantidad;
    }
    
    
    public dtoTransaccion() {
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    @Override
    public String toString() {
        return "dtoTransaccion{" + "idTransaccion=" + idTransaccion + ", idUsuario=" + idUsuario + ", idProducto=" + idProducto + ", tipoTransaccion=" + tipoTransaccion + ", fechaHora=" + fechaHora + ", observaciones=" + observaciones + ", cantidad=" + cantidad + ", nombre_producto=" + nombre_producto + ", nombre_usuario=" + nombre_usuario + '}';
    }
    
    
    
}
