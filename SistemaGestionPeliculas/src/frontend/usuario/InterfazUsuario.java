/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend.usuario;

import backend.Compra;
import backend.Pelicula;
import static frontend.Login.gestorCompras;
import static frontend.Login.gestorPeliculas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebas
 */
public class InterfazUsuario extends javax.swing.JFrame {

    /**
     * Creates new form Catalogo
     */
    
    public ArrayList<Pelicula> peliculasEnCarrito;
    
    public void rellenarTablaCatalogo(){
        String nombresColumnas[] = {"ID","Titulo","Director","Año","Genero","Precio"};
        List<Pelicula> listaPeliculas = new ArrayList<>(gestorPeliculas.getPeliculas().values());
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        model.setColumnIdentifiers(nombresColumnas);
        for (Pelicula pelicula : listaPeliculas) {
            model.addRow(new Object[]{pelicula.getId(),pelicula.getTitulo(),pelicula.getDirector(),pelicula.getYear(),pelicula.getGenero(),pelicula.getPrecio()});
        }
        tablaPeliculas.setModel(model);
    }
    
    public void rellenarTablaCarrito(){
        String nombresColumnas[] = {"ID","Titulo","Director","Año","Genero","Precio"};
        List<Pelicula> listaPeliculas = peliculasEnCarrito;
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        model.setColumnIdentifiers(nombresColumnas);
        for (Pelicula pelicula : listaPeliculas) {
            model.addRow(new Object[]{pelicula.getId(),pelicula.getTitulo(),pelicula.getDirector(),pelicula.getYear(),pelicula.getGenero(),pelicula.getPrecio()});
        }
        tablaPeliculas.setModel(model);
        
    }
    
    public void mostrarCatalogo() {
        titulo.setText("CATALOGO");
        botonAgregarAlCarrito2.setVisible(false);
        botonAgregarAlCarrito1.setVisible(true);
        botonBuscarPorTitulo.setVisible(false);
        botonBuscarPorDirector.setVisible(false);
        botonBuscarPorGenero.setVisible(false);
        botonEliminar.setVisible(false);
        botonFinalizarCompra.setVisible(false);
        rellenarTablaCatalogo();
    }

    public void mostrarBuscar() {

        titulo.setText("BUSCAR PELICULA");
        botonAgregarAlCarrito2.setVisible(true);
        botonAgregarAlCarrito1.setVisible(false);
        botonBuscarPorTitulo.setVisible(true);
        botonBuscarPorDirector.setVisible(true);
        botonBuscarPorGenero.setVisible(true);
        botonEliminar.setVisible(false);
        botonFinalizarCompra.setVisible(false);
        rellenarTablaCatalogo();
    }

    public void mostrarCarrito() {
        titulo.setText("CARRITO");
        botonAgregarAlCarrito2.setVisible(false);
        botonAgregarAlCarrito1.setVisible(false);
        botonBuscarPorTitulo.setVisible(false);
        botonBuscarPorDirector.setVisible(false);
        botonBuscarPorGenero.setVisible(false);
        botonEliminar.setVisible(true);
        botonFinalizarCompra.setVisible(true);
        rellenarTablaCarrito();
    }

    public InterfazUsuario() {
        initComponents();
        mostrarCatalogo();
        rellenarTablaCatalogo();
        peliculasEnCarrito = new ArrayList<>();
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
        panelNavegable = new javax.swing.JPanel();
        botonBusqueda = new javax.swing.JButton();
        botonCatalogo = new javax.swing.JButton();
        botonCarrito = new javax.swing.JButton();
        panelTitulo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPeliculas = new javax.swing.JTable();
        botonAgregarAlCarrito2 = new javax.swing.JButton();
        botonBuscarPorTitulo = new javax.swing.JButton();
        botonBuscarPorGenero = new javax.swing.JButton();
        botonBuscarPorDirector = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonFinalizarCompra = new javax.swing.JButton();
        botonAgregarAlCarrito1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNavegable.setPreferredSize(new java.awt.Dimension(91, 645));
        panelNavegable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBusqueda.setIcon(new ImageIcon("src/frontend/usuario/media/iconoBusqueda.png"));
        botonBusqueda.setBorder(null);
        botonBusqueda.setPreferredSize(new java.awt.Dimension(84, 84));
        botonBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBusquedaActionPerformed(evt);
            }
        });
        panelNavegable.add(botonBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 101, -1, -1));

        botonCatalogo.setIcon(new ImageIcon("src/frontend/usuario/media/iconoCatalogo.png"));
        botonCatalogo.setBorder(null);
        botonCatalogo.setPreferredSize(new java.awt.Dimension(84, 84));
        botonCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCatalogoActionPerformed(evt);
            }
        });
        panelNavegable.add(botonCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        botonCarrito.setIcon(new ImageIcon("src/frontend/usuario/media/iconoCarrito.png"));
        botonCarrito.setBorder(null);
        botonCarrito.setPreferredSize(new java.awt.Dimension(84, 84));
        botonCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCarritoActionPerformed(evt);
            }
        });
        panelNavegable.add(botonCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 465, -1, -1));

        panelFondo.add(panelNavegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 37, 90, -1));

        panelTitulo.setBackground(new java.awt.Color(71, 160, 209));
        panelTitulo.setPreferredSize(new java.awt.Dimension(667, 102));

        titulo.setBackground(new java.awt.Color(242, 167, 48));
        titulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 54)); // NOI18N
        titulo.setForeground(new java.awt.Color(242, 167, 48));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("<html><center>CATALOGO</center></html>");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        panelFondo.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 47, -1, -1));

        panelTabla.setPreferredSize(new java.awt.Dimension(1057, 373));

        tablaPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPeliculas.setShowGrid(false);
        jScrollPane1.setViewportView(tablaPeliculas);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelFondo.add(panelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 194, -1, -1));

        botonAgregarAlCarrito2.setBackground(new java.awt.Color(46, 137, 187));
        botonAgregarAlCarrito2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        botonAgregarAlCarrito2.setForeground(new java.awt.Color(220, 140, 13));
        botonAgregarAlCarrito2.setText("<html><center> AÑADIR AL <br>CARRITO");
        botonAgregarAlCarrito2.setPreferredSize(new java.awt.Dimension(216, 70));
        botonAgregarAlCarrito2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarAlCarrito2ActionPerformed(evt);
            }
        });
        panelFondo.add(botonAgregarAlCarrito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 600, -1, -1));

        botonBuscarPorTitulo.setBackground(new java.awt.Color(46, 137, 187));
        botonBuscarPorTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        botonBuscarPorTitulo.setForeground(new java.awt.Color(227, 145, 12));
        botonBuscarPorTitulo.setText("<html><center> BUSCAR POR <br>TITULO");
        botonBuscarPorTitulo.setPreferredSize(new java.awt.Dimension(216, 70));
        panelFondo.add(botonBuscarPorTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 600, -1, -1));

        botonBuscarPorGenero.setBackground(new java.awt.Color(46, 137, 187));
        botonBuscarPorGenero.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        botonBuscarPorGenero.setForeground(new java.awt.Color(220, 140, 13));
        botonBuscarPorGenero.setText("<html><center> BUSCAR POR <br>GENERO");
        botonBuscarPorGenero.setPreferredSize(new java.awt.Dimension(216, 70));
        panelFondo.add(botonBuscarPorGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 600, -1, -1));

        botonBuscarPorDirector.setBackground(new java.awt.Color(46, 137, 187));
        botonBuscarPorDirector.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        botonBuscarPorDirector.setForeground(new java.awt.Color(220, 140, 13));
        botonBuscarPorDirector.setText("<html><center> BUSCAR POR DIRECTOR");
        botonBuscarPorDirector.setPreferredSize(new java.awt.Dimension(216, 70));
        panelFondo.add(botonBuscarPorDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, -1, -1));

        botonEliminar.setBackground(new java.awt.Color(46, 137, 187));
        botonEliminar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(220, 140, 13));
        botonEliminar.setText("<html><center> ELIMINAR");
        botonEliminar.setPreferredSize(new java.awt.Dimension(216, 70));
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        panelFondo.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 600, -1, -1));

        botonFinalizarCompra.setBackground(new java.awt.Color(46, 137, 187));
        botonFinalizarCompra.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        botonFinalizarCompra.setForeground(new java.awt.Color(220, 140, 13));
        botonFinalizarCompra.setText("<html><center> FINALIZAR <br>COMPRA");
        botonFinalizarCompra.setPreferredSize(new java.awt.Dimension(216, 70));
        botonFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarCompraActionPerformed(evt);
            }
        });
        panelFondo.add(botonFinalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, -1, -1));

        botonAgregarAlCarrito1.setBackground(new java.awt.Color(46, 137, 187));
        botonAgregarAlCarrito1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        botonAgregarAlCarrito1.setForeground(new java.awt.Color(220, 140, 13));
        botonAgregarAlCarrito1.setText("<html><center> AÑADIR AL <br>CARRITO");
        botonAgregarAlCarrito1.setPreferredSize(new java.awt.Dimension(216, 70));
        botonAgregarAlCarrito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarAlCarrito1ActionPerformed(evt);
            }
        });
        panelFondo.add(botonAgregarAlCarrito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 600, -1, -1));

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

    private void botonBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBusquedaActionPerformed
        // TODO add your handling code here:

        mostrarBuscar();
    }//GEN-LAST:event_botonBusquedaActionPerformed

    private void botonCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCatalogoActionPerformed
        // TODO add your handling code here:
        mostrarCatalogo();
    }//GEN-LAST:event_botonCatalogoActionPerformed

    private void botonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCarritoActionPerformed
        // TODO add your handling code here:
        mostrarCarrito();
    }//GEN-LAST:event_botonCarritoActionPerformed

    private void botonAgregarAlCarrito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarAlCarrito1ActionPerformed
        // TODO add your handling code here:
        try {
            long id =  (long) tablaPeliculas.getModel().getValueAt(tablaPeliculas.getSelectedRow(), 0);
            peliculasEnCarrito.add(gestorPeliculas.getPeliculas().get(id));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_botonAgregarAlCarrito1ActionPerformed

    private void botonAgregarAlCarrito2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarAlCarrito2ActionPerformed
        // TODO add your handling code here:
        try {
            long id = (long) tablaPeliculas.getModel().getValueAt(tablaPeliculas.getSelectedRow(), 0);
            peliculasEnCarrito.add(gestorPeliculas.getPeliculas().get(id));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_botonAgregarAlCarrito2ActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        try {
            long id = (long) tablaPeliculas.getModel().getValueAt(tablaPeliculas.getSelectedRow(), 0);
            peliculasEnCarrito.remove(gestorPeliculas.getPeliculas().get(id));
            rellenarTablaCarrito();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarCompraActionPerformed
        // TODO add your handling code here:
        try {
            for (Pelicula pelicula : peliculasEnCarrito) {
                Compra com = new  Compra(0, cliente.getId(), pelicula.getId(), LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                gestorCompras.agregar(com);
            }
            peliculasEnCarrito.removeAll(peliculasEnCarrito);
            rellenarTablaCarrito();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_botonFinalizarCompraActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarAlCarrito1;
    private javax.swing.JButton botonAgregarAlCarrito2;
    private javax.swing.JButton botonBuscarPorDirector;
    private javax.swing.JButton botonBuscarPorGenero;
    private javax.swing.JButton botonBuscarPorTitulo;
    private javax.swing.JButton botonBusqueda;
    private javax.swing.JButton botonCarrito;
    private javax.swing.JButton botonCatalogo;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonFinalizarCompra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelNavegable;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTable tablaPeliculas;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
