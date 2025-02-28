package Clase4;

public class Ejecutar {
    public static void main(String[] args) {
        
        //Creacion de los objetos de clase Vehiculo

        //Forma1
        Vehiculo objVehiculo = new Vehiculo("Toyota", "Blanca", 4500.0, 2025, "TS3456WE", 2.3, "150HP");

        //Forma2
        Vehiculo objVehiculo2;
        objVehiculo2 = new Vehiculo("Ferrari", "Rojo", 5000.0, "SEWR567UY", 1.8, "450HP");


        //Mostrar la marca del objeto vehiculo
        System.out.println(objVehiculo.getMarca());

        //Se va modificarla marca del vehiculo del objeto objVehiculo1
        objVehiculo.setMarca("Chevrolet");

        //Mostrar todo el objeto
        System.out.println(objVehiculo.toString());
        System.out.println(objVehiculo2);


    }
}
