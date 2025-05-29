
package sql;

import logica.Rol;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author manue
 */
public class RolDAO {
    public void create(Rol r){
        String sql = """
                     INSERT INTO rol (nombre, descripcion)
                     VALUES (?,?);
                     """;
        
        try (Connection conn = Conexion.getConexion(); PreparedStatement ps = conn.prepareStatement(sql);){
            
            ps.setString(1, r.getNombre());
            ps.setString(2, r.getDescripcion());
            
            ps.executeUpdate();
            
        } catch (SQLException ex){
            JOptionPane.showInputDialog("Hubo un error con la conexion de roles");
        }
        
        
    }
}
