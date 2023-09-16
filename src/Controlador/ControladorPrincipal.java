package Controlador;

import Vista.VCreate;
import Vista.VLogin;
import Vista.VPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import rsscalelabel.RSScaleLabel;

/**
 *
 * @author criso
 */
public class ControladorPrincipal implements ActionListener {
    private final VPrincipal frmPrincipal;
    private final VLogin frmLogin;
    private final VCreate frmCreate;
    
    public ControladorPrincipal(VPrincipal frmPrincipal, VLogin frmLogin, VCreate frmCreate) {
        this.frmPrincipal = frmPrincipal;
        this.frmLogin = frmLogin;
        this.frmCreate = frmCreate;
        this.frmPrincipal.menuCrearEncuesta.addActionListener(this);
        
        
        
        
        // Agregar el WindowListener a frmCreate
        this.frmCreate.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frmCreate.dispose();
                frmPrincipal.setLocationRelativeTo(null);
                frmPrincipal.setVisible(true); // Mostrar la vista principal al cerrar frmPro
            }
        });
    }
    
        public void inciar(){
        String path = "src/img/";
        RSScaleLabel.setScaleLabel(frmLogin.jLabel1, path + "login.png");
        frmLogin.setTitle("Login");
        frmLogin.setLocationRelativeTo(null);
        frmPrincipal.setTitle("Principal");
        frmPrincipal.setLocationRelativeTo(null);
        frmCreate.setTitle("Create");
        frmCreate.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==frmPrincipal.menuCrearEncuesta){
            frmCreate.setVisible(true);
            frmPrincipal.setVisible(false);
        }
    }
    
}
