package Clase4;

public class Vehiculo {

    // Atributos de la Clase
    private String marca;
    private String color;
    private double cilindraje;
    private String chasis;
    private double peso;
    private String potencia;

    // Constructor de la clase permite Inicializar el objeto
    // El constructor de la clase se reconoce porque tiene el mismo nombre de la
    // clase

    public Vehiculo(String marca, String color, double cilindraje, String chasis, double peso, String potencia) {
        this.marca = marca;
        this.color = color;
        this.cilindraje = cilindraje;
        this.chasis = chasis;
        this.peso = peso;
        this.potencia = potencia;
    }

    // Metodos getter and setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Permite mostrar el objeto.

    public String toString() {
        return "Vehiculo {Marca: " + marca + "Color: " + color +
                " Cilindraje: " + cilindraje + " Chasis: " + chasis + " Peso: "
                + peso + "Potencia: " + potencia + "}";
    }

    //Métodos de la clase
    public void acelerar(){
    system.System.out.println("Vehiculo acelerando.......");
    }
    public void frenar(){
        system.System.out.println("Vehiculo frenando.......");
        }
    public void girarIzquierda(){
        system.System.out.println("Vehiculo grirando a la izquierda.......");
        }
    public void girarDerecha(){
            system.System.out.println("Vehiculo girando a la derecha.......");
        }
    public void retroceder(){
        system.System.out.println("Vehiculo retrocediendo.......");
        }

}
