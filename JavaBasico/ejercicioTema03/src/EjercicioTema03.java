import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioTema03 {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        Scanner lector = new Scanner(System.in);
        System.out.println("Escriba 5 nombres: ");
        for (int i = 0; i < 5; i++) {
            nombres.add(lector.next());
        }

        System.out.println("Los nombres introducidos son:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
