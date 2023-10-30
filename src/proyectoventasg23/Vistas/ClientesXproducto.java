package proyectoventasg23.Vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoventasg23.AccesoADatos.*;
import proyectoventasg23.Entidades.*;


public class ClientesXproducto extends javax.swing.JInternalFrame {

    public ClientesXproducto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextProducto = new javax.swing.JTextField();
        jBtnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();
        jTextDatosProducto = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setTitle("Busqueda de clientes que compraron un producto");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese el código de  producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel1.add(jTextProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 164, -1));

        jBtnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Nombre", "Apellido", "Dirección", "Teléfono"
            }
        ));
        jTClientes.setToolTipText("");
        jScrollPane1.setViewportView(jTClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 237, 500, 105));
        jPanel1.add(jTextDatosProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 490, -1));

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

    if (jTextProducto != null && !jTextProducto.getText().isEmpty()) {
        int idProducto = Integer.parseInt(jTextProducto.getText());

        ProductoData productoData = new ProductoData();
        Producto producto = productoData.buscarProducto(idProducto);
        if (producto != null) {
                String datosProducto = producto.toString();

                jTextDatosProducto.setText(datosProducto);
            } else {
                jTextDatosProducto.setText("Producto no encontrado");
        }

        if (producto != null) {
            DetalleVentaData detalleVentaData = new DetalleVentaData();
            List<DetalleVenta> detallesVenta = detalleVentaData.obtenerDetallesVentaDeProducto(producto);

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ID Cliente");
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Dirección");
            model.addColumn("Teléfono");

            for (DetalleVenta detalleVenta : detallesVenta) {
                Cliente cliente = detalleVenta.getVenta().getCliente();
                if (cliente != null) {
                    model.addRow(new Object[]{
                        cliente.getIdCliente(),
                        cliente.getNombre(),
                        cliente.getApellido(),
                        cliente.getDomicilio(),
                        cliente.getTelefono()
                    });
                }
            }

            jTClientes.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "El producto con ID " + idProducto + " no existe.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese un ID de producto válido.");
    }
    }//GEN-LAST:event_jBtnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTClientes;
    private javax.swing.JTextField jTextDatosProducto;
    private javax.swing.JTextField jTextProducto;
    // End of variables declaration//GEN-END:variables
}
