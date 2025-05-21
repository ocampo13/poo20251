import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre de tu personaje (Dragon):");
        String nombreJugador = scanner.nextLine();

        Dragon dragon = new Dragon(nombreJugador);
        Cazador cazador = new Cazador("Cazador de Dragones");

        JuegoLucha juego = new JuegoLucha(dragon, cazador);
        juego.iniciarPelea();
    }
}
