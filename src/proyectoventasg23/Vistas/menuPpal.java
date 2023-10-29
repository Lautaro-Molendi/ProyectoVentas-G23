
package proyectoventasg23.Vistas;


public class menuPpal extends javax.swing.JFrame {
       
   
    public menuPpal() {
        initComponents();
      
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateral = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        panelMenucl = new javax.swing.JPanel();
        jlabelCliente = new javax.swing.JLabel();
        panelMenuProd = new javax.swing.JPanel();
        jlabelProducto = new javax.swing.JLabel();
        panelMenuVenta = new javax.swing.JPanel();
        jlabelVentas = new javax.swing.JLabel();
        jPanelCons = new javax.swing.JPanel();
        jLabConsulta = new javax.swing.JLabel();
        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FRAVEMAX  SRL");
        setBackground(new java.awt.Color(255, 255, 255));

        panelLateral.setBackground(new java.awt.Color(255, 153, 153));

        labelLogo.setBackground(new java.awt.Color(255, 153, 153));
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N

        panelMenucl.setBackground(new java.awt.Color(255, 102, 102));

        jlabelCliente.setBackground(new java.awt.Color(255, 102, 102));
        jlabelCliente.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jlabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlabelCliente.setText("Clientes");
        jlabelCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelClienteMouseClicked(evt);
            }
        });
        jlabelCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jlabelClienteKeyPressed(evt);
            }
        });

        panelMenuProd.setBackground(new java.awt.Color(255, 102, 102));

        jlabelProducto.setBackground(new java.awt.Color(255, 102, 102));
        jlabelProducto.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jlabelProducto.setForeground(new java.awt.Color(255, 255, 255));
        jlabelProducto.setText("Productos");
        jlabelProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuProdLayout = new javax.swing.GroupLayout(panelMenuProd);
        panelMenuProd.setLayout(panelMenuProdLayout);
        panelMenuProdLayout.setHorizontalGroup(
            panelMenuProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMenuProdLayout.setVerticalGroup(
            panelMenuProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabelProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        panelMenuVenta.setBackground(new java.awt.Color(255, 102, 102));

        jlabelVentas.setBackground(new java.awt.Color(255, 102, 102));
        jlabelVentas.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jlabelVentas.setForeground(new java.awt.Color(255, 255, 255));
        jlabelVentas.setText("Ventas");
        jlabelVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelVentasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuVentaLayout = new javax.swing.GroupLayout(panelMenuVenta);
        panelMenuVenta.setLayout(panelMenuVentaLayout);
        panelMenuVentaLayout.setHorizontalGroup(
            panelMenuVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMenuVentaLayout.setVerticalGroup(
            panelMenuVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelCons.setBackground(new java.awt.Color(255, 102, 102));

        jLabConsulta.setBackground(new java.awt.Color(255, 102, 102));
        jLabConsulta.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabConsulta.setForeground(new java.awt.Color(255, 255, 255));
        jLabConsulta.setText("Consultas");
        jLabConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabConsultaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsLayout = new javax.swing.GroupLayout(jPanelCons);
        jPanelCons.setLayout(jPanelConsLayout);
        jPanelConsLayout.setHorizontalGroup(
            jPanelConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelConsLayout.setVerticalGroup(
            jPanelConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelMenuclLayout = new javax.swing.GroupLayout(panelMenucl);
        panelMenucl.setLayout(panelMenuclLayout);
        panelMenuclLayout.setHorizontalGroup(
            panelMenuclLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuclLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jlabelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelMenuProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelMenuVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMenuclLayout.setVerticalGroup(
            panelMenuclLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuclLayout.createSequentialGroup()
                .addComponent(jlabelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelMenuProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(panelMenuclLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenuVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMenuclLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jPanelCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMenucl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelMenucl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelTitulo.setBackground(new java.awt.Color(255, 102, 102));

        labelTitulo.setBackground(new java.awt.Color(255, 153, 153));
        labelTitulo.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTitulo.setText("Lideres en electrodomésticos");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(657, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        escritorio.setBackground(new java.awt.Color(255, 204, 204));
        escritorio.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1027, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(escritorio)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlabelClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlabelClienteKeyPressed
        
    }//GEN-LAST:event_jlabelClienteKeyPressed

    private void jlabelClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelClienteMouseClicked
      escritorio.removeAll();
        escritorio.repaint();
        Clientes vistaClientes= new Clientes();
        vistaClientes.setVisible(true);
        escritorio.add(vistaClientes);
        escritorio.moveToFront(vistaClientes);
    }//GEN-LAST:event_jlabelClienteMouseClicked

    private void jlabelProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelProductoMouseClicked
       escritorio.removeAll();
        escritorio.repaint();
        Productos vistaProductos = new Productos();
        vistaProductos.setVisible(true);
        escritorio.add(vistaProductos);
        escritorio.moveToFront(vistaProductos);
       
    }//GEN-LAST:event_jlabelProductoMouseClicked

    private void jlabelVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelVentasMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        VistaVentas vistaVentas = new VistaVentas();
        vistaVentas.setVisible(true);
        escritorio.add(vistaVentas);
        escritorio.moveToFront(vistaVentas);
    }//GEN-LAST:event_jlabelVentasMouseClicked

    private void jLabConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabConsultaMouseClicked
        escritorio.removeAll();
        escritorio.repaint();
        VistaConsultas vistaConsultas = new VistaConsultas();
        vistaConsultas.setVisible(true);
        escritorio.add(vistaConsultas);
        escritorio.moveToFront(vistaConsultas);
    }//GEN-LAST:event_jLabConsultaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPpal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabConsulta;
    private javax.swing.JPanel jPanelCons;
    private javax.swing.JLabel jlabelCliente;
    private javax.swing.JLabel jlabelProducto;
    private javax.swing.JLabel jlabelVentas;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelMenuProd;
    private javax.swing.JPanel panelMenuVenta;
    private javax.swing.JPanel panelMenucl;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
