package proyectoventasg23.Entidades;

public class DetalleVenta {
    
    int idDetalleVenta;    
    Venta venta;
    Producto producto;
    int cantidad;
    double precioVenta;
   

    public DetalleVenta() {
    }

    public DetalleVenta(Venta venta, Producto producto, int cantidad, double precioVenta) {
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }

    public DetalleVenta(int idDetalleVenta, Venta venta, Producto producto, int cantidad, double precioVenta) {
        this.idDetalleVenta = idDetalleVenta;
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "DetalleVenta nro: " + idDetalleVenta + ", venta:" + venta + ", producto:" + producto + ", cantidad:" + cantidad + ", precioVenta:" + precioVenta;
    }

    
    
    
}
