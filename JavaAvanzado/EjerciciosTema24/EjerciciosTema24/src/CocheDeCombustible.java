// Clase CocheDeCombustible que extiende la funcionalidad de la clase Coche sin modificarla
class CocheDeCombustible extends Coche {
    public CocheDeCombustible(String marca, String modelo, int año, double precio) {
        super(marca, modelo, año, precio);
    }

    // Método específico para coche de combustible
    public void llenarDepositoCombustible(int litros) {
        System.out.println("Depositando " + litros + " litros de combustible");
    }
}
