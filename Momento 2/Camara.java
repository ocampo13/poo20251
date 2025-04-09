// Clase que representa un producto de tipo Camara
// Hereda de la clase Producto
public class Camara extends Producto {

    // Marca de la cámara, por ejemplo: Canon, Nikon
    private String marca;

    // Modelo específico de la cámara
    private String modelo;

    // Constructor: crea una nueva cámara con sus atributos
    public Camara(int numero, String marca, String modelo) {
        super(numero);           // Llama al constructor de la clase padre Producto
        this.marca = marca;      // Asigna la marca recibida
        this.modelo = modelo;    // Asigna el modelo recibido
    }

    // Implementación del método abstracto de Producto
    // Muestra todos los datos de esta cámara
    @Override
    public void mostrarDetalle() {
        System.out.println("---- Producto: Cámara ----");
        System.out.println("Número de producto: " + numero);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
