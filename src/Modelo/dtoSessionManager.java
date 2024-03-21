package Modelo;


public class dtoSessionManager {
    
    private static int idUser;
    private static String username;
    private static String rol;

    public static String getUsername() {
        return username;
    }
    
    public static int getIdUser() {
        return idUser;
    }
    
    public static String getRol() {
        return rol;
    }

    public static void setUser(String us, int id, String rol) {
        dtoSessionManager.username = us;
        dtoSessionManager.idUser = id;
        dtoSessionManager.rol = rol;
    }
    
    
    public static void SalirSesion(){
        idUser=0;
        username="";
        rol="";
    }
    
}
