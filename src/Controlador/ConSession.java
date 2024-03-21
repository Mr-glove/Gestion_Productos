package Controlador;

import Modelo.dtoSessionManager;

public class ConSession {

    public void IngresarSesion(String us, int id, String rol){
        dtoSessionManager.setUser(us, id, rol);
    }
}
