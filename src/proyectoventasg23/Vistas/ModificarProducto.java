/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoventasg23.Vistas;

import javax.swing.JOptionPane;
import proyectoventasg23.AccesoADatos.ProductoData;
import proyectoventasg23.Entidades.Producto;

/**
 *
 * @author Altamirano
 */
public class ModificarProducto extends javax.swing.JInternalFrame {
private ProductoData proData = new ProductoData();
private Producto nuevoPro = null;
    /**
     * Creates new form ModificarProducto
     */
    public ModificarProducto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jlnom = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlPre = new javax.swing.JLabel();
        jlSto = new javax.swing.JLabel();
        jtNom = new javax.swing.JTextField();
        jtDes = new javax.swing.JTextField();
        jtPre = new javax.swing.JTextField();
        jtSto = new javax.swing.JTextField();
        jbMod = new javax.swing.JButton();
        jbBus = new javax.swing.JButton();
        jbNue = new javax.swing.JButton();
        jrEst = new javax.swing.JRadioButton();
        jlEst = new javax.swing.JLabel();
        jbEli = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jdEscritorio.setBackground(new java.awt.Color(240, 240, 240));
        jdEscritorio.setForeground(new java.awt.Color(240, 240, 240));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setText("Modificar producto");

        jLabel2.setText("Ingrese el ID del producto: ");

        jtId.setText(" ");

        jlnom.setText("Nombre:");

        jLabel3.setText("Descripción:");

        jlPre.setText("Precio:");

        jlSto.setText("Stock:");

        jtNom.setText(" ");

        jtDes.setText("  ");

        jtPre.setText("  ");

        jbMod.setText("Modificar");
        jbMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModActionPerformed(evt);
            }
        });

        jbBus.setText("Buscar");
        jbBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBusActionPerformed(evt);
            }
        });

        jbNue.setText("Nuevo");
        jbNue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNueActionPerformed(evt);
            }
        });

        jlEst.setText("Estado:");

        jbEli.setText("Eliminar");
        jbEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliActionPerformed(evt);
            }
        });

        jdEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jtId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jlnom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jlPre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jlSto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jtNom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jtDes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jtPre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jtSto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jbMod, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jbBus, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jbNue, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jrEst, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jlEst, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jbEli, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdEscritorioLayout.createSequentialGroup()
                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdEscritorioLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1))
                    .addGroup(jdEscritorioLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBus))
                    .addGroup(jdEscritorioLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlnom)
                                .addComponent(jLabel3)
                                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jlSto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlPre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jdEscritorioLayout.createSequentialGroup()
                                .addComponent(jlEst)
                                .addGap(25, 25, 25)))
                        .addGap(35, 35, 35)
                        .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdEscritorioLayout.createSequentialGroup()
                                .addComponent(jrEst)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtPre)
                            .addComponent(jtDes)
                            .addComponent(jtNom)
                            .addComponent(jtSto))))
                .addGap(94, 94, 94))
            .addGroup(jdEscritorioLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jbMod)
                .addGap(18, 18, 18)
                .addComponent(jbNue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbEli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdEscritorioLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jbBus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnom)
                    .addComponent(jtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPre)
                    .addComponent(jtPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlSto)
                    .addComponent(jtSto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrEst)
                    .addComponent(jlEst))
                .addGap(7, 7, 7)
                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMod)
                    .addComponent(jbNue)
                    .addComponent(jbEli))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jdEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModActionPerformed
        // TODO add your handling code here:
        try {
          Integer idProducto = Integer.parseInt(jtId.getText());  
          String nom = jtNom.getText();
          String des = jtDes.getText();
          Double pre = Double.parseDouble(jtPre.getText());
          Integer sto = Integer.parseInt(jtSto.getText());
          if (nom.isEmpty()|| des.isEmpty()|| pre.equals(0)|| sto.equals(0)){
            JOptionPane.showMessageDialog(this, "no debe haber campos vacios");  
          }
          Boolean est = jrEst.isSelected();
          
          nuevoPro.setIdProducto(idProducto);
          nuevoPro.setNombreProducto(nom);
          nuevoPro.setDescripcion(des);
          nuevoPro.setPrecioActual(pre);
          nuevoPro.setStock(sto);
          proData.modificarProducto(nuevoPro);
          
        } catch (NumberFormatException nfe){
             JOptionPane.showMessageDialog(this, "el id no es valido");
        }
        
    }//GEN-LAST:event_jbModActionPerformed

    private void jbBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBusActionPerformed
        // TODO add your handling code here:
        try{
            Integer idProducto = Integer.parseInt(jtId.getText());
            nuevoPro = proData.buscarProducto(idProducto);
            if (nuevoPro!=null){
                
             jtNom.setText(nuevoPro.getNombreProducto());
             jtDes.setText(nuevoPro.getDescripcion());    
             jtPre.setText(Double.toString(nuevoPro.getPrecioActual()));
             jtSto.setText(Integer.toString(nuevoPro.getStock()));
             jrEst.setSelected(nuevoPro.isEstado());
             
            }
            
       } catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(this, "el id no es valido");
           
       }
    }//GEN-LAST:event_jbBusActionPerformed

    private void jbNueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNueActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        nuevoPro= null;
        
    }//GEN-LAST:event_jbNueActionPerformed

    private void jbEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliActionPerformed
        // TODO add your handling code here:
          if (nuevoPro!=null){
            proData.eliminarProducto(nuevoPro.getIdProducto());
            nuevoPro = null;
            limpiarCampos();
        } else {
          JOptionPane.showMessageDialog(this, "no hay producto seleccionado");  
        }
    }//GEN-LAST:event_jbEliActionPerformed
    private void limpiarCampos(){
        jtId.setText("");
        jtNom.setText("");
        jtDes.setText("");
        jtPre.setText("");
        jtSto.setText("");
        jrEst.setSelected(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbBus;
    private javax.swing.JButton jbEli;
    private javax.swing.JButton jbMod;
    private javax.swing.JButton jbNue;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JLabel jlEst;
    private javax.swing.JLabel jlPre;
    private javax.swing.JLabel jlSto;
    private javax.swing.JLabel jlnom;
    private javax.swing.JRadioButton jrEst;
    private javax.swing.JTextField jtDes;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNom;
    private javax.swing.JTextField jtPre;
    private javax.swing.JTextField jtSto;
    // End of variables declaration//GEN-END:variables
}