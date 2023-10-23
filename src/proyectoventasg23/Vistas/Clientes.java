
package proyectoventasg23.Vistas;

import javax.swing.JOptionPane;
import proyectoventasg23.AccesoADatos.ClienteData;
import proyectoventasg23.Entidades.Cliente;

public class Clientes extends javax.swing.JInternalFrame {

    public Clientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBAgregar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTelefono = new javax.swing.JTextField();
        jDireccion = new javax.swing.JTextField();
        jApellido = new javax.swing.JTextField();
        jNombre = new javax.swing.JTextField();

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Dirección");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Teléfono");

        jTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefonoActionPerformed(evt);
            }
        });

        jDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDireccionActionPerformed(evt);
            }
        });

        jApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jApellidoActionPerformed(evt);
            }
        });

        jNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNombre)
                            .addComponent(jApellido)
                            .addComponent(jDireccion)
                            .addComponent(jTelefono)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAgregar)
                        .addGap(164, 164, 164)
                        .addComponent(jModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                        .addComponent(jBEliminar)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar)
                    .addComponent(jModificar)
                    .addComponent(jBEliminar))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed

    String idClienteStr = JOptionPane.showInputDialog("Ingrese el ID del cliente a modificar:");
 
    if (idClienteStr == null || idClienteStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un ID de cliente válido.");
        return;
    }
    int idCliente;
    try {
        idCliente = Integer.parseInt(idClienteStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El ID de cliente debe ser un número válido.");
        return;
    }
    String nombre = jNombre.getText();
    String apellido = jApellido.getText();
    String telefono = jTelefono.getText();
    String domicilio = jDireccion.getText();

    Cliente cliente = new Cliente(idCliente, nombre, apellido, domicilio, telefono);

    ClienteData cD = new ClienteData();
   
        cD.modificarCliente(cliente);
       
    }//GEN-LAST:event_jModificarActionPerformed

    private void jNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreActionPerformed
    
    }//GEN-LAST:event_jNombreActionPerformed

    private void jApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jApellidoActionPerformed
    
    }//GEN-LAST:event_jApellidoActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
      String nombre = jNombre.getText();
    String apellido = jApellido.getText();
    String telefono = jTelefono.getText();
    String domicilio = jDireccion.getText();
    
    Cliente cliente = new Cliente(nombre, apellido, domicilio, telefono);
    
    ClienteData clienteData = new ClienteData();
    clienteData.guardarCliente(cliente);
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDireccionActionPerformed
    
    }//GEN-LAST:event_jDireccionActionPerformed

    private void jTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelefonoActionPerformed
    
    }//GEN-LAST:event_jTelefonoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

    String idClienteStr = JOptionPane.showInputDialog("Ingrese el ID del cliente a eliminar:");

    if (idClienteStr == null || idClienteStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un ID de cliente válido.");
        return;
    }
    int idCliente;
    try {
        idCliente = Integer.parseInt(idClienteStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El ID de cliente debe ser un número válido.");
        return; 
    }
    ClienteData clienteData = new ClienteData();
    clienteData.eliminarCliente(idCliente);
    }//GEN-LAST:event_jBEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jApellido;
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JTextField jDireccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jModificar;
    private javax.swing.JTextField jNombre;
    private javax.swing.JTextField jTelefono;
    // End of variables declaration//GEN-END:variables

}
