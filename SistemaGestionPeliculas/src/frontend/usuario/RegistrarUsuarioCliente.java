/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend.usuario;

import backend.Cliente;
import static frontend.Login.gestorCliente;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class RegistrarUsuarioCliente extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarUsuarioCliente
     */
    public RegistrarUsuarioCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new FondoPanel();
        panelFormularioRegistro = new javax.swing.JPanel();
        tituloID = new javax.swing.JLabel();
        tituloNombre = new javax.swing.JLabel();
        tituloEmail = new javax.swing.JLabel();
        tituloDireccion = new javax.swing.JLabel();
        txtID = new javax.swing.JFormattedTextField();
        txtNombre = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDireccionParte4 = new javax.swing.JTextField();
        txtDireccionParte3 = new javax.swing.JTextField();
        txtDireccionParte2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxDireccion = new javax.swing.JComboBox<>();
        panelTituloRegistro = new javax.swing.JPanel();
        tituloRegistro = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFormularioRegistro.setBackground(new java.awt.Color(71, 160, 209));
        panelFormularioRegistro.setPreferredSize(new java.awt.Dimension(638, 395));

        tituloID.setBackground(new java.awt.Color(242, 167, 48));
        tituloID.setFont(new java.awt.Font("Lucida Sans", 1, 26)); // NOI18N
        tituloID.setForeground(new java.awt.Color(242, 167, 48));
        tituloID.setText("ID:");

        tituloNombre.setBackground(new java.awt.Color(242, 167, 48));
        tituloNombre.setFont(new java.awt.Font("Lucida Sans", 1, 26)); // NOI18N
        tituloNombre.setForeground(new java.awt.Color(242, 167, 48));
        tituloNombre.setText("Nombre:");

        tituloEmail.setBackground(new java.awt.Color(242, 167, 48));
        tituloEmail.setFont(new java.awt.Font("Lucida Sans", 1, 26)); // NOI18N
        tituloEmail.setForeground(new java.awt.Color(242, 167, 48));
        tituloEmail.setText("Email:");

        tituloDireccion.setBackground(new java.awt.Color(242, 167, 48));
        tituloDireccion.setFont(new java.awt.Font("Lucida Sans", 1, 26)); // NOI18N
        tituloDireccion.setForeground(new java.awt.Color(242, 167, 48));
        tituloDireccion.setText("Direccion:");

        txtID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID.setPreferredSize(new java.awt.Dimension(75, 38));
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(75, 38));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(75, 38));

        txtDireccionParte4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDireccionParte4.setPreferredSize(new java.awt.Dimension(75, 38));
        txtDireccionParte4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionParte4KeyTyped(evt);
            }
        });

        txtDireccionParte3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDireccionParte3.setPreferredSize(new java.awt.Dimension(75, 38));
        txtDireccionParte3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionParte3KeyTyped(evt);
            }
        });

        txtDireccionParte2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDireccionParte2.setPreferredSize(new java.awt.Dimension(75, 38));
        txtDireccionParte2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionParte2KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setText("#");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel2.setText("-");

        comboBoxDireccion.setFont(new java.awt.Font("Lucida Sans", 0, 16)); // NOI18N
        comboBoxDireccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calle", "Cra" }));

        javax.swing.GroupLayout panelFormularioRegistroLayout = new javax.swing.GroupLayout(panelFormularioRegistro);
        panelFormularioRegistro.setLayout(panelFormularioRegistroLayout);
        panelFormularioRegistroLayout.setHorizontalGroup(
            panelFormularioRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioRegistroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelFormularioRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tituloNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tituloEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tituloDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(tituloID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormularioRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioRegistroLayout.createSequentialGroup()
                        .addComponent(comboBoxDireccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDireccionParte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addGap(2, 2, 2)
                        .addComponent(txtDireccionParte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(txtDireccionParte4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        panelFormularioRegistroLayout.setVerticalGroup(
            panelFormularioRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormularioRegistroLayout.createSequentialGroup()
                .addGroup(panelFormularioRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormularioRegistroLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelFormularioRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccionParte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionParte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionParte4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(comboBoxDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFormularioRegistroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelFormularioRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(panelFormularioRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(panelFormularioRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(tituloDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );

        panelFondo.add(panelFormularioRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 203, -1, -1));

        panelTituloRegistro.setBackground(new java.awt.Color(71, 160, 209));
        panelTituloRegistro.setPreferredSize(new java.awt.Dimension(638, 133));

        tituloRegistro.setBackground(new java.awt.Color(242, 167, 48));
        tituloRegistro.setFont(new java.awt.Font("Lucida Sans", 1, 54)); // NOI18N
        tituloRegistro.setForeground(new java.awt.Color(242, 167, 48));
        tituloRegistro.setText("<html><center>\nREGISTRARSE \nCOMO CLIENTE</p>\n</html>");

        javax.swing.GroupLayout panelTituloRegistroLayout = new javax.swing.GroupLayout(panelTituloRegistro);
        panelTituloRegistro.setLayout(panelTituloRegistroLayout);
        panelTituloRegistroLayout.setHorizontalGroup(
            panelTituloRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloRegistroLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(tituloRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        panelTituloRegistroLayout.setVerticalGroup(
            panelTituloRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelFondo.add(panelTituloRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 25, -1, -1));

        botonRegistrarse.setBackground(new java.awt.Color(37, 110, 151));
        botonRegistrarse.setFont(new java.awt.Font("Lucida Sans", 1, 20)); // NOI18N
        botonRegistrarse.setForeground(new java.awt.Color(242, 167, 48));
        botonRegistrarse.setText("<html><center> REGISTRARSE");
        botonRegistrarse.setPreferredSize(new java.awt.Dimension(216, 70));
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        panelFondo.add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 620, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtDireccionParte4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionParte4KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionParte4KeyTyped

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        // TODO add your handling code here:
        if (txtNombre.getText().isBlank() || txtEmail.getText().isBlank() || txtDireccionParte2.getText().isBlank() || txtDireccionParte3.getText().isBlank() || txtDireccionParte4.getText().isBlank() || txtID.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos antes de registrarse", "ERROR", 0);
        } else {
            try {
                long id = Long.parseLong(txtID.getText());
                String nombre = txtNombre.getText();
                String email = txtEmail.getText();
                String direccion = comboBoxDireccion.getSelectedItem() + " " + txtDireccionParte2.getText() + " #" + txtDireccionParte3.getText() + "-" + txtDireccionParte4.getText();
                Cliente cli = new Cliente(id, nombre, email, direccion, 0);
                try {
                    gestorCliente.agregar(cli);
                    cliente = cli;
                    InterfazUsuario i = new InterfazUsuario();
                    i.setVisible(true);
                    this.dispose();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void txtDireccionParte2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionParte2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isSpaceChar(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionParte2KeyTyped

    private void txtDireccionParte3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionParte3KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isSpaceChar(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDireccionParte3KeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

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
            java.util.logging.Logger.getLogger(RegistrarUsuarioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarioCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuarioCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JComboBox<String> comboBoxDireccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelFormularioRegistro;
    private javax.swing.JPanel panelTituloRegistro;
    private javax.swing.JLabel tituloDireccion;
    private javax.swing.JLabel tituloEmail;
    private javax.swing.JLabel tituloID;
    private javax.swing.JLabel tituloNombre;
    private javax.swing.JLabel tituloRegistro;
    private javax.swing.JTextField txtDireccionParte2;
    private javax.swing.JTextField txtDireccionParte3;
    private javax.swing.JTextField txtDireccionParte4;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtID;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
