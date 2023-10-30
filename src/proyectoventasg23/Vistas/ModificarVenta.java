
package proyectoventasg23.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import proyectoventasg23.AccesoADatos.*;
import proyectoventasg23.Entidades.*;

public class ModificarVenta extends javax.swing.JInternalFrame {
          private VentaData ventaData;
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
        setMaximizable(true);
        setResizable(true);
        setTitle("Manipulacion de Ventas");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 96, 136, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código Cliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 98, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo de Venta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 56, -1, -1));
        jPanel1.add(jTextIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 54, 136, -1));
        jPanel1.add(jDateFechaVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 147, 136, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha de venta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 157, -1, -1));

        jBtnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnGuardar.setText("Guardar Cambios");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 216, -1, -1));

        jBtnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 216, -1, -1));

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
            Cliente clienteSeleccionado = new Cliente();
           clienteSeleccionado.setIdCliente(cliente.getIdCliente());
              venta.setCliente(clienteSeleccionado);
            if (venta != null) {
                venta.setCliente(cliente);
                venta.setFechaVenta(fechaVenta);               

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
