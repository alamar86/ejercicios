package nombrado;

import java.util.ArrayList;

public class Funciones {
    ArrayList<String> nombres = new ArrayList<String>();

    /**
     * Determina si una palabra es un palíndromo, es decir,
     * si se lee igual de izuierda a derecha que de derecha a izquierda
     * @param palabra
     * @return - true si se lee igual en ambas direcciones - false de lo contrario
     * @author Jose Alamar
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
     * @author Jose Alamar
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
