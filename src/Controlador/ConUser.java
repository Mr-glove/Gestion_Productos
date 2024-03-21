package Controlador;

import Dao.DaoUsuario;
import Modelo.dtoUsuario;
import Modelo.dtoSessionManager;

public class ConUser {

    public boolean Ingresar(String us, String con){
        dtoUsuario user = DaoUsuario.seleccionarUsuarioPorNombre(us);
        if(user == null){
            return false;
        }
        else{
            if(user.getNombreUsuario().equals(us) && user.getContraseña().equals(con)){
                
                //iniciar sesion
                dtoSessionManager.setUser(user.getNombreUsuario(),user.getIdUsuario(),user.getRol());
                return true;
            }
            else
                // cerrar sesion (porsiacaso)
                dtoSessionManager.setUser("",0,"");
                return false;
        }
    }
}
