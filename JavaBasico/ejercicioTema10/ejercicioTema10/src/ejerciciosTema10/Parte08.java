package ejerciciosTema10;

import java.io.*;

public class Parte08 {
    // Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    // La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado
    // en "fileOut".
    public static void main(String[] args) {
        String fileIn = "C:\\Programación\\OpenbootCamp\\Ejercicios\\JavaBasico\\ejercicioTema10\\origen.txt";
        String fileOut = "C:\\Programación\\OpenbootCamp\\Ejercicios\\JavaBasico\\ejercicioTema10\\destino.txt";
        copiarFichero(fileIn, fileOut);
    }
    public static void copiarFichero(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
            in.close();
            System.out.println("Fichero copiado");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
