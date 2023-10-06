package proyectoventasg23.Entidades;

public class Cliente {
    
    int idCliente;
    String nombre; 
    String apellido;
    String domicilio;
    String telefono;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String apellido, String domicilio, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Cliente(String nombre, String apellido, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "nombre:" + nombre + ", apellido:" + apellido + ", domicilio:" + domicilio + ", telefono:" + telefono ;
    }
    
    
    
    
    
}
