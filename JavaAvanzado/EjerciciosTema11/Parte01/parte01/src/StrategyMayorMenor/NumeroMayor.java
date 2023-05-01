package StrategyMayorMenor;

import java.util.Arrays;

public class NumeroMayor implements Numeros{
    int mayor;
    @Override
    public void obtener(int[] numeros) {
        mayor = Arrays.stream(numeros).reduce(numeros[0], Math::max);
    }

    @Override
    public void mostrar() {
        System.out.println("El mayor de los numeros es: " + mayor);
    }
}
