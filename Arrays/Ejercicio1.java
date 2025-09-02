import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var tamArray = ScannerManager.leerInt(scanner, "Introduce el tamaño del array: ");
        final var min = ScannerManager.leerInt(scanner, "Introduce el valor mínimo del array: ");
        final var max = ScannerManager.leerInt(scanner, "Introduce el valor máximo del array: ");
        final var escalar = ScannerManager.leerInt(scanner, "Introduce el valor del escalar: ");
        scanner.close();

        final var arrayOriginal = RandomUtilities.generarRandomArrayInt(tamArray, min, max, new java.util.Random());
        final var arrayResultado = calcularProductoEscalar(arrayOriginal, escalar);
        mostrarArray(arrayOriginal, arrayResultado);
        
    }

    static int[] calcularProductoEscalar(int[] array, int escalar) {
        final var resultado = array.length;
        final var producto = new int[resultado];

        for (var i = 0; i < resultado; i++) {
            producto[i] = array[i] * escalar;
        }

        return producto;
    }

    static void mostrarArray(int[] arrayOriginal, int[] arrayResultado) {
       System.out.printf("Array original es: %s%n", Arrays.toString(arrayOriginal));
       System.out.printf("Array resultado es: %s%n", Arrays.toString(arrayResultado));
    }

}
