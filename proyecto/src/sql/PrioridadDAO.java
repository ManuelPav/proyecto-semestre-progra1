
package sql;

import java.sql.*;
import javax.swing.JOptionPane;
import logica.Prioridad;

/**
 * @author manue
 */
public class PrioridadDAO {
    private void create(Prioridad p){
        String sql = """
                     INSERT INTO nivelprioridad (nombre)
                     VALUES (?)
                     """;
        
        try(Connection conn = Conexion.getConexion(); PreparedStatement ps = conn.prepareStatement(sql);){
            
            ps.setString(1, p.getNombre());
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "hubo un problema al guardar los datos");
        }
    }
    
}
