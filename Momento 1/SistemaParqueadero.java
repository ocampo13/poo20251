import java.util.Scanner;

// Clase Moto que representa una motocicleta
class Moto {
    String placa;
    int cilindraje;
    long horaIngreso;

    public Moto(String placa, int cilindraje, long horaIngreso) {
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.horaIngreso = horaIngreso;
    }
}

// Clase Parqueadero que maneja los espacios
class Parqueadero {
    Moto[] bajoCilindraje = new Moto[20]; // 20 espacios
    Moto[] altoCilindraje = new Moto[10]; // 10 espacios
    Scanner sc = new Scanner(System.in);

    // Método para registrar una moto
    public void registrarMoto() {
        System.out.println("Ingrese la placa de la moto:");
        String placa = sc.next();
        System.out.println("Ingrese el cilindraje de la moto:");
        int cilindraje = sc.nextInt();
        boolean registrado = false;

        if (cilindraje < 400) {
            while (!registrado) {
                mostrarEstadoBajoCilindraje();
                System.out.println("Seleccione un puesto (1-20):");
                int puesto = sc.nextInt() - 1;

                if (puesto >= 0 && puesto < bajoCilindraje.length) {
                    if (bajoCilindraje[puesto] == null) {
                        bajoCilindraje[puesto] = new Moto(placa, cilindraje, System.currentTimeMillis());
                        System.out.println("Moto registrada en puesto " + (puesto + 1));
                        registrado = true;
                    } else {
                        System.out.println("❌ El puesto ya está ocupado. Intente con otro.");
                    }
                } else {
                    System.out.println("⚠️ Número de puesto inválido. Intente nuevamente.");
                }
            }
        } else {
            while (!registrado) {
                mostrarEstadoAltoCilindraje();
                System.out.println("Seleccione un puesto (1-10):");
                int puesto = sc.nextInt() - 1;

                if (puesto >= 0 && puesto < altoCilindraje.length) {
                    if (altoCilindraje[puesto] == null) {
                        altoCilindraje[puesto] = new Moto(placa, cilindraje, System.currentTimeMillis());
                        System.out.println("Moto registrada en puesto " + (puesto + 1));
                        registrado = true;
                    } else {
                        System.out.println("❌ El puesto ya está ocupado. Intente con otro.");
                    }
                } else {
                    System.out.println("⚠️ Número de puesto inválido. Intente nuevamente.");
                }
            }
        }
    }

    // Método para calcular tarifa y liberar espacio
    public void cobrarTarifa() {
        System.out.println("Ingrese la placa de la moto:");
        String placa = sc.next();

        for (int i = 0; i < bajoCilindraje.length; i++) {
            if (bajoCilindraje[i] != null && bajoCilindraje[i].placa.equals(placa)) {
                calcularYMostrarCobro(bajoCilindraje[i]);
                bajoCilindraje[i] = null;
                return;
            }
        }

        for (int i = 0; i < altoCilindraje.length; i++) {
            if (altoCilindraje[i] != null && altoCilindraje[i].placa.equals(placa)) {
                calcularYMostrarCobro(altoCilindraje[i]);
                altoCilindraje[i] = null;
                return;
            }
        }

        System.out.println("❌ La moto con placa " + placa + " no fue encontrada.");
    }

    // Método auxiliar para calcular el cobro
    private void calcularYMostrarCobro(Moto moto) {
        long tiempoEstacionado = (System.currentTimeMillis() - moto.horaIngreso) / (1000 * 60);
        int costo = (tiempoEstacionado <= 30) ? 0 : (tiempoEstacionado <= 60) ? 800 : 2000;

        System.out.println("⏳ Tiempo estacionado: " + tiempoEstacionado + " minutos.");
        System.out.println("💰 Costo total: $" + costo);
    }

    // Método para mostrar el estado del parqueadero
    public void mostrarEstado() {
        mostrarEstadoBajoCilindraje();
        mostrarEstadoAltoCilindraje();
    }

    private void mostrarEstadoBajoCilindraje() {
        System.out.println("📍 Puestos de bajo cilindraje:");
        for (int i = 0; i < bajoCilindraje.length; i++) {
            System.out.println("Puesto " + (i + 1) + ": " + (bajoCilindraje[i] == null ? "✅ Libre" : "❌ Ocupado"));
        }
    }

    private void mostrarEstadoAltoCilindraje() {
        System.out.println("📍 Puestos de alto cilindraje:");
        for (int i = 0; i < altoCilindraje.length; i++) {
            System.out.println("Puesto " + (i + 1) + ": " + (altoCilindraje[i] == null ? "✅ Libre" : "❌ Ocupado"));
        }
    }
}

// Clase principal que maneja el menú
public class SistemaParqueadero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();
        int opcion;

        do {
            System.out.println("\n📌 Menú Principal:");
            System.out.println("1️⃣ Registrar moto");
            System.out.println("2️⃣ Cobrar tarifa");
            System.out.println("3️⃣ Mostrar estado del parqueadero");
            System.out.println("4️⃣ Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    parqueadero.registrarMoto();
                    break;
                case 2:
                    parqueadero.cobrarTarifa();
                    break;
                case 3:
                    parqueadero.mostrarEstado();
                    break;
                case 4:
                    System.out.println("👋 Saliendo del sistema...");
                    break;
                default:
                    System.out.println("❌ Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
