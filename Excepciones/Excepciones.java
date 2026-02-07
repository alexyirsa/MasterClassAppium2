package Excepciones;

import java.util.Arrays;

public class Excepciones {
    public static void main(String[] args) {
      final int[] arrayAleatorio = RandomUtilities.generarRandomArrayInt(5, 10, 100, new java.util.Random());
      final var scanner = new java.util.Scanner(System.in);

      int indiceLeido;

      do{
        mostrarArray(arrayAleatorio);
        indiceLeido = ScannerManager.leerInt(scanner, "Ingrese un índice para mostrar su elemento (0-4), presione -1 para salir:");
        if(indiceLeido != -1){
            mostrarElemento(indiceLeido, arrayAleatorio);
        }
      }while(indiceLeido != -1);

      scanner.close();
      
    }

    static void mostrarElemento(int i, int[] array) {
        System.out.printf("El elemento en la posición %s es %d%n%n", i, array[i]);
    }

    static void mostrarArray(int[] array) {
        System.out.printf("El Array es: %s%n", Arrays.toString(array));
    
    }

    
}
