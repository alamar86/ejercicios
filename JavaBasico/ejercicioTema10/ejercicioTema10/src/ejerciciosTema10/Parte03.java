package ejerciciosTema10;
import java.util.Vector;

public class Parte03 {
    public static void main(String[] args) {
        // Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<String> vector = new Vector<String>();
        vector.add("Jose");
        vector.add("Juan");
        vector.add("Maria");
        vector.add("Pedro");
        vector.add("Ana");
        vector.remove(2);
        vector.remove(3);
        System.out.println(vector);
    }
}
