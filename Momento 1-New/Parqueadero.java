import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Parqueadero {
    Moto[] bajoCilindraje = new Moto[20]; // 20 puestos para motos <400cc
    Moto[] altoCilindraje = new Moto[10]; // 10 puestos para motos >=400cc
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");

    public void registrarMoto() {
        System.out.println("Ingrese la placa de la moto:");
        String placa = sc.nextLine();

        System.out.println("Ingrese el cilindraje de la moto:");
        int cilindraje = Integer.parseInt(sc.nextLine()); // Usa nextLine() para evitar problemas con el buffer

        String horaIngreso = "";
        boolean horaValida = false;

        System.out.println("¿Desea ingresar la hora manualmente? (S/N)");
        String respuesta = sc.nextLine().trim().toUpperCase();

        if (respuesta.equals("S")) {
            while (!horaValida) {
                System.out.println("Ingrese la hora de ingreso en formato HH:mm (Ejemplo: 14:30):");
                String horaTexto = sc.nextLine();
                
                try {
                    // Validar si la hora ingresada es correcta
                    Date horaValidada = formatoHora.parse(horaTexto);
                    horaIngreso = formatoHora.format(horaValidada);
                    horaValida = true;
                } catch (ParseException e) {
                    System.out.println("⚠ Error: Formato incorrecto. Intente nuevamente (Ejemplo: 14:30).");
                }
            }
        } else {
            // Capturar la hora actual del sistema
            Date ahora = new Date();
            horaIngreso = formatoHora.format(ahora);
        }

        Moto nuevaMoto = new Moto(placa, cilindraje, horaIngreso);

        if (cilindraje < 400) {
            for (int i = 0; i < bajoCilindraje.length; i++) {
                if (bajoCilindraje[i] == null) {
                    bajoCilindraje[i] = nuevaMoto;
                    System.out.println("✅ Moto registrada en puesto " + (i + 1) + " a las " + nuevaMoto.getHoraIngreso());
                    return;
                }
            }
        } else {
            for (int i = 0; i < altoCilindraje.length; i++) {
                if (altoCilindraje[i] == null) {
                    altoCilindraje[i] = nuevaMoto;
                    System.out.println("✅ Moto registrada en puesto " + (i + 1) + " a las " + nuevaMoto.getHoraIngreso());
                    return;
                }
            }
        }
        System.out.println("❌ No hay espacios disponibles.");
    }
}
