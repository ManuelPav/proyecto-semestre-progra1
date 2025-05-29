
package sql;

import java.sql.*;
import logica.Permisos;
import javax.swing.JOptionPane;
/**
 * @author manue
 */

public class PermisosDAO {
    public void create(Permisos p){
        String sql = """
                     INSERT INTO permisos (nombre, descripcion)
                     VALUES (?,?);
                     """;
        
        try (Connection conn = Conexion.getConexion(); PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Hubo un error al guardar el permiso");
        };
    };
}
