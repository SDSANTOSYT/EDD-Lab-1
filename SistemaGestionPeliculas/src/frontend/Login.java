/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.Cliente;
import backend.GestorClientes;
import backend.GestorCompras;
import backend.GestorPeliculas;
import backend.Reporte;
import frontend.admin.InterfazAdmin;
import frontend.usuario.InterfazUsuario;
import frontend.usuario.RegistrarUsuarioCliente;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public static GestorClientes gestorCliente;
    public static GestorCompras gestorCompras;
    public static GestorPeliculas gestorPeliculas;
    public static Reporte generadorReporte;
    public static Cliente cliente;

    public Login() {
        gestorCliente = new GestorClientes("clientes");
        gestorCompras = new GestorCompras("compras");
        gestorPeliculas = new GestorPeliculas("peliculas");
        generadorReporte = new Reporte();
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
        lblTitulo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        tFieldUsuario = new javax.swing.JTextField();
        pFieldContraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(71, 160, 209));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 160, 209)));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(242, 167, 48));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("<html><center>Inicio de Sesión</center></html>");
        lblTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 160, 209)));
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 300, 80));

        lblUsuario.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 20)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario: ");
        lblUsuario.setMaximumSize(new java.awt.Dimension(150, 30));
        lblUsuario.setMinimumSize(new java.awt.Dimension(150, 30));
        lblUsuario.setPreferredSize(new java.awt.Dimension(140, 30));
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 140, 30));

        lblContraseña.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 20)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setText("Contraseña: ");
        lblContraseña.setMaximumSize(new java.awt.Dimension(150, 30));
        lblContraseña.setMinimumSize(new java.awt.Dimension(150, 30));
        lblContraseña.setPreferredSize(new java.awt.Dimension(140, 30));
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 140, 30));

        tFieldUsuario.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        tFieldUsuario.setPreferredSize(new java.awt.Dimension(140, 30));
        getContentPane().add(tFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 160, 30));

        pFieldContraseña.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        pFieldContraseña.setPreferredSize(new java.awt.Dimension(140, 30));
        getContentPane().add(pFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 160, 30));

        btnIngresar.setBackground(new java.awt.Color(71, 160, 209));
        btnIngresar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(242, 167, 48));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 420, 150, 50));

        lblBackground.setIcon(new ImageIcon("src/frontend/usuario/media/fondoLogin.png"));
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (tFieldUsuario.getText().isEmpty() || pFieldContraseña.getPassword() == null || String.copyValueOf(pFieldContraseña.getPassword()).equals("") || tFieldUsuario.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Usted tiene campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (tFieldUsuario.getText().equalsIgnoreCase("Admin") && String.valueOf(pFieldContraseña.getPassword()).equals("Admin")) {
                new InterfazAdmin().setVisible(true);
                this.dispose();
                tFieldUsuario.setText("");
                pFieldContraseña.setText("");
            } else {
                try {
                    Long usuario = Long.valueOf(tFieldUsuario.getText());
                    Long password = Long.valueOf(String.valueOf(pFieldContraseña.getPassword()));
                    Boolean est = false;
                    for (Cliente cli : gestorCliente.getClientes().values()) {
                        if (usuario == cli.getId() && password == cli.getId()) {
                            est = true;
                            cliente = cli;
                            new InterfazUsuario().setVisible(true);
                            this.dispose();
                            break;
                        } else if (usuario == cli.getId()) {
                            est = true;
                            JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                            pFieldContraseña.setText("");
                            break;
                        }
                    }
                    if (!est) {
                        switch (JOptionPane.showConfirmDialog(null, "Usuario no encontrado. \n Desea registrarse?", "Error", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) {
                            case 0:
                                new RegistrarUsuarioCliente().setVisible(true);
                                this.dispose();
                                break;
                            case 1:
                                tFieldUsuario.setText("");
                                pFieldContraseña.setText("");
                                break;
                        }
                        tFieldUsuario.setText("");
                        pFieldContraseña.setText("");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error con alguno de los campos ingresados", "Error", JOptionPane.ERROR_MESSAGE);
                    tFieldUsuario.setText("");
                    pFieldContraseña.setText("");
                }
            }
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login lg = new Login();
                lg.setLocationRelativeTo(null);
                lg.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pFieldContraseña;
    private javax.swing.JTextField tFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
