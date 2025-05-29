package logica;

public class Visitante extends Usuario {

    public Visitante() {
    }

    public Visitante(String nombre, String nombreUsuario, String correo, String contraseña, Rol rol) {
        super(nombre, nombreUsuario, correo, contraseña, rol);
    }

}
