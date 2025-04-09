// Esta clase representa a una persona que realiza pedidos
public class Cliente {

    // Atributo que almacena la cédula del cliente
    private String cedula;

    // Atributo que almacena el nombre del cliente
    private String nombre;

    // Constructor: se llama cuando se crea un nuevo objeto Cliente
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;       // Guarda la cédula que llega por parámetro
        this.nombre = nombre;       // Guarda el nombre que llega por parámetro
    }

    // Método que devuelve la cédula del cliente
    public String getCedula() {
        return cedula;
    }

    // Método que devuelve el nombre del cliente
    public String getNombre() {
        return nombre;
    }
}
