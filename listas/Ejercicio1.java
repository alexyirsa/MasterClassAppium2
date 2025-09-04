package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Ejercicio1 {
    public static void main(String[] args) {
        final var listAlto = new ArrayList<String>();
        final var listMedio = new ArrayList<String>();
        final var listBajo = new ArrayList<String>();
        final var nombres = crearArraysNombres();
        final var imc = crearArrayImc();
        rellenarListasImc(listAlto, listMedio, listBajo, nombres, imc);
        System.out.printf("Personas con IMC alto: %s%n ", listAlto);
        System.out.printf("Personas con IMC medio: %s%n ", listMedio);
        System.out.printf("Personas con IMC bajo: %s%n", listBajo);
    }

    static String[] crearArraysNombres(){
        return new String[]{"Juan", "Ana", "Pedro", "María", "Luis", "Sofía", "Lucía", "Marta", "Carlos", "Laura"};
    }

    static double[] crearArrayImc(){
        return RandomUtilities.generarRandomArrayDouble(10, 1, 50, new Random());
    }

    static void rellenarListasImc(
        List<String> listAlto,
        List<String> listMedio,
        List<String> listBajo,
        String[] nombres,
        double[] imc
        ){ 
            final var n = imc.length;
            for (int i = 0; i < n; i++) {
                final var imcValue = imc[i];
                final var nombre = nombres[i];

                if (imcValue >= 40) {
                    listAlto.add(nombre);
                } else if (imcValue >= 25) {
                    listMedio.add(nombre);
                } else {
                    listBajo.add(nombre);
                }
            }
        }            
}



