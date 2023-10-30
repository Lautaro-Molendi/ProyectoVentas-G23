
package proyectoventasg23.Vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import proyectoventasg23.AccesoADatos.ProductoData;
import proyectoventasg23.Entidades.Producto;

public class ModificarProducto extends javax.swing.JInternalFrame {

    private ProductoData proData = new ProductoData();
    private Producto nuevoPro = new Producto();

    public ModificarProducto() {
        initComponents();
        limpiarCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpEscritorio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jlPre = new javax.swing.JLabel();
        jlSto = new javax.swing.JLabel();
        jtNom = new javax.swing.JTextField();
        jtDes = new javax.swing.JTextField();
        jtPre = new javax.swing.JTextField();
        jtSto = new javax.swing.JTextField();
        jbMod = new javax.swing.JButton();
        jbBus = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jrEst = new javax.swing.JRadioButton();
        jlEst = new javax.swing.JLabel();
        jbEli = new javax.swing.JButton();
        jlnom = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Producto");
        setPreferredSize(new java.awt.Dimension(800, 600));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jpEscritorio.setBackground(new java.awt.Color(255, 153, 153));
        jpEscritorio.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese el ID del producto: ");

        jtId.setText(" ");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descripción:");

        jlPre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlPre.setForeground(new java.awt.Color(0, 0, 0));
        jlPre.setText("Precio:");

        jlSto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlSto.setForeground(new java.awt.Color(0, 0, 0));
        jlSto.setText("Stock:");

        jtNom.setText(" ");

        jtDes.setText("  ");

        jtPre.setText("  ");

        jbMod.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jbMod.setText("Modificar");
        jbMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModActionPerformed(evt);
            }
        });

        jbBus.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jbBus.setText("Buscar");
        jbBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBusActionPerformed(evt);
            }
        });

        jBtnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jrEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstActionPerformed(evt);
            }
        });

        jlEst.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlEst.setForeground(new java.awt.Color(0, 0, 0));
        jlEst.setText("Estado:");

        jbEli.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jbEli.setText("Eliminar");
        jbEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliActionPerformed(evt);
            }
        });

        jlnom.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jlnom.setForeground(new java.awt.Color(0, 0, 0));
        jlnom.setText("Nombre:");

        javax.swing.GroupLayout jpEscritorioLayout = new javax.swing.GroupLayout(jpEscritorio);
        jpEscritorio.setLayout(jpEscritorioLayout);
        jpEscritorioLayout.setHorizontalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscritorioLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEscritorioLayout.createSequentialGroup()
                        .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEscritorioLayout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jBtnLimpiar)
                                .addGap(66, 66, 66)
                                .addComponent(jbMod)
                                .addGap(60, 60, 60)
                                .addComponent(jbEli))
                            .addGroup(jpEscritorioLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEst)
                                    .addComponent(jlSto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlPre)
                                    .addComponent(jLabel3)
                                    .addComponent(jlnom))
                                .addGap(33, 33, 33)
                                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrEst)
                                    .addComponent(jtSto, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtNom, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtDes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)))
                                .addGap(14, 14, 14)))
                        .addContainerGap(246, Short.MAX_VALUE))
                    .addGroup(jpEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbBus)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpEscritorioLayout.setVerticalGroup(
            jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEscritorioLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBus))
                .addGap(18, 18, 18)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEscritorioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jlnom)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEscritorioLayout.createSequentialGroup()
                        .addComponent(jtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlPre)
                    .addComponent(jtPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlSto)
                    .addComponent(jtSto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrEst, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlEst, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addGroup(jpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnLimpiar)
                    .addComponent(jbMod)
                    .addComponent(jbEli))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModActionPerformed

        try {
            Integer idProducto = Integer.parseInt(jtId.getText());
            String nom = jtNom.getText();
            String des = jtDes.getText();
            Double pre = Double.parseDouble(jtPre.getText());
            Integer sto = Integer.parseInt(jtSto.getText());
            if (nom.isEmpty() || des.isEmpty() || pre.equals(0) || sto.equals(0)) {
                JOptionPane.showMessageDialog(this, "No debe haber campos vacios");
            }
            boolean est = jrEst.isSelected();

            nuevoPro.setIdProducto(idProducto);
            nuevoPro.setNombreProducto(nom);
            nuevoPro.setDescripcion(des);
            nuevoPro.setPrecioActual(pre);
            nuevoPro.setStock(sto);
            nuevoPro.setEstado(est);

            proData.modificarProducto(nuevoPro);

            if (nuevoPro.isEstado()) {
                jrEst.setSelected(true); // Si el producto está activo, selecciono el JRadioButton
            } else {
                jrEst.setSelected(false); // Si el producto no está activo el rad esta desactivado
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "El código no es valido");
        }

    }//GEN-LAST:event_jbModActionPerformed

    private void jbBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBusActionPerformed

        try {
            int idProducto = Integer.parseInt(jtId.getText());
            nuevoPro = proData.buscarProducto(idProducto);

            if (nuevoPro != null) {
                jtNom.setText(nuevoPro.getNombreProducto());
                jtDes.setText(nuevoPro.getDescripcion());
                jtPre.setText(nuevoPro.getPrecioActual() + "");
                jtSto.setText(nuevoPro.getStock() + "");
                jrEst.setText(nuevoPro.isEstado() + "");

            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El código de producto no es válido: ");

        }
    }//GEN-LAST:event_jbBusActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed

        limpiarCampos();
        nuevoPro = null;

    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jbEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliActionPerformed

        if (nuevoPro != null) {
            proData.eliminarProducto(nuevoPro.getIdProducto());
            nuevoPro = null;
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No hay producto seleccionado");
        }
    }//GEN-LAST:event_jbEliActionPerformed

    private void jrEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstActionPerformed

        nuevoPro.isEstado();

    }//GEN-LAST:event_jrEstActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

        dispose();
        Productos vistaProducto = new Productos();
        vistaProducto.setVisible(true);
        vistaProducto.moveToFront();
        jpEscritorio.add(vistaProducto);
    }//GEN-LAST:event_formMouseClicked
    private void limpiarCampos() {
        jtId.setText("");
        jtNom.setText("");
        jtDes.setText("");
        jtPre.setText("");
        jtSto.setText("");
        jrEst.setSelected(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbBus;
    private javax.swing.JButton jbEli;
    private javax.swing.JButton jbMod;
    private javax.swing.JLabel jlEst;
    private javax.swing.JLabel jlPre;
    private javax.swing.JLabel jlSto;
    private javax.swing.JLabel jlnom;
    private javax.swing.JPanel jpEscritorio;
    private javax.swing.JRadioButton jrEst;
    private javax.swing.JTextField jtDes;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNom;
    private javax.swing.JTextField jtPre;
    private javax.swing.JTextField jtSto;
    // End of variables declaration//GEN-END:variables
}
