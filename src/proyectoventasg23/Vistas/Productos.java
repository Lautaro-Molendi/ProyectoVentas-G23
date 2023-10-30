
package proyectoventasg23.Vistas;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import proyectoventasg23.AccesoADatos.ProductoData;
import proyectoventasg23.Entidades.Producto;

public class Productos extends javax.swing.JInternalFrame {

    private ProductoData proData = new ProductoData();
    private Producto nuevoPro = null;
   // JInternalFrame vistaProducto = new JInternalFrame();

    public Productos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jpEscritorio = new javax.swing.JPanel();
        jNombre = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jDescripcion = new javax.swing.JLabel();
        jTextDescrip = new javax.swing.JTextField();
        jPrecio = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        jStock = new javax.swing.JLabel();
        jTextStock = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbMod = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setBorder(null);
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administración de Productos");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jpEscritorio.setBackground(new java.awt.Color(255, 153, 153));
        jpEscritorio.setMinimumSize(new java.awt.Dimension(800, 600));
        jpEscritorio.setPreferredSize(new java.awt.Dimension(800, 600));
        jpEscritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jNombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jNombre.setForeground(new java.awt.Color(0, 0, 0));
        jNombre.setText("Nombre");
        jpEscritorio.add(jNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 87, -1, -1));
        jpEscritorio.add(jTextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 85, 246, -1));

        jDescripcion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jDescripcion.setText("Descripción");
        jpEscritorio.add(jDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 129, -1, -1));
        jpEscritorio.add(jTextDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 127, 246, -1));

        jPrecio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jPrecio.setText("Precio");
        jpEscritorio.add(jPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 172, 81, 16));
        jpEscritorio.add(jTextPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 169, 246, -1));

        jStock.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jStock.setForeground(new java.awt.Color(0, 0, 0));
        jStock.setText("Stock");
        jpEscritorio.add(jStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 213, 81, -1));
        jpEscritorio.add(jTextStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 211, 246, -1));

        jbGuardar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jpEscritorio.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        jbMod.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jbMod.setText("Modificar");
        jbMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModActionPerformed(evt);
            }
        });
        jpEscritorio.add(jbMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        jBtnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });
        jpEscritorio.add(jBtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModActionPerformed

        ModificarProducto vistaModPro = new ModificarProducto();
        menuPpal.escritorio.add(vistaModPro);
        vistaModPro.setVisible(true);
        vistaModPro.moveToFront();
    }//GEN-LAST:event_jbModActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        try {
            String nombre = jTextNombre.getText();
            String descripcion = jTextDescrip.getText();
            Double precio = Double.parseDouble(jTextPrecio.getText());
            Integer stock = Integer.parseInt(jTextStock.getText());
            if (nombre.isEmpty() || descripcion.isEmpty() || precio.equals(0) || stock.equals(0)) {
                JOptionPane.showMessageDialog(this, "no puede haber campos vacios");
            }
            if (nuevoPro == null) {
                nuevoPro = new Producto(nombre, descripcion, precio, stock, true);
                proData.guardarProducto(nuevoPro);

            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "no se pudo ingresar a la tabla");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        limpiarCampos();
        nuevoPro = null;
    }//GEN-LAST:event_jBtnLimpiarActionPerformed
    private void limpiarCampos() {
        jTextNombre.setText("");
        jTextDescrip.setText("");
        jTextPrecio.setText("");
        jTextStock.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JLabel jDescripcion;
    private javax.swing.JLabel jNombre;
    private javax.swing.JLabel jPrecio;
    private javax.swing.JLabel jStock;
    private javax.swing.JTextField jTextDescrip;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextStock;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbMod;
    private javax.swing.JPanel jpEscritorio;
    // End of variables declaration//GEN-END:variables
}
