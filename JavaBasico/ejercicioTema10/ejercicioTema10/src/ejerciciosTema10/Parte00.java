package ejerciciosTema10;

public class Parte00 {
    // Dada la función:
    //
    // public static String reverse(String texto) { }
    //
    //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    public static void main(String[] args) {
        String texto = "Hola Mundo";
        System.out.println(reverse(texto));
    }
    public static String reverse(String texto) {
        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        return resultado;
    }
}
