
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
   
    private DefaultTableModel modeloTabla= new DefaultTableModel();*/
    
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

        setTitle("Consultas");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jRadProdxVentaFecha.setBackground(new java.awt.Color(255, 153, 153));
        grupoConsulta.add(jRadProdxVentaFecha);
        jRadProdxVentaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadProdxVentaFechaActionPerformed(evt);
            }
        });

        jRadVentaxFecha.setBackground(new java.awt.Color(255, 153, 153));
        grupoConsulta.add(jRadVentaxFecha);
        jRadVentaxFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadVentaxFechaActionPerformed(evt);
            }
        });

        jRadventaxCliente.setBackground(new java.awt.Color(255, 153, 153));
        grupoConsulta.add(jRadventaxCliente);
        jRadventaxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadventaxClienteActionPerformed(evt);
            }
        });

        jRadClientesyProd.setBackground(new java.awt.Color(255, 153, 153));
        grupoConsulta.add(jRadClientesyProd);
        jRadClientesyProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadClientesyProdActionPerformed(evt);
            }
        });

        jLBuscarPxF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLBuscarPxF.setText("Buscar productos por fecha");

        jLBuscarVxC.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLBuscarVxC.setText("Buscar ventas por cliente");

        jLBuscarVxF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLBuscarVxF.setText("Buscar ventas por fecha");

        jLBuscarCxC.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLBuscarCxC.setText("Buscar clientes por producto");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadventaxCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLBuscarVxC)
                        .addGap(760, 760, 760))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadProdxVentaFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadClientesyProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadVentaxFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jBtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLBuscarPxF))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLBuscarVxF)
                                    .addComponent(jLBuscarCxC))))
                        .addGap(737, 737, 737))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLBuscarPxF)
                    .addComponent(jRadProdxVentaFecha))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadventaxCliente)
                    .addComponent(jLBuscarVxC))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadClientesyProd)
                    .addComponent(jLBuscarCxC))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadVentaxFecha)
                    .addComponent(jLBuscarVxF))
                .addGap(37, 37, 37)
                .addComponent(jBtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
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
  /*private void armarCabecera(){
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Descripción");
        modeloTabla.addColumn("Precio");
        jTablaProdFecha.setModel(modeloTabla);

        }
    private void vaciarTabla () {
        for (int i = modeloTabla.getRowCount()-1; i >=0;i--){
            modeloTabla.removeRow(i);
        }}*/
}
