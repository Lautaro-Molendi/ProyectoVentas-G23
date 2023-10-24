
package proyectoventasg23.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyectoventasg23.AccesoADatos.*;
import proyectoventasg23.Entidades.*;


public class VistaVentas extends javax.swing.JInternalFrame {
    
   Cliente nuevoCliente= new Cliente();
   Cliente clienteSeleccionado= new Cliente();
   ClienteData nuevoCliData= new ClienteData();
    Venta ventaNueva = null;
    VentaData vtaData= new VentaData();
     LocalDate fechaVta=null;
    private DefaultTableModel modeloTabla;
    private JTable tablaVenta;
    
    
    public VistaVentas() {
        initComponents();
        agregarClientes();
        armarTabla();
        listarVentasEnTabla();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelBuscarCliente = new javax.swing.JLabel();
        jComboClientes = new javax.swing.JComboBox<>();
        jDateFechaVta = new com.toedter.calendar.JDateChooser();
        jLabelFechaVta = new javax.swing.JLabel();
        jBtnRegistrarVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVta = new javax.swing.JTable();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Administracion de ventas");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setToolTipText("");

        jLabelBuscarCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelBuscarCliente.setForeground(new java.awt.Color(51, 51, 51));
        jLabelBuscarCliente.setText("Buscar código de Cliente");

        jComboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboClientesActionPerformed(evt);
            }
        });

        jLabelFechaVta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelFechaVta.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFechaVta.setText("Ingrese la fecha de venta");

        jBtnRegistrarVenta.setText("Guardar Venta");
        jBtnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistrarVentaActionPerformed(evt);
            }
        });

        jTableVta.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jTableVta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableVta);

        jBtnModificar.setText("Modificar");
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelBuscarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jComboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jBtnRegistrarVenta))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelFechaVta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDateFechaVta, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jBtnModificar)
                        .addGap(111, 111, 111)
                        .addComponent(jBtnEliminar)))
                .addContainerGap(546, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelBuscarCliente)
                    .addComponent(jComboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFechaVta)
                    .addComponent(jDateFechaVta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jBtnRegistrarVenta)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnModificar)
                    .addComponent(jBtnEliminar))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboClientesActionPerformed
        clienteSeleccionado = (Cliente) jComboClientes.getSelectedItem();
        Integer idCliente= clienteSeleccionado.getIdCliente();
     
    }//GEN-LAST:event_jComboClientesActionPerformed

    private void jBtnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistrarVentaActionPerformed
        Cliente cliente = (Cliente) jComboClientes.getSelectedItem();
        LocalDate fechaVenta = jDateFechaVta.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Venta nuevaVenta = new Venta(cliente, fechaVenta);
        vtaData.guardarVenta(nuevaVenta);
        listarVentasEnTabla();
    }//GEN-LAST:event_jBtnRegistrarVentaActionPerformed

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        int filaSeleccionada = jTableVta.getSelectedRow();

    if (filaSeleccionada >= 0) {
        Venta ventaSeleccionada = obtenerVentaDesdeTabla(filaSeleccionada);

        
        ModificarVenta modifVenta = new ModificarVenta(ventaSeleccionada);
        menuPpal.escritorio.add(modifVenta);
        modifVenta.setVisible(true);
        modifVenta.moveToFront();
    }//GEN-LAST:event_jBtnModificarActionPerformed
    }
    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
         int filaSeleccionada = jTableVta.getSelectedRow();

    if (filaSeleccionada >= 0) {
        
        int idVenta = (int) jTableVta.getValueAt(filaSeleccionada, 0);
        vtaData.eliminarVenta(idVenta);        
        listarVentasEnTabla();  
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona una venta para eliminar.");
    }
    }//GEN-LAST:event_jBtnEliminarActionPerformed
    
    public void agregarClientes() {
        ClienteData clienteData = new ClienteData();
        List<Cliente> listaClientes = clienteData.listarCliente();
        for (Cliente cli : listaClientes) {
            jComboClientes.addItem(cli);
        }
    }
    
    public void listarVentasEnTabla() {
   
        while (modeloTabla.getRowCount() > 0) {
            modeloTabla.removeRow(0);
        }
        List<Venta> ventas = vtaData.listarVentas();
        for (Venta venta : ventas) {
            Object[] row = {venta.getIdVenta(), venta.getCliente().getIdCliente(), venta.getFechaVenta()};
            modeloTabla.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jBtnRegistrarVenta;
    private javax.swing.JComboBox<Cliente> jComboClientes;
    private com.toedter.calendar.JDateChooser jDateFechaVta;
    private javax.swing.JLabel jLabelBuscarCliente;
    private javax.swing.JLabel jLabelFechaVta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVta;
    // End of variables declaration//GEN-END:variables
    private void armarTabla(){
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Cliente");
        modeloTabla.addColumn("Fecha de Venta");
        jTableVta.setModel(modeloTabla);
    }
    private void vaciarTabla () {
        for (int i = modeloTabla.getRowCount()-1; i >=0;i--){
            modeloTabla.removeRow(i);
        }}
    private Venta obtenerVentaDesdeTabla(int filaSeleccionada) {    
    if (filaSeleccionada >= 0 && filaSeleccionada < vtaData.listarVentas().size()) {       
        return vtaData.listarVentas().get(filaSeleccionada);
    } else{JOptionPane.showMessageDialog(null, "error en la fila");
            return null;}
    }
    }
