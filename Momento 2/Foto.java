// Clase que representa una fotografía que puede ser impresa
public class Foto {

    // Nombre del archivo de la foto (puede ser ruta o nombre simple)
    private String fichero;

    // Constructor que recibe el nombre del archivo y lo guarda
    public Foto(String fichero) {
        this.fichero = fichero;
    }

    // Método que simula la impresión de la foto mostrando su nombre
    public void print() {
        System.out.println("Imprimiendo foto: " + fichero);
    }
}
