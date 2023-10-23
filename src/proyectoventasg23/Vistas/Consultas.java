
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

/**
 *
 * @author luciana
 */
public class Consultas extends javax.swing.JInternalFrame {
    public VentaData ventaD= new VentaData();
    public Venta ventaNueva=null;
    public DetalleVentaData detalleData= new DetalleVentaData();
    public DetalleVenta nuevoDetalle=null;
    public Cliente nuevoCli= null;
    public ClienteData clientDat= new ClienteData();
    public Producto nuevoProducto= null;
    public ProductoData proData=new ProductoData();
    private DefaultTableModel modeloTabla= new DefaultTableModel(){
        public boolean isCellEditable(int fila, int column) {
                return false;
        }
    };
    
    public Consultas() {
        initComponents();      
        jPanelProdxFecha.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoConsulta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadProdxFecha = new javax.swing.JRadioButton();
        jRadVentaxFecha = new javax.swing.JRadioButton();
        jRadventaxCliente = new javax.swing.JRadioButton();
        jRadClientesyProd = new javax.swing.JRadioButton();
        jLBuscarPxF = new javax.swing.JLabel();
        jLBuscarVxC = new javax.swing.JLabel();
        jLBuscarVxF = new javax.swing.JLabel();
        jLBuscarCxC = new javax.swing.JLabel();
        jBtnAceptar = new javax.swing.JButton();
        jPanelProdxFecha = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDateProdXventa = new com.toedter.calendar.JDateChooser();
        jBtnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaProdFecha = new javax.swing.JTable();

        setTitle("Consultas");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jRadProdxFecha.setBackground(new java.awt.Color(255, 153, 153));
        grupoConsulta.add(jRadProdxFecha);
        jRadProdxFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadProdxFechaActionPerformed(evt);
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
        jLBuscarPxF.setForeground(new java.awt.Color(51, 51, 51));
        jLBuscarPxF.setText("Buscar productos por fecha");

        jLBuscarVxC.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLBuscarVxC.setForeground(new java.awt.Color(51, 51, 51));
        jLBuscarVxC.setText("Buscar ventas por cliente");

        jLBuscarVxF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLBuscarVxF.setForeground(new java.awt.Color(51, 51, 51));
        jLBuscarVxF.setText("Buscar ventas por fecha");

        jLBuscarCxC.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLBuscarCxC.setForeground(new java.awt.Color(51, 51, 51));
        jLBuscarCxC.setText("Buscar clientes segun compra");

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

        jPanelProdxFecha.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese la fecha");

        jDateProdXventa.setBackground(new java.awt.Color(204, 204, 204));
        jDateProdXventa.setForeground(new java.awt.Color(255, 153, 153));
        jDateProdXventa.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jBtnBuscar.setBackground(new java.awt.Color(255, 102, 102));
        jBtnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jBtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnBuscar.setText("Buscar");
        jBtnBuscar.setBorder(null);
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 153));

        jTablaProdFecha.setBackground(new java.awt.Color(255, 153, 153));
        jTablaProdFecha.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTablaProdFecha.setForeground(new java.awt.Color(51, 51, 51));
        jTablaProdFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablaProdFecha.setGridColor(new java.awt.Color(255, 102, 102));
        jTablaProdFecha.setSelectionBackground(new java.awt.Color(255, 51, 102));
        jTablaProdFecha.setSelectionForeground(new java.awt.Color(255, 153, 153));
        jScrollPane1.setViewportView(jTablaProdFecha);

        javax.swing.GroupLayout jPanelProdxFechaLayout = new javax.swing.GroupLayout(jPanelProdxFecha);
        jPanelProdxFecha.setLayout(jPanelProdxFechaLayout);
        jPanelProdxFechaLayout.setHorizontalGroup(
            jPanelProdxFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdxFechaLayout.createSequentialGroup()
                .addGroup(jPanelProdxFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProdxFechaLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addComponent(jDateProdXventa, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProdxFechaLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(jPanelProdxFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProdxFechaLayout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(122, Short.MAX_VALUE)))
        );
        jPanelProdxFechaLayout.setVerticalGroup(
            jPanelProdxFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdxFechaLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanelProdxFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateProdXventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(60, 60, 60)
                .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(376, Short.MAX_VALUE))
            .addGroup(jPanelProdxFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProdxFechaLayout.createSequentialGroup()
                    .addGap(251, 251, 251)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(263, Short.MAX_VALUE)))
        );

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
                            .addComponent(jRadProdxFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadClientesyProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadVentaxFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLBuscarPxF)
                            .addComponent(jBtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLBuscarCxC)
                            .addComponent(jLBuscarVxF))
                        .addGap(725, 725, 725))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 327, Short.MAX_VALUE)
                    .addComponent(jPanelProdxFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLBuscarPxF)
                    .addComponent(jRadProdxFecha))
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
                .addGap(53, 53, 53)
                .addComponent(jBtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelProdxFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptarActionPerformed
        if(jRadProdxFecha.isSelected()){
            jPanelProdxFecha.setVisible(true);  
            armarCabecera();
        }
    }//GEN-LAST:event_jBtnAceptarActionPerformed

    private void jRadClientesyProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadClientesyProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadClientesyProdActionPerformed

    private void jRadventaxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadventaxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadventaxClienteActionPerformed

    private void jRadVentaxFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadVentaxFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadVentaxFechaActionPerformed

    private void jRadProdxFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadProdxFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadProdxFechaActionPerformed

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
      Date fecha= jDateProdXventa.getDate();
     LocalDate fechaSeleccionada = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
     
     List<Producto> productos = detalleData.listarProductosDeVentaEnFecha(fechaSeleccionada);
    }//GEN-LAST:event_jBtnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoConsulta;
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JButton jBtnBuscar;
    private com.toedter.calendar.JDateChooser jDateProdXventa;
    private javax.swing.JLabel jLBuscarCxC;
    private javax.swing.JLabel jLBuscarPxF;
    private javax.swing.JLabel jLBuscarVxC;
    private javax.swing.JLabel jLBuscarVxF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelProdxFecha;
    private javax.swing.JRadioButton jRadClientesyProd;
    private javax.swing.JRadioButton jRadProdxFecha;
    private javax.swing.JRadioButton jRadVentaxFecha;
    private javax.swing.JRadioButton jRadventaxCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaProdFecha;
    // End of variables declaration//GEN-END:variables
  private void armarCabecera(){
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Descripción");
        modeloTabla.addColumn("Precio");
        jTablaProdFecha.setModel(modeloTabla);

        }
    private void vaciarTabla () {
        for (int i = modeloTabla.getRowCount()-1; i >=0;i--){
            modeloTabla.removeRow(i);
        }}
}
