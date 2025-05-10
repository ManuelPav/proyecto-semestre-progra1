
package logica;

public class Departamento extends Entidad{
    private Tecnico tecnico;

    public Departamento() {
    };

    public Departamento(Tecnico tecnico, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.tecnico = tecnico;
    };

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    
    
    
}
