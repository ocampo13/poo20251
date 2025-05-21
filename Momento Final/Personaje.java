import java.util.Random;

public abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected final int MAX_DANO = 30;
    protected final int MIN_DANO = 10;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    public abstract void atacar(Personaje oponente);

    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}
