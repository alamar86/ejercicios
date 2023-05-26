package entities;

// Clase entities.Coche que cumple con el principio de responsabilidad única
public class CocheImpl implements Coche{
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    public CocheImpl(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }


    @Override
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Precio: " + precio);
    }
}
