
package sql;

import java.sql.*;
import javax.swing.JOptionPane;
import logica.FlujoDeTrabajo;

/**
 * @author manue
 */
public class FlujoDeTrabajoDAO {
    public void create (FlujoDeTrabajo f){
        String sql = """
                 INSERT INTO flujodetrabajo (nombre)
                 VALUES (?);
                 """; 
    
        try (Connection conn = Conexion.getConexion(); PreparedStatement ps = conn.prepareStatement(sql);){

            ps.setString(1, f.getNombre());
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Hubo un problema al ingresar los datos");
        }
    }
}
