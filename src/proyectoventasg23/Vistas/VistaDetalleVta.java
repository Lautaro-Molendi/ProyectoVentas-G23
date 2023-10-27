
package proyectoventasg23.Vistas;

import javax.swing.JOptionPane;
import proyectoventasg23.AccesoADatos.*;
import proyectoventasg23.Entidades.*;


public class VistaDetalleVta extends javax.swing.JInternalFrame {
        
    DetalleVenta nuevoDet= new DetalleVenta();
    DetalleVentaData detalleData= new DetalleVentaData();
    
    public VistaDetalleVta() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextIdVenta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextPrecio = new javax.swing.JTextField();
        jBtnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextIdDetalle = new javax.swing.JTextField();
        jBtnNuevo = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBTnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Detalles de Venta");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jTextIdVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdVentaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Codigo de venta");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Producto");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Precio");

        jBtnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Codigo de Detalle");

        jBtnNuevo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnNuevo.setText("Nuevo Detalle");
        jBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoActionPerformed(evt);
            }
        });

        jBtnModificar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnModificar.setText("Modificar");
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });

        jBtnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBTnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBTnLimpiar.setText("Limpiar");
        jBTnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(jTextIdDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jBtnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jBtnNuevo)
                .addGap(18, 18, 18)
                .addComponent(jBtnModificar)
                .addGap(18, 18, 18)
                .addComponent(jBtnEliminar)
                .addGap(18, 18, 18)
                .addComponent(jBTnLimpiar)
                .addGap(0, 108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextIdDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTnLimpiar)
                    .addComponent(jBtnEliminar)
                    .addComponent(jBtnModificar)
                    .addComponent(jBtnNuevo))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        Integer idDetalle= Integer.parseInt(jTextIdDetalle.getText());
        nuevoDet= detalleData.buscarDetalleVenta(idDetalle);
        if(nuevoDet!=null){
            jTextIdVenta.setText(nuevoDet.getVenta().getIdVenta()+"");
            jTextProducto.setText(nuevoDet.getProducto().getNombreProducto());
            jTextCantidad.setText(nuevoDet.getCantidad()+"");
            jTextPrecio.setText(nuevoDet.getPrecioVenta()+"");
       
        }
                  
    }//GEN-LAST:event_jBtnBuscarActionPerformed

    private void jBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoActionPerformed
          try {
            String idventaString = jTextIdVenta.getText();
            String productoString = jTextProducto.getText();
            String cantidadString= jTextCantidad.getText();
            String precioString=jTextPrecio.getText();
            
            if (idventaString.isEmpty() || productoString.isEmpty()|| cantidadString.isEmpty() || precioString.isEmpty()){
    JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
            }else{
                int idventa= Integer.parseInt(idventaString);
                int producto=Integer.parseInt(productoString);
                int cantidad = Integer.parseInt(cantidadString);
                Double precio = Double.parseDouble(precioString);}
               
            if (nuevoDet == null){
                //nuevoDet = new DetalleVenta (Venta,Producto, cantidad, precio);
                detalleData.guardarDetalleVenta(nuevoDet);

            }

        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Verifique la validez de los campos");
        }
    }//GEN-LAST:event_jBtnNuevoActionPerformed

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed

   try {
        int idDetalleVenta = Integer.parseInt(jTextIdDetalle.getText());
        int idVenta = Integer.parseInt(jTextIdVenta.getText());
        int idProducto = Integer.parseInt(jTextProducto.getText());
        int cantidad = Integer.parseInt(jTextCantidad.getText());
        double precioVenta = Double.parseDouble(jTextPrecio.getText());

        Producto producto = new Producto(idProducto);

        Venta venta = new Venta(idVenta);

        DetalleVenta detalleVenta = new DetalleVenta(idDetalleVenta, venta, producto, cantidad, precioVenta);

        DetalleVentaData detalleVentaData = new DetalleVentaData();
        detalleVentaData.modificarDetalleVenta(detalleVenta);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Asegurate de ingresar números válidos.");
    }
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
    try {
        int idDetalleVenta = Integer.parseInt(jTextIdDetalle.getText());

        DetalleVenta detalleVenta = new DetalleVenta();
        detalleVenta.setIdDetalleVenta(idDetalleVenta);

        DetalleVentaData detalleVentaData = new DetalleVentaData();
        detalleVentaData.eliminarDetalleVenta(idDetalleVenta);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Asegurate de ingresar un número válido en el campo de ID de Detalle de Venta.");
    }
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jTextIdVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdVentaActionPerformed

    private void jBTnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTnLimpiarActionPerformed

    jTextIdDetalle.setText("");
    jTextIdVenta.setText("");         
    jTextProducto.setText("");      
    jTextCantidad.setText(""); 
    jTextPrecio.setText("");
    }//GEN-LAST:event_jBTnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTnLimpiar;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jBtnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextIdDetalle;
    private javax.swing.JTextField jTextIdVenta;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextProducto;
    // End of variables declaration//GEN-END:variables
}
