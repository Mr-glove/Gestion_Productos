package Controlador;

import Dao.DaoProductos;
import Dao.DaoTransaccion;
import Modelo.dtoProductos;
import Modelo.dtoTransaccion;
import Vista.Almacen;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class ConAlmacen {
    
    // función el cual permite que la tabla del almacen se actualize 
    public void LLenarTabla(){
        // traer los datos de DaoProductos (bd)
        List<dtoProductos> prod = new ArrayList<>();
        prod = DaoProductos.seleccionarTodosProductos();
        
        //Llenar la tabla del Almacen
        Almacen.modelo.setNumRows(prod.size());
        for(int i=0;i<prod.size();i++){
            Almacen.tblAlm.setValueAt(prod.get(i).getIdProducto(), i,0);
            Almacen.tblAlm.setValueAt(prod.get(i).getNombre(), i, 1);
            Almacen.tblAlm.setValueAt(prod.get(i).getCantidad(), i, 2);
            Almacen.tblAlm.setValueAt(prod.get(i).getPrecioUnitario(),i,3);
            Almacen.tblAlm.setValueAt(prod.get(i).getDescripcion(),i, 4);
        }
    }
    
    // funcion el cual inserta una cantidad a un producto existente
    public void IngresarProductos(int idProducto, int cantidad, int idUsuario, Date fechaHora, String Obs){
        
        //insertar un producto nuevo a la bd
        DaoProductos.ingresarProducto(idProducto,cantidad);
        
        //Insertando la transaccion
        dtoTransaccion tra = new dtoTransaccion(idUsuario, idProducto, "entrada" , fechaHora, cantidad, Obs);
        DaoTransaccion.insertarTransaccion(tra);

    }
    
    public void RetirarProductos(int idProducto, int cantidad, int idUsuario, Date fechaHora, String Obs){
        
        //retirar un producto nuevo a la bd
        DaoProductos.retirarProducto(idProducto,cantidad);
        
        //Insertando la transaccion
        dtoTransaccion tra = new dtoTransaccion(idUsuario, idProducto, "salida" , fechaHora, cantidad, Obs);
        DaoTransaccion.insertarTransaccion(tra);
        
    }


}
