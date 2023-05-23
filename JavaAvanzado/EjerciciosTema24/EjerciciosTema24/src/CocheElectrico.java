// Clase CocheElectrico que extiende la funcionalidad de la clase Coche sin modificarla
class CocheElectrico extends Coche {
    private int autonomia;

    public CocheElectrico(String marca, String modelo, int año, double precio, int autonomia) {
        super(marca, modelo, año, precio);
        this.autonomia = autonomia;
    }

    // Método específico para coches eléctricos
    public void cargarBateria() {
        System.out.println("Cargando la batería del coche eléctrico...");
    }
}




