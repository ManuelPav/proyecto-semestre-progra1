
package logica;

public class FlujoDeTrabajo {
    private String nombre;
    
    public FlujoDeTrabajo(){       
    };
    
    public FlujoDeTrabajo(String nombre){
        this.nombre = nombre; 
    }; 
    
    public String getNombre(){
        return this.nombre; 
    }; 
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }; 
    
}
