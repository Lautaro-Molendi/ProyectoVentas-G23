
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

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo de Detalle de Venta");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo de venta");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Codigo de Producto");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad");

        jTextCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio");

        jBtnGuardarCambios.setText("Guardar Cambios");
        jBtnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarCambiosActionPerformed(evt);
            }
        });

        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextIdDetalleVta)
                            .addComponent(jTextIdVenta)
                            .addComponent(jTextIdProducto)
                            .addComponent(jTextCantidad)
                            .addComponent(jTextPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jBtnGuardarCambios)
                        .addGap(70, 70, 70)
                        .addComponent(jBtnLimpiar)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIdDetalleVta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardarCambios)
                    .addComponent(jBtnLimpiar))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        limpiarCampos();
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
