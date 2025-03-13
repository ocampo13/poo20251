import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class ParqueaderoCali {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos un objeto Scanner para capturar la entrada del usuario

        // Arreglos para almacenar las placas de las motos según su cilindraje
        String[] bajoCilindraje = new String[20]; // Arreglo de 20 posiciones para motos de bajo cilindraje (< 400cc)
        String[] altoCilindraje = new String[10]; // Arreglo de 10 posiciones para motos de alto cilindraje (>= 400cc)

        // Arreglos para almacenar el tiempo de ingreso de cada moto
        int[] minutosIngresoBajo = new int[20]; // Minutos de ingreso para motos de bajo cilindraje
        int[] minutosIngresoAlto = new int[10]; // Minutos de ingreso para motos de alto cilindraje

        int opcion; // Variable para almacenar la opción del menú seleccionada por el usuario

        do {
            // Mostramos el menú de opciones al usuario
            System.out.println("\nMenú opciones:");
            System.out.println("1. Registrar moto");
            System.out.println("2. Cobrar tarifa");
            System.out.println("3. Visualizar estado parqueadero");
            System.out.println("4. Abandonar menú");
            System.out.print("Digite una opción: ");
            opcion = sc.nextInt(); // Capturamos la opción del usuario
            sc.nextLine(); // Limpiamos el buffer del Scanner

            if (opcion == 1) { // Opción para registrar una moto
                System.out.println("Digite la placa de la moto:");
                String placa = sc.next(); // Capturamos la placa de la moto
                System.out.println("Digite el cilindraje de la moto:");
                int cilindraje = sc.nextInt(); // Capturamos el cilindraje de la moto
                sc.nextLine(); // Limpiamos el buffer del Scanner

                System.out.println("Digite la hora de ingreso en formato HH:MM (ejemplo 14:30):");
                String[] tiempo = sc.nextLine().split(":"); // Dividimos la hora ingresada en horas y minutos

                if (tiempo.length != 2) { // Validamos que el formato sea correcto
                    System.out.println("Formato de hora incorrecto. Intente de nuevo.");
                    continue; // Volvemos al menú
                }

                // Convertimos la hora ingresada a minutos totales
                int minutosIngreso = Integer.parseInt(tiempo[0]) * 60 + Integer.parseInt(tiempo[1]);

                if (cilindraje < 400) { // Si la moto es de bajo cilindraje (< 400cc)
                    System.out.println("Digite la posición (1-20):");
                    int pos = sc.nextInt() - 1; // Convertimos la posición a índice de array
                    if (pos >= 0 && pos < 20 && bajoCilindraje[pos] == null) { // Verificamos que la posición sea válida y esté libre
                        bajoCilindraje[pos] = placa; // Registramos la placa en el arreglo
                        minutosIngresoBajo[pos] = minutosIngreso; // Registramos la hora de ingreso
                        System.out.println("Moto registrada en puesto " + (pos + 1));
                    } else {
                        System.out.println("Posición ocupada o inválida.");
                    }
                } else { // Si la moto es de alto cilindraje (>= 400cc)
                    System.out.println("Digite la posición (1-10):");
                    int pos = sc.nextInt() - 1; // Convertimos la posición a índice de array
                    if (pos >= 0 && pos < 10 && altoCilindraje[pos] == null) { // Verificamos que la posición sea válida y esté libre
                        altoCilindraje[pos] = placa; // Registramos la placa en el arreglo
                        minutosIngresoAlto[pos] = minutosIngreso; // Registramos la hora de ingreso
                        System.out.println("Moto registrada en puesto " + (pos + 1));
                    } else {
                        System.out.println("Posición ocupada o inválida.");
                    }
                }
            } else if (opcion == 2) { // Opción para cobrar tarifa
                System.out.println("Digite la placa de la moto:");
                String placa = sc.next(); // Capturamos la placa de la moto
                sc.nextLine(); // Limpiamos el buffer del Scanner

                System.out.println("Digite la hora de salida en formato HH:MM (ejemplo 15:45):");
                String[] tiempo = sc.nextLine().split(":"); // Dividimos la hora ingresada en horas y minutos

                if (tiempo.length != 2) { // Validamos que el formato sea correcto
                    System.out.println("Formato de hora incorrecto. Intente de nuevo.");
                    continue; // Volvemos al menú
                }

                // Convertimos la hora ingresada a minutos totales
                int minutosSalida = Integer.parseInt(tiempo[0]) * 60 + Integer.parseInt(tiempo[1]);
                boolean encontrada = false; // Variable para verificar si la moto fue encontrada

                // Buscamos la moto en el arreglo de bajo cilindraje
                for (int i = 0; i < 20; i++) {
                    if (bajoCilindraje[i] != null && bajoCilindraje[i].equals(placa)) {
                        int tiempoEstacionado = minutosSalida - minutosIngresoBajo[i]; // Calculamos el tiempo estacionado
                        int costo = (tiempoEstacionado <= 30) ? 0 : (tiempoEstacionado <= 60) ? 800 : 2000; // Calculamos el costo
                        System.out.println("Tiempo: " + tiempoEstacionado + " minutos. Costo: $" + costo);
                        bajoCilindraje[i] = null; // Liberamos el puesto
                        encontrada = true;
                        break;
                    }
                }

                // Buscamos la moto en el arreglo de alto cilindraje
                for (int i = 0; i < 10; i++) {
                    if (altoCilindraje[i] != null && altoCilindraje[i].equals(placa)) {
                        int tiempoEstacionado = minutosSalida - minutosIngresoAlto[i]; // Calculamos el tiempo estacionado
                        int costo = (tiempoEstacionado <= 30) ? 0 : (tiempoEstacionado <= 60) ? 800 : 2000; // Calculamos el costo
                        System.out.println("Tiempo: " + tiempoEstacionado + " minutos. Costo: $" + costo);
                        altoCilindraje[i] = null; // Liberamos el puesto
                        encontrada = true;
                        break;
                    }
                }

                if (!encontrada) { // Si la moto no se encontró en ningún arreglo
                    System.out.println("Moto no encontrada.");
                }
            } else if (opcion == 3) { // Opción para visualizar el estado del parqueadero
                System.out.println("Puestos de bajo cilindraje:");
                for (int i = 0; i < 20; i++) {
                    System.out.println("Puesto " + (i + 1) + ": " + (bajoCilindraje[i] == null ? "Libre" : "Ocupado"));
                }
                System.out.println("Puestos de alto cilindraje:");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Puesto " + (i + 1) + ": " + (altoCilindraje[i] == null ? "Libre" : "Ocupado"));
                }
            }

        } while (opcion != 4); // Repetimos el menú hasta que el usuario elija salir

        System.out.println("Abandonando programa!..."); // Mensaje de despedida
        sc.close(); // Cerramos el Scanner para liberar recursos
    }
}
