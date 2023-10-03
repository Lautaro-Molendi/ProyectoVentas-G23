 
package proyectoventasg23.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import proyectoventasg23.Entidades.Producto;


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
            ps.setString(1, producto.getNombreProducto());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioActual());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.isEstado());
            ps.executeUpdate();
            ResultSet rs =  ps.getGeneratedKeys();
            if (rs.next()){
                producto.setIdProducto(rs.getInt("idProducto"));
                JOptionPane.showMessageDialog(null, "Producto agregado a la lista");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla producto");
        }
    }
    
    public void eliminarProducto (int id){
        String sql = "UPDATE producto SET estado = 0 WHERE idProducto = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila ==1){
                JOptionPane.showMessageDialog(null, "producto eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "no se puede acceder a la tabla producto");
        }
    }
}
