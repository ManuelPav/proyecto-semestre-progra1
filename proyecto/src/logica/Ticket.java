
package logica;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.Date;

public class Ticket extends Entidad {
    private  Departamento departamentoAsignado;
    private String nivelDePrioridad;
    private URL adjunto;
    private Date fechaDeCreacion;
    private String nota;

    public Ticket() {
    }

    public Ticket(Departamento departamentoAsignado, String nivelDePrioridad, URL adjunto, Date fechaDeCreacion, String nombre, String descripcion, String nota) {
        super(nombre, descripcion);
        this.departamentoAsignado = departamentoAsignado;
        this.nivelDePrioridad = nivelDePrioridad;
        this.adjunto = adjunto;
        this.fechaDeCreacion = fechaDeCreacion;
        this.nota = nota;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
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

    public URL getAdjunto() {
        return adjunto;
    }

    public void setAdjunto(URL adjunto) {
        this.adjunto = adjunto;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }
    
    
}
