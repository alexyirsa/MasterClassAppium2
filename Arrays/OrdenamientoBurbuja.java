import java.util.Arrays;
import java.util.Random;
import java.util.Objects;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        final var arrayAleatorio = RandomUtilities.generarRandomArrayInt(30, 10, 500, new Random());
        imprimirInformacion(arrayAleatorio);
        ordenar(arrayAleatorio);
        imprimirInformacion(arrayAleatorio);
    }

    static void ordenar(int[] arreglo) {
        final int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    static void imprimirInformacion(int[] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
}
