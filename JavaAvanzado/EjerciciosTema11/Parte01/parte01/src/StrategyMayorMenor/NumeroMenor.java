package StrategyMayorMenor;

import java.util.Arrays;

public class NumeroMenor implements Numeros{
    int menor = 0;

    @Override
    public void obtener(int[] numeros) {
        menor = Arrays.stream(numeros)
                .reduce(numeros[0], Math::min);
    }

    @Override
    public void mostrar() {
        System.out.println("El menor numero es: " + menor);
    }
}
