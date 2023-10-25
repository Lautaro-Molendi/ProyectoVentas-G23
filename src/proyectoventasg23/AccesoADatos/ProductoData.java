 
package proyectoventasg23.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectoventasg23.Entidades.*;
import proyectoventasg23.AccesoAdatos.*;


public class ProductoData {
    private Connection connection = null;
    
    public ProductoData(){
        connection = Conexion.getConexion();         
  }
    
    public void guardarProducto (Producto producto){
        String sql = "INSERT INTO producto (nombreProducto, descripcion, precioActual, stock, estado)"
                + " VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "producto guardado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo acceder a la tabla producto");
        }
      }      
    
    public void eliminarProducto (int id){
        String sql = "UPDATE producto SET estado = 0 WHERE idProducto = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
           int exito = ps.executeUpdate();
           if (exito==1){
               JOptionPane.showMessageDialog(null, "producto eliminado");
           }
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo acceder a la tabla producto");
        }
}
    public void modificarProducto(Producto producto){
        String sql = "UPDATE producto SET nombreProducto= ?, descripcion= ?, precioActual= ?, stock= ?"
                + " WHERE idProducto= ? ";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble (3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setInt(5, producto.getIdProducto());
            int exito = ps.executeUpdate();
            
            if (exito==1){
                JOptionPane.showMessageDialog(null, "producto modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo acceder a la tabla producto");
        }
  }
    public List <Producto> listarProducto (){
    List <Producto> productos = new ArrayList <Producto>();
    String sql = "SELECT idProducto, nombreProducto, descripcion, precioActual, stock"
            + " FROM producto WHERE estado = 1";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
            Producto producto = new Producto();
            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setNombreProducto(rs.getString("nombreProducto"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecioActual(rs.getDouble("precioActual"));
            producto.setStock(rs.getInt("stock"));   
            productos.add(producto);
             
        }
            System.out.println(" ");
         ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se pudo acceder a la tabla producto");
        }
    return productos;
  } 
    
  public Producto buscarProducto (int idProducto){
      Producto producto =null;
    String sql = "SELECT nombreProducto, descripcion, precioActual, stock"
            + " FROM producto WHERE idProducto = ? AND estado = 1";
    PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
            producto = new Producto();
            producto.setIdProducto(idProducto);
            producto.setNombreProducto(rs.getString("nombreProducto"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecioActual(rs.getDouble("precioActual"));
            producto.setStock(rs.getInt("stock"));      
        } else {
           JOptionPane.showMessageDialog(null, "El producto no existe");
                   }
         ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla producto");
        }
    return producto;
  }   
    
}