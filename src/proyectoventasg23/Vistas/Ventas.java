
package proyectoventasg23.Vistas;

import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import proyectoventasg23.AccesoADatos.*;
import proyectoventasg23.Entidades.*;

public class Ventas extends javax.swing.JInternalFrame {
    public VentaData ventaD= new VentaData();
    public Venta ventaNueva=null;
    public DetalleVentaData detalleData= new DetalleVentaData();
    public DetalleVenta nuevoDetalle=null;
    public Cliente nuevoCli= null;
    public ClienteData clientDat= new ClienteData();
    public Producto nuevoProducto= null;
    public ProductoData proData=new ProductoData();
    public int idCliente, idProducto;
    
    public Ventas() {
        initComponents();
    
        agregarClientes();
        agregarProducto();
            limpiarCampos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelVentas = new javax.swing.JPanel();
        jLabelFech = new javax.swing.JLabel();
        jDateVenta = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jTextCliente = new javax.swing.JTextField();
        jComboCliente = new javax.swing.JComboBox<>();
        jBtnRegistrarVenta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextProducto = new javax.swing.JTextField();
        jTextCant = new javax.swing.JTextField();
        jTextPrecio = new javax.swing.JTextField();
        jComboProducto = new javax.swing.JComboBox<>();
        jBtnRegistrarDetalle = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setMaximizable(true);

        jPanelVentas.setBackground(new java.awt.Color(255, 153, 153));
        jPanelVentas.setToolTipText("");

        jLabelFech.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelFech.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFech.setText("Seleccionar fecha:");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese código de cliente:");

        jComboCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jComboCliente.setMaximumRowCount(4);
        jComboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboClienteActionPerformed(evt);
            }
        });

        jBtnRegistrarVenta.setText("Registrar Venta");
        jBtnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistrarVentaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Producto");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cantidad");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Precio");

        jComboProducto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jComboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboProductoActionPerformed(evt);
            }
        });

        jBtnRegistrarDetalle.setText("Registrar Detalle");
        jBtnRegistrarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistrarDetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVentasLayout = new javax.swing.GroupLayout(jPanelVentas);
        jPanelVentas.setLayout(jPanelVentasLayout);
        jPanelVentasLayout.setHorizontalGroup(
            jPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentasLayout.createSequentialGroup()
                .addGroup(jPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentasLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabelFech)
                        .addGap(18, 18, 18)
                        .addComponent(jDateVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVentasLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextCant, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVentasLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVentasLayout.createSequentialGroup()
                        .addGroup(jPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelVentasLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelVentasLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboCliente, 0, 308, Short.MAX_VALUE)
                            .addComponent(jComboProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelVentasLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jBtnRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVentasLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jBtnRegistrarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
        );
        jPanelVentasLayout.setVerticalGroup(
            jPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentasLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFech))
                    .addComponent(jDateVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentasLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addGroup(jPanelVentasLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jBtnRegistrarVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentasLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addGroup(jPanelVentasLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jTextProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentasLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3))
                    .addComponent(jTextCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVentasLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jBtnRegistrarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboClienteActionPerformed
       //obtengl cliente del jCombo 
        Cliente clienteSeleccionado = (Cliente) jComboCliente.getSelectedItem();
         if (clienteSeleccionado != null) {   
             idCliente= clienteSeleccionado.getIdCliente();
            jTextCliente.setText(String.valueOf(clienteSeleccionado.getIdCliente()));
         }else{
         jTextCliente.setText("");
         }
    }//GEN-LAST:event_jComboClienteActionPerformed

    private void jComboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboProductoActionPerformed
        Producto productoSeleccionado = (Producto) jComboProducto.getSelectedItem();
          if(productoSeleccionado!=null){
           idProducto= productoSeleccionado.getIdProducto();
          jTextCliente.setText(String.valueOf(productoSeleccionado.getIdProducto()));
          jTextPrecio.setText(String.valueOf(productoSeleccionado.getPrecioActual()));
          }else{
          jTextProducto.setText("");
          jTextPrecio.setText("");
          }
    }//GEN-LAST:event_jComboProductoActionPerformed

    private void jBtnRegistrarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistrarDetalleActionPerformed
     
           try{
               Integer idProducto = Integer.parseInt(jTextProducto.getText());
               Integer cantidad = Integer.parseInt(jTextCant.getText());
               Double precio = Double.parseDouble(jTextPrecio.getText());
               if(ventaNueva!=null && idProducto!=null && cantidad !=null){
                    Producto producto = proData.buscarProducto(idProducto);
                    if(producto!=null){
                  nuevoDetalle=new DetalleVenta(cantidad, ventaNueva, precio, producto);
                  detalleData.guardarDetalleVenta(nuevoDetalle);
                }else{JOptionPane.showMessageDialog(this,"No puede haber campos vacíos");}
          
    }//GEN-LAST:event_jBtnRegistrarDetalleActionPerformed
            }catch(NumberFormatException ex){
           
           JOptionPane.showMessageDialog(this, "Ingrese números que sean válidos.");}}
    
    private void jBtnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistrarVentaActionPerformed
         
        try {
            Date fechaSeleccionada = jDateVenta.getDate();

            if (fechaSeleccionada != null) {
                LocalDate fechaVta = fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                try {
                    idCliente = Integer.parseInt(jTextCliente.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "id no valido"+ex);
                } catch (HeadlessException ex) {
                    JOptionPane.showMessageDialog(this, "no sé"+ex);
                }
               
                    nuevoCli = clientDat.buscarCliente(idCliente);
                    ventaNueva = new Venta(nuevoCli, fechaVta);
                    ventaD.guardarVenta(ventaNueva);
            } else{JOptionPane.showMessageDialog(this, "No seleccionó fecha");}                 
           
              
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese numeros");
    }//GEN-LAST:event_jBtnRegistrarVentaActionPerformed
    }
    private void limpiarCampos(){
    jDateVenta.setDate(null);
    jTextCliente.setText("");
    jComboCliente.setSelectedIndex(-1);
    jTextProducto.setText("");
     jComboProducto.setSelectedIndex(-1);
     jTextProducto.setText("");
     jTextCant.setText("");
     jTextPrecio.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnRegistrarDetalle;
    private javax.swing.JButton jBtnRegistrarVenta;
    private javax.swing.JComboBox<Cliente> jComboCliente;
    private javax.swing.JComboBox<Producto> jComboProducto;
    private com.toedter.calendar.JDateChooser jDateVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelFech;
    private javax.swing.JPanel jPanelVentas;
    private javax.swing.JTextField jTextCant;
    private javax.swing.JTextField jTextCliente;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextProducto;
    // End of variables declaration//GEN-END:variables
       
    public void agregarClientes() {
        ClienteData clienteData = new ClienteData();
        List<Cliente> listaClientes = clienteData.listarCliente();
        for (Cliente cli : listaClientes) {
            jComboCliente.addItem(cli);
        }
    }
    
    public void agregarProducto(){
    ProductoData produData= new ProductoData();
    List<Producto>listaProductos= produData.listarProducto();
    for(Producto prod:listaProductos){
    jComboProducto.addItem(prod);
    }
    }
    
  
}