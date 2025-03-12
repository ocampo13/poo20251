import java.text.SimpleDateFormat;
import java.util.Date;

public class Moto {
    String placa;
    int cilindraje;
    long horaIngreso;  // Hora en milisegundos

    // Constructor
    public Moto(String placa, int cilindraje, long horaIngreso) {
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.horaIngreso = horaIngreso;
    }

    // Método para obtener la hora de ingreso en formato legible
    public String getHoraIngreso() {
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
        return formatoHora.format(new Date(horaIngreso));
    }
}
