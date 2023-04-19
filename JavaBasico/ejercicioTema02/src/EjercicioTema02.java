import java.util.Scanner;

public class EjercicioTema02 {
    public static void main(String[] args) {
        Scanner leePrecio = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = leePrecio.nextDouble();
        double precioConIva = calcularPrecioConIva(precio);
        System.out.println("El precio con IVA es: " + precioConIva + "€");
    }

    /**
     * Calcula el precio con IVA
     * @param precio
     * @return
     */
    public static double calcularPrecioConIva(double precio) {
        return precio + (precio * 0.21);
    }
}
