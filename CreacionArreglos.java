public class CreacionArreglos {
    public static void main(String[] args) {
        
        //creacion de arreglo de enteros
        int [] a = {3, 6, 5, 10, 20, 1, 4, 9 };

        //Recorrer y mostrar los elementos del arreglo
        //a.length -> Obtiene la longitud del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+ i +"]=" + a[i]);
        }
    }
}
