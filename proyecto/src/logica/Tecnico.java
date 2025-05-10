
package logica;

public class Tecnico extends Persona{
    private Departamento departamento;

    public Tecnico() {
    }

    public Tecnico(String nombre, String nombreUsuario, String correo, String contraseña, Rol rol, Departamento departamento) {
        super(nombre, nombreUsuario, correo, contraseña, rol);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
    
    
    
    
}
