
package proyectoventasg23.Entidades;

import java.time.LocalDate;

public class Venta {
    
   int idVenta;
   Cliente cliente; 
   LocalDate FechaVenta;

    public Venta() {
    }

    public Venta(int idVenta, Cliente cliente, LocalDate FechaVenta) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.FechaVenta = FechaVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(LocalDate FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", cliente=" + cliente + ", FechaVenta=" + FechaVenta + '}';
    }
   
   
}
