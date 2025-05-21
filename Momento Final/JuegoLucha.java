public class JuegoLucha {
    private Personaje jugador;
    private Personaje maquina;

    public JuegoLucha(Personaje jugador, Personaje maquina) {
        this.jugador = jugador;
        this.maquina = maquina;
    }

    public void iniciarPelea() {
        System.out.println("¡La pelea comienza entre " + jugador.getNombre() + " y " + maquina.getNombre() + "!\n");

        while (jugador.estaVivo() && maquina.estaVivo()) {
            turno(jugador, maquina);
            if (maquina.estaVivo()) {
                turno(maquina, jugador);
            }
        }

        if (jugador.estaVivo()) {
            System.out.println("\n¡" + jugador.getNombre() + " ha ganado la pelea!");
        } else {
            System.out.println("\n" + maquina.getNombre() + " ha ganado la pelea.");
        }
    }

    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("\nTurno de " + atacante.getNombre());
        System.out.println(defensor.getNombre() + " tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.");
    }
}
