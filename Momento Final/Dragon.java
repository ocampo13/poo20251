import java.util.Scanner;

public class Dragon extends Personaje {

    public Dragon(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje oponente) {
        Scanner scanner = new Scanner(System.in);
        int dano = 0;
        int opcion = 0;

        while (opcion < 1 || opcion > 3) {
            System.out.println("\nElige tu ataque:");
            System.out.println("1. Mordida (15 daño)");
            System.out.println("2. Llama Infernal (25 daño)");
            System.out.println("3. Golpe con Ala (10 daño)");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
        }

        switch (opcion) {
            case 1:
                dano = 15;
                System.out.println(nombre + " usa Mordida.");
                break;
            case 2:
                dano = 25;
                System.out.println(nombre + " lanza Llama Infernal.");
                break;
            case 3:
                dano = 10;
                System.out.println(nombre + " da un Golpe con el Ala.");
                break;
        }

        oponente.recibirDano(dano);
    }
}
