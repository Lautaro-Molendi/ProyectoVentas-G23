
package proyectoventasg23.Vistas;

import javax.swing.JOptionPane;
import proyectoventasg23.AccesoADatos.ClienteData;
import proyectoventasg23.Entidades.Cliente;

public class ModificarCliente extends javax.swing.JInternalFrame {

    private ClienteData clienteData = new ClienteData();
    private Cliente nuevoCliente = new Cliente();

    public ModificarCliente() {
        initComponents();
        limpiarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtNom = new javax.swing.JTextField();
        jtApe = new javax.swing.JTextField();
        jtDom = new javax.swing.JTextField();
        jtTel = new javax.swing.JTextField();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar cliente");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese el ID del cliente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 87, -1, -1));
        jPanel1.add(jtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 85, 91, -1));

        jbBuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 81, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 185, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Domicilio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 227, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Teléfono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 269, -1, -1));

        jtNom.setText(" ");
        jPanel1.add(jtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 180, 160, -1));

        jtApe.setText(" ");
        jPanel1.add(jtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 138, 160, -1));

        jtDom.setText(" ");
        jPanel1.add(jtDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 222, 160, -1));

        jtTel.setText("  ");
        jPanel1.add(jtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 264, 160, -1));

        jbEliminar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 334, -1, -1));

        jbModificar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 334, -1, -1));

        jbNuevo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 334, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        try {
            int idCliente = Integer.parseInt(jtId.getText());
            nuevoCliente = clienteData.buscarCliente(idCliente);
            if (nuevoCliente != null) {

                jtApe.setText(nuevoCliente.getApellido());
                jtNom.setText(nuevoCliente.getNombre());
                jtDom.setText(nuevoCliente.getDomicilio());
                jtTel.setText(nuevoCliente.getTelefono());

            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El código de cliente no es válido: ");

        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        Integer idCliente = Integer.parseInt(jtId.getText());
        nuevoCliente = clienteData.buscarCliente(idCliente);
        if (nuevoCliente != null) {
            clienteData.eliminarCliente(nuevoCliente.getIdCliente());
            nuevoCliente = null;
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "no hay producto seleccionado");
        }

    }//GEN-LAST:event_jbEliminarActionPerformed
    private void limpiarCampos() {
        jtId.setText("");
        jtApe.setText("");
        jtNom.setText("");
        jtDom.setText("");
        jtTel.setText("");
    }
    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        try {
            Integer idCliente = Integer.parseInt(jtId.getText());
            String ape = jtApe.getText();
            String nom = jtNom.getText();
            String dom = jtDom.getText();
            String tel = jtTel.getText();

            if (ape.isEmpty() || nom.isEmpty() || dom.isEmpty() || tel.isEmpty()) {
                JOptionPane.showMessageDialog(this, "no debe haber campos vacios");
            } else {
                nuevoCliente.setIdCliente(idCliente);
                nuevoCliente.setApellido(ape);
                nuevoCliente.setNombre(nom);
                nuevoCliente.setDomicilio(dom);
                nuevoCliente.setTelefono(tel);
                clienteData.modificarCliente(nuevoCliente);
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "El código no es válido");
        }

    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        limpiarCampos();
        nuevoCliente = null;
    }//GEN-LAST:event_jbNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JTextField jtApe;
    private javax.swing.JTextField jtDom;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNom;
    private javax.swing.JTextField jtTel;
    // End of variables declaration//GEN-END:variables
}
