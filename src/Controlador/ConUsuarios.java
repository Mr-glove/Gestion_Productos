package Controlador;
import Dao.DaoUsuario;
import Modelo.dtoUsuario;
import Vista.Usuarios;
import java.util.ArrayList;
import java.util.List;

public class ConUsuarios {
    
    public void LlenarTabla(){
        List<dtoUsuario> us = new ArrayList<>();
        us = DaoUsuario.seleccionarTodosUsuarios();
        
        //Llenar la tabla del Usuarios
        Usuarios.modelo.setNumRows(us.size());
        for(int i=0;i<us.size();i++){
            Usuarios.tblUsuarios.setValueAt(us.get(i).getIdUsuario(), i,0);
            Usuarios.tblUsuarios.setValueAt(us.get(i).getNombreUsuario(), i, 1);
            Usuarios.tblUsuarios.setValueAt(us.get(i).getContraseña(), i, 2);
            Usuarios.tblUsuarios.setValueAt(us.get(i).getRol(),i,3);
        }
    }
    
    public void CrearUsuario(String nom, String con,String rol, String contc){
        dtoUsuario us = new dtoUsuario(nom,con,rol, contc);
        DaoUsuario.insertarUsuario(us);
    }
    
    public void ModificarProducto(int id, String nom, String con,String rol, String contc){
        dtoUsuario us = new dtoUsuario(id,nom,con,rol, contc);
        DaoUsuario.actualizarUsuario(us);
    }
    
    public void EliminarUsuario(int id){
        DaoUsuario.eliminarUsuario(id);
    }

}
