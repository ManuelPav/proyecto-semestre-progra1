package sql;

import java.sql.*;
import logica.*;

/**
 * @author manue
 */
public class UsuarioDAO {
    
    Departamento dep = new Departamento();
    Rol rol = new Rol();
    
    public void create(Usuario u) {
        
        String sql = """ 
                    INSERT INTO ususarios (nombre, nombreusuario, departamento, contrasenia, correo, rol)
                    VALUES (?,?,?,?,?,?,?);
                     """;

        try (Connection conn = Conexion.getConexion(); PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getNombreUsuario());
            ps.setString(3, dep.getNombre());
            ps.setString(4, u.getContraseña());
            ps.setString(5, u.getCorreo());
            ps.setString(6, rol.getNombre());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("hola que hace");
        }
    }
}
