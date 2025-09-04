import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var tamArray = ScannerManager.leerInt(scanner, "Introduce el tamaño del array: ");
        final var min = ScannerManager.leerInt(scanner, "Introduce el radio min: ");
        final var max = ScannerManager.leerInt(scanner, "Introduce el radio max: ");
        scanner.close();
        final var random = new java.util.Random();
        final var array1 = RandomUtilities.generarRandomArrayDouble(tamArray, min, max, random);
        mostrarArray(array1, calcularArea(array1), calcularArrayPermietro(array1));
    }

    static double[] calcularArrayPermietro(double[] array){
        double[] perimetros = new double[array.length];
        for (var i = 0; i < array.length; i++) {
            perimetros[i] = array[i] * 2 * Math.PI;
        }
        return perimetros;
    }

    static double[] calcularArea(double[] array){
        double[] areas = new double[array.length];
        for (var i = 0; i < array.length; i++) {
            areas[i] = Math.PI * Math.pow(array[i], 2);
        }
        return areas;
    }

    static void mostrarArray(double[] arrayRadio, double[] arrayArea, double[] arrayPerimetro){ {
        System.out.printf("Array de Radios es: %s%n", Arrays.toString(arrayRadio));
        System.out.printf("Array de Areas es: %s%n", Arrays.toString(arrayArea));
        System.out.printf("Array de Perimetros es: %s%n", Arrays.toString(arrayPerimetro));
    }
    }
}
