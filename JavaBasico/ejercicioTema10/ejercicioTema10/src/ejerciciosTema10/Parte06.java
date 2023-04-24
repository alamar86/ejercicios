package ejerciciosTema10;

import java.util.ArrayList;

public class Parte06 {
    public static void main(String[] args) {
        // Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        // A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último,
        // vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos,
        // siempre y cuando cumplas el primer "for" de relleno.
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
