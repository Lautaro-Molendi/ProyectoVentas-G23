/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoventasg23.Vistas;

import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author luciana
 */
public class Consultas extends javax.swing.JInternalFrame {

    
    public Consultas() {
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoConsulta = new javax.swing.ButtonGroup();
        escritorioConsultas = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jRadProdxFecha = new javax.swing.JRadioButton();
        jRadVentaxFecha = new javax.swing.JRadioButton();
        jRadventaxCliente = new javax.swing.JRadioButton();
        jRadClientesyProd = new javax.swing.JRadioButton();
        jLBuscarPxF = new javax.swing.JLabel();
        jLBuscarVxC = new javax.swing.JLabel();
        jLBuscarVxF = new javax.swing.JLabel();
        jLBuscarCxC = new javax.swing.JLabel();
        jBtnAceptar = new javax.swing.JButton();
        jPanelProdxFecha = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jBtnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();

        setTitle("Consultas");

        escritorioConsultas.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout escritorioConsultasLayout = new javax.swing.GroupLayout(escritorioConsultas);
        escritorioConsultas.setLayout(escritorioConsultasLayout);
        escritorioConsultasLayout.setHorizontalGroup(
            escritorioConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
        );
        escritorioConsultasLayout.setVerticalGroup(
            escritorioConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jRadProdxFecha.setBackground(new java.awt.Color(255, 153, 153));
        grupoConsulta.add(jRadProdxFecha);
        jRadProdxFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadProdxFechaActionPerformed(evt);
            }
        });

        jRadVentaxFecha.setBackground(new java.awt.Color(255, 153, 153));
        grupoConsulta.add(jRadVentaxFecha);
        jRadVentaxFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadVentaxFechaActionPerformed(evt);
            }
        });

        jRadventaxCliente.setBackground(new java.awt.Color(255, 153, 153));
        grupoConsulta.add(jRadventaxCliente);
        jRadventaxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadventaxClienteActionPerformed(evt);
            }
        });

        jRadClientesyProd.setBackground(new java.awt.Color(255, 153, 153));
        grupoConsulta.add(jRadClientesyProd);
        jRadClientesyProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadClientesyProdActionPerformed(evt);
            }
        });

        jLBuscarPxF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLBuscarPxF.setForeground(new java.awt.Color(51, 51, 51));
        jLBuscarPxF.setText("Buscar productos por fecha");

        jLBuscarVxC.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLBuscarVxC.setForeground(new java.awt.Color(51, 51, 51));
        jLBuscarVxC.setText("Buscar ventas por cliente");

        jLBuscarVxF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLBuscarVxF.setForeground(new java.awt.Color(51, 51, 51));
        jLBuscarVxF.setText("Buscar ventas por fecha");

        jLBuscarCxC.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLBuscarCxC.setForeground(new java.awt.Color(51, 51, 51));
        jLBuscarCxC.setText("Buscar clientes segun compra");

        jBtnAceptar.setBackground(new java.awt.Color(255, 102, 102));
        jBtnAceptar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jBtnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnAceptar.setText("Aceptar");
        jBtnAceptar.setBorder(null);
        jBtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese la fecha");

        jDateChooser1.setBackground(new java.awt.Color(204, 204, 204));
        jDateChooser1.setForeground(new java.awt.Color(255, 153, 153));
        jDateChooser1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jBtnBuscar.setBackground(new java.awt.Color(255, 102, 102));
        jBtnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jBtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnBuscar.setText("Buscar");
        jBtnBuscar.setBorder(null);
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 153));

        jTabla.setBackground(new java.awt.Color(255, 153, 153));
        jTabla.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jTabla.setForeground(new java.awt.Color(51, 51, 51));
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabla.setGridColor(new java.awt.Color(255, 102, 102));
        jTabla.setSelectionBackground(new java.awt.Color(255, 51, 102));
        jTabla.setSelectionForeground(new java.awt.Color(255, 153, 153));
        jScrollPane1.setViewportView(jTabla);

        javax.swing.GroupLayout jPanelProdxFechaLayout = new javax.swing.GroupLayout(jPanelProdxFecha);
        jPanelProdxFecha.setLayout(jPanelProdxFechaLayout);
        jPanelProdxFechaLayout.setHorizontalGroup(
            jPanelProdxFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdxFechaLayout.createSequentialGroup()
                .addGroup(jPanelProdxFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProdxFechaLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelProdxFechaLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(jPanelProdxFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProdxFechaLayout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );
        jPanelProdxFechaLayout.setVerticalGroup(
            jPanelProdxFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdxFechaLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanelProdxFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(60, 60, 60)
                .addComponent(jBtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(jPanelProdxFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelProdxFechaLayout.createSequentialGroup()
                    .addGap(251, 251, 251)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(251, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadventaxCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLBuscarVxC)
                        .addGap(760, 760, 760))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadProdxFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadClientesyProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadVentaxFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLBuscarPxF)
                            .addComponent(jBtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLBuscarCxC)
                            .addComponent(jLBuscarVxF))
                        .addGap(725, 725, 725))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(343, 343, 343)
                    .addComponent(jPanelProdxFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLBuscarPxF)
                    .addComponent(jRadProdxFecha))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadventaxCliente)
                    .addComponent(jLBuscarVxC))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadClientesyProd)
                    .addComponent(jLBuscarCxC))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadVentaxFecha)
                    .addComponent(jLBuscarVxF))
                .addGap(53, 53, 53)
                .addComponent(jBtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelProdxFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(escritorioConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(escritorioConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptarActionPerformed
        if(jRadProdxFecha.isSelected()){
            jPanelProdxFecha.setVisible(true);
           
        }
    }//GEN-LAST:event_jBtnAceptarActionPerformed

    private void jRadClientesyProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadClientesyProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadClientesyProdActionPerformed

    private void jRadventaxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadventaxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadventaxClienteActionPerformed

    private void jRadVentaxFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadVentaxFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadVentaxFechaActionPerformed

    private void jRadProdxFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadProdxFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadProdxFechaActionPerformed

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed

    }//GEN-LAST:event_jBtnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorioConsultas;
    private javax.swing.ButtonGroup grupoConsulta;
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JButton jBtnBuscar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLBuscarCxC;
    private javax.swing.JLabel jLBuscarPxF;
    private javax.swing.JLabel jLBuscarVxC;
    private javax.swing.JLabel jLBuscarVxF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelProdxFecha;
    private javax.swing.JRadioButton jRadClientesyProd;
    private javax.swing.JRadioButton jRadProdxFecha;
    private javax.swing.JRadioButton jRadVentaxFecha;
    private javax.swing.JRadioButton jRadventaxCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    // End of variables declaration//GEN-END:variables
}
