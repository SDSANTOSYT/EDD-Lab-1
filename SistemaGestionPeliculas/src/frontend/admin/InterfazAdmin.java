/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend.admin;

import backend.Compra;
import backend.GestorClientes;
import backend.GestorCompras;
import frontend.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class InterfazAdmin extends javax.swing.JFrame {

    /**
     * Creates new form InterfazAdmin
     */
    public InterfazAdmin() {
        initComponents();
        //this.setLocationRelativeTo(null);
    }
    static String ID;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        VolverButton = new javax.swing.JButton();
        ClienteText = new javax.swing.JLabel();
        ClienteButton = new javax.swing.JButton();
        CompraText = new javax.swing.JLabel();
        VerClientesText = new javax.swing.JLabel();
        VerClientesButton = new javax.swing.JButton();
        CompraButton = new javax.swing.JButton();
        VerCompraText = new javax.swing.JLabel();
        VerComprasButton = new javax.swing.JButton();
        VerPeliculasText = new javax.swing.JLabel();
        VerPeliculasButton = new javax.swing.JButton();
        CompraText1 = new javax.swing.JLabel();
        CompraButton1 = new javax.swing.JButton();
        panelTitulo = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo1.setBackground(new java.awt.Color(242, 167, 48));
        titulo1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(242, 167, 48));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Volver");
        jPanel1.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 550, 200, 50));

        VolverButton.setBackground(new java.awt.Color(71, 160, 209));
        VolverButton.setBorder(null);
        VolverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonActionPerformed(evt);
            }
        });
        jPanel1.add(VolverButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 160, 50));

        ClienteText.setBackground(new java.awt.Color(242, 167, 48));
        ClienteText.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        ClienteText.setForeground(new java.awt.Color(242, 167, 48));
        ClienteText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClienteText.setText("<html><center>Buscar Cliente</center></html>");
        jPanel1.add(ClienteText, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 200, 50));

        ClienteButton.setBackground(new java.awt.Color(71, 160, 209));
        ClienteButton.setBorder(null);
        ClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ClienteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 220, 70));

        CompraText.setBackground(new java.awt.Color(242, 167, 48));
        CompraText.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        CompraText.setForeground(new java.awt.Color(242, 167, 48));
        CompraText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CompraText.setText("<html><center>Buscar Compra</center></html>");
        jPanel1.add(CompraText, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 210, 50));

        VerClientesText.setBackground(new java.awt.Color(242, 167, 48));
        VerClientesText.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        VerClientesText.setForeground(new java.awt.Color(242, 167, 48));
        VerClientesText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VerClientesText.setText("<html><center>Ver Clientes</center></html>");
        jPanel1.add(VerClientesText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 210, 50));

        VerClientesButton.setBackground(new java.awt.Color(71, 160, 209));
        VerClientesButton.setBorder(null);
        VerClientesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerClientesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(VerClientesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 220, 70));

        CompraButton.setBackground(new java.awt.Color(71, 160, 209));
        CompraButton.setBorder(null);
        CompraButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompraButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CompraButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 220, 70));

        VerCompraText.setBackground(new java.awt.Color(242, 167, 48));
        VerCompraText.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        VerCompraText.setForeground(new java.awt.Color(242, 167, 48));
        VerCompraText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VerCompraText.setText("<html><center>Ver Compras</center></html>");
        jPanel1.add(VerCompraText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, 50));

        VerComprasButton.setBackground(new java.awt.Color(71, 160, 209));
        VerComprasButton.setBorder(null);
        VerComprasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerComprasButtonActionPerformed(evt);
            }
        });
        jPanel1.add(VerComprasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 220, 70));

        VerPeliculasText.setBackground(new java.awt.Color(242, 167, 48));
        VerPeliculasText.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        VerPeliculasText.setForeground(new java.awt.Color(242, 167, 48));
        VerPeliculasText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VerPeliculasText.setText("<html><center>Ver Películas</center></html>");
        jPanel1.add(VerPeliculasText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 210, 50));

        VerPeliculasButton.setBackground(new java.awt.Color(71, 160, 209));
        VerPeliculasButton.setBorder(null);
        VerPeliculasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPeliculasButtonActionPerformed(evt);
            }
        });
        jPanel1.add(VerPeliculasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 220, 70));

        CompraText1.setBackground(new java.awt.Color(242, 167, 48));
        CompraText1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        CompraText1.setForeground(new java.awt.Color(242, 167, 48));
        CompraText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CompraText1.setText("<html><center>Reportes</center></html>");
        jPanel1.add(CompraText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 210, 50));

        CompraButton1.setBackground(new java.awt.Color(71, 160, 209));
        CompraButton1.setBorder(null);
        CompraButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompraButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(CompraButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 220, 70));

        panelTitulo.setBackground(new java.awt.Color(71, 160, 209));
        panelTitulo.setPreferredSize(new java.awt.Dimension(667, 102));
        panelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo2.setBackground(new java.awt.Color(242, 167, 48));
        titulo2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 54)); // NOI18N
        titulo2.setForeground(new java.awt.Color(242, 167, 48));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("<html><center>ADMIN</center></html>");
        panelTitulo.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 102));

        jPanel1.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 390, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/usuario/media/Imagen de fondo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteButtonActionPerformed
        ID = null;
        ID = JOptionPane.showInputDialog(this, "Ingrese el ID del cliente que busca", "Buscar por ID", 3);
        if (ID == null) {
            JOptionPane.showMessageDialog(null, "ID inválido", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            new InterfazResultado().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_ClienteButtonActionPerformed

    private void CompraButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompraButtonActionPerformed
        ID = null;
        ID = JOptionPane.showInputDialog(this, "Ingrese el ID del cliente que busca", "Buscar por ID", 3);
        if (ID == null) {
            JOptionPane.showMessageDialog(null, "ID inválido", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            new InterfazResultado().setVisible(true);
            this.dispose();

        }

    }//GEN-LAST:event_CompraButtonActionPerformed

    private void VolverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_VolverButtonActionPerformed

    private void VerComprasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerComprasButtonActionPerformed
        new VerCompras().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VerComprasButtonActionPerformed

    private void VerClientesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerClientesButtonActionPerformed
        new VerClientes().setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_VerClientesButtonActionPerformed

    private void VerPeliculasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPeliculasButtonActionPerformed
        new VerPeliculas().setVisible(true);
        this.dispose();    }//GEN-LAST:event_VerPeliculasButtonActionPerformed

    private void CompraButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompraButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompraButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClienteButton;
    private javax.swing.JLabel ClienteText;
    private javax.swing.JButton CompraButton;
    private javax.swing.JButton CompraButton1;
    private javax.swing.JLabel CompraText;
    private javax.swing.JLabel CompraText1;
    private javax.swing.JButton VerClientesButton;
    private javax.swing.JLabel VerClientesText;
    private javax.swing.JLabel VerCompraText;
    private javax.swing.JButton VerComprasButton;
    private javax.swing.JButton VerPeliculasButton;
    private javax.swing.JLabel VerPeliculasText;
    private javax.swing.JButton VolverButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
