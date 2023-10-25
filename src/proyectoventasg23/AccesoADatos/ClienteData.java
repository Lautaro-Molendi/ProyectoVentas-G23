
package proyectoventasg23.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectoventasg23.Entidades.*;



public class ClienteData {
      private Connection connection = null;
    
    public ClienteData(){
        connection = Conexion.getConexion();         
  }
    public void guardarCliente (Cliente cliente){
        String sql = "INSERT INTO cliente (apellido, nombre, domicilio, telefono)"
                + " VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                cliente.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente registrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de clientes");
        }
      }     
     public void modificarCliente(Cliente cliente){
        String sql = "UPDATE cliente SET apellido= ?, nombre= ?, domicilio= ?, telefono= ?"
                + " WHERE idCliente= ? ";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString (3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.setInt(5, cliente.getIdCliente());
            int exito = ps.executeUpdate();
            
            if (exito==1){
                JOptionPane.showMessageDialog(null, "Cliente modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de clientes");
        }
  }
      public void eliminarCliente (int id){
        String sql = "DELETE FROM cliente WHERE idCliente = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
           int exito = ps.executeUpdate();
           if (exito==1){
               JOptionPane.showMessageDialog(null, "Cliente eliminado");
           }
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de clientes ");
        }
}
       public List <Cliente> listarCliente(){
    List <Cliente> clientes = new ArrayList <Cliente>();
    String sql = "SELECT idCliente, apellido, nombre, domicilio, telefono"
            + " FROM cliente";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            Cliente cliente = new Cliente();
            cliente.setIdCliente(rs.getInt("idCliente"));
            cliente.setApellido(rs.getString("apellido"));
            cliente.setNombre(rs.getString("nombre"));
            cliente.setDomicilio(rs.getString("domicilio"));
            cliente.setTelefono(rs.getString("telefono"));
            clientes.add(cliente);             
        }
            System.out.print(" ");
         ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de clientes");
        }
    return clientes;
          
  } 
  
      public Cliente buscarCliente (int idCliente){
      Cliente cliente =null;
    String sql = "SELECT apellido, nombre, domicilio, telefono"
            + " FROM cliente WHERE idCliente = ?";
    PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
            cliente = new Cliente();
            cliente.setIdCliente(idCliente);
            cliente.setApellido(rs.getString("apellido"));
            cliente.setNombre(rs.getString("nombre"));
            cliente.setDomicilio(rs.getString("domicilio"));
            cliente.setTelefono(rs.getString("telefono"));     
        } else {
           JOptionPane.showMessageDialog(null, "El cliente no existe");
                   }
         ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla producto");
        }
    return cliente;
  }   
    
}
