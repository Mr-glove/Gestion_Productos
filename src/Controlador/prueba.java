/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
import Controlador.ConAlmacen;
import Dao.DaoProductos;

/**
 *
 * @author Luhana
 */
public class prueba {
    
    public static void main(String[] args) {

        ConAlmacen conAlm = new ConAlmacen();
        /*DaoProductos.ingresarProducto(1,5);
        DaoProductos.ingresarProducto(2,5);
        DaoProductos.ingresarProducto(3,5);
        DaoProductos.ingresarProducto(4,5);*/
    }
    
    public static Timestamp tiempo(){
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;
    }
    
}
