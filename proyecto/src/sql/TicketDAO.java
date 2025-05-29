package sql;

import javax.swing.JOptionPane;
import logica.*;
import java.sql.*;

/**
 * @author manue
 */
public class TicketDAO {

    Departamento d = new Departamento();
    Prioridad p = new Prioridad();
    EstadoTicket et = new EstadoTicket();
    FlujoDeTrabajo ft = new FlujoDeTrabajo();

    public void create(Ticket t) {
        String sql = """
                     INSERT INTO tickets (nombre, departamento, prioridad, adjinto, fechaCreacion, estadoticket, nota, flujodetrabajo)
                     VALUES (?,?,?,?,?,?,?,?);
                     """;

        try (Connection conn = Conexion.getConexion(); PreparedStatement ps = conn.prepareStatement(sql);) {

            ps.setString(1, t.getNombre());
            ps.setString(2, d.getNombre());
            ps.setString(3, p.getNombre());
            ps.setURL(4, t.getAdjunto());
            ps.setDate(5, (Date) t.getFechaDeCreacion());
            ps.setString(6, et.getNombre());
            ps.setString(7, t.getNota());
            ps.setString(8, ft.getNombre());

            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "hubo un error al guardar los datos");
        }
    }
}
