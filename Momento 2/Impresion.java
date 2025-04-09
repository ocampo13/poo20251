// Clase que representa un producto de tipo Impresion
// Hereda de Producto
public class Impresion extends Producto {

    // Atributo que indica si la impresión es a color, blanco y negro, etc.
    private String color;

    // Arreglo de objetos Foto: representa todas las fotos que se van a imprimir
    private Foto[] fotos;

    // Constructor: inicializa el número, el color y las fotos de la impresión
    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);          // Llama al constructor de Producto
        this.color = color;     // Asigna el color recibido
        this.fotos = fotos;     // Asigna las fotos recibidas
    }

    // Implementación del método abstracto mostrarDetalle()
    // Muestra todos los datos de esta impresión y las fotos que contiene
    @Override
    public void mostrarDetalle() {
        System.out.println("---- Producto: Impresión ----");
        System.out.println("Número de producto: " + numero);
        System.out.println("Color: " + color);
        System.out.println("Fotos:");
        // Recorre el arreglo de fotos e imprime cada una
        for (Foto foto : fotos) {
            foto.print();  // Llama al método print() de cada foto
        }
    }
}
