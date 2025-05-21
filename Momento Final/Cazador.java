import java.util.Random;

public class Cazador extends Personaje {

    public Cazador(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int opcion = rand.nextInt(3) + 1;
        int dano = 0;

        switch (opcion) {
            case 1:
                dano = 20;
                System.out.println(nombre + " usa Espadazo.");
                break;
            case 2:
                dano = 30;
                System.out.println(nombre + " dispara Flecha Explosiva.");
                break;
            case 3:
                dano = 10;
                System.out.println(nombre + " ataca con Golpe de Escudo.");
                break;
        }

        oponente.recibirDano(dano);
    }
}
