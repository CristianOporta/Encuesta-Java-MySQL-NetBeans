/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author criso
 */
public class VPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VPrincipal
     */
    public VPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuSalir = new javax.swing.JMenuItem();
        menuCRUD = new javax.swing.JMenu();
        menuCrearEncuesta = new javax.swing.JMenuItem();
        menuBuscarEncuesta = new javax.swing.JMenuItem();
        menuActualizarEncuesta = new javax.swing.JMenuItem();
        menuEliminarEncuesta = new javax.swing.JMenuItem();
        menuReporte = new javax.swing.JMenu();
        menuEncuestasRegistradas = new javax.swing.JMenuItem();
        menuEncuestasPalabrasC = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 230));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menuArchivo.setText("Archivo");
        menuArchivo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        menuSalir.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon.png"))); // NOI18N
        menuSalir.setText("Salir");
        menuArchivo.add(menuSalir);

        jMenuBar1.add(menuArchivo);

        menuCRUD.setText("CRUD");
        menuCRUD.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        menuCrearEncuesta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        menuCrearEncuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        menuCrearEncuesta.setText("Crear Encuesta");
        menuCRUD.add(menuCrearEncuesta);

        menuBuscarEncuesta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        menuBuscarEncuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        menuBuscarEncuesta.setText("Buscar Encuesta");
        menuCRUD.add(menuBuscarEncuesta);

        menuActualizarEncuesta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        menuActualizarEncuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        menuActualizarEncuesta.setText("Actualizar Encuesta");
        menuCRUD.add(menuActualizarEncuesta);

        menuEliminarEncuesta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        menuEliminarEncuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        menuEliminarEncuesta.setText("Eliminar Encuesta");
        menuCRUD.add(menuEliminarEncuesta);

        jMenuBar1.add(menuCRUD);

        menuReporte.setText("Reporte");
        menuReporte.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        menuEncuestasRegistradas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        menuEncuestasRegistradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/report.png"))); // NOI18N
        menuEncuestasRegistradas.setText("Encuestas Registradas");
        menuReporte.add(menuEncuestasRegistradas);

        menuEncuestasPalabrasC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        menuEncuestasPalabrasC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/report.png"))); // NOI18N
        menuEncuestasPalabrasC.setText("Encuestas de Palabras a sus Compañeros");
        menuReporte.add(menuEncuestasPalabrasC);

        jMenuBar1.add(menuReporte);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JMenuItem menuActualizarEncuesta;
    private javax.swing.JMenu menuArchivo;
    public javax.swing.JMenuItem menuBuscarEncuesta;
    private javax.swing.JMenu menuCRUD;
    public javax.swing.JMenuItem menuCrearEncuesta;
    public javax.swing.JMenuItem menuEliminarEncuesta;
    public javax.swing.JMenuItem menuEncuestasPalabrasC;
    public javax.swing.JMenuItem menuEncuestasRegistradas;
    private javax.swing.JMenu menuReporte;
    public javax.swing.JMenuItem menuSalir;
    // End of variables declaration//GEN-END:variables
}