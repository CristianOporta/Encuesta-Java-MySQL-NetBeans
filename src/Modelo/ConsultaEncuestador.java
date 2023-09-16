package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author criso
 */
public class ConsultaEncuestador extends Conexion {
    // Metodo Buscar
    public boolean buscar(Encuestador p) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "SELECT * FROM encuestador WHERE email=? AND password=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getEmail());
            ps.setString(2, p.getPassword());
            rs = ps.executeQuery();
            if (rs.next()) {
                return true; // Credenciales válidas
            }
            return false; // Credenciales incorrectas
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    //------------------------------------------
}
