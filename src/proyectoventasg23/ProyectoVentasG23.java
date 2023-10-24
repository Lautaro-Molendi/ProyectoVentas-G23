
package proyectoventasg23;

import java.sql.Connection;
import java.time.LocalDate;
import proyectoventasg23.AccesoADatos.Conexion;
import proyectoventasg23.AccesoADatos.*;
import proyectoventasg23.Entidades.*;

public class ProyectoVentasG23 {

   
    public static void main(String[] args) {
    Connection connection = Conexion.getConexion();
    //ProductoData pD = new ProductoData ();
    //pD.eliminarProducto(2);
    //pD.eliminarProducto(11);
    //pD.modificarProducto(p1);
    //System.out.println(pD.listarProducto());
    //System.out.println(pD.buscarProducto(2)); 
       
  //  Cliente c1= new Cliente("Gomez", "Carlos", "Rosas 888", "228154268");
    //  Cliente c2= new Cliente("Perez", "Mario", "Mitre 333", "2265982268");
    // Cliente c3= new Cliente(3,"Martinez", "Luis", "Maipu 2020", "365154268");
   // ClienteData cd= new ClienteData();
    //cd.guardarCliente(c1);
    //cd.modificarCliente(c1);
    //  cd.eliminarCliente(1);
    //System.out.print(cd.listarCliente());
    //cd.buscarCliente(3);
    
   // Producto p2 = new Producto (6, "arroz", "alimento en grano", 750, 16, true);
   // Cliente c= new Cliente (2,"Gomez", "Carlos", "Rosas 888", "228154268");
   // Venta v= new Venta(2, c, LocalDate.of(2023, 10, 05) );
   // VentaData vD= new VentaData();
    //vD.guardarVenta(v);
   // DetalleVenta dv= new DetalleVenta(2,v,700.00,p2);
   // DetalleVentaData dVD=new DetalleVentaData();
         //dVD.guardarDetalleVenta(dv);
    //dVD.eliminarDetalleVenta(20);
    //dVD.modificarDetalleVenta(dV);
    //System.out.println(dVD.buscarDetalleVenta(11));
    //System.out.println(dVD.listarDetalleVenta());
   // System.out.println(dVD.listarProductosDeVentaEnFecha(LocalDate.of(2023, 10, 05)));
    
     
    
    //VentaData vD= new VentaData();
    //vD.guardarVenta(v);
    //System.out.println(vD.listarVentas());  
    }
    
}
