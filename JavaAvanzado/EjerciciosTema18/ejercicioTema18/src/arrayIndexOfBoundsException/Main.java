package arrayIndexOfBoundsException;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};
        int resultado = 0;

        try {
            resultado = numeros[8];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Estas intentando acceder a una posición inexistente del array"
            + "\n con mensaje de error -> " + e.getMessage());
        }

    }
}
