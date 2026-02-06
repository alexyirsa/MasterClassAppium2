package sets;

import java.util.Arrays;
import java.util.HashSet;

import java.util.logging.Logger;

public class EjemploSet2 {
    private static final Logger logger = Logger.getLogger(EjemploSet2.class.getName());

    public static void main(String[] args) {
        final var conjunto = new HashSet<>(Arrays.asList("Carlos", "Jorge", "Mariana", "Rodrigo", "Jimena"));
        
        for(var nombre : conjunto){
            if (logger.isLoggable(java.util.logging.Level.INFO)) {
                logger.info(String.format("Contenido del conjunto: %s%n", nombre));
            }
        }// Intento de agregar un duplicado
       
    }
    
}
