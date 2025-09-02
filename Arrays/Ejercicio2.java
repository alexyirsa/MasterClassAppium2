import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var tamArray = ScannerManager.leerInt(scanner, "Introduce el tamaño del array: ");
        final var min = ScannerManager.leerInt(scanner, "Introduce el valor mínimo del array: ");
        final var max = ScannerManager.leerInt(scanner, "Introduce el valor máximo del array: ");

        scanner.close();

        final var random = new java.util.Random();
        final var arrayUno = RandomUtilities.generarRandomArrayInt(tamArray, min, max, random);
        final var arrayDos = RandomUtilities.generarRandomArrayInt(tamArray, min, max, random);
        final var arrayResultado = calcularSumaArray(arrayUno, arrayDos);
        mostrarArray(arrayUno, arrayDos, arrayResultado);   
    }

    static int[] calcularSumaArray(int[] arrayUno, int[] array2) {
        final var resultado = arrayUno.length;
        final var producto = new int[resultado];

        for (var i = 0; i < resultado; i++) {
            producto[i] = arrayUno[i] + array2[i];
        }

        return producto;
    }

    static void mostrarArray(int[] arrayUno, int[] arrayDos, int[] arrayResultado) {
        System.out.printf("Array Uno es: %s%n", Arrays.toString(arrayUno));
        System.out.printf("Array Dos es: %s%n", Arrays.toString(arrayDos));
        System.out.printf("Array resultado es: %s%n", Arrays.toString(arrayResultado));
    }

}
    



