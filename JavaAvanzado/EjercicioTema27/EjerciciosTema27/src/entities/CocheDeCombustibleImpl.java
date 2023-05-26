package entities;

// Clase entities.CocheDeCombustible que extiende la funcionalidad de la clase entities.Coche sin modificarla
public class CocheDeCombustibleImpl extends CocheImpl implements CocheDeCombustible{
    public CocheDeCombustibleImpl(String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
    }

    // Método específico para coche de combustible
    @Override
    public void llenarDepositoCombustible(int litros) {
        System.out.println("Depositando " + litros + " litros de combustible");
    }
}
