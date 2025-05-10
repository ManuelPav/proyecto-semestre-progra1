
package logica;

public abstract class Persona {
    private String nombre;
    private String nombreUsuario;
    private String correo; 
    private String contraseña; 
    private Rol rol;

    public Persona() {
    }

    public Persona(String nombre, String nombreUsuario, String correo, String contraseña, Rol rol) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    public void agregarNota(){
        
    }
    
    
    
    
}
