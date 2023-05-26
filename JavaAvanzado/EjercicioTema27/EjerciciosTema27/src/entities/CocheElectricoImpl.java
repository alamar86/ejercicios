package entities;

// Clase entities.CocheElectrico que extiende la funcionalidad de la clase entities.Coche sin modificarla
public class CocheElectricoImpl extends CocheImpl implements CocheElectrico{
    private int autonomia;

    public CocheElectricoImpl(String marca, String modelo, int año, double precio, int autonomia) {
        super(marca, modelo, año, precio);
        this.autonomia = autonomia;
    }

    // Método específico para coches eléctricos
    @Override
    public void cargarBateria() {
        System.out.println("Cargando la batería del coche eléctrico...");
    }
}




