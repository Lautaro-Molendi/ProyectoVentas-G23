
package proyectoventasg23.Vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import proyectoventasg23.AccesoADatos.*;
import proyectoventasg23.Entidades.*;

public class VentasXcliente extends javax.swing.JInternalFrame {

   
    public VentasXcliente() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextCliente = new javax.swing.JTextField();
        jBtnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTVentas = new javax.swing.JTable();
        jbLimpiar = new javax.swing.JButton();
        jTextDatosCliente = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setTitle("Busqueda de ventas por cliente");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese el Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 68, 128, 37));
        jPanel1.add(jTextCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 75, 144, -1));

        jBtnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jTVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID venta", "Fecha venta"
            }
        ));
        jScrollPane1.setViewportView(jTVentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 110));

        jbLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));
        jPanel1.add(jTextDatosCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 530, -1));

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

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        
        try {
            int clienteID = Integer.parseInt(jTextCliente.getText());
            
            ClienteData clienteData = new ClienteData();
            Cliente cliente = clienteData.buscarCliente(clienteID);

            if (cliente != null) {
                String datosCliente = cliente.toString();

                jTextDatosCliente.setText(datosCliente);
            } else {
                jTextDatosCliente.setText("Cliente no encontrado");
        }
        
               
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("ID Venta");
                model.addColumn("Fecha Venta");

                model.setRowCount(0);

                VentaData ventaData = new VentaData();
                List<Venta> todasLasVentas = ventaData.listarVentas();

                for (Venta venta : todasLasVentas) {
                    if (venta.getCliente().getIdCliente() == clienteID) {
                        model.addRow(new Object[]{venta.getIdVenta(), venta.getFechaVenta()});
                    }
                }
                jTVentas.setModel(model);
       }catch (NumberFormatException ex){
        JOptionPane.showMessageDialog(this, "Debe ingresar un id valido ");
   }  
        
    }//GEN-LAST:event_jBtnBuscarActionPerformed
     
           
    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
       
       
        DefaultTableModel model = (DefaultTableModel) jTVentas.getModel();
        while(model.getRowCount()>0)model.removeRow(0);
 
        TableColumnModel modCol = jTVentas.getColumnModel();
        while(modCol.getColumnCount()>0)modCol.removeColumn(modCol.getColumn(0));
        jTextCliente.setText("");

    }//GEN-LAST:event_jbLimpiarActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTVentas;
    private javax.swing.JTextField jTextCliente;
    private javax.swing.JTextField jTextDatosCliente;
    private javax.swing.JButton jbLimpiar;
    // End of variables declaration//GEN-END:variables
}
