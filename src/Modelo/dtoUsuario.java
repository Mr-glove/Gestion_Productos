package Modelo;

public class dtoUsuario {
    private int idUsuario;
    private String nombreUsuario;
    private String contraseña;
    private String rol;
    private String informacionContacto;

    public dtoUsuario(int idUsuario, String nombreUsuario, String contraseña, String rol, String informacionContacto) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
        this.informacionContacto = informacionContacto;
    }
    
    public dtoUsuario(String nombreUsuario, String contraseña, String rol, String informacionContacto){
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
        this.informacionContacto = informacionContacto;
    }

    public dtoUsuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getInformacionContacto() {
        return informacionContacto;
    }

    public void setInformacionContacto(String informacionContacto) {
        this.informacionContacto = informacionContacto;
    }
    
}
