
package proyectoventasg23.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectoventasg23.Entidades.DetalleVenta;
import proyectoventasg23.Entidades.Producto;
import proyectoventasg23.Entidades.Venta;
import proyectoventasg23.Entidades.Cliente;

public class DetalleVentaData {
    private Connection connection = null;

    public DetalleVentaData() {
        connection = Conexion.getConexion();
    }

    public void guardarDetalleVenta(DetalleVenta detalleVenta) {
        String sql = "INSERT INTO detalleVenta (cantidad, idVenta, precioVenta, idProducto)"
                + " VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, detalleVenta.getCantidad());
            ps.setInt(2, detalleVenta.getVenta().getIdVenta());
            ps.setDouble(3, detalleVenta.getPrecioVenta());
            ps.setInt(4, detalleVenta.getProducto().getIdProducto());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                detalleVenta.setIdDetalleVenta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Detalle de venta registrado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de detalles de venta");
        }
    }

    public void modificarDetalleVenta(DetalleVenta detalleVenta) {
        String sql = "UPDATE detalleVenta SET cantidad = ?, idVenta = ?, precioVenta = ?, idProducto = ?"
                + " WHERE idDetalleVenta = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, detalleVenta.getCantidad());
            ps.setInt(2, detalleVenta.getVenta().getIdVenta());
            ps.setDouble(3, detalleVenta.getPrecioVenta());
            ps.setInt(4, detalleVenta.getProducto().getIdProducto());
            ps.setInt(5, detalleVenta.getIdDetalleVenta());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Detalle de venta modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de detalles de venta");
        }
    }

    public void eliminarDetalleVenta(int id) {
        String sql = "DELETE FROM detalleVenta WHERE idDetalleVenta = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Detalle de venta eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de detalles de venta");
        }
    }

   public List<DetalleVenta> listarDetalleVenta() {
    List<DetalleVenta> detallesVenta = new ArrayList<DetalleVenta>();
    String sql = "SELECT dv.idDetalleVenta, dv.cantidad, dv.precioVenta, v.idCliente, v.fechaVenta, p.idProducto, p.nombreProducto, p.descripcion, p.precioActual, p.stock, p.estado " +
                 "FROM detalleVenta dv " +
                 "INNER JOIN venta v ON dv.idVenta = v.idVenta " +
                 "INNER JOIN producto p ON dv.idProducto = p.idProducto";
    
    try {
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            DetalleVenta detalleVenta = new DetalleVenta();
            detalleVenta.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
            detalleVenta.setCantidad(rs.getInt("cantidad"));
            detalleVenta.setPrecioVenta(rs.getDouble("precioVenta"));

            Venta venta = new Venta();
            venta.setIdVenta(rs.getInt("idVenta"));

            Cliente cliente = new Cliente();
            cliente.setIdCliente(rs.getInt("idCliente"));
            venta.setCliente(cliente);

            venta.setFechaVenta(rs.getDate("fechaVenta").toLocalDate());
            detalleVenta.setVenta(venta);

            Producto producto = new Producto();
            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setNombreProducto(rs.getString("nombreProducto"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecioActual(rs.getDouble("precioActual"));
            producto.setStock(rs.getInt("stock"));
            producto.setEstado(rs.getBoolean("estado"));
            detalleVenta.setProducto(producto);

            detallesVenta.add(detalleVenta);
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de detalles de venta");
    }
    return detallesVenta;
}
   
   
   
 public DetalleVenta buscarDetalleVenta(int id) {
    DetalleVenta detalleVenta = null;
    String sql = "SELECT dv.cantidad, dv.precioVenta, v.idCliente, v.fechaVenta, p.idProducto, p.nombreProducto, p.descripcion, p.precioActual, p.stock, p.estado " +
                 "FROM detalleVenta dv " +
                 "INNER JOIN venta v ON dv.idVenta = v.idVenta " +
                 "INNER JOIN producto p ON dv.idProducto = p.idProducto " +
                 "WHERE dv.idDetalleVenta = ?";
    try {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            detalleVenta = new DetalleVenta();
            detalleVenta.setIdDetalleVenta(id);
            detalleVenta.setCantidad(rs.getInt("cantidad"));
            detalleVenta.setPrecioVenta(rs.getDouble("precioVenta"));
            Venta venta = new Venta();
            venta.setIdVenta(rs.getInt("idVenta"));
            Cliente cliente = new Cliente();
            cliente.setIdCliente(rs.getInt("idCliente"));
            venta.setCliente(cliente);
            venta.setFechaVenta(rs.getDate("fechaVenta").toLocalDate());
            detalleVenta.setVenta(venta);
            Producto producto = new Producto();
            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setNombreProducto(rs.getString("nombreProducto"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecioActual(rs.getDouble("precioActual"));
            producto.setStock(rs.getInt("stock"));
            producto.setEstado(rs.getBoolean("estado"));
            detalleVenta.setProducto(producto);
        } else {
            JOptionPane.showMessageDialog(null, "No existe el detalle de venta buscado");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de detalles de venta");
    }
    return detalleVenta;
}
}