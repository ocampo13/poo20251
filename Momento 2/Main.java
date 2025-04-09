import java.util.Date; // Importa la clase Date para usar fechas

// Clase principal donde se ejecuta el programa
public class Main {
    public static void main(String[] args) {

        // Crear un cliente con cédula y nombre
        Cliente cliente = new Cliente("123456789", "Laura Torres");

        // Crear una cámara con número, marca y modelo
        Camara cam = new Camara(1, "Canon", "EOS R50");

        // Crear un arreglo de fotos para impresión
        Foto[] fotos = {
            new Foto("foto1.jpg"),
            new Foto("foto2.jpg")
        };

        // Crear una impresión con número, color y las fotos
        Impresion imp = new Impresion(2, "Color", fotos);

        // Crear un arreglo de productos que contiene la cámara y la impresión
        // Aquí se aplica el polimorfismo: el arreglo es de tipo Producto
        Producto[] productos = { cam, imp };

        // Crear un pedido con el cliente, productos, fecha actual y número de tarjeta
        Pedido pedido = new Pedido(cliente, productos, new Date(), 987654321);

        // Mostrar por pantalla todos los datos del pedido
        pedido.mostrarPedido();
    }
}
