package sets;

import java.util.HashSet;

public class EjemploSet1 {

    public static void main(String[] args) {
        final var conjunto = new HashSet<Integer>();
        conjunto.add(5);
        conjunto.add(10);
        conjunto.add(15);
        conjunto.add(10); // Intento de agregar un duplicado
        
        System.out.println("Contenido del conjunto: %s%n " + conjunto);
        System.out.println("Tamaño del conjunto: " + conjunto.size());
    }
    
}
