
package sql;

import java.sql.*;
import org.postgresql.ds.PGSimpleDataSource;

public class Conexion {

    private static PGSimpleDataSource ds = new PGSimpleDataSource ();
    
    static{
        ds.setServerNames(new String[] {"ep-divine-block-a88kgth1-pooler.eastus2.azure.neon.tech"});
        ds.setDatabaseName("tickets");
        ds.setUser("tickets_owner");
        ds.setPassword("npg_khE9Yftrl3SR");
    }
    
    public static Connection getConexion() throws SQLException{
        return ds.getConnection();
    }
}
