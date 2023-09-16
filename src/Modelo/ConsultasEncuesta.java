/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author criso
 */
public class ConsultasEncuesta extends Conexion {

    // Metodo Registrar
    public boolean registrar(Encuesta encuesta) {
        Connection con = getConexion();
        String sql = "CALL AgregarEncuesta(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, encuesta.getEncuestadorId());
            ps.setString(2, encuesta.getEncuestadoSexo());
            ps.setString(3, encuesta.getEncuestadoNombreCompleto());
            ps.setString(4, encuesta.getEncuestadoFechaNacimiento());
            ps.setString(5, encuesta.getEncuestadoCedula());
            ps.setString(6, encuesta.getEncuestadoDireccion());
            ps.setString(7, encuesta.getEncuestadoTelefonos());
            ps.setString(8, encuesta.getEncuestadoCorreosElectronicos());
            ps.setString(9, encuesta.getEncuestaAreaTrabajo());
            ps.setString(10, encuesta.getEncuestaPalabrasAliento());
            ps.setString(11, encuesta.getEncuestaAgradecimientoProfesores());
            ps.setString(12, encuesta.getEncuestaLugarViajar());
            ps.setString(13, encuesta.getEncuestaObservacion());
            ps.setString(14, encuesta.getEncuestaAreaEspecialParaTrabajar());
            ps.setString(15, encuesta.getEncuestaSalarioEsperado());
            ps.setString(16, encuesta.getEncuestaAreaReforzarCursosLibres());
            ps.setString(17, encuesta.getEncuestaPagoMaximoCurso());
            ps.setString(18, encuesta.getEncuestaFamilias());
            ps.execute();
            return true;
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
