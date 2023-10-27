/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoventasg23.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import proyectoventasg23.AccesoADatos.DetalleVentaData;
import proyectoventasg23.Entidades.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductosXventa extends javax.swing.JInternalFrame {

    public ProductosXventa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        jBtnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProductos = new javax.swing.JTable();

        setClosable(true);
        setTitle("Busqueda de productos vendidos en una fecha");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese la fecha");

        jDateFecha.setBackground(new java.awt.Color(204, 204, 204));
        jDateFecha.setForeground(new java.awt.Color(255, 153, 153));
        jDateFecha.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jBtnBuscar.setBackground(new java.awt.Color(255, 102, 102));
        jBtnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jBtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnBuscar.setText("Buscar");
        jBtnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 153));

        jTProductos.setBackground(new java.awt.Color(255, 153, 153));
        jTProductos.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTProductos.setForeground(new java.awt.Color(51, 51, 51));
        jTProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Producto", "Precio"
            }
        ));
        jTProductos.setToolTipText("");
        jTProductos.setGridColor(new java.awt.Color(255, 102, 102));
        jTProductos.setSelectionBackground(new java.awt.Color(255, 51, 102));
        jTProductos.setSelectionForeground(new java.awt.Color(255, 153, 153));
        jScrollPane1.setViewportView(jTProductos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
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

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed

    Date selectedDate = jDateFecha.getDate();

    if (selectedDate != null) {
        LocalDate fecha = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        List<Producto> productosVendidos = obtenerProductosVendidosEnFecha(fecha);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Producto");
        model.addColumn("Nombre");
        model.addColumn("Precio");

        for (Producto producto : productosVendidos) {
            model.addRow(new Object[]{
                producto.getIdProducto(),
                producto.getNombreProducto(),
                producto.getPrecioActual()
            });
        }

        jTProductos.setModel(model);
    } else {
        JOptionPane.showMessageDialog(null, "Selecciona primero una fecha ");
    }
}

private List<Producto> obtenerProductosVendidosEnFecha(LocalDate fecha) {
    DetalleVentaData detalleVentaData = new DetalleVentaData();
    return detalleVentaData.listarProductosDeVentaEnFecha(fecha);
    }//GEN-LAST:event_jBtnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscar;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProductos;
    // End of variables declaration//GEN-END:variables
}
