
package proyectoventasg23.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoventasg23.AccesoADatos.VentaData;
import proyectoventasg23.Entidades.Cliente;
import proyectoventasg23.Entidades.Venta;

public class VentasXfecha extends javax.swing.JInternalFrame {

    public VentasXfecha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTVentas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Busqueda de  ventas por fecha");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese la Fecha:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 43, -1, -1));
        jPanel1.add(jDateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 33, -1, -1));

        jTVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Venta", "Cliente", "Fecha Venta"
            }
        ));
        jScrollPane1.setViewportView(jTVentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 151, 371, 108));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 91, -1, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
    java.util.Date selectedDate = jDateFecha.getDate();
    if (selectedDate == null) {
        JOptionPane.showMessageDialog(null, "Seleccione una fecha primero");
        return;
    }
    LocalDate selectedLocalDate = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    
    VentaData ventaData = new VentaData();
    List<Venta> allVentas = ventaData.listarVentas();
   
    List<Venta> ventasFiltradas = new ArrayList<>();
    for (Venta venta : allVentas) {
        if (venta.getFechaVenta().equals(selectedLocalDate)) {
            ventasFiltradas.add(venta);
        }
    }
    
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID Venta");
    model.addColumn("Cliente");
    model.addColumn("Fecha Venta");

    for (Venta venta : ventasFiltradas) {
        int idVenta = venta.getIdVenta();
        Cliente cliente = venta.getCliente();
        String clienteInfo = cliente.getNombre() + " " + cliente.getApellido();
        LocalDate fechaVenta = venta.getFechaVenta();
        model.addRow(new Object[]{idVenta, clienteInfo, fechaVenta});
    }
    
    jTVentas.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTVentas;
    // End of variables declaration//GEN-END:variables
}
