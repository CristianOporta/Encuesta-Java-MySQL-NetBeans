/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import Modelo.ConsultasEncuesta;
import Modelo.Encuesta;
import Vista.VCreate;
import Vista.VPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author criso
 */
public class ControladorCreate extends Conexion implements ActionListener {

    private final VPrincipal frmPrincipal;
    private final VCreate frmCreate;
    private final Encuesta Encuesta;
    private final ConsultasEncuesta CEncuesta;

    public ControladorCreate(VPrincipal frmPrincipal, VCreate frmCreate, Encuesta Encuesta, ConsultasEncuesta CEncuesta) {
        this.frmPrincipal = frmPrincipal;
        this.frmCreate = frmCreate;
        this.Encuesta = Encuesta;
        this.CEncuesta = CEncuesta;
        this.frmCreate.getBtnLimpiar().addActionListener(this);
        this.frmCreate.getBtnRegresar().addActionListener(this);
        this.frmCreate.getBtnGuardar().addActionListener(this);

        RellenarComboBox("paises", "detalle", this.frmCreate.cbPaises);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmCreate.getBtnLimpiar()) {
            limpiar();
        }

        if (e.getSource() == frmCreate.getBtnRegresar()) {
            frmCreate.dispose();
            frmPrincipal.setVisible(true);
        }

        if (e.getSource() == frmCreate.getBtnGuardar()) {
            Encuesta.setEncuestadorId(1);

            Encuesta.setEncuestadoNombreCompleto(frmCreate.getTxtNombreCompleto());

            Encuesta.setEncuestadoSexo(frmCreate.getTxtSexo());

            Encuesta.setEncuestadoFechaNacimiento(frmCreate.getTxtFechaNacimiento());

            Encuesta.setEncuestadoCedula(frmCreate.getTxtCedula());

            Encuesta.setEncuestadoDireccion(frmCreate.getTxtDireccion());

            Encuesta.setEncuestadoTelefonos(frmCreate.getTxtTelefonos());

            Encuesta.setEncuestadoCorreosElectronicos(frmCreate.getTxtCorreosElectronicos());

            Encuesta.setEncuestaAreaTrabajo(frmCreate.getTxtAreaTrabajo());

            Encuesta.setEncuestaPalabrasAliento(frmCreate.getTxtPalabrasAliento());

            Encuesta.setEncuestaAgradecimientoProfesores(frmCreate.getTxtAgradecimientoProfesores());

            Encuesta.setEncuestaLugarViajar(frmCreate.getTxtPaises());

            Encuesta.setEncuestaObservacion(frmCreate.getTxtObservacion());

            Encuesta.setEncuestaAreaEspecialParaTrabajar(frmCreate.getTxtAreaEspecialParaTrabajar());

            if (!frmCreate.getTxtSalarioEsperado().isEmpty()) {
                Encuesta.setEncuestaSalarioEsperado(frmCreate.getTxtSalarioEsperado());
            }

            Encuesta.setEncuestaAreaReforzarCursosLibres(frmCreate.getTxtAreaReforzarCursosLibres());

            if (!frmCreate.getTxtPagoMaximoCurso().isEmpty()) {
                Encuesta.setEncuestaPagoMaximoCurso(frmCreate.getTxtPagoMaximoCurso());
            }

            Encuesta.setEncuestaFamilias(frmCreate.getTxtFamilias());

            if (CEncuesta.registrar(Encuesta)) {
                JOptionPane.showMessageDialog(null, "¡Encuesta Agregada!", "Satisfactorio", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al Agregar Encuesta!", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    public void limpiar() {
        frmCreate.setTxtNombreCompleto("");
        frmCreate.setTxtSexo("M");
        frmCreate.setTxtFechaNacimiento("");
        frmCreate.setTxtCedula("");
        frmCreate.setTxtDireccion("");
        frmCreate.setTxtTelefonos("");
        frmCreate.setTxtCorreosElectronicos("");
        frmCreate.setTxtAreaTrabajo("Estatal");
        frmCreate.setTxtPalabrasAliento("");
        frmCreate.setTxtAgradecimientoProfesores("");
        frmCreate.setTxtPaises("Estados Unidos");
        frmCreate.setTxtObservacion("");
        frmCreate.setTxtAreaEspecialParaTrabajar("");
        frmCreate.setTxtSalarioEsperado("");
        frmCreate.setTxtAreaReforzarCursosLibres("");
        frmCreate.setTxtPagoMaximoCurso("");
        frmCreate.setTxtFamilias("");
    }

    public void RellenarComboBox(String tabla, String valor, JComboBox comboBox) {
        String sql = "SELECT " + valor + " FROM " + tabla + " ORDER BY id";

        try (Connection con = getConexion(); PreparedStatement preparedStatement = con.prepareStatement(sql); ResultSet resultSet = preparedStatement.executeQuery()) {

            comboBox.removeAllItems(); // Limpia los elementos previos en el combobox

            while (resultSet.next()) {
                comboBox.addItem(resultSet.getString(valor));
            }

        } catch (SQLException e) {
            // En caso de un error de SQL, muestra el mensaje de error y un cuadro de diálogo de error
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error");
        }

    }

}
