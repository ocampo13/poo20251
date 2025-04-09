// Clase abstracta: no se pueden crear objetos directamente de esta clase
// Sirve como base para otros productos como Camara e Impresion
public abstract class Producto {

    // Atributo que guarda el número del producto (puede ser código interno)
    protected int numero;

    // Constructor: inicializa el número del producto
    public Producto(int numero) {
        this.numero = numero;
    }

    // Método para obtener el número del producto
    public int getNumero() {
        return numero;
    }

    // Método abstracto: cada clase hija debe escribir su propia versión
    public abstract void mostrarDetalle();
}
