
package proyectoventasg23.Vistas;

import javax.swing.JOptionPane;
import proyectoventasg23.AccesoADatos.*;
import proyectoventasg23.Entidades.*;



        public class ModificarDetalle extends javax.swing.JInternalFrame {
          private DetalleVentaData detalleData;
          private DetalleVenta detalleVenta;
          private VentaData ventaData;
          private Venta venta;
          private Producto producto;
          private ProductoData productoData;
                  
  
    public ModificarDetalle(DetalleVenta detalleSeleccionado) {
        initComponents();
        this.detalleVenta=detalleSeleccionado;
        jTextIdDetalleVta.setText(String.valueOf(detalleVenta.getIdDetalleVenta()));//traigo los datos de detalle de venta
        jTextIdVenta.setText(String.valueOf(detalleVenta.getVenta().getIdVenta()));
        jTextIdProducto.setText(String.valueOf(detalleVenta.getProducto().getIdProducto()));
        jTextCantidad.setText(String.valueOf(detalleVenta.getCantidad()));
        jTextPrecio.setText(String.valueOf(detalleVenta.getPrecioVenta()));
        
        ventaData= new VentaData();
        detalleData = new DetalleVentaData();
        productoData = new ProductoData();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextIdDetalleVta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextIdVenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextIdProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        jBtnGuardarCambios = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Detalle de Venta");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextIdDetalleVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 44, 201, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo de Detalle de Venta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 46, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo de venta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 88, -1, -1));
        jPanel1.add(jTextIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 86, 201, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Codigo de Producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 130, -1, -1));
        jPanel1.add(jTextIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 128, 201, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 172, -1, -1));

        jTextCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(jTextCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 170, 201, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 214, -1, -1));
        jPanel1.add(jTextPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 212, 201, -1));

        jBtnGuardarCambios.setText("Guardar Cambios");
        jBtnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 285, -1, -1));

        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 285, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarCambiosActionPerformed
        try {
        int idDetalleVenta = Integer.parseInt(jTextIdDetalleVta.getText());//para traer los datos modificados
        int idVenta = Integer.parseInt(jTextIdVenta.getText());
        int idProducto = Integer.parseInt(jTextIdProducto.getText());
        int cantidad = Integer.parseInt(jTextCantidad.getText());
        double precioVenta = Double.parseDouble(jTextPrecio.getText());

        // Crear un objeto DetalleVenta con los datos modificados
        venta= new Venta(idVenta);
        producto=new Producto(idProducto);
        DetalleVenta detalleModificado = new DetalleVenta(idDetalleVenta,venta, producto, cantidad, precioVenta);

      
        detalleData.modificarDetalleVenta(detalleModificado);//para actualizar el detalle
        
        JOptionPane.showMessageDialog(this, "Detalle de venta actualizado correctamente");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Datos no válidos");
    }
       
    }//GEN-LAST:event_jBtnGuardarCambiosActionPerformed

    private void jTextCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidadActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
         limpiarCampos();
       
    }//GEN-LAST:event_jBtnLimpiarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardarCambios;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextIdDetalleVta;
    private javax.swing.JTextField jTextIdProducto;
    private javax.swing.JTextField jTextIdVenta;
    private javax.swing.JTextField jTextPrecio;
    // End of variables declaration//GEN-END:variables
        public void limpiarCampos(){
         jTextIdDetalleVta.setText("");
            jTextIdVenta.setText("");
        jTextIdProducto.setText("");
        jTextCantidad.setText("");
        jTextPrecio.setText("");
        }
        }
