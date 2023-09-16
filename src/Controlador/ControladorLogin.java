package Controlador;

import Modelo.ConsultaEncuestador;
import Modelo.Encuestador;
import Vista.VLogin;
import Vista.VPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author criso
 */
public class ControladorLogin implements ActionListener {
    private final VLogin frmLogin;
    private final VPrincipal frmPrincipal;
    private final Encuestador Encuestador;
    private final ConsultaEncuestador CEncuestador;
    
    public ControladorLogin(VLogin frmLogin, VPrincipal frmPrincipal, Encuestador Encuestador, ConsultaEncuestador CEncuestador) {
        this.frmLogin = frmLogin;
        this.frmPrincipal = frmPrincipal;
        this.Encuestador = Encuestador;
        this.CEncuestador = CEncuestador;
        this.frmLogin.getBtnIngresar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==frmLogin.getBtnIngresar()){
            Encuestador.setEmail(frmLogin.getTxtEmail());
            Encuestador.setPassword(frmLogin.getTxtPassword());
            if(CEncuestador.buscar(Encuestador)){
                JOptionPane.showMessageDialog(null, "¡Encontrador encontrado!", "Satisfactorio", JOptionPane.INFORMATION_MESSAGE);
                frmLogin.setVisible(false);
                frmPrincipal.setLocationRelativeTo(null);
                frmPrincipal.setVisible(true); // Mostrar la vista principal al cerrar frmLogin

            }else{
                JOptionPane.showMessageDialog(null, "¡Encuestador no encontrado!", "Error", JOptionPane.WARNING_MESSAGE);
                frmLogin.setTxtPassword("");
            }
        }

    }
    
}

