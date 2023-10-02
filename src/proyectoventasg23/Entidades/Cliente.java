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
    
    
    
}
