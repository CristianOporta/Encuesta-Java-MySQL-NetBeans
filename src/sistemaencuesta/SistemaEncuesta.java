/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaencuesta;

import Controlador.ControladorCreate;
import Controlador.ControladorLogin;
import Controlador.ControladorPrincipal;
import Modelo.ConsultaEncuestador;
import Modelo.ConsultasEncuesta;
import Modelo.Encuesta;
import Modelo.Encuestador;
import Vista.VCreate;
import Vista.VLogin;
import Vista.VPrincipal;

/**
 *
 * @author criso
 */
public class SistemaEncuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Modelo
        Encuestador Encuestador = new Encuestador();
        ConsultaEncuestador CEncuestador = new ConsultaEncuestador(); 
        //-------
        Encuesta Encuesta = new Encuesta();
        ConsultasEncuesta CEncuesta = new ConsultasEncuesta();
        
        
        // Vista
        VLogin frmLogin = new VLogin();  
        //-------
        VPrincipal frmPrincipal = new VPrincipal();
        //-------
        VCreate frmCreate = new VCreate();
        
        
        
        // Controlador
        ControladorLogin ctrlLogin = new ControladorLogin(frmLogin, frmPrincipal, Encuestador, CEncuestador);
        //-------
        ControladorPrincipal ctrlPrincipal = new ControladorPrincipal(frmPrincipal, frmLogin, frmCreate);
        //-------
        ControladorCreate ctrlCreate = new ControladorCreate(frmPrincipal, frmCreate, Encuesta, CEncuesta);
        
        
        
        // Inica la vista principal
        ctrlPrincipal.inciar();
        frmLogin.setVisible(true);
    }
}
