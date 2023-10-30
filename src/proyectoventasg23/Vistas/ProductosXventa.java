
package proyectoventasg23.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import proyectoventasg23.AccesoADatos.DetalleVentaData;
import proyectoventasg23.Entidades.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoventasg23.Entidades.*;

public class ProductosXventa extends javax.swing.JInternalFrame {
 
    private DefaultTableModel modeloTabla= new DefaultTableModel();
    public DetalleVentaData detalleData= new DetalleVentaData();
    public DetalleVenta nuevoDetalle=null;

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
        setMaximizable(true);
        setTitle("Busqueda de productos de una venta  en una fecha");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese la fecha");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 82, -1, -1));

        jDateFecha.setBackground(new java.awt.Color(204, 204, 204));
        jDateFecha.setForeground(new java.awt.Color(255, 153, 153));
        jDateFecha.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel1.add(jDateFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 72, 174, -1));

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
        jPanel1.add(jBtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 127, 72, 35));

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 153));

        jTProductos.setBackground(new java.awt.Color(255, 153, 153));
        jTProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 102), new java.awt.Color(255, 102, 102), new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51)));
        jTProductos.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTProductos.setForeground(new java.awt.Color(255, 51, 51));
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
        jTProductos.setGridColor(new java.awt.Color(204, 0, 51));
        jTProductos.setSelectionBackground(new java.awt.Color(255, 51, 102));
        jTProductos.setSelectionForeground(new java.awt.Color(255, 51, 102));
        jScrollPane1.setViewportView(jTProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 193, 540, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed

        Date fecha = jDateFecha.getDate();
         if (fecha != null) {
        LocalDate fechaSeleccionada = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        List<Producto> productos = detalleData.listarProductosDeVentaEnFecha(fechaSeleccionada);
         DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Producto");
            model.addColumn("Nombre");
            model.addColumn("Precio");
        
        for (Producto producto : productos) {
            model.addRow(new Object[]{producto.getNombreProducto(), producto.getDescripcion(), producto.getPrecioActual()});
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
    
   
    private void vaciarTabla () {
        for (int i = modeloTabla.getRowCount()-1; i >=0;i--){
            modeloTabla.removeRow(i);
        }}
   }
