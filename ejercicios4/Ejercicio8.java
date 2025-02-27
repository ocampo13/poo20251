package ejercicios4;  // Asegúrate de que la carpeta se llame "ejercicios4"

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[30];

        // Llenar el arreglo con números ingresados por el usuario
        System.out.println("Ingrese 30 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Inicializar mayor y menor correctamente
        int mayor = numeros[0];
        int menor = numeros[0];
        int repeticionesMayor = 0;
        int repeticionesMenor = 0;

        // Encontrar mayor y menor número
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            } else if (num < menor) {  // Aquí estaba el error de "meno" mal escrito
                menor = num;
            }
        }

        // Contar repeticiones del mayor y menor
        for (int num : numeros) {
            if (num == mayor) {
                repeticionesMayor++;
            }
            if (num == menor) {
                repeticionesMenor++;
            }
        }

        // Mostrar resultados
        System.out.println("Número mayor: " + mayor + " (Repetido " + repeticionesMayor + " veces)");
        System.out.println("Número menor: " + menor + " (Repetido " + repeticionesMenor + " veces)");

        scanner.close();
    }
}
