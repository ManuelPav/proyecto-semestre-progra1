package sql;

import logica.EstadoTicket;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author manue
 */
public class EstadoTicketDAO {

    public void create(EstadoTicket et) {
        String sql = """
                 INSERT INTO estadoticket (nombre, descripcion)
                 VALUES (?,?);
                 """;

        try (Connection conn = Conexion.getConexion(); PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setString(1, et.getNombre());
            ps.setString(2, et.getDescripcion());

            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al ingresar los datos");
        }
    }

}
