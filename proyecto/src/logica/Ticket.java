
package logica;

import java.time.LocalDateTime;

public class Ticket extends Entidad {
    private  Departamento departamentoAsignado;
    private String nivelDePrioridad;
    private String adjunto;
    private LocalDateTime fechaDeCreacion;

    public Ticket() {
    }

    public Ticket(Departamento departamentoAsignado, String nivelDePrioridad, String adjunto, LocalDateTime fechaDeCreacion, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.departamentoAsignado = departamentoAsignado;
        this.nivelDePrioridad = nivelDePrioridad;
        this.adjunto = adjunto;
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Departamento getDepartamentoAsignado() {
        return departamentoAsignado;
    }

    public void setDepartamentoAsignado(Departamento departamentoAsignado) {
        this.departamentoAsignado = departamentoAsignado;
    }

    public String getNivelDePrioridad() {
        return nivelDePrioridad;
    }

    public void setNivelDePrioridad(String nivelDePrioridad) {
        this.nivelDePrioridad = nivelDePrioridad;
    }

    public String getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
    }

    public LocalDateTime getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDateTime fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }
    
    
}
