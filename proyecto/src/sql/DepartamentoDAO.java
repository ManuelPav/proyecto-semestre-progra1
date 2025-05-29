package sql;

import javax.swing.JOptionPane;
import java.sql.*;
import logica.*;

/**
 * @author manue
 */
public class DepartamentoDAO {

    Tecnico t = new Tecnico();

    public void create(Departamento d) {
        String sql = """
                     INSERT INTO departamento(nombre,descripcion,usuariosasignados)
                     VALUES (?,?,?);
                     """;

        try (Connection conn = Conexion.getConexion(); PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setString(1, d.getNombre());
            ps.setString(2, d.getDescripcion());
            ps.setString(3, t.getNombre());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al incertar los datos");
        }
    }
}
