
package proyectoventasg23;

import java.sql.Connection;
import proyectoventasg23.AccesoADatos.Conexion;
import proyectoventasg23.AccesoADatos.ProductoData;
import proyectoventasg23.Entidades.Producto;

public class ProyectoVentasG23 {

   
    public static void main(String[] args) {
    Connection connection = Conexion.getConexion();
    // Producto p1 = new Producto (6, "azucar", "alimento seco", 750, 16, true);
      ProductoData pD = new ProductoData ();
       //pD.guardarProducto(p1);
        //pD.eliminarProducto(11);
        //pD.modificarProducto(p1);
       // System.out.println(pD.listarProducto());
        System.out.println(pD.buscarProducto(6)); 
       
    }
    
}
