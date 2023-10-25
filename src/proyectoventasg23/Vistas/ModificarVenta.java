
package proyectoventasg23.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import proyectoventasg23.AccesoADatos.*;
import proyectoventasg23.Entidades.*;

public class ModificarVenta extends javax.swing.JInternalFrame {
          VentaData ventaData;
          private Venta venta;
    public ModificarVenta(Venta venta) {
        
        initComponents();
        this.venta = venta;
        jTextIdVenta.setText(String.valueOf(venta.getIdVenta()));
        jTextIdCliente.setText(String.valueOf(venta.getIdCliente())); 
        jDateFechaVta.setDate(java.sql.Date.valueOf(venta.getFechaVenta()));
    
        ventaData=new VentaData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextIdCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextIdVenta = new javax.swing.JTextField();
        jDateFechaVta = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jBtnGuardar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Manipulacion de Ventas");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código Cliente:");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo de Venta");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha de venta");

        jBtnGuardar.setText("Guardar Cambios");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
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
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnGuardar)
                        .addGap(54, 54, 54)
                        .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateFechaVta, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jTextIdCliente)
                            .addComponent(jTextIdVenta))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateFechaVta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardar)
                    .addComponent(jBtnLimpiar))
                .addContainerGap(72, Short.MAX_VALUE))
        );

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

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        
         try {
        int idVenta = Integer.parseInt(jTextIdVenta.getText());
        int idCliente = Integer.parseInt(jTextIdCliente.getText());
        LocalDate fechaVenta = jDateFechaVta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        ClienteData clienteData = new ClienteData();
        Cliente cliente = clienteData.buscarCliente(idCliente);

        if (cliente != null) {
            Venta venta = ventaData.buscarVenta(idVenta);
            if (venta != null) {
                // Actualizar los campos de la venta
                venta.setCliente(cliente);
                venta.setFechaVenta(fechaVenta);

                // Luego, llama al método para modificar la venta
                ventaData.modificarVenta(venta);

                JOptionPane.showMessageDialog(this, "Venta actualizada correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Venta no encontrada");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "ID de venta o ID de cliente no válido");
    }
        /*try {
            int idVenta = Integer.parseInt(jTextIdVenta.getText());
            int idCliente = Integer.parseInt(jTextIdCliente.getText());
            LocalDate fechaVenta = jDateFechaVta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            ClienteData clienteData = new ClienteData();
            Cliente cliente = clienteData.buscarCliente(idCliente);
            if (cliente != null) {
                Venta venta = ventaData.buscarVenta(idVenta);
                 Cliente clienteSeleccionado = new Cliente();
           clienteSeleccionado.setIdCliente(idCliente.getIdCliente());
              venta.setCliente(clienteSeleccionado);
                venta.setFechaVenta(fechaVenta);
                ventaData.modificarVenta(venta);
                JOptionPane.showMessageDialog(this, "Venta actualizada correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "Cliente no encontrado");
            }  
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "ID de venta o ID de cliente no válido");
        }*/
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        jTextIdVenta.setText("");
        jTextIdCliente.setText("");
        jDateFechaVta.setDate(null);
        
    }//GEN-LAST:event_jBtnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnLimpiar;
    private com.toedter.calendar.JDateChooser jDateFechaVta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextIdCliente;
    private javax.swing.JTextField jTextIdVenta;
    // End of variables declaration//GEN-END:variables
}
