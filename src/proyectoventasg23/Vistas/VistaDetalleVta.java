
package proyectoventasg23.Vistas;

import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyectoventasg23.AccesoADatos.*;
import proyectoventasg23.Entidades.*;

public class VistaDetalleVta extends javax.swing.JInternalFrame {

    ClienteData nuevoCliData = new ClienteData();
    Venta venta = null;
    VentaData vtaData = new VentaData();
    LocalDate fechaVta = null;
    private DefaultTableModel modeloTabla;
    private JTable tablaVenta;

    DetalleVentaData detalleData = new DetalleVentaData();

    private int idVenta;
    private int idProductoSeleccionado;

    public VistaDetalleVta(int idVenta) {
        initComponents();
        this.idVenta = idVenta; //armo el detalle pasando el idVenta obtenido en la vista anterior
        jTextCodigoVta.setText(String.valueOf(idVenta));
        agregarProductos();
        armarTabla();
        listarDetallesEnTabla();
    }

    public void agregarProductos() {
        ProductoData productoData = new ProductoData();
        List<Producto> listaProductos = productoData.listarProducto();
        for (Producto prod : listaProductos) {
            jComboProducto.addItem(prod); //agrego al jcombo para elegir producto
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextCantidad = new javax.swing.JTextField();
        jTextPrecio = new javax.swing.JTextField();
        jBtnGuardarDetalle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDetalleVta = new javax.swing.JTable();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jComboProducto = new javax.swing.JComboBox<>();
        jTextCodigoVta = new javax.swing.JTextField();
        jBtnActualizar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Detalles de Venta");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Código de venta");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 31, 150, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Código de Producto");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 78, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cantidad");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 117, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 159, -1, -1));

        jTextCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantidadActionPerformed(evt);
            }
        });
        jTextCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextCantidadKeyPressed(evt);
            }
        });
        jPanel2.add(jTextCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 115, 203, -1));
        jPanel2.add(jTextPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 157, 203, -1));

        jBtnGuardarDetalle.setText("Guardar Detalle");
        jBtnGuardarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarDetalleActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnGuardarDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 217, -1, -1));

        jTableDetalleVta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableDetalleVta);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 282, 615, 91));

        jBtnModificar.setText("Modificar");
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 389, -1, -1));

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 389, -1, -1));

        jPanel2.add(jComboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 71, 203, -1));
        jPanel2.add(jTextCodigoVta, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 29, 197, -1));

        jBtnActualizar.setText("Actualizar Tabla");
        jBtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 389, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGuardarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarDetalleActionPerformed
        try {
            Integer idVenta = Integer.parseInt(jTextCodigoVta.getText());
            Venta venta = new Venta(idVenta);
            Producto producto = (Producto) jComboProducto.getSelectedItem();
            int idProductoSeleccionado = producto.getIdProducto();
            int cantidad = Integer.parseInt(jTextCantidad.getText());
            //traigo el precio del prod de la tabla
            double precioProducto = producto.getPrecioActual();
            double precioFinal = precioProducto * cantidad;  //lo multiplico por la cantidad y lo guardo para el detalle   

            DetalleVenta nuevoDet = new DetalleVenta(venta, producto, cantidad, precioFinal); //paso el precio final  
            DetalleVentaData detalleData = new DetalleVentaData();
            detalleData.guardarDetalleVenta(nuevoDet);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ingrese numeros en los campos ");
        }
    }//GEN-LAST:event_jBtnGuardarDetalleActionPerformed

    private void jTextCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidadActionPerformed

        int cantidad = Integer.parseInt(jTextCantidad.getText());
        Producto producto = (Producto) jComboProducto.getSelectedItem();
        double precioProducto = producto.getPrecioActual();
        double precioTotal = cantidad * precioProducto;
        jTextPrecio.setText(String.valueOf(precioTotal));//con este método se actualiza sólo el jText cob el precio del producto * cantidad
    }//GEN-LAST:event_jTextCantidadActionPerformed

    private void jTextCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCantidadKeyPressed

    }//GEN-LAST:event_jTextCantidadKeyPressed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        int filaSeleccionada = jTableDetalleVta.getSelectedRow();

        if (filaSeleccionada >= 0) {
            int idDetalleVenta = (int) jTableDetalleVta.getValueAt(filaSeleccionada, 0);
            detalleData.eliminarDetalleVenta(idDetalleVenta);
            listarDetallesEnTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Selecciona un detalle de venta para eliminar.");
        }
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        int filaSeleccionada = jTableDetalleVta.getSelectedRow();

        if (filaSeleccionada >= 0) {
            //resta desde acá el constructor de la clase con el id
            DetalleVenta detalleSeleccionado = obtenerDetallesDesdeTabla(filaSeleccionada);
            ModificarDetalle modificarDet = new ModificarDetalle(detalleSeleccionado);
            menuPpal.escritorio.add(modificarDet);
            modificarDet.setVisible(true);
            modificarDet.moveToFront();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un detalle para modificar");
        }

    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarActionPerformed
        vaciarTabla();
        listarDetallesEnTabla();

    }//GEN-LAST:event_jBtnActualizarActionPerformed
         public void listarDetallesEnTabla() {

             while (modeloTabla.getRowCount() > 0) {
                 modeloTabla.removeRow(0);
             }
             List<DetalleVenta> detalles = detalleData.listarDetalleVenta();
             for (DetalleVenta detalle : detalles) {
                 Object[] row = {detalle.getIdDetalleVenta(), detalle.getVenta().getIdVenta(), detalle.getProducto().getIdProducto(), detalle.getCantidad(), detalle.getPrecioVenta()};
                 modeloTabla.addRow(row);
             }
         }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActualizar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnGuardarDetalle;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JComboBox<Producto> jComboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDetalleVta;
    private javax.swing.JTextField jTextCantidad;
    private javax.swing.JTextField jTextCodigoVta;
    private javax.swing.JTextField jTextPrecio;
    // End of variables declaration//GEN-END:variables
 private void armarTabla() {
        modeloTabla = new DefaultTableModel(); //creo un objeto modeloTabla
        modeloTabla.addColumn("Código de detalle");//armo la cabecera
        modeloTabla.addColumn("Codigo de Venta");
        modeloTabla.addColumn("Código de producto");
        modeloTabla.addColumn("Cantidad");
        modeloTabla.addColumn("Precio final");
        jTableDetalleVta.setModel(modeloTabla); //seteo la tabla con los datos nuevos
    }

    private void vaciarTabla() {
        for (int i = modeloTabla.getRowCount() - 1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }//armo metodo por si lo necesito

    private DetalleVenta obtenerDetallesDesdeTabla(int filaSeleccionada) {

        if (filaSeleccionada >= 0 && filaSeleccionada < detalleData.listarDetalleVenta().size()) {
            return detalleData.listarDetalleVenta().get(filaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(null, "error en la fila seleccionada");
            return null;
        }

    }
}
