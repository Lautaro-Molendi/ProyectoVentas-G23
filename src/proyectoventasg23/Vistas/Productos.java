/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoventasg23.Vistas;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyectoventasg23.AccesoADatos.ProductoData;
import proyectoventasg23.Entidades.Producto;



public class Productos extends javax.swing.JInternalFrame {


private ProductoData proData = new ProductoData();
private Producto nuevoPro = null;
    
    /**
     * Creates new form Producto
     */
    public Productos() {
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

        jTextField3 = new javax.swing.JTextField();
        jNombre = new javax.swing.JLabel();
        jtNom = new javax.swing.JTextField();
        jDescripcion = new javax.swing.JLabel();
        jtDes = new javax.swing.JTextField();
        jPrecio = new javax.swing.JLabel();
        jtPre = new javax.swing.JTextField();
        jStock = new javax.swing.JLabel();
        jtSto = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setBorder(null);
        setResizable(true);
        setTitle("Administración de Productos");
        setPreferredSize(new java.awt.Dimension(800, 600));

        jNombre.setText("Nombre");

        jDescripcion.setText("Descripción");

        jPrecio.setText("Precio");

        jStock.setText("Stock");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jButton1.setText("Modificar");

        jButton2.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jNombre)
                .addGap(44, 44, 44)
                .addComponent(jtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jDescripcion)
                .addGap(32, 32, 32)
                .addComponent(jtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPrecio)
                .addGap(51, 51, 51)
                .addComponent(jtPre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jStock)
                .addGap(51, 51, 51)
                .addComponent(jtSto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jbGuardar)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jbSalir))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jNombre))
                    .addComponent(jtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jDescripcion))
                    .addComponent(jtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPrecio))
                    .addComponent(jtPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jStock))
                    .addComponent(jtSto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardar)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jbSalir)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
           try {
        String nombre = jtNom.getText();
        String descripcion = jtDes.getText();
        Double precio = Double.parseDouble(jtPre.getText());
        Integer stock = Integer.parseInt(jtSto.getText());
        if(nombre.isEmpty()||descripcion.isEmpty()||precio.equals(0)|| stock.equals(0)){
            JOptionPane.showMessageDialog(this,"no puede haber campos vacios");
      }
        if (nuevoPro == null){
                nuevoPro = new Producto (nombre, descripcion, precio, stock, true);
                proData.guardarProducto(nuevoPro);
                JOptionPane.showMessageDialog(this, "producto guardado");
           }
      
      }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "no se pudo ingresar a la tabla"); 
     }
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jDescripcion;
    private javax.swing.JLabel jNombre;
    private javax.swing.JLabel jPrecio;
    private javax.swing.JLabel jStock;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtDes;
    private javax.swing.JTextField jtNom;
    private javax.swing.JTextField jtPre;
    private javax.swing.JTextField jtSto;
    // End of variables declaration//GEN-END:variables
}