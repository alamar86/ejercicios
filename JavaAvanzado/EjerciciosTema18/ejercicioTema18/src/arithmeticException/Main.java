package arithmeticException;
// Implementar Arithmetic exception tratando de hacer una división entre dos números, siendo el que divide 0
public class Main {
    public static void main(String[] args) {
        int dividendo = 10;
        int divisor = 0;

        try {
            System.out.println(dividendo/divisor);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por " + divisor +
                    "\nError con mensaje -> " + e.getMessage());
        }
    }
}
