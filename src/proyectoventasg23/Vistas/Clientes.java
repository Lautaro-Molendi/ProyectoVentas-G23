
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

        jpEscritorio = new javax.swing.JPanel();
        jModificar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jtTel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtDom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtApe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtNom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBtnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));
        setBorder(null);
        setClosable(true);
        setMaximizable(true);
        setTitle("Administración de Clientes");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jpEscritorio.setBackground(new java.awt.Color(255, 153, 153));
        jpEscritorio.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jModificar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jBAgregar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Teléfono:");

        jtDom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDomActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Domicilio:");

        jtApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Apellido:");

        jtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jBtnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEscritorioLayout = new javax.swing.GroupLayout(jpEscritorio);
        jpEscritorio.setLayout(jpEscritorioLayout);
        jpEscritorioLayout.setHorizontalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscritorioLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEscritorioLayout.createSequentialGroup()
                        .addComponent(jBAgregar)
                        .addGap(48, 48, 48)
                        .addComponent(jBtnLimpiar)
                        .addGap(47, 47, 47)
                        .addComponent(jModificar))
                    .addComponent(jtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDom, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jpEscritorioLayout.setVerticalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEscritorioLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jtDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar)
                    .addComponent(jModificar)
                    .addComponent(jBtnLimpiar))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed

        ModificarCliente vistaModCliente = new ModificarCliente(); //creo un objeto de la vista de modificar
        menuPpal.escritorio.add(vistaModCliente);// se lo agrego al menuPpal
        vistaModCliente.setVisible(true);//lo hago visible 
        vistaModCliente.moveToFront();//lo traigo adelante
    }//GEN-LAST:event_jModificarActionPerformed

    private void jtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomActionPerformed

    }//GEN-LAST:event_jtNomActionPerformed

    private void jtApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApeActionPerformed

    }//GEN-LAST:event_jtApeActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed

        String apellido = jtApe.getText();
        String nombre = jtNom.getText();
        String domicilio = jtDom.getText();
        String telefono = jtTel.getText();
        if (apellido.isEmpty() || nombre.isEmpty() || domicilio.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "no debe haber campos vacios");
        } else if (!comprobarLetras(apellido) || !comprobarLetras(nombre)) {//llamo al metodo creado para comprobar que sean validos los textos
            JOptionPane.showMessageDialog(null, "Nombre y Apellido no lleva números");
        } else {
            Cliente cliente = new Cliente(apellido, nombre, domicilio, telefono);
            ClienteData clienteData = new ClienteData();
            clienteData.guardarCliente(cliente);
        }


    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jtDomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDomActionPerformed

    }//GEN-LAST:event_jtDomActionPerformed

    private void jtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelActionPerformed

    }//GEN-LAST:event_jtTelActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed

        limpiarCampos();
        Cliente cliente = null;
    }//GEN-LAST:event_jBtnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jModificar;
    private javax.swing.JPanel jpEscritorio;
    private javax.swing.JTextField jtApe;
    private javax.swing.JTextField jtDom;
    private javax.swing.JTextField jtNom;
    private javax.swing.JTextField jtTel;
    // End of variables declaration//GEN-END:variables
     private void limpiarCampos() {
    jtApe.setText(""); 
    jtNom.setText(""); 
    jtDom.setText(""); 
    jtTel.setText(""); 
     }
    private boolean comprobarLetras(String texto) {

        return texto.matches("^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]*$"); //compruebo si los campos tienen letras 
    }
}
