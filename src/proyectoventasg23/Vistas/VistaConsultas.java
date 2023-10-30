
package proyectoventasg23.Vistas;

import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoventasg23.Entidades.*;
import proyectoventasg23.AccesoADatos.*;


public class VistaConsultas extends javax.swing.JInternalFrame {
    /*public VentaData ventaD= new VentaData();
    public Venta ventaNueva=null;
    public DetalleVentaData detalleData= new DetalleVentaData();
    public DetalleVenta nuevoDetalle=null;
    public Cliente nuevoCli= null;
    public ClienteData clientDat= new ClienteData();
    public Producto nuevoProducto= null;
    public ProductoData proData=new ProductoData();
   
    */
    
    public VistaConsultas() {
        initComponents();           
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoConsulta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadProdxVentaFecha = new javax.swing.JRadioButton();
        jRadVentaxFecha = new javax.swing.JRadioButton();
        jRadventaxCliente = new javax.swing.JRadioButton();
        jRadClientesyProd = new javax.swing.JRadioButton();
        jLBuscarPxF = new javax.swing.JLabel();
        jLBuscarVxC = new javax.swing.JLabel();
        jLBuscarVxF = new javax.swing.JLabel();
        jLBuscarCxC = new javax.swing.JLabel();
        jBtnAceptar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultas");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadProdxVentaFecha.setBackground(new java.awt.Color(255, 153, 153));
        grupoConsulta.add(jRadProdxVentaFecha);
        jRadProdxVentaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadProdxVentaFechaActionPerformed(evt);
            }
        });
        jPanel1.add(jRadProdxVentaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 26, -1, -1));

        jRadVentaxFecha.setBackground(new java.awt.Color(255, 153, 153));
        grupoConsulta.add(jRadVentaxFecha);
        jRadVentaxFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadVentaxFechaActionPerformed(evt);
            }
        });
        jPanel1.add(jRadVentaxFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 188, -1, -1));

        jRadventaxCliente.setBackground(new java.awt.Color(255, 153, 153));
        grupoConsulta.add(jRadventaxCliente);
        jRadventaxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadventaxClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jRadventaxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 81, 31, -1));

        jRadClientesyProd.setBackground(new java.awt.Color(255, 153, 153));
        grupoConsulta.add(jRadClientesyProd);
        jRadClientesyProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadClientesyProdActionPerformed(evt);
            }
        });
        jPanel1.add(jRadClientesyProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 133, -1, -1));

        jLBuscarPxF.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLBuscarPxF.setForeground(new java.awt.Color(0, 0, 0));
        jLBuscarPxF.setText("Buscar productos por fecha");
        jPanel1.add(jLBuscarPxF, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 31, -1, -1));

        jLBuscarVxC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLBuscarVxC.setForeground(new java.awt.Color(0, 0, 0));
        jLBuscarVxC.setText("Buscar ventas por cliente");
        jPanel1.add(jLBuscarVxC, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 81, -1, -1));

        jLBuscarVxF.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLBuscarVxF.setForeground(new java.awt.Color(0, 0, 0));
        jLBuscarVxF.setText("Buscar ventas por fecha");
        jPanel1.add(jLBuscarVxF, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 188, -1, -1));

        jLBuscarCxC.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLBuscarCxC.setForeground(new java.awt.Color(0, 0, 0));
        jLBuscarCxC.setText("Buscar clientes por producto");
        jPanel1.add(jLBuscarCxC, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 133, -1, -1));

        jBtnAceptar.setBackground(new java.awt.Color(255, 102, 102));
        jBtnAceptar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jBtnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAceptar.setText("Aceptar");
        jBtnAceptar.setBorder(null);
        jBtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 244, 97, 42));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptarActionPerformed
        if(jRadProdxVentaFecha.isSelected()){
          ProductosXventa productosXventa =new ProductosXventa();
        menuPpal.escritorio.add(productosXventa);
        productosXventa.setVisible(true);
        productosXventa.moveToFront();
        }else if (jRadClientesyProd.isSelected()){
        ClientesXproducto clientexProd= new ClientesXproducto();
       menuPpal.escritorio.add(clientexProd);
       clientexProd.setVisible(true);
       clientexProd.moveToFront();
       }else if(jRadventaxCliente.isSelected()){
       VentasXcliente ventasxCliente = new VentasXcliente();
        menuPpal.escritorio.add(ventasxCliente);
        ventasxCliente.setVisible(true);
        ventasxCliente.moveToFront();
       }else if(jRadVentaxFecha.isSelected()){
       VentasXfecha ventasxFecha= new VentasXfecha();
        menuPpal.escritorio.add(ventasxFecha);
        ventasxFecha.setVisible(true);
        ventasxFecha.moveToFront();
       }else{JOptionPane.showMessageDialog(null,"Debe seleccionar un área de consulta");}

    }//GEN-LAST:event_jBtnAceptarActionPerformed

    private void jRadClientesyProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadClientesyProdActionPerformed
       
    }//GEN-LAST:event_jRadClientesyProdActionPerformed

    private void jRadventaxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadventaxClienteActionPerformed
        
        
    }//GEN-LAST:event_jRadventaxClienteActionPerformed

    private void jRadVentaxFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadVentaxFechaActionPerformed
        
    }//GEN-LAST:event_jRadVentaxFechaActionPerformed

    private void jRadProdxVentaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadProdxVentaFechaActionPerformed
          
    }//GEN-LAST:event_jRadProdxVentaFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoConsulta;
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JLabel jLBuscarCxC;
    private javax.swing.JLabel jLBuscarPxF;
    private javax.swing.JLabel jLBuscarVxC;
    private javax.swing.JLabel jLBuscarVxF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadClientesyProd;
    private javax.swing.JRadioButton jRadProdxVentaFecha;
    private javax.swing.JRadioButton jRadVentaxFecha;
    private javax.swing.JRadioButton jRadventaxCliente;
    // End of variables declaration//GEN-END:variables
  
}
