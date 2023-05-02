package nombrado;


import java.util.ArrayList;

/**
 * Ejercicio correspondiente al Tema 14 del curso de Java Avanzado de operbootcamp
 * El ejercicio consta de dos parte, una en diseñar dos funciones limpias en función de las normas de nombrado en el
 * tema 12 y la segunda parte consiste en comentar algun proyecto realizado anteriormente y comentar si hemos detectado
 * algun fallo en los comentarios.
 * He decidido realizar las dos partes en una, he decidido comentar con javadoc las dos funciones de la parte 1 del
 * ejercicio.
 * @see <a href="https://open-bootcamp.com/">...</a>
 * @author Jose Alamar Ferrer
 */
public class Funciones {
    ArrayList<String> nombres = new ArrayList<String>();

    /**
     * Determina si una palabra es un palíndromo, es decir,
     * si se lee igual de izuierda a derecha que de derecha a izquierda
     * @param palabra
     * @return - true si se lee igual en ambas direcciones - false de lo contrario
     */
    public boolean esPalindromo(String palabra){
        String palabraIvertida = "";
        for(int i = palabra.length() - 1; i >= 0; i--){
            palabraIvertida += palabra.charAt(i);
        }
        return palabra.equals(palabraIvertida);
    }

    /**
     * Método para saber si una lista de nombres contiene un nombre en concreto
     * @param nombres - lista de nombres
     * @param nombre - nombre a localizar en la lista
     * @return - true si lo encuentra en la lista- false de lo contrario
     */
    public boolean encontrarNombre(ArrayList<String> nombres, String nombre){
        for(String n : nombres) {
            if(n.equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
    }
}
