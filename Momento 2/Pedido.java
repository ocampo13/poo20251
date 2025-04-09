import java.util.Date;  // Se usa para manejar la fecha del pedido

// Clase que representa un pedido hecho por un cliente
public class Pedido {

    // Cliente que realizó el pedido (relación de agregación)
    private Cliente cliente;

    // Arreglo de productos comprados en el pedido
    private Producto[] productos;

    // Fecha en la que se hizo el pedido
    private Date fecha;

    // Número de tarjeta con el que se pagó el pedido
    private int numeroTarjetaCredito;

    // Constructor: recibe todos los datos del pedido y los guarda
    public Pedido(Cliente cliente, Producto[] productos, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    // Método que muestra toda la información del pedido
    public void mostrarPedido() {
        System.out.println("====== DETALLE DEL PEDIDO ======");
        System.out.println("Nombre del cliente: " + cliente.getNombre());   // Usa método getNombre()
        System.out.println("Cédula del cliente: " + cliente.getCedula());   // Usa método getCedula()
        System.out.println("Fecha del pedido: " + fecha.toString());        // Muestra la fecha actual
        System.out.println("Número de tarjeta de crédito: " + numeroTarjetaCredito); // Muestra la tarjeta
        System.out.println("Productos incluidos en el pedido:");

        // Recorre todos los productos y muestra su detalle
        // POLIMORFISMO: cada producto puede ser una Camara o una Impresion
        for (Producto p : productos) {
            p.mostrarDetalle();  // Se ejecuta la versión correspondiente según el tipo real
        }
    }
}
