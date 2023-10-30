
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
    
    Cliente nuevoCliente = new Cliente();
    Cliente clienteSeleccionado = new Cliente();
    ClienteData nuevoCliData = new ClienteData();
    Venta ventaNueva = null;
    VentaData vtaData = new VentaData();
    LocalDate fechaVta = null;
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
        jBtnGenerarDet = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Administracion de ventas");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBuscarCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelBuscarCliente.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBuscarCliente.setText("Buscar código de Cliente");
        jPanel1.add(jLabelBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 52, -1, -1));

        jComboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jComboClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 32, 314, 39));
        jPanel1.add(jDateFechaVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 104, 314, 40));

        jLabelFechaVta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelFechaVta.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaVta.setText("Ingrese la fecha de venta");
        jPanel1.add(jLabelFechaVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 125, -1, -1));

        jBtnRegistrarVenta.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnRegistrarVenta.setText("Guardar Venta");
        jBtnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistrarVentaActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 188, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 238, -1, 94));

        jBtnModificar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnModificar.setText("Modificar venta");
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jBtnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 380, -1, -1));

        jBtnGenerarDet.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnGenerarDet.setText("Generar/ Modificar  Detalle");
        jBtnGenerarDet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGenerarDetActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnGenerarDet, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
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
        int idClienteSeleccionado = cliente.getIdCliente();
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
        else{JOptionPane.showMessageDialog(null, "Seleccione una venta de la tabla");}
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

    private void jBtnGenerarDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGenerarDetActionPerformed
        int filaSeleccionada = jTableVta.getSelectedRow();

        if (filaSeleccionada >= 0) {
        // Obtengo el valor de idVenta de la fila seleccionada
        int idVenta = (int) jTableVta.getValueAt(filaSeleccionada, 0);

       VistaDetalleVta detalleDeVenta = new VistaDetalleVta(idVenta);

        menuPpal.escritorio.add(detalleDeVenta);
        detalleDeVenta.setVisible(true);
        detalleDeVenta.moveToFront();
    }else{JOptionPane.showMessageDialog(null,"Seleccione una fila para generar detalle");}
    }//GEN-LAST:event_jBtnGenerarDetActionPerformed
    
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
    private javax.swing.JButton jBtnGenerarDet;
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
