package listas;

import java.util.List;
import java.util.Random;

public class OrdenamientoListasBoobleSort {

    public static void main(String[] args) {

        final var lista = RandomUtilities.generarListaIntAleatoria(30, 10, 500, new Random());
        imprimirLista(lista);
        ordenarListas(lista);
        imprimirLista(lista);
    }
    static void ordenarArray(int[] array) {
        final var n = array.length;
       for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static void ordenarListas(List<Integer> list) {
        final var n = list.size();
        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    var temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    static void imprimirLista(List<Integer> list) {
       System.out.printf("La lista es: %s%n", list);
    }
        
}
