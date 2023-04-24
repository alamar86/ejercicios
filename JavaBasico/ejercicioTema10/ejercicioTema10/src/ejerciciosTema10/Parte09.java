package ejerciciosTema10;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/*
 * Esta clase leera un archivo el cual contiene nombres, contará la frecuencia de los nombres
 * y ordenará los nombres por frecuencia descendiente
 */
public class Parte09 {
    public static void main(String[] args) {
        // Definir el archivo de entrada
        String archivo = "C:\\Programación\\OpenbootCamp\\Ejercicios\\JavaBasico\\ejercicioTema10\\nombres.txt";

        // HashMap para contar la frecuencia
        Map<String, Integer> frecuencia = new HashMap<>();

        // Leer el archivo de entrada
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine())!= null) {
                // Actualizar la frecuencia de cada nombre
                String[] nombres = linea.split(" ");
                for (String nombre : nombres) {
                    nombre = nombre.toLowerCase();
                    if (frecuencia.containsKey(nombre)) {
                        frecuencia.put(nombre, frecuencia.get(nombre) + 1);
                    } else {
                        frecuencia.put(nombre, 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de entrada: " + e.getMessage());
        }

        // ArrayList para ordenar los nombres por frecuencia descendiente
        List<String> nombresOrdenados = new ArrayList<>(frecuencia.keySet());
        nombresOrdenados.sort((n1, n2) -> frecuencia.get(n2) - frecuencia.get(n1));

        // Mostrar resultados
        System.out.println("Frecuencia de nombres en el archivo: ");
        for (String nombre : nombresOrdenados) {
            System.out.printf("%s: %d%n", nombre, frecuencia.get(nombre));
        }
    }
}
