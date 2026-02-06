package maps;

import java.util.Map;
import java.util.Scanner;

import sets.ScannerManager;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var mapaColores = crearMapa();
        final var scanner = new Scanner(System.in);

        int claveLeida;
        System.out.print("Ingrese una clave (1-4) para obtener el color asociado, presione 0 para salir: ");
        
        do{
            claveLeida = ScannerManager.leerInt(scanner, "Ingrese la clave deseada:");
            if(claveLeida != 0){
                mostrarColor(mapaColores, claveLeida);
            }

        }while((claveLeida != 0));
        scanner.close();
    }

    static Map<Integer, String> crearMapa() {
        return Map.of(
            1, "Rojo",
            2, "Verde",
            3, "Azul",
            4, "Amarillo");
        }
    
    static void mostrarColor(Map<Integer, String> mapa, int clave) {
        if (mapa.containsKey(clave)) {
            System.out.println("El color asociado a la clave " + clave + " es: " + mapa.get(clave));
        } else {
            System.out.println("La clave " + clave + " no existe en el mapa.");
        }
    }
    
}
