
package proyectoventasg23.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectoventasg23.Entidades.*;
import proyectoventasg23.AccesoADatos.ProductoData;
import proyectoventasg23.Entidades.Venta;

public class DetalleVentaData {
    private Connection connection = null;
    private ProductoData productoData;
    
    public DetalleVentaData() {
        connection = Conexion.getConexion();
        productoData=new ProductoData();
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
        List<DetalleVenta> detallesVenta = new ArrayList<>();
        String sql = "SELECT dv.idDetalleVenta, dv.cantidad, dv.precioVenta, v.idVenta, p.idProducto " +
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
                detalleVenta.setVenta(venta);

                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                detalleVenta.setProducto(producto);

                detallesVenta.add(detalleVenta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de detalles de ventas");
        }
        return detallesVenta;
    }




  
public DetalleVenta buscarDetalleVenta(int id) {
    DetalleVenta detalleVenta = null;
    String sql = "SELECT idDetalleVenta, cantidad, precioVenta, idVenta, idProducto " +
                 "FROM detalleVenta " +
                 "WHERE idDetalleVenta = ?";
    PreparedStatement ps = null;
    try {
        ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            detalleVenta = new DetalleVenta();
            detalleVenta.setIdDetalleVenta(id);
            detalleVenta.setCantidad(rs.getInt("cantidad"));
            detalleVenta.setPrecioVenta(rs.getDouble("precioVenta"));

            Venta venta = new Venta();
            venta.setIdVenta(rs.getInt("idVenta"));
            detalleVenta.setVenta(venta);

            Producto producto = productoData.buscarProducto(rs.getInt("idProducto"));
            producto.setIdProducto(rs.getInt("idProducto"));
            detalleVenta.setProducto(producto);
        } else {
            JOptionPane.showMessageDialog(null, "No existe el detalle de venta buscado");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de detalles de ventas");
    }
    return detalleVenta;
}

public List<DetalleVenta> obtenerDetallesVentaDeVenta(Venta venta)  {
    List<DetalleVenta> detalles = new ArrayList<>();
    String sql = "SELECT idDetalleVenta, cantidad, precioVenta, idProducto FROM detalleVenta WHERE idVenta = ?";
    
    try (PreparedStatement ps = connection.prepareStatement(sql)) {
        ps.setInt(1, venta.getIdVenta());
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            DetalleVenta detalle = new DetalleVenta();
            detalle.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
            detalle.setCantidad(rs.getInt("cantidad"));
            detalle.setPrecioVenta(rs.getDouble("precioVenta"));
            detalle.setVenta(venta);
            detalles.add(detalle);
        }
    }   catch (SQLException ex) {
            Logger.getLogger(DetalleVentaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return detalles;
}

   

public List<Producto> listarProductosDeVentaEnFecha(LocalDate fecha) {
    List<Producto> productos = new ArrayList<>();
    String sql = "SELECT p.idProducto, p.nombreProducto, p.descripcion, p.precioActual, p.stock " +
                 "FROM venta v " +
                 "INNER JOIN detalleVenta dv ON v.idVenta = dv.idVenta " +
                 "INNER JOIN producto p ON dv.idProducto = p.idProducto " +
                 "WHERE v.fechaVenta = ?";
    
    try {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setDate(1, java.sql.Date.valueOf(fecha));
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Producto producto = new Producto();
            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setNombreProducto(rs.getString("nombreProducto"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecioActual(rs.getDouble("precioActual"));
            producto.setStock(rs.getInt("stock"));
            productos.add(producto);
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de detalles de ventas");
    }
    return productos;
}

   
}
