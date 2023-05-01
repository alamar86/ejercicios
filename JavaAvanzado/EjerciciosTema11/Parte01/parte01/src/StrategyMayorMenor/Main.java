package StrategyMayorMenor;
// He decidido aplicar el patron strategy para aplicar a la función de obetener el mayor o menor número de un array tipo
// int, el motivo es muy sencillo de momento es el que mejor veo para aplicar a lo que querramos para mínimo un doble
// comportamiento que puede tener una interfaz.
public class Main {
    public static void main(String[] args) {
        int[] numeros = {123, 22, 332, 34, 152, 46};
        // Creo un bifurcador que determinará obtener el mayor o menor número de un array
        boolean extraerMayor = false;

        Numeros numero = extraerMayor ? new NumeroMayor() : new NumeroMenor();

        numero.obtener(numeros);
        numero.mostrar();
    }
}
