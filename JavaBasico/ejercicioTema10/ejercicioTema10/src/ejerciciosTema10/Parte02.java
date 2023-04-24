package ejerciciosTema10;

public class Parte02 {
    public static void main(String[] args) {
        // Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int[][] matriz = new int[2][2];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Posición es: [" + i + "][" + j + "] y el valor es: " + matriz[i][j] );
            }
        }
    }
}
