
package logica;

public class EstadoTicket {
    private String nombre; 
    private String descripcion; 
    private boolean estadoFinal;
    private EstadoTicket siguienteEstado;

    public EstadoTicket() {
    }

    public EstadoTicket(String nombre, String descripcion, boolean estadoFinal, EstadoTicket siguienteEstado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estadoFinal = estadoFinal;
        this.siguienteEstado = siguienteEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstadoFinal() {
        return estadoFinal;
    }

    public void setEstadoFinal(boolean estadoFinal) {
        this.estadoFinal = estadoFinal;
    }

    public EstadoTicket getSiguienteEstado() {
        return siguienteEstado;
    }

    public void setSiguienteEstado(EstadoTicket siguienteEstado) {
        this.siguienteEstado = siguienteEstado;
    }
    
    
}
