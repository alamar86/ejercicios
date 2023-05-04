package fileNotFoundException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader archivo = new FileReader("inexistente.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado"
            + "\n Con Error -> " + e.getMessage());
        }
    }
}
