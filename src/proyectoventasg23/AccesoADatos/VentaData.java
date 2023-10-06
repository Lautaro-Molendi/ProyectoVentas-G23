package proyectoventasg23.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import proyectoventasg23.Entidades.*;


public class VentaData {
    
    private Connection connection = null;

    public VentaData() {
        connection = Conexion.getConexion();
    }

    public void guardarVenta(Venta venta) {
        String sql = "INSERT INTO venta (idCliente, fechaVenta) VALUES (?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, venta.getCliente().getIdCliente());
            ps.setDate(2, java.sql.Date.valueOf(venta.getFechaVenta()));
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                venta.setIdVenta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Venta registrada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de ventas");
        }
    }

    public void modificarVenta(Venta venta) {
        String sql = "UPDATE venta SET idCliente = ?, fechaVenta = ? WHERE idVenta = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, venta.getCliente().getIdCliente());
            ps.setDate(2, java.sql.Date.valueOf(venta.getFechaVenta()));
            ps.setInt(3, venta.getIdVenta());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Venta modificada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de ventas");
        }
    }

    public void eliminarVenta(int id) {
        String sql = "DELETE FROM venta WHERE idVenta = ?";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Venta eliminada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de ventas");
        }
    }
    
   public List<Venta> listarVentas() {
    List<Venta> ventas = new ArrayList<>();
    String sql = "SELECT v.idVenta, v.fechaVenta, c.idCliente, c.apellido, c.nombre, c.domicilio, c.telefono " +
                 "FROM venta v " +
                 "INNER JOIN cliente c ON v.idCliente = c.idCliente";

    try {
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Venta venta = new Venta();
            venta.setIdVenta(rs.getInt("idVenta"));

            Cliente cliente = new Cliente();
            cliente.setIdCliente(rs.getInt("idCliente"));
            cliente.setApellido(rs.getString("apellido"));
            cliente.setNombre(rs.getString("nombre"));
            cliente.setDomicilio(rs.getString("domicilio"));
            cliente.setTelefono(rs.getString("telefono"));

            venta.setCliente(cliente);
            venta.setFechaVenta(rs.getDate("fechaVenta").toLocalDate());
            ventas.add(venta);
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de ventas");
    }
    return ventas;
}


public Venta buscarVenta(int id) {
    Venta venta = null;
    String sql = "SELECT idCliente, fechaVenta FROM venta WHERE idVenta = ?";
    PreparedStatement ps = null;
    try {
        ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            venta = new Venta();
            venta.setIdVenta(id);
            int idCliente = rs.getInt("idCliente");
            ClienteData clienteData = new ClienteData();
            Cliente cliente = clienteData.buscarCliente(idCliente); 
            venta.setCliente(cliente);
            venta.setFechaVenta(rs.getDate("fechaVenta").toLocalDate());
        } else {
            JOptionPane.showMessageDialog(null, "No existe la Venta buscada");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla de ventas");
    }
    return venta;
}
}
