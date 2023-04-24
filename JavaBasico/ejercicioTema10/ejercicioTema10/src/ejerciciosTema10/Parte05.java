package ejerciciosTema10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Parte05 {
    public static void main(String[] args) {
        // Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        // Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Primer elemento");
        lista.add("Segundo elemento");
        lista.add("Tercer elemento");
        lista.add("Cuarto elemento");

        LinkedList<String> lista2 = new LinkedList<>(lista);

        System.out.println("Elementos del ArraList");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        System.out.println("\nElementos del LinkedList");
        for (String elemento : lista2) {
            System.out.println(elemento);
        }

    }
}
