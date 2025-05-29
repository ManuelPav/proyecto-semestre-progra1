
package logica;

public abstract class Trabajadores extends Usuario{

    public Trabajadores() {
    }

    public Trabajadores(String nombre, String nombreUsuario, String correo, String contraseña, Rol rol) {
        super(nombre, nombreUsuario, correo, contraseña, rol);
    }
    
    
    
}
