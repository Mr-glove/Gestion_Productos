package Controlador;
import Modelo.dtoTransaccion;
import Dao.DaoTransaccion;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Vista.Transaccion;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ConTransaccion {
    
    
    public void IngresarTransaccion(int idUs, int idPro, String tipoTran, String Obs, Date fec){
        //dtoTransaccion tra = new dtoTransaccion(idPro, idPro, idPro, tipoTran, fec, Obs;
        //DaoTransaccion.insertarTransaccion(transaccion);
    }
    
    public static void LlenarTabla(){
        // traer los datos de DaoProductos (bd)
        List<dtoTransaccion> tra = new ArrayList<>();
        tra = DaoTransaccion.seleccionarTodasTransacciones();
        
        // Formato de la cadena original
        SimpleDateFormat formatoOriginal = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        
        // Formato deseado
        SimpleDateFormat formatoDeseado = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        //Llenar la tabla del Almacen
        Transaccion.modelo.setNumRows(tra.size());
        for(int i=0;i<tra.size();i++){
            Transaccion.tbltra.setValueAt(tra.get(i).getIdProducto(), i,0);
            Transaccion.tbltra.setValueAt(tra.get(i).getNombre_usuario(), i, 1);
            Transaccion.tbltra.setValueAt(tra.get(i).getNombre_producto(), i, 2);
            Transaccion.tbltra.setValueAt(tra.get(i).getCantidad(),i,3);
            Transaccion.tbltra.setValueAt(tra.get(i).getTipoTransaccion(),i, 4);
            Transaccion.tbltra.setValueAt(tra.get(i).getFechaHora(),i, 5);
            Transaccion.tbltra.setValueAt(tra.get(i).getObservaciones(),i, 6);
        }
    }
    
    private String transformarfecha(String cadenaOriginal) throws ParseException {
        String formatoOriginalStr = "EEE MMM dd HH:mm:ss zzz yyyy";
        String formatoDeseadoStr = "dd/MM/yyyy HH:mm:ss";
        
        SimpleDateFormat formatoOriginal = new SimpleDateFormat(formatoOriginalStr);
        SimpleDateFormat formatoDeseado = new SimpleDateFormat(formatoDeseadoStr);
        
        // Convertir la cadena original a un objeto Date
        Date fecha = formatoOriginal.parse(cadenaOriginal);
        
        // Formatear la fecha en el formato deseado y devolver como cadena
        return formatoDeseado.format(fecha);
    }
    
}
