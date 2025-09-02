import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var tamArray = ScannerManager.leerInt(scanner, "Introduce el tamaño del array: ");
        final var min = ScannerManager.leerInt(scanner, "Introduce el array min: ");
        final var max = ScannerManager.leerInt(scanner, "Introduce el array max: ");
        scanner.close();
        final var random = new java.util.Random();
        final var array1 = RandomUtilities.generarRandomArrayDouble(tamArray, min, max, random);
        final var array2 = RandomUtilities.generarRandomArrayDouble(tamArray, min, max, random);
        final var promedioPonderado = calcularPromedioPonderado(array1, array2);
        mostrarArray(array1, array2, promedioPonderado);
    }

    static double calcularPromedioPonderado(double[] array1, double[] array2){
        final var n = array1.length;
        double numerador = 0.0;
        for (var i = 0; i < array1.length; i++) {
            numerador += (array1[i] * array2[i]);
        }
        return numerador / n;
    }

    static void mostrarArray(double[] array1, double[] array2, double promedioPonderado) {
        System.out.printf("Array Uno es: %s%n", Arrays.toString(array1));
        System.out.printf("Array Dos es: %s%n", Arrays.toString(array2));
        System.out.printf("El promedio ponderado es: %s%n", promedioPonderado);
    }
}
