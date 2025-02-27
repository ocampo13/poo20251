package ejercicios4; // Asegúrate de que el paquete sea correcto

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();
        int[] numeros = new int[tamaño];

        // Llenar el arreglo con valores ingresados por el usuario
        System.out.println("Ingrese " + tamaño + " números:");
        for (int i = 0; i < tamaño; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Pedir el número a buscar
        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscar = scanner.nextInt();

        // Contar cuántas veces aparece el número en el arreglo
        int contador = 0;
        for (int num : numeros) {
            if (num == numeroBuscar) {
                contador++;
            }
        }

        // Mostrar el resultado
        System.out.println("El número " + numeroBuscar + " aparece " + contador + " veces en el arreglo.");

        scanner.close();
    }
}
